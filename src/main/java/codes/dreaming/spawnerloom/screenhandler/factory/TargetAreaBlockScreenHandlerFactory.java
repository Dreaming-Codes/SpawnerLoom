package codes.dreaming.spawnerloom.screenhandler.factory;

import codes.dreaming.spawnerloom.registry.BlockInit;
import codes.dreaming.spawnerloom.registry.ScreenHandlerInit;
import codes.dreaming.spawnerloom.screenhandler.TargetAreaBlockScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class TargetAreaBlockScreenHandlerFactory implements NamedScreenHandlerFactory {
    @Override
    public Text getDisplayName() {
        return BlockInit.TARGET_AREA_BLOCK.getName();
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new TargetAreaBlockScreenHandler(ScreenHandlerInit.TARGET_AREA_BLOCK, syncId);
    }
}
