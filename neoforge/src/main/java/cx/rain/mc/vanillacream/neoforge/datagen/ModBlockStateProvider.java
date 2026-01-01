package cx.rain.mc.vanillacream.neoforge.datagen;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractAutoGenBlockStateProvider;
import games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractAutoGenItemModelProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;

import static games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractAutoGenItemModelProvider.GENERATED;

public class ModBlockStateProvider extends AbstractAutoGenBlockStateProvider {

    public ModBlockStateProvider(PackOutput output, String modId, ExistingFileHelper exFileHelper,
                                 List<IRegistry<? extends Block>> autoGenRegistries) {
        super(output, modId, exFileHelper, autoGenRegistries);
    }

    @Override
    protected void register() {
        simpleBlock(ModBlocks.ROSE.get(), models().cross("rose", modLoc("block/rose")).renderType(RenderType.CUTOUT.name));
        simpleBlock(ModBlocks.CYAN_ROSE.get(), models().cross("cyan_rose", modLoc("block/cyan_rose")).renderType(RenderType.CUTOUT.name));
        simpleBlock(ModBlocks.PAEONIA.get(), models().cross("paeonia", modLoc("block/paeonia")).renderType(RenderType.CUTOUT.name));
        itemModels().singleTexture("rose", mcLoc(GENERATED), "layer0", modLoc("block/rose"));
        itemModels().singleTexture("cyan_rose", mcLoc(GENERATED), "layer0", modLoc("block/cyan_rose"));
        itemModels().singleTexture("paeonia", mcLoc(GENERATED), "layer0", modLoc("block/paeonia"));

        simpleBlock(ModBlocks.POTTED_ROSE.get(), models().singleTexture("potted_rose", mcLoc("block/flower_pot_cross"), "plant", modLoc("block/rose")));
        simpleBlock(ModBlocks.POTTED_CYAN_ROSE.get(), models().singleTexture("potted_cyan_rose", mcLoc("block/flower_pot_cross"), "plant", modLoc("block/cyan_rose")));
        simpleBlock(ModBlocks.POTTED_PAEONIA.get(), models().singleTexture("potted_paeonia", mcLoc("block/flower_pot_cross"), "plant", modLoc("block/paeonia")));
    }
}
