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
    public ModBlockTagsProvider(PackOutput output,
                                CompletableFuture<HolderLookup.Provider> registries,
                                String modId,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, registries, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Block.VANILLA_SMALL_FLOWERS).add(ModBlocks.ROSE.get(), ModBlocks.CYAN_ROSE.get(), ModBlocks.PAEONIA.get());
        tag(ModTags.Block.VANILLA_FLOWER_POTS).add(ModBlocks.POTTED_ROSE.get(), ModBlocks.POTTED_CYAN_ROSE.get(), ModBlocks.POTTED_PAEONIA.get());
    }
}
