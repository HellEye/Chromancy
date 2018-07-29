package com.helleye.chromancy.items.tools;

import com.helleye.chromancy.Main;
import com.helleye.chromancy.init.ModItems;
import com.helleye.chromancy.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;

public class ToolHoe extends ItemHoe implements IHasModel {
	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}