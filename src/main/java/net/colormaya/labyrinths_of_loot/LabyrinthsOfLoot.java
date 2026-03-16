package net.colormaya.labyrinths_of_loot;

import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LabyrinthsOfLoot implements ModInitializer {
	public static final String MOD_ID = "labyrinths_of_loot";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
