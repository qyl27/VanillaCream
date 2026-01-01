package cx.rain.mc.vanillacream;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModBlockItems;
import cx.rain.mc.vanillacream.registries.ModCreativeModeTabs;
import cx.rain.mc.vanillacream.registries.ModItems;

public class VanillaCreamMod {
    public static final String MOD_ID = "vanillacream";

    public static void init() {
        ModBlocks.register();
        ModBlockItems.register();
        ModItems.register();
        ModCreativeModeTabs.register();
    }

    public static void initClient() {
    }
}
