package net.justmili.mysticcreationsteam.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ChunkSectionLayerMap;
import net.justmili.mysticcreationsteam.init.PlushBlocks;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class MCTPlushiesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ChunkSectionLayerMap.putBlock(PlushBlocks.BASETEST_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.ENO_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.MILLIE_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.APPELS_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.MAHAN_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.MOCHILA_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.GAEL_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.DGIRAFFE_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.FAYE_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.JOHN_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.PLUME_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.RAZE_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.MARY_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.IZYA_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.BLU_PLUSH, ChunkSectionLayer.CUTOUT);
        ChunkSectionLayerMap.putBlock(PlushBlocks.NEMESTRO_PLUSH, ChunkSectionLayer.CUTOUT);
    }
}