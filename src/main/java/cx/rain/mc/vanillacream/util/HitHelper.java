package cx.rain.mc.vanillacream.util;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class HitHelper {
    public static @Nullable BlockHitResult pickBlockFromSight(ServerLevel level, Entity entity, double distance) {
        var hitResult = entity.pick(distance, 1, false);
        if (hitResult instanceof BlockHitResult blockHitResult) {
            var pos = blockHitResult.getBlockPos();
            if (level.isLoaded(pos)) {
                return blockHitResult;
            }
        }
        return null;
    }
}
