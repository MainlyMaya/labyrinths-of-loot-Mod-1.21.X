package net.colormaya.labyrinths_of_loot.datagen;


import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DRAGON_BAMBOO);
        addDrop(ModBlocks.DRAGON_BAMBOO_PLANKS);
        addDrop(ModBlocks.DRAGON_BAMBOO_BLOCK);
        addDrop(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK);

        addDrop(ModBlocks.DUNGEON_COBBLE);
        addDrop(ModBlocks.DUNGEON_PILLAR);
        addDrop(ModBlocks.DUNGEON_PILLAR_BASE);
        addDrop(ModBlocks.DUNGEON_STONE_BRICKS);
        addDrop(ModBlocks.MOSSY_DUNGEON_COBBLE);
        addDrop(ModBlocks.MOSSY_DUNGEON_STONE_BRICKS);

        addDrop(ModBlocks.CORALSTONE_BRICKS);
        addDrop(ModBlocks.CORALSTONE_PILLAR);
        addDrop(ModBlocks.CORALSTONE_PILLAR_BASE);

        addDrop(ModBlocks.MIRESTONE_BRICKS);
        addDrop(ModBlocks.MIRESTONE_PILLAR);
        addDrop(ModBlocks.MIRESTONE_PILLAR_BASE);

        addDrop(ModBlocks.LIMESTONE_BRICKS);
        addDrop(ModBlocks.CHISELED_LIMESTONE_BRICKS);


        addDrop(ModBlocks.MIRESTONE, multipleOreDrops(ModBlocks.MIRESTONE, ModItems.MIRE_BALL, 4, 4));
        addDrop(ModBlocks.CORALSTONE, multipleOreDrops(ModBlocks.CORALSTONE, ModItems.CORAL_FRAGMENTS, 2, 4));



        }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

}
