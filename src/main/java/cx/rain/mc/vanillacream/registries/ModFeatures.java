package cx.rain.mc.vanillacream.registries;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class ModFeatures {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
}
