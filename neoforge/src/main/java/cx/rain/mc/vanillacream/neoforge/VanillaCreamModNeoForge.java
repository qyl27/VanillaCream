package cx.rain.mc.vanillacream.neoforge;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(VanillaCreamMod.MOD_ID)
public class VanillaCreamModNeoForge {
    public VanillaCreamModNeoForge(ModContainer container, IEventBus bus) {
        bus.addListener(this::setupClient);

        VanillaCreamMod.init();
    }

    private void setupClient(FMLClientSetupEvent event) {
        VanillaCreamMod.initClient();
    }
}
