/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.proxy

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.thedragonteam.mobsettings.event.RegistryEventHandler
import net.thedragonteam.mobsettings.registry.MobDrops
import net.thedragonteam.thedragonlib.util.LogHelper

open class CommonProxy {

    fun preInit(event: FMLPreInitializationEvent) {
        MinecraftForge.EVENT_BUS.register(MobDrops())
        MinecraftForge.EVENT_BUS.register(RegistryEventHandler())
        LogHelper.info("Finished PreInitialization")
    }
}
