package cx.rain.mc.vanillacream.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;

import static cx.rain.mc.vanillacream.util.ResourceLocationHelper.modLoc;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_ROSE = ResourceKey.create(Registries.CONFIGURED_FEATURE, modLoc("flower_rose"));
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_PAEONIA = ResourceKey.create(Registries.CONFIGURED_FEATURE, modLoc("flower_paeonia"));

    private static RandomPatchConfiguration grassPatch(BlockStateProvider stateProvider, int tries) {
        return new RandomPatchConfiguration(tries, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(stateProvider)));
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        FeatureUtils.register(context, FLOWER_ROSE, Feature.FLOWER, grassPatch(new WeightedStateProvider(
                SimpleWeightedRandomList.<BlockState>builder()
                        .add(ModBlocks.ROSE.get().defaultBlockState(), 9)
                        .add(ModBlocks.CYAN_ROSE.get().defaultBlockState(), 1)
        ), 24));
        FeatureUtils.register(context, FLOWER_PAEONIA, Feature.FLOWER, grassPatch(BlockStateProvider.simple(ModBlocks.PAEONIA.get()), 32));
    }
}
