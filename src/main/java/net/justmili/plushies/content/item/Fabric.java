package net.justmili.plushies.content.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class Fabric extends Item {
    public Fabric() {
        super(new Properties().stacksTo(1).repairable(Items.IRON_NUGGET));
    }
}