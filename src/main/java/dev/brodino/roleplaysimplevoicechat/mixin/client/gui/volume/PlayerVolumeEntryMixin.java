package dev.brodino.roleplaysimplevoicechat.mixin.client.gui.volume;

import com.mojang.blaze3d.systems.RenderSystem;
import de.maxhenkel.voicechat.gui.volume.PlayerVolumeEntry;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerVolumeEntry.class)
public class PlayerVolumeEntryMixin {

    @Redirect(
            method = "renderElement",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderTexture(ILnet/minecraft/util/Identifier;)V",
                    ordinal = 0
            )
    )
    public void rpsvc$setTexture(int texture, Identifier id) {
        RenderSystem.setShaderTexture(0, new Identifier("textures/entity/steve.png"));
    }
}
