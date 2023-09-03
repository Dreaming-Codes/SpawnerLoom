package codes.dreaming.spawnerloom.screenhandler;

import codes.dreaming.spawnerloom.registry.ScreenHandlerInit;
import me.lucko.fabric.api.permissions.v0.Permissions;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class SpawnerScreenHandler extends ScreenHandler {
    public SpawnerScreenHandler(@Nullable ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    public static SpawnerScreenHandler client(int syncId, PlayerInventory inventory) {
        return new SpawnerScreenHandler(ScreenHandlerInit.SPAWNER, syncId);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        if(Permissions.check(player, "spawnerloom.edit", 2)) {
            return true;
        }else {
            player.sendMessage(Text.of("You do not have permission to edit spawners!"), true);
            return false;
        }
    }
}
