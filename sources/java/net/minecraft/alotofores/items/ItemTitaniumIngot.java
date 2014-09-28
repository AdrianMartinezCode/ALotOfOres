package net.minecraft.alotofores.items;

import net.minecraft.alotofores.lib.RefStrings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTitaniumIngot extends Item {
	public ItemTitaniumIngot(int i) {
		this.setUnlocalizedName("TitaniumIngot");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(RefStrings.MODID + ":" + "TitaniumIngot");
	}
}