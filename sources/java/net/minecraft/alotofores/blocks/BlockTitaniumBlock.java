package net.minecraft.alotofores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumBlock extends Block{

	public BlockTitaniumBlock(int i, Material iron) {
		super(iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("Titanium Block");
		this.setHarvestLevel("pickaxe", 2); //0=wood,1=stone,2=iron,3=diamond
		//this.setBlockTextureName(RefStrings.MODID + ":" + "TitaniumBlock");
	}
	
}