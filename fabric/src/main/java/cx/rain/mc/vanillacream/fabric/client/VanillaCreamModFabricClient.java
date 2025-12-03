package cx.rain.mc.vanillacream.fabric.client;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import net.fabricmc.api.ClientModInitializer;

public class VanillaCreamModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VanillaCreamMod.initClient();
    }
}
