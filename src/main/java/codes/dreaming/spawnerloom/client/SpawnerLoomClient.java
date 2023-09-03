package codes.dreaming.spawnerloom.client;

import codes.dreaming.spawnerloom.client.renderer.block.entity.SpawnerBlockEntityRenderer;
import codes.dreaming.spawnerloom.client.screen.SpawnerScreen;
import codes.dreaming.spawnerloom.client.screen.TargetAreaBlockScreen;
import codes.dreaming.spawnerloom.registry.ScreenHandlerInit;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

import static codes.dreaming.spawnerloom.registry.BlockEntityInit.SPAWNER;

public class SpawnerLoomClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(SPAWNER, SpawnerBlockEntityRenderer::new);
        HandledScreens.register(ScreenHandlerInit.SPAWNER, SpawnerScreen::new);
        HandledScreens.register(ScreenHandlerInit.TARGET_AREA_BLOCK, TargetAreaBlockScreen::new);
    }
}
