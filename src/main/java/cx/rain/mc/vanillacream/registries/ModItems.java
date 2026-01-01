package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final IRegistry<Item> REGISTRY = RegistryManager.create(VanillaCreamMod.MOD_ID, Registries.ITEM);

    public static void register() {
        REGISTRY.register();
    }
}
