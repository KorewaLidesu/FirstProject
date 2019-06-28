package com.azusaaizawa.testproject.init;

import java.util.ArrayList;
import java.util.List;

import com.azusaaizawa.testproject.items.ToolBase;

import net.minecraft.item.Item;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item BUILDERS_WAND = new ToolBase("builders_wand");
	public static final Item SUPER_BUILDERS_WAND = new ToolBase("super_builders_wand");
	
}
