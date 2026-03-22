package net.colormaya.labyrinths_of_loot.item;

import net.colormaya.labyrinths_of_loot.LabyrinthsOfLoot;
import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LABYRINTHS_OF_LOOT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP ,
            Identifier.of(LabyrinthsOfLoot.MOD_ID, "labyrinths_of_loot_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.DUNGEON_STONE_BRICKS))
                    .displayName(Text.translatable("itemgroup.labyrinths_of_loot.items"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModBlocks.DUNGEON_STONE);
                        entries.add(ModBlocks.DUNGEON_STONE_SLAB);
                        entries.add(ModBlocks.DUNGEON_STONE_STAIRS);

                        entries.add(ModBlocks.DUNGEON_COBBLE);
                        entries.add(ModBlocks.DUNGEON_COBBLE_SLAB);
                        entries.add(ModBlocks.DUNGEON_COBBLE_STAIRS);
                        entries.add(ModBlocks.DUNGEON_COBBLE_WALL);

                        entries.add(ModBlocks.DUNGEON_STONE_BRICKS);
                        entries.add(ModBlocks.DUNGEON_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.DUNGEON_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.DUNGEON_STONE_BRICKS_WALL);

                        entries.add(ModBlocks.DUNGEON_PILLAR);
                        entries.add(ModBlocks.DUNGEON_PILLAR_BASE);

                        entries.add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS_WALL);

                        entries.add(ModBlocks.MOSSY_DUNGEON_COBBLE);
                        entries.add(ModBlocks.MOSSY_DUNGEON_COBBLE_WALL);
                        entries.add(ModBlocks.MOSSY_DUNGEON_COBBLE_SLAB);
                        entries.add(ModBlocks.MOSSY_DUNGEON_COBBLE_STAIRS);

                        entries.add(ModItems.MIRE_BALL);
                        entries.add(ModItems.MIRE_BRICK);

                        entries.add(ModBlocks.MIRESTONE);
                        entries.add(ModBlocks.MIRESTONE_SLAB);
                        entries.add(ModBlocks.MIRESTONE_STAIRS);

                        entries.add(ModBlocks.MIRESTONE_BRICKS);
                        entries.add(ModBlocks.MIRESTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.MIRESTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.MIRESTONE_BRICKS_WALL);

                        entries.add(ModBlocks.MIRESTONE_PILLAR);
                        entries.add(ModBlocks.MIRESTONE_PILLAR_BASE);

                        entries.add(ModItems.LIMESTONE_CHUNK);

                        entries.add(ModBlocks.LIMESTONE_BRICKS);
                        entries.add(ModBlocks.CHISELED_LIMESTONE_BRICKS);

                        entries.add(ModItems.CORAL_FRAGMENTS);

                        entries.add(ModBlocks.CORALSTONE);
                        entries.add(ModBlocks.CORALSTONE_SLAB);
                        entries.add(ModBlocks.CORALSTONE_STAIRS);
                        entries.add(ModBlocks.CORALSTONE_WALL);

                        entries.add(ModBlocks.CORALSTONE_BRICKS);
                        entries.add(ModBlocks.CORALSTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.CORALSTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CORALSTONE_BRICKS_WALL);

                        entries.add(ModBlocks.CORALSTONE_PILLAR);
                        entries.add(ModBlocks.CORALSTONE_PILLAR_BASE);

                        entries.add(ModBlocks.CARAPACE_BRICKS);
                        entries.add(ModBlocks.LAYERED_CARAPACE_BRICKS);
                        entries.add(ModBlocks.CRACKED_CARAPACE_BRICKS);
                        entries.add(ModBlocks.CRACKED_LAYERED_CARAPACE_BRICKS);
                        entries.add(ModBlocks.EMBEDDED_CARAPACE_BRICKS);
                        entries.add(ModBlocks.LAYERED_EMBEDDED_CARAPACE_BRICKS);

                        entries.add(ModBlocks.DRAGON_BAMBOO);
                        entries.add(ModBlocks.DRAGON_BAMBOO_BLOCK);
                        entries.add(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK);
                        entries.add(ModBlocks.DRAGON_BAMBOO_PLANKS);
                        entries.add(ModBlocks.DRAGON_BAMBOO_STAIRS);
                        entries.add(ModBlocks.DRAGON_BAMBOO_SLAB);
                        entries.add(ModBlocks.DRAGON_BAMBOO_DOOR);
                        entries.add(ModBlocks.DRAGON_BAMBOO_TRAPDOOR);
                        entries.add(ModBlocks.DRAGON_BAMBOO_FENCE);
                        entries.add(ModBlocks.DRAGON_BAMBOO_FENCE_GATE);
                        entries.add(ModBlocks.DRAGON_BAMBOO_PRESSURE_PLATE);
                        entries.add(ModBlocks.DRAGON_BAMBOO_BUTTON);


                    })

                .build());


    public static void registerItemGroups () {
        LabyrinthsOfLoot.LOGGER.info("Registering Item Groups for " + LabyrinthsOfLoot.MOD_ID);
    }

}
