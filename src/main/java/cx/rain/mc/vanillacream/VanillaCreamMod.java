package cx.rain.mc.vanillacream;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModItems;
import cx.rain.mc.vanillacream.registries.ModCreativeModeTabs;

public class VanillaCreamMod {
    public static final String MOD_ID = "vanillacream";

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModCreativeModeTabs.register();
    }

    public static void initClient() {
    }
}
