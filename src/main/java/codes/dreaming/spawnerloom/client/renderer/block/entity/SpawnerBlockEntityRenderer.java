package codes.dreaming.spawnerloom.client.renderer.block.entity;

import codes.dreaming.spawnerloom.block.entity.SpawnerBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.MobSpawnerLogic;

import static codes.dreaming.spawnerloom.SpawnerLoom.LOGGER;

@Environment(value= EnvType.CLIENT)
public class SpawnerBlockEntityRenderer implements BlockEntityRenderer<SpawnerBlockEntity> {
    private final EntityRenderDispatcher entityRenderDispatcher;

    public SpawnerBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.entityRenderDispatcher = ctx.getEntityRenderDispatcher();
    }

    @Override
    public void render(SpawnerBlockEntity mobSpawnerBlockEntity, float f, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, int j) {
        matrixStack.push();
        matrixStack.translate(0.5, 0.0, 0.5);
        MobSpawnerLogic mobSpawnerLogic = mobSpawnerBlockEntity.getLogic();
        Entity entity = mobSpawnerLogic.getRenderedEntity(mobSpawnerBlockEntity.getWorld());
        if (entity != null) {
            float g = 0.53125f;
            float h = Math.max(entity.getWidth(), entity.getHeight());
            if ((double)h > 1.0) {
                g /= h;
            }
            matrixStack.translate(0.0, 0.4f, 0.0);
            matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion((float) MathHelper.lerp((double)f, mobSpawnerLogic.method_8279(), mobSpawnerLogic.method_8278()) * 10.0f));
            matrixStack.translate(0.0, -0.2f, 0.0);
            matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(-30.0f));
            matrixStack.scale(g, g, g);
            this.entityRenderDispatcher.render(entity, 0.0, 0.0, 0.0, 0.0f, f, matrixStack, vertexConsumerProvider, i);
        }
        matrixStack.pop();
    }
}
