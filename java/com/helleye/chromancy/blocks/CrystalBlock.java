package com.helleye.chromancy.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CrystalBlock extends BlockBase {
	
	public CrystalBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(1.5f);
		setResistance(10f);
		setHarvestLevel("pickaxe", 0);
		setLightLevel(4 / 15f);
		// setLightOpacity(0); // ??
		// setBlockUnbreakable();
	}
}
