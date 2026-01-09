package cx.rain.mc.vanillacream.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import static cx.rain.mc.vanillacream.util.ResourceLocationHelper.modLoc;

public class ModConfiguredFeatures {
    private static final SimpleBlockConfiguration FLOWER_ROSE_CONFIG = new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ROSE.get()));
    private static final SimpleBlockConfiguration FLOWER_CYAN_ROSE_CONFIG = new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CYAN_ROSE.get()));
    private static final SimpleBlockConfiguration FLOWER_PAEONIA_CONFIG = new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PAEONIA.get()));

    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_ROSE = ResourceKey.create(Registries.CONFIGURED_FEATURE, modLoc("flower_rose"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_CYAN_ROSE = ResourceKey.create(Registries.CONFIGURED_FEATURE, modLoc("flower_cyan_rose"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_PAEONIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, modLoc("flower_paeonia"));

    private static RandomPatchConfiguration createFlowerConfig(SimpleBlockConfiguration blockConfig) {
        return new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, blockConfig));
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        FeatureUtils.register(context, FLOWER_ROSE, Feature.FLOWER, createFlowerConfig(FLOWER_ROSE_CONFIG));
        FeatureUtils.register(context, FLOWER_CYAN_ROSE, Feature.FLOWER, createFlowerConfig(FLOWER_CYAN_ROSE_CONFIG));
        FeatureUtils.register(context, FLOWER_PAEONIA, Feature.FLOWER, createFlowerConfig(FLOWER_PAEONIA_CONFIG));
    }
}
