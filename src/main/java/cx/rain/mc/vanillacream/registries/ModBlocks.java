package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import games.moegirl.sinocraft.sinocore.api.registry.IRegRef;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.api.registry.RegistryManager;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class ModBlocks {
    public static final IRegistry<Block> REGISTRY = RegistryManager.create(VanillaCreamMod.MOD_ID, Registries.BLOCK);

    public static final IRegRef<FlowerBlock> ROSE = REGISTRY.register("rose", () ->
            new FlowerBlock(MobEffects.DIG_SPEED, 5,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );
    public static final IRegRef<FlowerBlock> CYAN_ROSE = REGISTRY.register("cyan_rose", () ->
            new FlowerBlock(MobEffects.DARKNESS, 11,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );
    public static final IRegRef<FlowerBlock> PAEONIA = REGISTRY.register("paeonia", () ->
            new FlowerBlock(MobEffects.DAMAGE_BOOST, 3,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );

    public static final IRegRef<Block> POTTED_ROSE = REGISTRY.register("potted_rose", () -> Blocks.flowerPot(ROSE.get()));
    public static final IRegRef<Block> POTTED_CYAN_ROSE = REGISTRY.register("potted_cyan_rose", () -> Blocks.flowerPot(CYAN_ROSE.get()));
    public static final IRegRef<Block> POTTED_PAEONIA = REGISTRY.register("potted_paeonia", () -> Blocks.flowerPot(PAEONIA.get()));

    public static void register() {
        REGISTRY.register();
    }
}
