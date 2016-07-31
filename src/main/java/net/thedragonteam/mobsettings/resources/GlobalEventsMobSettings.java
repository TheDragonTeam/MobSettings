package net.thedragonteam.mobsettings.resources;

import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thedragonteam.mobsettings.MobSettings;
import net.thedragonteam.mobsettings.util.TextHelper;

public class GlobalEventsMobSettings {

    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
        MobSettings.logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.config.refresh"));
    }
}