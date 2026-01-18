package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static cx.rain.mc.vanillacream.util.ResourceLocationHelper.modLoc;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput, HolderLookup.Provider holderLookup) {
        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BAGUETTE.get())
                .pattern("  W")
                .pattern(" W ")
                .pattern("W  ")
                .define('W', Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.CALCITE, 2)
                .requires(Items.DIORITE)
                .requires(Items.DRIPSTONE_BLOCK)
                .unlockedBy("has_diorite", has(Items.DIORITE))
                .unlockedBy("has_dripstone_block", has(Items.DRIPSTONE_BLOCK))
                .save(recipeOutput, modLoc("calcite"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 2)
                .requires(Items.ANDESITE)
                .requires(Items.BASALT)
                .unlockedBy("has_andesite", has(Items.ANDESITE))
                .unlockedBy("has_basalt", has(Items.BASALT))
                .save(recipeOutput, modLoc("tuff"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DEEPSLATE, 2)
                .requires(Items.STONE)
                .requires(Items.BASALT)
                .unlockedBy("has_stone", has(Items.STONE))
                .unlockedBy("has_basalt", has(Items.BASALT))
                .save(recipeOutput, modLoc("deepslate"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, Items.BLACKSTONE, 2)
                .requires(Items.DEEPSLATE)
                .requires(Items.BASALT)
                .unlockedBy("has_stone", has(Items.STONE))
                .unlockedBy("has_basalt", has(Items.BASALT))
                .save(recipeOutput, modLoc("blackstone"));
    }
}
