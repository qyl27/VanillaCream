package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.VANILLA_SMALL_FLOWERS_BLOCK).add(ModBlocks.ROSE.get(), ModBlocks.CYAN_ROSE.get(), ModBlocks.PAEONIA.get());
        tag(ModTags.VANILLA_FLOWER_POTS_BLOCK).add(ModBlocks.POTTED_ROSE.get(), ModBlocks.POTTED_CYAN_ROSE.get(), ModBlocks.POTTED_PAEONIA.get());
    }
}
