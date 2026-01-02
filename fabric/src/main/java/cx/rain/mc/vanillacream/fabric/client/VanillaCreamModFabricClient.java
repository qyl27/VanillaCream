package cx.rain.mc.vanillacream.fabric.client;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import cx.rain.mc.vanillacream.registries.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class VanillaCreamModFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        VanillaCreamMod.initClient();
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutout(),
                ModBlocks.ROSE.get(), ModBlocks.CYAN_ROSE.get(), ModBlocks.PAEONIA.get(),
                ModBlocks.POTTED_ROSE.get(), ModBlocks.POTTED_CYAN_ROSE.get(), ModBlocks.POTTED_PAEONIA.get()
        );
    }
}
