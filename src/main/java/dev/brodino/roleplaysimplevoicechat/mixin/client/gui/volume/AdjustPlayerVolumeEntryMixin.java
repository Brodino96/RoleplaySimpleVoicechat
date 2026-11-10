package dev.brodino.roleplaysimplevoicechat.mixin.client.gui.volume;

import de.maxhenkel.voicechat.gui.volume.PlayerVolumeEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(PlayerVolumeEntry.AdjustPlayerVolumeEntry.class)
public class AdjustPlayerVolumeEntryMixin {

    /**
     * @author Brodino
     * @reason I don't want player to see who's talking, let them interact between eachother
     */
    @Overwrite
    public double getAudioLevel() { return -127.0F; }
}
