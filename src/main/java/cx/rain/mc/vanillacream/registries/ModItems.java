package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegRef;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final IRegistry<Item> REGISTRY = RegistryManager.create(VanillaCreamMod.MOD_ID, Registries.ITEM);

    public static final IRegRef<Item> BAGUETTE = REGISTRY.register("baguette", () -> new Item(new Item.Properties()
            .food(ModFoods.BAGUETTE)
            .sino$tab(ModCreativeModeTabs.TAB)
            .sino$tab(CreativeModeTabs.FOOD_AND_DRINKS)
    ));

    public static void register() {
        REGISTRY.register();
    }
}
