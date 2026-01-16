package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.world.entity.EntityType;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModEntityTagsProvider extends IntrinsicHolderTagsProvider<EntityType<?>> {
    @SuppressWarnings("deprecation")
    public ModEntityTagsProvider(PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> registries,
                                 String modId,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.ENTITY_TYPE, registries, e -> e.builtInRegistryHolder().getKey(),
                modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Entity.CAN_GROW)
                .add(EntityType.ARMADILLO, EntityType.AXOLOTL, EntityType.BEE, EntityType.CAMEL,
                        EntityType.CAT, EntityType.CHICKEN, EntityType.COW, EntityType.DOLPHIN,
                        EntityType.DONKEY, EntityType.FOX, EntityType.GOAT, EntityType.HOGLIN,
                        EntityType.HORSE, EntityType.MOOSHROOM, EntityType.MULE, EntityType.OCELOT,
                        EntityType.PANDA, EntityType.PARROT, EntityType.PIG, EntityType.POLAR_BEAR,
                        EntityType.RABBIT, EntityType.SHEEP, EntityType.LLAMA, EntityType.OCELOT,
                        EntityType.SNIFFER, EntityType.STRIDER, EntityType.TRADER_LLAMA, EntityType.TURTLE,
                        EntityType.VILLAGER, EntityType.WOLF);

        tag(ModTags.Entity.HAS_BABY)
                .addTag(ModTags.Entity.CAN_GROW)
                .add(EntityType.FROG)
                .add(EntityType.SKELETON_HORSE, EntityType.ZOMBIE_HORSE)
                .add(EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, EntityType.HUSK)
                .add(EntityType.PIGLIN, EntityType.PIGLIN_BRUTE, EntityType.ZOMBIFIED_PIGLIN, EntityType.ZOGLIN);
    }
}
