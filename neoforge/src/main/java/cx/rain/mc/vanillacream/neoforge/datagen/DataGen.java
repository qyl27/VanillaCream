package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;

@EventBusSubscriber(modid = VanillaCreamMod.MOD_ID)
public class DataGen {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        var gen = event.getGenerator();
        var existingFileHelper = event.getExistingFileHelper();
        var output = gen.getPackOutput();
        var registries = event.getLookupProvider();

        if (event.includeClient()) {
            event.addProvider(new ModBlockStateProvider(output, VanillaCreamMod.MOD_ID, existingFileHelper, List.of(ModBlocks.REGISTRY)));
            event.addProvider(new ModItemModelProvider(output, VanillaCreamMod.MOD_ID, existingFileHelper, List.of(ModItems.REGISTRY)));
        }

        if (event.includeServer()) {
            event.addProvider(new ModBlockTagsProvider(output, registries, VanillaCreamMod.MOD_ID, existingFileHelper));
        }
    }
}
