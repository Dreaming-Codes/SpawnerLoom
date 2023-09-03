package codes.dreaming.spawnerloom.registry;

import codes.dreaming.spawnerloom.block.entity.SpawnerBlockEntity;
import codes.dreaming.spawnerloom.block.entity.TargetAreaBlockEntity;
import io.wispforest.owo.registration.reflect.BlockEntityRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;

@SuppressWarnings("unused")
public class BlockEntityInit implements BlockEntityRegistryContainer {
    public static BlockEntityType<SpawnerBlockEntity> SPAWNER = FabricBlockEntityTypeBuilder.create(SpawnerBlockEntity::new, BlockInit.SPAWNER).build();

    public static BlockEntityType<TargetAreaBlockEntity> TARGET_AREA_BLOCK = FabricBlockEntityTypeBuilder.create(TargetAreaBlockEntity::new, BlockInit.TARGET_AREA_BLOCK).build();
}
