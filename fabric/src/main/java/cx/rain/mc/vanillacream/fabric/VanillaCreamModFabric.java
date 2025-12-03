package cx.rain.mc.vanillacream.fabric;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import net.fabricmc.api.ModInitializer;

public class VanillaCreamModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VanillaCreamMod.init();
    }
}
