package pixelmon.entities.pixelmon;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import pixelmon.Pixelmon;
import pixelmon.WorldHelper;
import pixelmon.api.interactions.IInteraction;
import pixelmon.battles.attacks.Attack;
import pixelmon.comm.ChatHandler;
import pixelmon.comm.EnumPackets;
import pixelmon.comm.PacketCreator;
import pixelmon.config.PixelmonItems;
import pixelmon.database.DatabaseMoves;
import pixelmon.database.DatabaseStats;
import pixelmon.database.SpawnConditions;
import pixelmon.database.SpawnLocation;
import pixelmon.entities.pixelmon.helpers.AIHelper;
import pixelmon.entities.trainers.EntityTrainer;
import pixelmon.items.ItemEther;
import pixelmon.items.ItemEvolutionStone;
import pixelmon.items.ItemHeld;
import pixelmon.items.ItemPokedex;
import pixelmon.items.ItemPotion;
import pixelmon.items.ItemStatusAilmentHealer;
import pixelmon.items.ItemTM;
import pixelmon.pokedex.Pokedex;
import pixelmon.pokedex.Pokedex.DexRegisterStatus;
import pixelmon.storage.PixelmonStorage;
import pixelmon.storage.PlayerNotLoadedException;
import pixelmon.storage.PlayerStorage;

public class EntityPixelmon extends Entity9HasSounds {

	public SpawnLocation pokemonLocation;
	public boolean playerOwned = false;

	public EntityPixelmon(World par1World) {
		super(par1World);

		targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		getNavigator().setAvoidsWater(true);
	}

	public void init(String name) {
		super.init(name);
		moveSpeed = getMoveSpeed();
	}

	public void onDeath(DamageSource damagesource) {
		if (!worldObj.isRemote) {
			super.onDeath(damagesource);
			if (getOwner() != null) {
				String s = "Your " + getName() + " fainted!";
				ChatHandler.sendChat(getOwner(), s);
				isFainted = true;
				setEntityHealth(0);
				catchInPokeball();
			} else {
				this.setDead();
			}
		}
	}

	public static ArrayList<IInteraction> interactionList = new ArrayList<IInteraction>();

	public boolean interact(EntityPlayer player) {
		if (player instanceof EntityPlayerMP) {
			ItemStack itemstack = ((EntityPlayer) player).getCurrentEquippedItem();
			if (itemstack != null) {
				for (IInteraction i : interactionList) {
					if (i.interact(this, player))
						return true;
				}
			}
		}

		return super.interact(player);
	}

	public void catchInPokeball() {
		if (getOwner() != null)
			updateNBT();
		isInBall = true;
		unloadEntity();
	}

	public void releaseFromPokeball() {
		aggression = Aggression.passive;
		worldObj.spawnEntityInWorld(this);
		isInBall = false;
		worldObj.playSoundAtEntity(this, getLivingSound(), this.getSoundVolume(), this.getSoundPitch());
	}

	public void clearAttackTarget() {
		setTarget(null);
		setAttackTarget(null);
	}

	// public void renderLevelUpEffects() {
	// EntityCrit2FX entitycrit2fx = new EntityCrit2FX(worldObj, this,
	// "magicCrit");
	// Minecraft.getMinecraft().effectRenderer.addEffect(entitycrit2fx);
	// }

	public boolean getCanSpawnHere() {
		if (pokemonLocation == SpawnLocation.Water) {
			if (baseStats.swimmingParameters == null)
				return false;
			int wdepth = WorldHelper.getWaterDepth((int) posX, (int) posY, (int) posZ, worldObj);
			if (wdepth > baseStats.swimmingParameters.depthRangeStart && wdepth < baseStats.swimmingParameters.depthRangeEnd)
				return true;
			else {
				double y = posY
						- (baseStats.swimmingParameters.depthRangeStart + rand.nextInt(baseStats.swimmingParameters.depthRangeEnd
								- baseStats.swimmingParameters.depthRangeStart));
				wdepth = WorldHelper.getWaterDepth((int) posX, (int) y, (int) posZ, worldObj);
				if (wdepth > baseStats.swimmingParameters.depthRangeStart && wdepth < baseStats.swimmingParameters.depthRangeEnd)
					return false;
				else {
					posY = y;
					return true;
				}
			}

		}

		int var1 = MathHelper.floor_double(this.posX);
		int var2 = MathHelper.floor_double(this.boundingBox.minY);
		int var3 = MathHelper.floor_double(this.posZ);

		int blockId = this.worldObj.getBlockId(var1, var2 - 1, var3);
		int lightLevel = this.worldObj.getFullBlockLightValue(var1, var2, var3);
		boolean[] conds = { true, true };
		if (baseStats.spawnConditions.length == 0)
			if (blockId != Block.grass.blockID)
				return false;
		for (SpawnConditions s : baseStats.spawnConditions) {
			if (s == SpawnConditions.Grass && blockId != Block.grass.blockID)
				conds[s.index] = false;
			if (s == SpawnConditions.Rock && blockId != Block.stone.blockID)
				conds[s.index] = false;
			if (s == SpawnConditions.Sand && blockId != Block.sand.blockID)
				conds[s.index] = false;
			if (s == SpawnConditions.Darkness)
				if (lightLevel > 11 && !(var2 < 60 && !this.worldObj.canBlockSeeTheSky(var1, var2, var3)))
					conds[s.index] = false;
			if (s == SpawnConditions.DayLight && lightLevel < 11)
				conds[s.index] = false;
		}
		return conds[0] && conds[1];
	}

	@Override
	public void onUpdate() {
		if (Pixelmon.freeze)
			return;
		if (posX > 1e20 || posX < -1e20 || posZ > 1e20 || posZ < -1e20)
			unloadEntity();
		if (getOwner() == null && baseStats != null && baseStats.spawnConditions != null && baseStats.spawnConditions.length > 0) {
			if (baseStats.spawnConditions[0] == SpawnConditions.Darkness)
				if (worldObj.getWorldTime() < 12000
						&& this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY),
								MathHelper.floor_double(this.posZ)))
					setDead();
			if (baseStats.spawnConditions[0] == SpawnConditions.DayLight && !worldObj.isDaytime())
				setDead();
		}
		if (playerOwned && getOwner() == null)
			setDead();
		super.onUpdate();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		if ((trainer != null) && !isStorage)
			return;
		super.writeEntityToNBT(nbt);
		if (getOwner() != null)
			nbt.setString("pixelmonOwner", getOwnerName());
		if (pokemonLocation == null)
			pokemonLocation = SpawnLocation.Land;
		nbt.setInteger("pixelmonType", pokemonLocation.index);
	}

	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound) {
		super.writeToNBT(par1nbtTagCompound);
	}

	boolean isStorage = false;

	public void writeEntityToStorageNBT(NBTTagCompound var1) {
		isStorage = true;
		writeEntityToNBT(var1);
		isStorage = false;
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);
		if (nbt.hasKey("pixelmonOwner"))
			super.setOwner(nbt.getString("pixelmonOwner"));
		int h = health;
		level.readFromNBT(nbt);
		setEntityHealth(h);

		if (nbt.hasKey("pixelmonType"))
			pokemonLocation = SpawnLocation.getFromIndex(nbt.getInteger("pixelmonType"));
		else if (baseStats.spawnLocations[0] == SpawnLocation.Land)
			pokemonLocation = SpawnLocation.Land;
		else
			pokemonLocation = SpawnLocation.Water;
		aiHelper = new AIHelper(getName(), this, tasks);
	}

	public void unloadEntity() {
		super.unloadEntity();

		ArrayList<Entity> list = new ArrayList<Entity>();
		list.add(this);
		worldObj.unloadEntities(list);
		clearAttackTarget();
		if (battleController != null) {
			battleController = null;
		}
	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}

	public ArrayList<String> getPreEvolutions() {
		return DatabaseStats.getPreEvolutions(getName());
	}
	

}
