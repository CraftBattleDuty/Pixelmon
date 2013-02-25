package pixelmon.structure;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.Facing;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureBoundingBox;

public class GeneralScattered extends StructureScattered {

	private static SchematicImporter s;

	// TODO implement a system in which we can have special pokemon spawn at
	// special coordinates.

	public GeneralScattered(Random par1Random, int par2, int par3, int par4, SchematicImporter schematic) {
		super(par1Random, par2, par3, par4, schematic.width, schematic.height, schematic.length);
		s = schematic;
	}

	public boolean addComponentParts(World world, Random par2Random, StructureBoundingBox bb) {
		if (!this.func_74935_a(world, bb, 0)) {
			return false;
		} else {
			for (int x = 0; x < s.width; x++)
				for (int z = 0; z < s.length; z++)
					for (int y = 0; y < s.height; y++) {
						try {
							this.placeBlockAtCurrentPosition(world, s.blocks[x][y][z], this.getMetadataWithOffset(s.blocks[x][y][z], s.blockData[x][y][z]), x, y, z, bb);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					}
			// id, metadata
			return true;
		}
	}

	protected int getMetadataWithOffset(int par1, int par2) {
		if (par1 == Block.stairCompactCobblestone.blockID || par1 == Block.stairCompactPlanks.blockID || par1 == Block.stairsNetherBrick.blockID
				|| par1 == Block.stairsStoneBrickSmooth.blockID || par1 == Block.stairsSandStone.blockID) {
			if (this.coordBaseMode == 2) {
				if (par2 == 2) {
					return 3;
				}

				if (par2 == 3) {
					return 2;
				}
			} else if (this.coordBaseMode == 1) {
				if (par2 == 0) {
					return 2;
				}

				if (par2 == 1) {
					return 3;
				}

				if (par2 == 2) {
					return 1;
				}

				if (par2 == 3) {
					return 0;
				}
			} else if (this.coordBaseMode == 3) // ---FIXED
			{
				if (par2 == 0) {
					return 2;
				}

				if (par2 == 1) {
					return 3;
				}

				if (par2 == 2) {
					return 0;
				}

				if (par2 == 3) {
					return 1;
				}
			}
		}
		if (par1 == Block.pistonBase.blockID || par1 == Block.pistonStickyBase.blockID || par1 == Block.lever.blockID || par1 == Block.dispenser.blockID) {
			int othermeta = par2 & 8;
			int side = par2 & 7;
			if (this.coordBaseMode == 1) {
				if (par2 == 2 || par2 == 3) {
					return Facing.faceToSide[par2];
				}
			} else if (this.coordBaseMode == 3) {
				if (par2 == 2) {
					return 4;
				}

				if (par2 == 3) {
					return 5;
				}

				if (par2 == 4) {
					return 2;
				}

				if (par2 == 5) {
					return 3;
				}
			} else if (this.coordBaseMode == 2) {
				if (side == 1) {
					return 2 + othermeta;
				}

				if (side == 2) {
					return 1 + othermeta;
				}

				if (side == 4) {
					return 3 + othermeta;
				}

				if (side == 3) {
					return 4 + othermeta;
				}
			}
		}
		return par2;
	}

	public boolean generate(World world, Random random) {
		return addComponentParts(world, random, boundingBox);
	}

}
