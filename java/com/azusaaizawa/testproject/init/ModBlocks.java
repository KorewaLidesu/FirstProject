package com.azusaaizawa.testproject.init;

import java.util.ArrayList;
import java.util.List;

import com.azusaaizawa.testproject.blocks.BuildingBase;
import com.azusaaizawa.testproject.blocks.DecorationBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BEDROCKIUM_BLOCK = new BuildingBase("bedrockium_block", Material.IRON);
	
}
