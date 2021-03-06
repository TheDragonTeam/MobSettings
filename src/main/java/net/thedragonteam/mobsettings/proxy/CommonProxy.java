/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.mobsettings.registry.MobDrops;
import net.thedragonteam.thedragonlib.util.LogHelper;

import static net.thedragonteam.mobsettings.registry.MobSpawns.addMobSpawns;
import static net.thedragonteam.mobsettings.registry.MobSpawns.removeMobSpawns;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MobDrops());
        addMobSpawns();
        removeMobSpawns();
        LogHelper.info("Finished PreInitialization");
    }
}
