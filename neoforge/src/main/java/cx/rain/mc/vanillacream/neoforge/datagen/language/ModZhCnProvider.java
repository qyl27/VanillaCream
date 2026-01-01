package cx.rain.mc.vanillacream.neoforge.datagen.language;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModCreativeModeTabs;
import games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractLanguageProvider;
import net.minecraft.data.PackOutput;

public class ModZhCnProvider extends AbstractLanguageProvider {
    public ModZhCnProvider(PackOutput output, String modId, String locale) {
        super(output, modId, locale);
    }

    @Override
    protected void register() {
        addTab(ModCreativeModeTabs.TAB, "Vanilla Cream!");

        addBlock(ModBlocks.ROSE, "玫瑰");
        addBlock(ModBlocks.CYAN_ROSE, "青色玫瑰");
        addBlock(ModBlocks.PAEONIA, "芍药");
    }
}
