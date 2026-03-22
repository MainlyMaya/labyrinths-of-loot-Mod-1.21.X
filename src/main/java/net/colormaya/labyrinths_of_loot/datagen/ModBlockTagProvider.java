package net.colormaya.labyrinths_of_loot.datagen;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_BRICKS)
                .add(ModBlocks.CHISELED_LIMESTONE_BRICKS)
                .add(ModBlocks.CORALSTONE)
                .add(ModBlocks.CORALSTONE_BRICKS)
                .add(ModBlocks.CORALSTONE_PILLAR)
                .add(ModBlocks.CORALSTONE_PILLAR_BASE)
                .add(ModBlocks.MIRESTONE)
                .add(ModBlocks.MIRESTONE_BRICKS)
                .add(ModBlocks.MIRESTONE_PILLAR)
                .add(ModBlocks.MIRESTONE_PILLAR_BASE)
                .add(ModBlocks.DUNGEON_COBBLE)
                .add(ModBlocks.DUNGEON_PILLAR)
                .add(ModBlocks.DUNGEON_PILLAR_BASE)
                .add(ModBlocks.DUNGEON_STONE)
                .add(ModBlocks.DUNGEON_STONE_BRICKS)
                .add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS)
                .add(ModBlocks.MOSSY_DUNGEON_COBBLE)
                .add(ModBlocks.EMBEDDED_CARAPACE_BRICKS)
                .add(ModBlocks.LAYERED_EMBEDDED_CARAPACE_BRICKS)
                .add(ModBlocks.MIRESTONE_SLAB)
                .add(ModBlocks.MIRESTONE_STAIRS)
                .add(ModBlocks.MIRESTONE_BRICKS_WALL)
                .add(ModBlocks.MIRESTONE_BRICKS_SLAB)
                .add(ModBlocks.MIRESTONE_BRICKS_STAIRS)
                .add(ModBlocks.CORALSTONE_WALL)
                .add(ModBlocks.CORALSTONE_SLAB)
                .add(ModBlocks.CORALSTONE_STAIRS)
                .add(ModBlocks.CORALSTONE_BRICKS)
                .add(ModBlocks.CORALSTONE_BRICKS_WALL)
                .add(ModBlocks.CORALSTONE_BRICKS_SLAB)
                .add(ModBlocks.CORALSTONE_BRICKS_STAIRS)
                .add(ModBlocks.DUNGEON_COBBLE_WALL)
                .add(ModBlocks.DUNGEON_COBBLE_SLAB)
                .add(ModBlocks.DUNGEON_COBBLE_STAIRS)
                .add(ModBlocks.MOSSY_DUNGEON_COBBLE_WALL)
                .add(ModBlocks.MOSSY_DUNGEON_COBBLE_SLAB)
                .add(ModBlocks.MOSSY_DUNGEON_COBBLE_STAIRS)
                .add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_WALL)
                .add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_SLAB)
                .add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_STAIRS)
                .add(ModBlocks.DUNGEON_STONE_SLAB)
                .add(ModBlocks.DUNGEON_STONE_STAIRS)
                .add(ModBlocks.DUNGEON_STONE_BRICKS_WALL)
                .add(ModBlocks.DUNGEON_STONE_BRICKS_SLAB)
                .add(ModBlocks.DUNGEON_STONE_BRICKS_STAIRS)
                ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.MIRESTONE)
                .add(ModBlocks.MIRESTONE_SLAB)
                .add(ModBlocks.MIRESTONE_STAIRS)
                ;

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.DRAGON_BAMBOO)
                .add(ModBlocks.DRAGON_BAMBOO_SHOOT)
                .add(ModBlocks.DRAGON_BAMBOO_BLOCK)
                .add(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK)
                .add(ModBlocks.DRAGON_BAMBOO_PLANKS)
                .add(ModBlocks.DRAGON_BAMBOO_BUTTON)
                .add(ModBlocks.DRAGON_BAMBOO_FENCE)
                .add(ModBlocks.DRAGON_BAMBOO_DOOR)
                .add(ModBlocks.DRAGON_BAMBOO_SLAB)
                .add(ModBlocks.DRAGON_BAMBOO_TRAPDOOR)
                .add(ModBlocks.DRAGON_BAMBOO_FENCE_GATE)
                .add(ModBlocks.DRAGON_BAMBOO_PRESSURE_PLATE)
                .add(ModBlocks.DRAGON_BAMBOO_STAIRS)
                ;

        getOrCreateTagBuilder(BlockTags.BASE_STONE_OVERWORLD)
                .add(ModBlocks.MIRESTONE)
                .add(ModBlocks.DUNGEON_STONE)
                .add(ModBlocks.CORALSTONE)
                ;

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.DRAGON_BAMBOO_BLOCK)
                .add(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.DRAGON_BAMBOO_FENCE)
        ;
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.DRAGON_BAMBOO_FENCE_GATE)
        ;
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DUNGEON_STONE_BRICKS_WALL)
                .add(ModBlocks.CORALSTONE_BRICKS_WALL)
                .add(ModBlocks.DUNGEON_COBBLE_WALL)
                .add(ModBlocks.MIRESTONE_BRICKS_WALL)
                .add(ModBlocks.CORALSTONE_WALL)
        ;
    }
}
