package sub_mod.techne_block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTechne extends Block implements ITileEntityProvider {

	public BlockTechne(int id) {
		super(id, Material.circuits);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(0.25F);
		setStepSound(soundMetalFootstep);
		setTextureName("iron_block");
		setUnlocalizedName(ModBlockTechne.MODID + ".block_techne");
	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityTechne();
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

}
