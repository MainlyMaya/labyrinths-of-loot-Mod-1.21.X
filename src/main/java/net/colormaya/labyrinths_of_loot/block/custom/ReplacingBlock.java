package net.colormaya.labyrinths_of_loot.block.custom;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class ReplacingBlock extends Block {
    private static Map<Block, Block> REPLACE_BLOCK_MAP;

    public ReplacingBlock(Settings settings) {
        super(settings);
    }

    // Initialize the map later, once ModBlocks are registered
    public static void initializeReplaceBlockMap() {
        REPLACE_BLOCK_MAP = Map.of(
                ModBlocks.EMBEDDED_CARAPACE_BRICKS, ModBlocks.CRACKED_CARAPACE_BRICKS,
                ModBlocks.LAYERED_CARAPACE_BRICKS, ModBlocks.CRACKED_LAYERED_CARAPACE_BRICKS
        );
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
        super.afterBreak(world, player, pos, state, blockEntity, tool);

        if (!world.isClient) {
            Block originalBlock = state.getBlock();

            if (REPLACE_BLOCK_MAP.containsKey(originalBlock)) {
                Block replacement = REPLACE_BLOCK_MAP.get(originalBlock);

                world.setBlockState(pos, replacement.getDefaultState());
            }
        }
    }
}
