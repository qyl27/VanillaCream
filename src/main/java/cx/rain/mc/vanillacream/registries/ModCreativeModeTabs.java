package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.ITabRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;

public class ModCreativeModeTabs {
    public static final ITabRegistry REGISTRY = RegistryManager.createTab(VanillaCreamMod.MOD_ID);

    public static final ResourceKey<CreativeModeTab> TAB = REGISTRY.register("tab");

    public static void register() {
        REGISTRY.register();
    }
}
