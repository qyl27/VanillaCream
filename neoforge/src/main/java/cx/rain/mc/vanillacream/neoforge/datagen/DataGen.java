package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import cx.rain.mc.vanillacream.neoforge.datagen.language.ModEnUsProvider;
import cx.rain.mc.vanillacream.neoforge.datagen.language.ModZhCnProvider;
import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModFeatures;
import cx.rain.mc.vanillacream.registries.ModItems;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

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
            event.addProvider(new ModZhCnProvider(output, VanillaCreamMod.MOD_ID, "zh_cn"));
            event.addProvider(new ModEnUsProvider(output, VanillaCreamMod.MOD_ID, "en_us"));
        }

        if (event.includeServer()) {
            event.addProvider(new ModBlockTagsProvider(output, registries, VanillaCreamMod.MOD_ID, existingFileHelper));
            event.addProvider(new ModRecipeProvider(output, registries));
            event.addProvider(new DatapackBuiltinEntriesProvider(output, registries, ModFeatures.BUILDER, Set.of(VanillaCreamMod.MOD_ID)));
        }
    }
}
