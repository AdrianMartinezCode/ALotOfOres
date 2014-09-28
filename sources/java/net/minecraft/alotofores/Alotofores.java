package net.minecraft.alotofores;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraft.alotofores.lib.*;
import net.minecraft.alotofores.proxy.*;
import net.minecraft.alotofores.blocks.*;
import net.minecraft.alotofores.items.*;
import net.minecraft.alotofores.worldgen.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class Alotofores {
	

		@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
		public static ServerProxy proxy;
		
		@Instance(value = RefStrings.MODID)
		public static Alotofores instance;
		
		
		/*------------ Plomo ------------*/
		//Bloque Ore de plomo.
		public static final Block LeadOre = new BlockLeadOre(45501, Material.rock);
		//Bloque de plomo.
		public static final Block LeadBlock = new BlockLeadBlock(45502, Material.iron);
		//Lingote de plomo.
		public static final Item LeadIngot = new ItemLeadIngot(45503);
		
		/*------------ Titanio ------------*/
		//Bloque Ore de titanio.
		public static final Block TitaniumOre = new BlockTitaniumOre(45521, Material.rock);
		//Bloque de titanio.
		public static final Block TitaniumBlock = new BlockTitaniumBlock(45522, Material.iron);
		//Lingote de titanio.
		public static final Item TitaniumIngot = new ItemTitaniumIngot(45523);
		
		//Creamos variable del tipo "EventManager"
		static final AlotoforesWorldGen oreManager = new AlotoforesWorldGen();
		
		@EventHandler
		public static void PreLoad(FMLPreInitializationEvent PreEvent) {
			proxy.registerRenderInfo();
			
			
			/*------------ Plomo ------------*/
			GameRegistry.registerBlock(LeadOre, "LeadOre");
			//LanguageRegistry.addName(LeadOre, "Lead Ore");
			
			GameRegistry.registerBlock(LeadBlock, "LeadBlock");
			//LanguageRegistry.addName(LeadBlock, "Lead Block");
			
			GameRegistry.registerItem(LeadIngot, "LeadIngot");
			//LanguageRegistry.addName(LeadIngot, "Lead Ingot");
			
			/*------------ Titanio ------------*/
			GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
			//LanguageRegistry.addName(TitaniumOre, "Titanium Ore");
			
			GameRegistry.registerBlock(TitaniumBlock, "TitaniumBlock");
			//LanguageRegistry.addName(TitaniumBlock, "Titanium Block");
			
			GameRegistry.registerItem(TitaniumIngot, "TitaniumIngot");
			//LanguageRegistry.addName(TitaniumIngot, "Titanium Ingot");
		}
		
		@EventHandler
		public static void load(FMLInitializationEvent event) {
			
			/*------------ Plomo ------------*/
			GameRegistry.addSmelting(LeadOre, new ItemStack(LeadIngot), 20f);
			GameRegistry.addShapedRecipe(new ItemStack(LeadBlock, 1), "XXX", "XXX", "XXX", 'X', LeadIngot);
			GameRegistry.addShapedRecipe(new ItemStack(LeadIngot, 9), "X  ", "   ", "   ", 'X', LeadBlock);
			
			/*------------ Titanio ------------*/
			GameRegistry.addSmelting(TitaniumOre, new ItemStack(TitaniumIngot), 20f);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumBlock, 1), "XXX", "XXX", "XXX", 'X', TitaniumIngot);
			GameRegistry.addShapedRecipe(new ItemStack(TitaniumIngot, 9), "X  ", "   ", "   ", 'X', TitaniumBlock);
			
			GameRegistry.registerWorldGenerator(oreManager, 1);
			
		}
		@EventHandler
		public static void PostLoad(FMLPostInitializationEvent PostEvent) {
			
		}
}
