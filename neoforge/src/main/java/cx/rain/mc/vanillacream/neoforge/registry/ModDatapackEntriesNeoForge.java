package cx.rain.mc.vanillacream.neoforge.registry;

import cx.rain.mc.vanillacream.registries.ModDatapackEntries;
import net.minecraft.core.RegistrySetBuilder;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModDatapackEntriesNeoForge {
    public static final RegistrySetBuilder BUILDER = ModDatapackEntries.BUILDER
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifications::bootstrap);
}
