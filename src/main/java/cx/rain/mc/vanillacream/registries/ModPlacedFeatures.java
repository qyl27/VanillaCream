package cx.rain.mc.vanillacream.registries;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.Arrays;

import static cx.rain.mc.vanillacream.util.ResourceLocationHelper.modLoc;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> FLOWER_ROSE = ResourceKey.create(Registries.PLACED_FEATURE, modLoc("flower_rose"));
    public static final ResourceKey<PlacedFeature> FLOWER_PAEONIA = ResourceKey.create(Registries.PLACED_FEATURE, modLoc("flower_paeonia"));

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        placedFlower(context, FLOWER_ROSE, ModConfiguredFeatures.FLOWER_ROSE);
        placedFlower(context, FLOWER_PAEONIA, ModConfiguredFeatures.FLOWER_PAEONIA);
    }

    private static void placed(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, PlacementModifier... placements) {
        PlacementUtils.register(context, key, feature, Arrays.asList(placements));
    }

    private static void placedFlower(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, ResourceKey<ConfiguredFeature<?, ?>> feature) {
        var featureHolder = context.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(feature);
        placed(context, key, featureHolder,
                RarityFilter.onAverageOnceEvery(32),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP,
                BiomeFilter.biome());
    }
}
