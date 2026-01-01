package cx.rain.mc.vanillacream.neoforge.datagen.language;

import cx.rain.mc.vanillacream.registries.ModBlocks;
import cx.rain.mc.vanillacream.registries.ModCreativeModeTabs;
import games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractLanguageProvider;
import net.minecraft.data.PackOutput;

public class ModEnUsProvider extends AbstractLanguageProvider {
    public ModEnUsProvider(PackOutput output, String modId, String locale) {
        super(output, modId, locale);
    }

    @Override
    protected void register() {
        addTab(ModCreativeModeTabs.TAB, "Vanilla Cream!");

        addBlock(ModBlocks.ROSE, "Rose");
        addBlock(ModBlocks.CYAN_ROSE, "Cyan Rose");
        addBlock(ModBlocks.PAEONIA, "Paeonia");
    }
}
