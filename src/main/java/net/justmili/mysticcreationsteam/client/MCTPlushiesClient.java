package net.justmili.mysticcreationsteam.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ChunkSectionLayerMap;
import net.justmili.mysticcreationsteam.init.PlushResourceLists;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.level.block.Block;

public class MCTPlushiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        for (Block plush : PlushResourceLists.getPlushies()) {
            setCutout(plush);
        }
    }

    private static void setCutout(Block block) {
        ChunkSectionLayerMap.putBlock(block, ChunkSectionLayer.CUTOUT);
    }
}