package net.minecraft.alotofores.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

import net.minecraft.alotofores.lib.RefStrings;

public class BlockLeadBlock extends Block{

	public BlockLeadBlock(int i, Material iron) {
		super(iron);
		this.setCreativeTab(CreativeTabs.tabBlock);
		//this.setCreativeTab(getCreativeTabToDisplayOn().tabBlock);
		this.setStepSound(soundTypeMetal);
		this.setHardness(4f);
		this.setResistance(5f);
		this.setBlockName("LeadBlock");
		this.setHarvestLevel("pickaxe", 2); //0=wood,1=stone,2=iron,3=diamond
		this.setBlockTextureName(RefStrings.MODID + ":" + "LeadBlock");
	}
}