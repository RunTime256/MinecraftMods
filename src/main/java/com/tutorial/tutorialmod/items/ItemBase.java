package com.tutorial.tutorialmod.items;

import com.tutorial.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item
{
    public ItemBase()
    {
        super(new Item.Properties().group(TutorialMod.TAB));
    }
}
