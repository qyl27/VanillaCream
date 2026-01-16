package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModBlockItems;
import cx.rain.mc.vanillacream.registries.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries,
                               CompletableFuture<TagLookup<Block>> blockTags,
                               String modId,
                               @Nullable ExistingFileHelper existingFileHelper) {
        super(output, registries, blockTags, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Item.VANILLA_SMALL_FLOWERS).add(ModBlockItems.ROSE.get(), ModBlockItems.CYAN_ROSE.get(), ModBlockItems.PAEONIA.get());
    }
}
