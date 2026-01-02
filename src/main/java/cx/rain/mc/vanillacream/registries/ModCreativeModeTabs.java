package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegRef;
import games.moegirl.sinocraft.sinocore.api.registry.ITabRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final ITabRegistry REGISTRY = RegistryManager.createTab(VanillaCreamMod.MOD_ID);

    public static final IRegRef<CreativeModeTab> TAB = REGISTRY.register("tab", builder -> {
        builder.icon(() -> new ItemStack(ModBlockItems.PAEONIA.get()));
    });

    public static void register() {
        REGISTRY.register();
    }
}
