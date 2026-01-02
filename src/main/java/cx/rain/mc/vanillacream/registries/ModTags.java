package cx.rain.mc.vanillacream.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static cx.rain.mc.vanillacream.util.ResourceLocationHelper.mcLoc;

public class ModTags {
    public static final TagKey<Block> VANILLA_SMALL_FLOWERS_BLOCK = TagKey.create(Registries.BLOCK, mcLoc("small_flowers"));
    public static final TagKey<Block> VANILLA_FLOWER_POTS_BLOCK = TagKey.create(Registries.BLOCK, mcLoc("flower_pots"));

    public static final TagKey<Item> VANILLA_SMALL_FLOWERS_ITEM = TagKey.create(Registries.ITEM, mcLoc("small_flowers"));
}
