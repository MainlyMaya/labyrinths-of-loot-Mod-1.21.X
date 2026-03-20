package net.colormaya.labyrinths_of_loot.datagen;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_LIMESTONE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORALSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CORALSTONE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MIRESTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MIRESTONE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUNGEON_COBBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUNGEON_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUNGEON_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_DUNGEON_COBBLE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_LAYERED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMBEDDED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_EMBEDDED_CARAPACE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRAGON_BAMBOO_PLANKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CORAL_FRAGMENTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIRE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIRE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIMESTONE_CHUNK, Models.GENERATED);
    }
}
