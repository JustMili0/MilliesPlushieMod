package net.justmili.plushies.content.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class SewingNeedle extends Item {
    public SewingNeedle(Properties properties) {
        super(properties.stacksTo(1).durability(64).repairable(Items.IRON_NUGGET));
    }
}
