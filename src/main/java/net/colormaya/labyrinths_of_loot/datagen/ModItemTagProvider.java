package net.colormaya.labyrinths_of_loot.datagen;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.DRAGON_BAMBOO_BLOCK.asItem())
                .add(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK.asItem())
                ;

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.DRAGON_BAMBOO_PLANKS.asItem())
        ;

    }
}
