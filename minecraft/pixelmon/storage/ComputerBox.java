package pixelmon.storage;

import java.util.Iterator;

import net.minecraft.nbt.NBTTagCompound;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class ComputerBox {
	public boolean hasChanged = false;
	public static final int boxLimit = 30;
	public int position;
	private NBTTagCompound[] storedPokemon = new NBTTagCompound[boxLimit];

	public ComputerBox(int position) {
		this.position = position;
		hasChanged = true;
	}

	public boolean hasSpace() {
		int count = 0;
		for (int i = 0; i < boxLimit; i++) {
			if (storedPokemon[i] != null)
				count++;
		}
		if (count < boxLimit)
			return true;
		return false;
	}

	public void add(EntityPixelmon p, int id) {
		NBTTagCompound n = new NBTTagCompound();
		p.setPokemonId(id);
		p.writeEntityToNBT(n);
		p.writeToNBT(n);
		n.setString("id", p.getName());
		n.setName(p.getName());
		n.setBoolean("IsInBall", true);
		n.setBoolean("IsShiny", p.getIsShiny());
		int pos = getNextSpace();
		n.setInteger("PixelmonOrder", pos);
		n.setInteger("BoxNumber", position);
		if (n.getShort("Health") > 0)
			n.setBoolean("IsFainted", false);
		storedPokemon[pos] = n;
		hasChanged = true;
	}

	public int getNextSpace() {
		for (int i = 0; i < boxLimit; i++)
			if (storedPokemon[i] == null)
				return i;
		return 0;
	}

	public NBTTagCompound get(int id) {
		for (NBTTagCompound n : storedPokemon) {
			if (n != null) {
				if (n.getInteger("pixelmonID") == id)
					return n;
			}
		}
		return null;
	}

	public NBTTagCompound[] getStoredPokemon() {
		for (int i = 0; i < storedPokemon.length; i++) {
			NBTTagCompound n = storedPokemon[i];
			if (n != null) {
				if (n.getString("Name").equals(""))
					storedPokemon[i] = null;
			}
		}
		return storedPokemon;
	}

	public void setStoredPokemon(NBTTagCompound[] pokemon) {
		storedPokemon = pokemon;
	}

	public NBTTagCompound getNBTByPosition(int pos) {
		return storedPokemon[pos];
	}

	public void load(NBTTagCompound boxTag) {
		for (int i = 0; i < boxLimit; i++)
			storedPokemon[i] = null;
		Iterator<NBTTagCompound> i = boxTag.getTags().iterator();

		while (i.hasNext()) {
			NBTTagCompound tag = i.next();
			tag.setName(tag.getString("Name"));
			int pos = tag.getInteger("PixelmonOrder");
			storedPokemon[pos] = tag;
		}
		hasChanged = false;
	}

	public void save(NBTTagCompound tag) {
		for (int i = 0; i < boxLimit; i++) {
			if (storedPokemon[i] != null) {
				tag.setCompoundTag("" + storedPokemon[i].getInteger("pixelmonID"), storedPokemon[i]);
			}
		}
		hasChanged = false;
	}
}
