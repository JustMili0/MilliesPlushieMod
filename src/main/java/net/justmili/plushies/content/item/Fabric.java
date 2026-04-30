package net.justmili.plushies.content.item;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class Fabric extends Item {
    private final DyeColor color;

    public Fabric(Properties properties, DyeColor color) {
        super(properties.stacksTo(64));
        this.color = color;
    }

    public DyeColor getColor() { return color; }
}