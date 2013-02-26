package pixelmon.entities.pixelmon;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import pixelmon.entities.pixelmon.particleEffects.ParticleEffects;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class Entity4Textures extends Entity3HasStats {
	public float maxScale = 1.25F;
	public float hoverTimer;
	public boolean alreadyInitialised = false;
	private ParticleEffects particleEffects;

	public Entity4Textures(World par1World) {
		super(par1World);
		dataWatcher.addObject(5, (short) 0); // shiny
		dataWatcher.addObject(6, (short) 0); // roasted
		dataWatcher.addObject(18, (short) 0); // red
	}

	protected void init(String name) {
		super.init(name);
		if (!worldObj.isRemote) {
			if ((new Random()).nextFloat() < 1 / 8192f) {
				dataWatcher.updateObject(5, (short) 1);
			}
		}
		alreadyInitialised = true;

		particleEffects = ParticleEffects.getParticleEffects(this);
	}

	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2) {
		if (par1DamageSource.isFireDamage())
			dataWatcher.updateObject(6, (short) 1);
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public String getTexture() {
		if (getIsShiny()
				&& Minecraft.getMinecraft().renderEngine.texturePack.getSelectedTexturePack().getResourceAsStream(
						"/pixelmon/texture/pokemon-shiny/shiny" + getName().toLowerCase() + ".png") != null)
			return "/pixelmon/texture/pokemon-shiny/shiny" + getName().toLowerCase() + ".png";
		else if (dataWatcher.getWatchableObjectShort(6) == (short) 1
				&& Minecraft.getMinecraft().renderEngine.texturePack.getSelectedTexturePack().getResourceAsStream(
						"/pixelmon/texture/pokemon-roasted/roasted" + getName().toLowerCase() + ".png") != null)
			return "/pixelmon/texture/pokemon-roasted/roasted" + getName().toLowerCase() + ".png";
		else
			return "/pixelmon/texture/pokemon/" + getName().toLowerCase() + ".png";
	}

	public boolean getIsShiny() {
		return dataWatcher.getWatchableObjectShort(5) == (short) 1;
	}

	public void setIsShiny(boolean isShiny) {
		if (isShiny)
			dataWatcher.updateObject(5, (short) 1);
		else
			dataWatcher.updateObject(5, (short) 0);
	}

	public boolean getIsRed() {
		return dataWatcher.getWatchableObjectShort(18) == (short) 1;
	}

	public void setIsRed(boolean isRed) {
		if (isRed)
			dataWatcher.updateObject(18, (short) 1);
		else
			dataWatcher.updateObject(18, (short) 0);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (worldObj.isRemote)
			if (particleEffects != null)
				particleEffects.onUpdate();
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);
		nbt.setBoolean("IsShiny", dataWatcher.getWatchableObjectShort(5) == (short) 1);
		nbt.setBoolean("IsRoasted", dataWatcher.getWatchableObjectShort(6) == (short) 1);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);
		dataWatcher.updateObject(5, nbt.getBoolean("IsShiny") ? (short) 1 : (short) 0);
		dataWatcher.updateObject(6, nbt.getBoolean("IsRoasted") ? (short) 1 : (short) 0);
		alreadyInitialised = true;
	}
}
