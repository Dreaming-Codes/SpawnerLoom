package codes.dreaming.spawnerloom.screenhandler.factory;

import codes.dreaming.spawnerloom.registry.BlockInit;
import codes.dreaming.spawnerloom.registry.ScreenHandlerInit;
import codes.dreaming.spawnerloom.screenhandler.SpawnerScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public record SpawnerScreenHandlerFactory(World world, BlockPos pos) implements NamedScreenHandlerFactory {
    @Override
    public Text getDisplayName() {
        return BlockInit.SPAWNER.getName();
    }

    @Override
    public @NotNull ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new SpawnerScreenHandler(ScreenHandlerInit.SPAWNER, syncId);
    }
}
