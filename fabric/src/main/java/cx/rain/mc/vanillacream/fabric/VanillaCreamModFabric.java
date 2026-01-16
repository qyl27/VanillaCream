package cx.rain.mc.vanillacream.fabric;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import cx.rain.mc.vanillacream.registries.ModPlacedFeatures;
import cx.rain.mc.vanillacream.registries.ModTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.minecraft.world.level.levelgen.GenerationStep;

public class VanillaCreamModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VanillaCreamMod.init();

        BiomeModifications.addFeature(biome -> biome.hasTag(ModTags.Biome.HAS_ROSE), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.FLOWER_ROSE);
        BiomeModifications.addFeature(biome -> biome.hasTag(ModTags.Biome.HAS_PAEONIA), GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacedFeatures.FLOWER_PAEONIA);
    }
}
