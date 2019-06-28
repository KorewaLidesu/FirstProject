package com.azusaaizawa.testproject.items;

import com.azusaaizawa.testproject.Main;
import com.azusaaizawa.testproject.init.ModItems;
import com.azusaaizawa.testproject.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ToolBase extends Item implements IHasModel {

	public ToolBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
