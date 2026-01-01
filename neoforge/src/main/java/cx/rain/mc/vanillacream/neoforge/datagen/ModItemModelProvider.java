package cx.rain.mc.vanillacream.neoforge.datagen;

import games.moegirl.sinocraft.sinocore.api.registry.IRegistry;
import games.moegirl.sinocraft.sinocore.neoforge.api.datagen.AbstractAutoGenItemModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.List;

public class ModItemModelProvider extends AbstractAutoGenItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modId, ExistingFileHelper existingFileHelper,
                                List<IRegistry<? extends Item>> autoGenRegistries) {
        super(output, modId, existingFileHelper, autoGenRegistries);
    }

    @Override
    protected void register() {

    }
}
