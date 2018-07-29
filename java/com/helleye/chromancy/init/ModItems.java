package com.helleye.chromancy.init;

import com.helleye.chromancy.items.ItemBase;
import com.helleye.chromancy.items.tools.ToolAxe;
import com.helleye.chromancy.items.tools.ToolHoe;
import com.helleye.chromancy.items.tools.ToolPickaxe;
import com.helleye.chromancy.items.tools.ToolSpade;
import com.helleye.chromancy.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<>();
	
	
	// materials
	public static final Item.ToolMaterial MATERIAL_CRYSTAL = EnumHelper.addToolMaterial("material_crystal", 3, 432, 8.0f, 2.5f, 15);
	
	// items
	public static final Item CRYSTAL = new ItemBase("crystal");
	
	
	//tools
	public static final ItemSword CRYSTAL_SWORD = new ToolSword("crystal_sword", MATERIAL_CRYSTAL);
	public static final ItemSpade CRYSTAL_SHOVEL = new ToolSpade("crystal_shovel", MATERIAL_CRYSTAL);
	public static final ItemPickaxe CRYSTAL_PICKAXE = new ToolPickaxe("crystal_pickaxe", MATERIAL_CRYSTAL);
	public static final ItemAxe CRYSTAL_AXE = new ToolAxe("crystal_axe", MATERIAL_CRYSTAL);
	public static final ItemHoe CRYSTAL_HOE = new ToolHoe("crystal_hoe", MATERIAL_CRYSTAL);
	
}
