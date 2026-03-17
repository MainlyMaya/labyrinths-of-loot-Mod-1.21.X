package net.colormaya.labyrinths_of_loot.item;

import net.colormaya.labyrinths_of_loot.LabyrinthsOfLoot;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



    public class ModItems {
        public static final Item LIMESTONE_CHUNK = registerItem("limestone_chunk", new Item(new Item.Settings()));
        public static final Item MIRE_BALL = registerItem("mire_ball", new Item(new Item.Settings()));
        public static final Item MIRE_BRICK = registerItem("mire_brick", new Item(new Item.Settings()));
        public static final Item CORAL_FRAGMENTS = registerItem("coral_fragments", new Item(new Item.Settings()));

        private static Item registerItem(String name, Item item) {
            return Registry.register(Registries.ITEM, Identifier.of(LabyrinthsOfLoot.MOD_ID, name), item);
        }

        public static void registerModItems() {
            LabyrinthsOfLoot.LOGGER.info("Registering Mod Items for " + LabyrinthsOfLoot.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                entries.add(LIMESTONE_CHUNK);
                entries.add(MIRE_BALL);
                entries.add(MIRE_BRICK);
                entries.add(CORAL_FRAGMENTS);
            });

        }
    }

