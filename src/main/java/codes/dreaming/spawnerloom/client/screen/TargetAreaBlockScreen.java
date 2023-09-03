package codes.dreaming.spawnerloom.client.screen;

import codes.dreaming.spawnerloom.screenhandler.SpawnerScreenHandler;
import io.wispforest.owo.ui.base.BaseUIModelHandledScreen;
import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.container.FlowLayout;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static codes.dreaming.spawnerloom.SpawnerLoom.MOD_ID;


public class TargetAreaBlockScreen extends BaseUIModelHandledScreen<FlowLayout, SpawnerScreenHandler> {
    public TargetAreaBlockScreen(SpawnerScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title, FlowLayout.class, BaseUIModelScreen.DataSource.asset(new Identifier(MOD_ID, "target_area_block_ui_model")));

        this.backgroundHeight = 175;

        this.titleY = 69420;
        this.playerInventoryTitleY = 82;
    }

    @Override
    protected void build(FlowLayout rootComponent) {

    }
}
