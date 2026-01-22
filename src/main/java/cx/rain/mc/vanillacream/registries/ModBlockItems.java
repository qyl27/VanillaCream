package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegRef;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModBlockItems {
    public static final IRegistry<Item> REGISTRY = RegistryManager.create(VanillaCreamMod.MOD_ID, Registries.ITEM);

    public static final IRegRef<BlockItem> ROSE = REGISTRY.register("rose", () -> new BlockItem(ModBlocks.ROSE.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));
    public static final IRegRef<BlockItem> CYAN_ROSE = REGISTRY.register("cyan_rose", () -> new BlockItem(ModBlocks.CYAN_ROSE.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));
    public static final IRegRef<BlockItem> PAEONIA = REGISTRY.register("paeonia", () -> new BlockItem(ModBlocks.PAEONIA.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));

    public static final IRegRef<BlockItem> REDSTONE_JACK_O_LANTERN = REGISTRY.register("redstone_jack_o_lantern", () -> new BlockItem(ModBlocks.REDSTONE_JACK_O_LANTERN.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS).sino$tab(CreativeModeTabs.REDSTONE_BLOCKS)));
    public static final IRegRef<BlockItem> SOUL_JACK_O_LANTERN = REGISTRY.register("soul_jack_o_lantern", () -> new BlockItem(ModBlocks.SOUL_JACK_O_LANTERN.get(), new Item.Properties().sino$tab(ModCreativeModeTabs.TAB).sino$tab(CreativeModeTabs.NATURAL_BLOCKS)));

    // Todo: You're in 1.21.9
//    public static final IRegRef<BlockItem> COPPER_JACK_O_LANTERN = REGISTRY.register("copper_jack_o_lantern", () -> new BlockItem(ModBlocks.COPPER_JACK_O_LANTERN.get(), new Item.Properties()));

    public static void register() {
        REGISTRY.register();
    }
}
