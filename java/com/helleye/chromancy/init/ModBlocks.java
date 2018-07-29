package com.helleye.chromancy.init;

import com.helleye.chromancy.blocks.BlockBase;
import com.helleye.chromancy.blocks.CrystalBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<>();
	
	//Block declarations
	public static final Block CRYSTAL_BLOCK = new CrystalBlock("crystal_block", Material.IRON);
	
	
}
