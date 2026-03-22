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

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_LAYERED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EMBEDDED_CARAPACE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAYERED_EMBEDDED_CARAPACE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool dragonBambooPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DRAGON_BAMBOO_PLANKS);
        dragonBambooPool.stairs(ModBlocks.DRAGON_BAMBOO_STAIRS);
        dragonBambooPool.slab(ModBlocks.DRAGON_BAMBOO_SLAB);
        dragonBambooPool.fence(ModBlocks.DRAGON_BAMBOO_FENCE);
        dragonBambooPool.fenceGate(ModBlocks.DRAGON_BAMBOO_FENCE_GATE);
        dragonBambooPool.button(ModBlocks.DRAGON_BAMBOO_BUTTON);
        dragonBambooPool.pressurePlate(ModBlocks.DRAGON_BAMBOO_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.DRAGON_BAMBOO_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DRAGON_BAMBOO_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool dungeonStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUNGEON_STONE);
        dungeonStonePool.stairs(ModBlocks.DUNGEON_STONE_STAIRS);
        dungeonStonePool.slab(ModBlocks.DUNGEON_STONE_SLAB);
        dungeonStonePool.button(ModBlocks.DUNGEON_STONE_BUTTON);
        dungeonStonePool.pressurePlate(ModBlocks.DUNGEON_STONE_PRESSURE_PLATE);

        BlockStateModelGenerator.BlockTexturePool dungeonStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUNGEON_STONE_BRICKS);
        dungeonStoneBricksPool.stairs(ModBlocks.DUNGEON_STONE_BRICKS_STAIRS);
        dungeonStoneBricksPool.slab(ModBlocks.DUNGEON_STONE_BRICKS_SLAB);
        dungeonStoneBricksPool.wall(ModBlocks.DUNGEON_STONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool dungeonCobblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DUNGEON_COBBLE);
        dungeonCobblePool.stairs(ModBlocks.DUNGEON_COBBLE_STAIRS);
        dungeonCobblePool.slab(ModBlocks.DUNGEON_COBBLE_SLAB);
        dungeonCobblePool.wall(ModBlocks.DUNGEON_COBBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyDungeonCobblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DUNGEON_COBBLE);
        mossyDungeonCobblePool.stairs(ModBlocks.MOSSY_DUNGEON_COBBLE_STAIRS);
        mossyDungeonCobblePool.slab(ModBlocks.MOSSY_DUNGEON_COBBLE_SLAB);
        mossyDungeonCobblePool.wall(ModBlocks.MOSSY_DUNGEON_COBBLE_WALL);

        BlockStateModelGenerator.BlockTexturePool mossyDungeonStoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS);
        mossyDungeonStoneBricksPool.stairs(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_STAIRS);
        mossyDungeonStoneBricksPool.slab(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_SLAB);
        mossyDungeonStoneBricksPool.wall(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool mirestonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIRESTONE);
        mirestonePool.stairs(ModBlocks.MIRESTONE_STAIRS);
        mirestonePool.slab(ModBlocks.MIRESTONE_SLAB);

        BlockStateModelGenerator.BlockTexturePool mirestoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIRESTONE_BRICKS);
        mirestoneBricksPool.stairs(ModBlocks.MIRESTONE_BRICKS_STAIRS);
        mirestoneBricksPool.slab(ModBlocks.MIRESTONE_BRICKS_SLAB);
        mirestoneBricksPool.wall(ModBlocks.MIRESTONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool coralstoneBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORALSTONE_BRICKS);
        coralstoneBricksPool.stairs(ModBlocks.CORALSTONE_BRICKS_STAIRS);
        coralstoneBricksPool.slab(ModBlocks.CORALSTONE_BRICKS_SLAB);
        coralstoneBricksPool.wall(ModBlocks.CORALSTONE_BRICKS_WALL);

        BlockStateModelGenerator.BlockTexturePool coralstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORALSTONE);
        coralstonePool.stairs(ModBlocks.CORALSTONE_STAIRS);
        coralstonePool.slab(ModBlocks.CORALSTONE_SLAB);
        coralstonePool.wall(ModBlocks.CORALSTONE_WALL);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CORAL_FRAGMENTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIRE_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIRE_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIMESTONE_CHUNK, Models.GENERATED);
    }
}
