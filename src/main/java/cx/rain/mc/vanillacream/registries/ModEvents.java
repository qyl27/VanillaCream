package cx.rain.mc.vanillacream.registries;

import cx.rain.mc.vanillacream.block.RedstonePumpkinLanternBlock;
import games.moegirl.sinocraft.sinocore.api.event.game.EntityEvents;
import net.minecraft.server.level.ServerPlayer;

public class ModEvents {
    public static void register() {
        EntityEvents.AFTER_TICK.register(args -> {
            var entity = args.getEntity();
            if (entity instanceof ServerPlayer player) {
                var level = player.serverLevel();
                RedstonePumpkinLanternBlock.playerTick(player, level);
            }
        });
    }
}
