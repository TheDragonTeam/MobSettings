/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thedragonteam.mobsettings.proxy.CommonProxy;
import net.thedragonteam.thedragonlib.config.ModConfigProcessor;
import net.thedragonteam.thedragonlib.util.LogHelper;

@Mod(modid = Reference.MODID,
        name = Reference.MODNAME,
        version = Reference.VERSION,
        guiFactory = Reference.GUI_FACTORY,
        dependencies = Reference.DEPEND,
        updateJSON = Reference.UPDATE_JSON)
public class MobSettings {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SEVER_PROXY)
    public static CommonProxy proxy;
    public static ModConfigProcessor configProcessor = new ModConfigProcessor();
    public static Configuration configuration;

    @Mod.Instance(Reference.MODID)
    public static MobSettings instance;

    public MobSettings() {
        LogHelper.getLogger(Reference.MODID).info("Welcoming Minecraft");
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(MSConfig.class, configuration);
        proxy.preInit(event);
    }
}