package cx.rain.mc.vanillacream.util;

import cx.rain.mc.vanillacream.VanillaCreamMod;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationHelper {
    public static ResourceLocation mcLoc(String path) {
        return ResourceLocation.withDefaultNamespace(path);
    }

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(VanillaCreamMod.MOD_ID, path);
    }
}
