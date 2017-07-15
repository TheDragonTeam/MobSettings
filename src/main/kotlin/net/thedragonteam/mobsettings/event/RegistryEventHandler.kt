package net.thedragonteam.mobsettings.event

import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.registry.EntityEntry
import net.thedragonteam.mobsettings.registry.MobSpawns

class RegistryEventHandler {

    @SubscribeEvent
    fun registerEntities(event: RegistryEvent.Register<EntityEntry>) {
        MobSpawns.addMobSpawns()
        MobSpawns.removeMobSpawns()
    }
}
