package cx.rain.mc.vanillacream;

import cx.rain.mc.vanillacream.registries.*;

public class VanillaCreamMod {
    public static final String MOD_ID = "vanillacream";

    public static void init() {
        ModBlocks.register();
        ModBlockItems.register();
        ModItems.register();
        ModCreativeModeTabs.register();
        ModEvents.register();
    }

    public static void initClient() {
    }
}
