package net.justmili.plushies.content.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class SewingNeedle extends Item {
    public SewingNeedle() {
        super(new Properties().stacksTo(1).repairable(Items.IRON_NUGGET));
    }
}
