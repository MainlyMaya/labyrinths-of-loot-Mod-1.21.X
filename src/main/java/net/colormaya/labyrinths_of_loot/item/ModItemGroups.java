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
            Identifier.of(LabyrinthsOfLoot.MOD_ID, "Labyrinths_of_loot_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.DUNGEON_STONE_BRICKS))
                    .displayName(Text.translatable("itemgroup.labyrinths_of_loot.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LIMESTONE_CHUNK);
                        entries.add(ModItems.MIRE_BALL);
                        entries.add(ModBlocks.DUNGEON_STONE);
                        entries.add(ModBlocks.DUNGEON_PILLAR);
                        entries.add(ModBlocks.DUNGEON_PILLAR_BASE);
                        entries.add(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS);
                        entries.add(ModBlocks.MOSSY_DUNGEON_COBBLE);
                        entries.add(ModBlocks.MIRESTONE);
                        entries.add(ModBlocks.MIRESTONE_BRICKS);
                        entries.add(ModBlocks.LIMESTONE_BRICKS);
                        entries.add(ModBlocks.CHISELED_LIMESTONE_BRICKS);
                        entries.add(ModBlocks.CORALSTONE);
                        entries.add(ModBlocks.CORALSTONE_BRICKS);

                    })

                .build());


    public static void registerItemGroups () {
        LabyrinthsOfLoot.LOGGER.info("Registering Item Groups for " + LabyrinthsOfLoot.MOD_ID);
    }

}
