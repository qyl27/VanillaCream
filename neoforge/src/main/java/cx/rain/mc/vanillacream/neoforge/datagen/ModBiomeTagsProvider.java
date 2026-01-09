package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagsProvider extends TagsProvider<Biome> {
    protected ModBiomeTagsProvider(PackOutput output,
                                   CompletableFuture<HolderLookup.Provider> registries,
                                   String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.BIOME, registries, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.HAS_ROSE_BIOME)
                .add(Biomes.FOREST, Biomes.FLOWER_FOREST, Biomes.BIRCH_FOREST, Biomes.OLD_GROWTH_BIRCH_FOREST,
                        Biomes.PLAINS, Biomes.SUNFLOWER_PLAINS, Biomes.RIVER, Biomes.BEACH,
                        Biomes.SWAMP, Biomes.SPARSE_JUNGLE);
        tag(ModTags.HAS_PAEONIA_BIOME)
                .add(Biomes.WINDSWEPT_FOREST, Biomes.MEADOW, Biomes.OLD_GROWTH_SPRUCE_TAIGA, Biomes.OLD_GROWTH_PINE_TAIGA)
                .addTag(BiomeTags.IS_SAVANNA);
    }
}
