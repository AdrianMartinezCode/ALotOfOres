package net.minecraft.alotofores.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import net.minecraft.alotofores.lib.RefStrings;

public class ItemLeadIngot extends Item {
	public ItemLeadIngot(int i) {
		this.setUnlocalizedName("LeadIngot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(RefStrings.MODID + ":" + "LeadIngot");
	}
}