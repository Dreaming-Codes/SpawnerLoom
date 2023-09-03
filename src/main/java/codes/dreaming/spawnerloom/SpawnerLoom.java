package codes.dreaming.spawnerloom;

import codes.dreaming.spawnerloom.registry.BlockEntityInit;
import codes.dreaming.spawnerloom.registry.BlockInit;
import codes.dreaming.spawnerloom.registry.ScreenHandlerInit;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpawnerLoom implements ModInitializer {

    public final static String MOD_ID = "spawnerloom";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        FieldRegistrationHandler.register(BlockInit.class, MOD_ID, false);
        FieldRegistrationHandler.register(BlockEntityInit.class, MOD_ID, false);
        FieldRegistrationHandler.register(ScreenHandlerInit.class, MOD_ID, false);

        BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPAWNER, RenderLayer.getCutout());
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
