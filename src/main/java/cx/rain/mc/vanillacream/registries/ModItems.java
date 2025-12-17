package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegRef;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final IRegistry<Item> REGISTRY = RegistryManager.create(VanillaCreamMod.MOD_ID, Registries.ITEM);

    public static final IRegRef<BlockItem> ROSE = REGISTRY.register("rose", () -> new BlockItem(ModBlocks.ROSE.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS, true)));
    public static final IRegRef<BlockItem> CYAN_ROSE = REGISTRY.register("cyan_rose", () -> new BlockItem(ModBlocks.CYAN_ROSE.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));
    public static final IRegRef<BlockItem> PAEONIA = REGISTRY.register("paeonia", () -> new BlockItem(ModBlocks.PAEONIA.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));

    public static void register() {
        REGISTRY.register();
    }
}
