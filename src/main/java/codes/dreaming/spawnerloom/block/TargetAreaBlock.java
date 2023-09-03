package codes.dreaming.spawnerloom.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class TargetAreaBlock extends BlockWithEntity {
    public TargetAreaBlock() {
        super(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(5.0f).sounds(BlockSoundGroup.METAL));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return null;
    }
}
