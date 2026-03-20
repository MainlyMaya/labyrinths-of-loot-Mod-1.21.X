package net.colormaya.labyrinths_of_loot.datagen;

import net.colormaya.labyrinths_of_loot.LabyrinthsOfLoot;
import net.colormaya.labyrinths_of_loot.block.ModBlocks;
import net.colormaya.labyrinths_of_loot.item.ModItems;
import net.colormaya.labyrinths_of_loot.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.StonecuttingRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        List<ItemConvertible> MIRES_BRICK_SMELTABLES = List.of(ModItems.MIRE_BALL);
        List<ItemConvertible> MIRESTONE_BRICKS_SMELTABLES = List.of(ModItems.MIRE_BALL, ModBlocks.MIRESTONE);
        List<ItemConvertible> DUNGEON_BRICKS_SMELTABLES = List.of( ModBlocks.DUNGEON_COBBLE);

        offerSmelting(exporter, DUNGEON_BRICKS_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUNGEON_STONE,0.25f,200,"dungeon_stone");
        offerBlasting(exporter, DUNGEON_BRICKS_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUNGEON_STONE,0.25f,200,"dungeon_stone");

        offerSmelting(exporter, MIRESTONE_BRICKS_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE_BRICKS,0.25f,200,"mirestone_bricks");
        offerBlasting(exporter, MIRESTONE_BRICKS_SMELTABLES, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE_BRICKS,0.25f,100,"mirestone_bricks");

        offerSmelting(exporter, MIRES_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.MIRE_BRICK,0.25f,160,"mirestone_brick");
        offerBlasting(exporter, MIRES_BRICK_SMELTABLES, RecipeCategory.MISC, ModItems.MIRE_BRICK,0.25f,80,"mirestone_brick");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRAGON_BAMBOO_PLANKS,2)
                .input(ModBlocks.DRAGON_BAMBOO_BLOCK)
                .criterion(hasItem(ModBlocks.DRAGON_BAMBOO_BLOCK), conditionsFromItem(ModBlocks.DRAGON_BAMBOO_BLOCK))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dragon_bamboo_planks_from_bamboo_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.DRAGON_BAMBOO_PLANKS,2)
                .input(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK)
                .criterion(hasItem(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK), conditionsFromItem(ModBlocks.STRIPPED_DRAGON_BAMBOO_BLOCK))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dragon_bamboo_planks_from_stripped_bamboo_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMESTONE_BRICKS,1)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModItems.LIMESTONE_CHUNK)
                .criterion(hasItem(ModItems.LIMESTONE_CHUNK), conditionsFromItem(ModItems.LIMESTONE_CHUNK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUNGEON_STONE_BRICKS,4)
                .pattern("SS")
                .pattern("SS")
                .input('S', ModBlocks.DUNGEON_STONE)
                .criterion(hasItem(ModBlocks.DUNGEON_STONE), conditionsFromItem(ModBlocks.DUNGEON_STONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORALSTONE)
                .pattern("FF")
                .pattern("FF")
                .input('F', ModItems.CORAL_FRAGMENTS)
                .criterion(hasItem(ModItems.CORAL_FRAGMENTS), conditionsFromItem(ModItems.CORAL_FRAGMENTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModItems.MIRE_BALL)
                .criterion(hasItem(ModItems.MIRE_BALL), conditionsFromItem(ModItems.MIRE_BALL))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE_BRICKS)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModItems.MIRE_BRICK)
                .criterion(hasItem(ModItems.MIRE_BRICK), conditionsFromItem(ModItems.MIRE_BRICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRAGON_BAMBOO_BLOCK)
                .pattern("BB")
                .pattern("BB")
                .input('B', ModItems.DRAGON_BAMBOO)
                .criterion(hasItem(ModItems.DRAGON_BAMBOO), conditionsFromItem(ModItems.DRAGON_BAMBOO))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORALSTONE_BRICKS,2)
                .pattern("FP")
                .pattern("PF")
                .input('F', ModItems.CORAL_FRAGMENTS)
                .input('P', Items.PRISMARINE_SHARD)
                .criterion(hasItem(ModItems.CORAL_FRAGMENTS), conditionsFromItem(ModItems.CORAL_FRAGMENTS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE_PILLAR,2)
                .pattern("B")
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.MIRESTONE_BRICKS)
                .criterion(hasItem(ModBlocks.MIRESTONE_BRICKS), conditionsFromItem(ModBlocks.MIRESTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORALSTONE_PILLAR,2)
                .pattern("B")
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.CORALSTONE_BRICKS)
                .criterion(hasItem(ModBlocks.CORALSTONE_BRICKS), conditionsFromItem(ModBlocks.CORALSTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUNGEON_PILLAR,2)
                .pattern("B")
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.DUNGEON_STONE_BRICKS)
                .criterion(hasItem(ModBlocks.DUNGEON_STONE_BRICKS), conditionsFromItem(ModBlocks.DUNGEON_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIRESTONE_PILLAR_BASE,1)
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.MIRESTONE_PILLAR)
                .criterion(hasItem(ModBlocks.MIRESTONE_PILLAR), conditionsFromItem(ModBlocks.MIRESTONE_PILLAR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORALSTONE_PILLAR_BASE,1)
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.CORALSTONE_PILLAR)
                .criterion(hasItem(ModBlocks.CORALSTONE_PILLAR), conditionsFromItem(ModBlocks.CORALSTONE_PILLAR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DUNGEON_PILLAR_BASE,1)
                .pattern("B")
                .pattern("B")
                .input('B', ModBlocks.DUNGEON_PILLAR)
                .criterion(hasItem(ModBlocks.DUNGEON_PILLAR), conditionsFromItem(ModBlocks.DUNGEON_PILLAR))
                .offerTo(exporter);

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DUNGEON_STONE), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.DUNGEON_STONE_BRICKS,1)
                .criterion(hasItem(ModBlocks.DUNGEON_STONE), conditionsFromItem(ModBlocks.DUNGEON_STONE))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dungeon_stone_bricks_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DUNGEON_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.DUNGEON_PILLAR,1)
                .criterion(hasItem(ModBlocks.DUNGEON_STONE_BRICKS), conditionsFromItem(ModBlocks.DUNGEON_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dungeon_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DUNGEON_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.DUNGEON_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.DUNGEON_STONE_BRICKS), conditionsFromItem(ModBlocks.DUNGEON_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dungeon_pillar_base_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DUNGEON_PILLAR), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.DUNGEON_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.DUNGEON_PILLAR), conditionsFromItem(ModBlocks.DUNGEON_PILLAR))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dungeon_pillar_base_from_dungeon_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.DUNGEON_PILLAR_BASE), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.DUNGEON_PILLAR,1)
                .criterion(hasItem(ModBlocks.DUNGEON_PILLAR_BASE), conditionsFromItem(ModBlocks.DUNGEON_PILLAR_BASE))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"dungeon_pillar_from_dungeon_pillar_base_from_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.MIRESTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.MIRESTONE_PILLAR,1)
                .criterion(hasItem(ModBlocks.MIRESTONE_BRICKS), conditionsFromItem(ModBlocks.MIRESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"mirestone_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.MIRESTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.MIRESTONE_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.MIRESTONE_BRICKS), conditionsFromItem(ModBlocks.MIRESTONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"mirestone_pillar_base_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.MIRESTONE_PILLAR), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.MIRESTONE_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.MIRESTONE_PILLAR), conditionsFromItem(ModBlocks.MIRESTONE_PILLAR))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"mirestone_pillar_base_from_mirestone_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.MIRESTONE_PILLAR_BASE), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.MIRESTONE_PILLAR,1)
                .criterion(hasItem(ModBlocks.MIRESTONE_PILLAR_BASE), conditionsFromItem(ModBlocks.MIRESTONE_PILLAR_BASE))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"mirestone_pillar_from_mirestone_pillar_base_from_stonecutting"));

        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.CORALSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CORALSTONE_PILLAR,1)
                .criterion(hasItem(ModBlocks.CORALSTONE_BRICKS), conditionsFromItem(ModBlocks.CORALSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"coralstone_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.CORALSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CORALSTONE_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.CORALSTONE_BRICKS), conditionsFromItem(ModBlocks.CORALSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"coralstone_pillar_base_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.CORALSTONE_PILLAR), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CORALSTONE_PILLAR_BASE,1)
                .criterion(hasItem(ModBlocks.CORALSTONE_PILLAR), conditionsFromItem(ModBlocks.CORALSTONE_PILLAR))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"coralstone_pillar_base_from_coralstone_pillar_from_stonecutting"));
        StonecuttingRecipeJsonBuilder.createStonecutting(Ingredient.ofItems(ModBlocks.CORALSTONE_PILLAR_BASE), RecipeCategory.BUILDING_BLOCKS ,ModBlocks.CORALSTONE_PILLAR,1)
                .criterion(hasItem(ModBlocks.CORALSTONE_PILLAR_BASE), conditionsFromItem(ModBlocks.CORALSTONE_PILLAR_BASE))
                .offerTo(exporter, Identifier.of(LabyrinthsOfLoot.MOD_ID,"coralstone_pillar_from_coralstone_pillar_base_from_stonecutting"));
    }
}
