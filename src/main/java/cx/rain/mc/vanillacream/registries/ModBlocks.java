package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import cx.rain.mc.vanillacream.block.RedstonePumpkinLanternBlock;
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
            new FlowerBlock(MobEffects.DARKNESS, 3,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );
    public static final IRegRef<FlowerBlock> CYAN_ROSE = REGISTRY.register("cyan_rose", () ->
            new FlowerBlock(MobEffects.NIGHT_VISION, 7,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );
    public static final IRegRef<FlowerBlock> PAEONIA = REGISTRY.register("paeonia", () ->
            new FlowerBlock(MobEffects.DIG_SPEED, 11,
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .offsetType(BlockBehaviour.OffsetType.XZ)
                            .pushReaction(PushReaction.DESTROY))
    );

    public static final IRegRef<Block> REDSTONE_JACK_O_LANTERN = REGISTRY.register("redstone_jack_o_lantern", () -> new RedstonePumpkinLanternBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(1.0F)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 8)
                    .isValidSpawn(Blocks::always)
                    .pushReaction(PushReaction.DESTROY)
    ));

    public static final IRegRef<Block> SOUL_JACK_O_LANTERN = REGISTRY.register("soul_jack_o_lantern", () -> new CarvedPumpkinBlock(
            BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(1.0F)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 11)
                    .isValidSpawn(Blocks::always)
                    .pushReaction(PushReaction.DESTROY)
    ));

    // Todo: You're in 1.21.9
//    public static final IRegRef<Block> COPPER_JACK_O_LANTERN = REGISTRY.register("copper_jack_o_lantern", () -> new CarvedPumpkinBlock(
//            BlockBehaviour.Properties.of()
//                    .mapColor(MapColor.COLOR_ORANGE)
//                    .strength(1.0F)
//                    .sound(SoundType.WOOD)
//                    .lightLevel(state -> 15)
//                    .isValidSpawn(Blocks::always)
//                    .pushReaction(PushReaction.DESTROY)
//    ));

    public static final IRegRef<Block> POTTED_ROSE = REGISTRY.register("potted_rose", () -> Blocks.flowerPot(ROSE.get()));
    public static final IRegRef<Block> POTTED_CYAN_ROSE = REGISTRY.register("potted_cyan_rose", () -> Blocks.flowerPot(CYAN_ROSE.get()));
    public static final IRegRef<Block> POTTED_PAEONIA = REGISTRY.register("potted_paeonia", () -> Blocks.flowerPot(PAEONIA.get()));

    public static void register() {
        REGISTRY.register();
    }
}
