package net.colormaya.labyrinths_of_loot;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class LabyrinthsOfLootClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Tell Minecraft that DRAGON_BAMBOO uses cutout (transparent) rendering
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRAGON_BAMBOO, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRAGON_BAMBOO_SHOOT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRAGON_BAMBOO_TRAPDOOR, RenderLayer.getCutout());
    }
}
