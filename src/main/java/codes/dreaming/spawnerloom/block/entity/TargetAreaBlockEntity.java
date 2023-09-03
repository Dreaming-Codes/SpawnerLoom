package codes.dreaming.spawnerloom.block.entity;

import codes.dreaming.spawnerloom.registry.BlockEntityInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class TargetAreaBlockEntity extends BlockEntity {
    public TargetAreaBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityInit.TARGET_AREA_BLOCK, pos, state);
    }
}
