package net.justmili.mysticcreationsteam.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ChunkSectionLayerMap;
import net.justmili.mysticcreationsteam.init.PlushBlocks;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class MCTPlushiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkSectionLayerMap.putBlock(PlushBlocks.BASETEST_PLUSH, ChunkSectionLayer.CUTOUT);
    }
}