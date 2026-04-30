package net.justmili.plushies.content.item;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

public class Fabric extends Item {
    private final DyeColor color;

    public Fabric(DyeColor color) {
        super(new Properties().stacksTo(64));
        this.color = color;
    }

    public DyeColor getColor() { return color; }
}