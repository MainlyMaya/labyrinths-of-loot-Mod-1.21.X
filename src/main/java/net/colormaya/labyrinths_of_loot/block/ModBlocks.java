package net.colormaya.labyrinths_of_loot.block;

import net.colormaya.labyrinths_of_loot.LabyrinthsOfLoot;
import net.colormaya.labyrinths_of_loot.block.custom.DragonBambooBlock;
import net.colormaya.labyrinths_of_loot.block.custom.DragonBambooShoot;
import net.colormaya.labyrinths_of_loot.block.custom.PillarBaseBlock;
import net.colormaya.labyrinths_of_loot.block.custom.ReplacingBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlocks {
        public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block CHISELED_LIMESTONE_BRICKS = registerBlock("chiseled_limestone_bricks",

                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 2.0F).sounds(BlockSoundGroup.DRIPSTONE_BLOCK).mapColor(MapColor.TERRACOTTA_BROWN)));
        public static final Block DUNGEON_STONE = registerBlock("dungeon_stone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.5F, 5.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_STONE_BRICKS = registerBlock("dungeon_stone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_COBBLE = registerBlock("dungeon_cobble",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.5F, 6.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block MOSSY_DUNGEON_STONE_BRICKS = registerBlock("mossy_dungeon_stone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3F, 4.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block MOSSY_DUNGEON_COBBLE = registerBlock("mossy_dungeon_cobble",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(3F, 4.0F).sounds(BlockSoundGroup.BASALT).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_PILLAR_BASE = registerBlock("dungeon_pillar_base",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(3F, 5.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));
        public static final Block DUNGEON_PILLAR = registerBlock("dungeon_pillar",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(3F, 5.0F).sounds(BlockSoundGroup.NETHER_BRICKS).mapColor(MapColor.GRAY)));

        public static final Block MIRESTONE = registerBlock("mirestone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.2F, 2.0F).sounds(BlockSoundGroup.PACKED_MUD).mapColor(MapColor.PALE_GREEN)));
        public static final Block MIRESTONE_BRICKS = registerBlock("mirestone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.8F, 3.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.PALE_GREEN)));
        public static final Block MIRESTONE_PILLAR_BASE = registerBlock("mirestone_pillar_base",
                new PillarBaseBlock(AbstractBlock.Settings.create().requiresTool().strength(1.8F, 3.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.PALE_GREEN)));
        public static final Block MIRESTONE_PILLAR = registerBlock("mirestone_pillar",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(1.8F, 3.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.PALE_GREEN)));

        public static final Block CORALSTONE = registerBlock("coralstone",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(1.5F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_BRICKS = registerBlock("coralstone_bricks",
                new Block(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_PILLAR_BASE = registerBlock("coralstone_pillar_base",
                new PillarBaseBlock(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));
        public static final Block CORALSTONE_PILLAR = registerBlock("coralstone_pillar",
                new PillarBlock(AbstractBlock.Settings.create().requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.BONE).mapColor(MapColor.CYAN)));

        public static final Block CARAPACE_BRICKS = registerBlock("carapace_bricks",
                new Block(AbstractBlock.Settings.create().strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
        public static final Block LAYERED_CARAPACE_BRICKS = registerBlock("layered_carapace_bricks",
                new Block(AbstractBlock.Settings.create().strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
        public static final Block CRACKED_CARAPACE_BRICKS = registerBlock("cracked_carapace_bricks",
                new Block(AbstractBlock.Settings.create().strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
        public static final Block CRACKED_LAYERED_CARAPACE_BRICKS = registerBlock("cracked_layered_carapace_bricks",
                new Block(AbstractBlock.Settings.create().strength(-1.0F, 3600000.0F).dropsNothing().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));

        public static final Block EMBEDDED_CARAPACE_BRICKS = registerBlock("embedded_carapace_bricks",
                new ReplacingBlock(AbstractBlock.Settings.create().strength(10.0F, 3600000.0F).requiresTool().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));
        public static final Block LAYERED_EMBEDDED_CARAPACE_BRICKS = registerBlock("layered_embedded_carapace_bricks",
                new ReplacingBlock(AbstractBlock.Settings.create().strength(10.0F, 3600000.0F).requiresTool().allowsSpawning(Blocks::never).sounds(BlockSoundGroup.STONE).mapColor(MapColor.BLACK)));

        public static final Block DRAGON_BAMBOO = registerBlock("dragon_bamboo",
                new DragonBambooBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).solid().ticksRandomly().strength(1.2F).sounds(BlockSoundGroup.BAMBOO).nonOpaque().dynamicBounds().offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never)));
        public static final Block DRAGON_BAMBOO_SHOOT = registerBlock("dragon_bamboo_shoot",
                new DragonBambooShoot(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).solid().ticksRandomly().breakInstantly().noCollision().strength(0.1F).sounds(BlockSoundGroup.BAMBOO_SAPLING).nonOpaque().dynamicBounds().offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY).solidBlock(Blocks::never)));
        public static final Block DRAGON_BAMBOO_BLOCK = registerBlock("dragon_bamboo_block",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_BLOCK)));
        public static final Block STRIPPED_DRAGON_BAMBOO_BLOCK = registerBlock("stripped_dragon_bamboo_block",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BAMBOO_BLOCK)));
        public static final Block DRAGON_BAMBOO_PLANKS = registerBlock("dragon_bamboo_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        public static final Block DRAGON_BAMBOO_STAIRS = registerBlock("dragon_bamboo_stairs",
            new StairsBlock(ModBlocks.DRAGON_BAMBOO_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
        public static final Block DRAGON_BAMBOO_SLAB = registerBlock("dragon_bamboo_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        public static final Block DRAGON_BAMBOO_BUTTON = registerBlock("dragon_bamboo_button",
            new ButtonBlock(BlockSetType.BAMBOO,30, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).noCollision()));
        public static final Block DRAGON_BAMBOO_PRESSURE_PLATE = registerBlock("dragon_bamboo_pressure_plate",
            new PressurePlateBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        public static final Block DRAGON_BAMBOO_FENCE = registerBlock("dragon_bamboo_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));
        public static final Block DRAGON_BAMBOO_FENCE_GATE = registerBlock("dragon_bamboo_fence_gate",
            new FenceGateBlock(WoodType.BAMBOO,AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        public static final Block DRAGON_BAMBOO_DOOR = registerBlock("dragon_bamboo_door",
            new DoorBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()));
        public static final Block DRAGON_BAMBOO_TRAPDOOR = registerBlock("dragon_bamboo_trapdoor",
            new TrapdoorBlock(BlockSetType.BAMBOO, AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS).nonOpaque()));

        public static final Block DUNGEON_STONE_BUTTON = registerBlock("dungeon_stone_button",
            new ButtonBlock(BlockSetType.STONE,20, AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE).noCollision()));
        public static final Block DUNGEON_STONE_PRESSURE_PLATE = registerBlock("dungeon_stone_pressure_plate",
            new PressurePlateBlock(BlockSetType.STONE, AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE)));

    public static final Block DUNGEON_STONE_STAIRS = registerBlock("dungeon_stone_stairs",
            new StairsBlock(ModBlocks.DUNGEON_STONE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE)));
    public static final Block DUNGEON_STONE_SLAB = registerBlock("dungeon_stone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE)));

    public static final Block DUNGEON_STONE_BRICKS_STAIRS = registerBlock("dungeon_stone_bricks_stairs",
            new StairsBlock(ModBlocks.DUNGEON_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE_BRICKS)));
    public static final Block DUNGEON_STONE_BRICKS_SLAB = registerBlock("dungeon_stone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE_BRICKS)));
    public static final Block DUNGEON_STONE_BRICKS_WALL = registerBlock("dungeon_stone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DUNGEON_STONE_BRICKS)));

    public static final Block MOSSY_DUNGEON_STONE_BRICKS_STAIRS = registerBlock("mossy_dungeon_stone_bricks_stairs",
            new StairsBlock(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS)));
    public static final Block MOSSY_DUNGEON_STONE_BRICKS_SLAB = registerBlock("mossy_dungeon_stone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS)));
    public static final Block MOSSY_DUNGEON_STONE_BRICKS_WALL = registerBlock("mossy_dungeon_stone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS)));

    public static final Block DUNGEON_COBBLE_STAIRS = registerBlock("dungeon_cobble_stairs",
            new StairsBlock(ModBlocks.DUNGEON_COBBLE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.DUNGEON_COBBLE)));
    public static final Block DUNGEON_COBBLE_SLAB = registerBlock("dungeon_cobble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.DUNGEON_COBBLE)));
    public static final Block DUNGEON_COBBLE_WALL = registerBlock("dungeon_cobble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.DUNGEON_COBBLE)));

    public static final Block MOSSY_DUNGEON_COBBLE_STAIRS = registerBlock("mossy_dungeon_cobble_stairs",
            new StairsBlock(ModBlocks.MOSSY_DUNGEON_COBBLE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_COBBLE)));
    public static final Block MOSSY_DUNGEON_COBBLE_SLAB = registerBlock("mossy_dungeon_cobble_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_COBBLE)));
    public static final Block MOSSY_DUNGEON_COBBLE_WALL = registerBlock("mossy_dungeon_cobble_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MOSSY_DUNGEON_COBBLE)));

    public static final Block MIRESTONE_STAIRS = registerBlock("mirestone_stairs",
            new StairsBlock(ModBlocks.MIRESTONE.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.MIRESTONE)));
    public static final Block MIRESTONE_SLAB = registerBlock("mirestone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MIRESTONE)));

    public static final Block MIRESTONE_BRICKS_STAIRS = registerBlock("mirestone_bricks_stairs",
            new StairsBlock(ModBlocks.MIRESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.MIRESTONE_BRICKS)));
    public static final Block MIRESTONE_BRICKS_SLAB = registerBlock("mirestone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.MIRESTONE_BRICKS)));
    public static final Block MIRESTONE_BRICKS_WALL = registerBlock("mirestone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.MIRESTONE_BRICKS)));

    public static final Block CORALSTONE_STAIRS = registerBlock("coralstone_stairs",
            new StairsBlock(ModBlocks.CORALSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.CORALSTONE)));
    public static final Block CORALSTONE_SLAB = registerBlock("coralstone_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CORALSTONE)));
    public static final Block CORALSTONE_WALL = registerBlock("coralstone_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.CORALSTONE)));

    public static final Block CORALSTONE_BRICKS_STAIRS = registerBlock("coralstone_bricks_stairs",
            new StairsBlock(ModBlocks.CORALSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.copy(ModBlocks.CORALSTONE_BRICKS)));
    public static final Block CORALSTONE_BRICKS_SLAB = registerBlock("coralstone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.copy(ModBlocks.CORALSTONE_BRICKS)));
    public static final Block CORALSTONE_BRICKS_WALL = registerBlock("coralstone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.copy(ModBlocks.CORALSTONE_BRICKS)));


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
                entries.add(MIRESTONE_PILLAR);
                entries.add(MIRESTONE_PILLAR_BASE);
                entries.add(CORALSTONE);
                entries.add(CORALSTONE_BRICKS);
                entries.add(CORALSTONE_PILLAR);
                entries.add(CORALSTONE_PILLAR_BASE);
                entries.add(CARAPACE_BRICKS);
                entries.add(LAYERED_CARAPACE_BRICKS);
                entries.add(CRACKED_CARAPACE_BRICKS);
                entries.add(CRACKED_LAYERED_CARAPACE_BRICKS);
                entries.add(EMBEDDED_CARAPACE_BRICKS);
                entries.add(LAYERED_EMBEDDED_CARAPACE_BRICKS);

                entries.add(DRAGON_BAMBOO);
                entries.add(DRAGON_BAMBOO_BLOCK);
                entries.add(STRIPPED_DRAGON_BAMBOO_BLOCK);
                entries.add(DRAGON_BAMBOO_PLANKS);
            });

            // Initialize the map after blocks are registered
            ReplacingBlock.initializeReplaceBlockMap();
        }
    }