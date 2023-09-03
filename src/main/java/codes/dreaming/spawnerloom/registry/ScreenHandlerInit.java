package codes.dreaming.spawnerloom.registry;

import codes.dreaming.spawnerloom.screenhandler.SpawnerScreenHandler;
import codes.dreaming.spawnerloom.screenhandler.TargetAreaBlockScreenHandler;
import io.wispforest.owo.registration.reflect.AutoRegistryContainer;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.registry.Registry;

@SuppressWarnings("unused")
public class ScreenHandlerInit implements AutoRegistryContainer<ScreenHandlerType<?>> {
    public static final ScreenHandlerType<SpawnerScreenHandler> SPAWNER = new ScreenHandlerType<>(SpawnerScreenHandler::client);

    public static final ScreenHandlerType<TargetAreaBlockScreenHandler> TARGET_AREA_BLOCK = new ScreenHandlerType<>(TargetAreaBlockScreenHandler::client);


    @Override
    public Registry<ScreenHandlerType<?>> getRegistry() {
        return Registry.SCREEN_HANDLER;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Class<ScreenHandlerType<?>> getTargetFieldType() {
        return (Class<ScreenHandlerType<?>>) (Object) ScreenHandlerType.class;
    }
}
