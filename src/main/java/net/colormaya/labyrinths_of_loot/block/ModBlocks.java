package net.colormaya.labyrinths_of_loot.block;

import net.colormaya.labyrinths_of_loot.LabyrinthsOfLoot;
import net.colormaya.labyrinths_of_loot.block.custom.PillarBaseBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

    public class ModBlocks {
        public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block CHISELED_LIMESTONE_BRICKS = registerBlock("chiseled_limestone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block DUNGEON_STONE = registerBlock("dungeon_stone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3.2F, 6.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_STONE_BRICKS = registerBlock("dungeon_stone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_COBBLE = registerBlock("dungeon_cobble",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 6.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block MOSSY_DUNGEON_STONE_BRICKS = registerBlock("mossy_dungeon_stone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 4.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block MOSSY_DUNGEON_COBBLE = registerBlock("mossy_dungeon_cobble",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 4.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_PILLAR_BASE = registerBlock("dungeon_pillar_base",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 5.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_PILLAR = registerBlock("dungeon_pillar",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(3.8F, 5.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block MIRESTONE = registerBlock("mirestone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.3F, 2.0F).sounds(BlockSoundGroup.PACKED_MUD).mapColor(MapColor.PALE_GREEN)));
        public static final Block MIRESTONE_BRICKS = registerBlock("mirestone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.3F, 3.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.PALE_GREEN)));
        public static final Block CORALSTONE = registerBlock("coralstone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_BRICKS = registerBlock("coralstone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_PILLAR_BASE = registerBlock("coralstone_pillar_base",
                new PillarBaseBlock(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_PILLAR = registerBlock("coralstone_pillar",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));




        private static Block registerBlock(String name, Block block) {
            registerBlockItem(name, block);
            return Registry.register(Registries.BLOCK, Identifier.of(LabyrinthsOfLoot.MOD_ID, name), block);
        }

        private static void registerBlockItem(String name, Block block) {
            Registry.register(Registries.ITEM, Identifier.of(LabyrinthsOfLoot.MOD_ID, name),
                    new BlockItem(block, new Item.Settings()));
        }

        public static void registerModBlocks() {
            LabyrinthsOfLoot.LOGGER.info("Registering Mod Blocks for " + LabyrinthsOfLoot.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
                entries.add(LIMESTONE_BRICKS);
                entries.add(CHISELED_LIMESTONE_BRICKS);
                entries.add(DUNGEON_STONE);
                entries.add(DUNGEON_COBBLE);
                entries.add(DUNGEON_STONE_BRICKS);
                entries.add(MOSSY_DUNGEON_STONE_BRICKS);
                entries.add(MOSSY_DUNGEON_COBBLE);
                entries.add(DUNGEON_PILLAR_BASE);
                entries.add(DUNGEON_PILLAR);
                entries.add(MIRESTONE);
                entries.add(MIRESTONE_BRICKS);
                entries.add(CORALSTONE);
                entries.add(CORALSTONE_BRICKS);
                entries.add(CORALSTONE_PILLAR);
                entries.add(CORALSTONE_PILLAR_BASE);
            });
        }
    }