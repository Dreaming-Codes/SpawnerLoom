package codes.dreaming.spawnerloom.registry;

import codes.dreaming.spawnerloom.block.SpawnerBlock;
import codes.dreaming.spawnerloom.block.TargetAreaBlock;
import io.wispforest.owo.registration.reflect.BlockRegistryContainer;
import net.minecraft.block.Block;

@SuppressWarnings("unused")
public class BlockInit implements BlockRegistryContainer {
    public static Block SPAWNER = new SpawnerBlock();

    public static Block TARGET_AREA_BLOCK = new TargetAreaBlock();
}
