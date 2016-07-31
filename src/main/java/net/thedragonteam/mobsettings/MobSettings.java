package net.thedragonteam.mobsettings;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.core.TheDragonCore;
import net.thedragonteam.core.config.ModConfigProcessor;
import net.thedragonteam.core.util.LogHelper;
import net.thedragonteam.mobsettings.proxy.CommonProxy;
import net.thedragonteam.mobsettings.registry.MobDrops;
import net.thedragonteam.mobsettings.resources.GlobalEventsMobSettings;
import net.thedragonteam.mobsettings.util.TextHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = MobSettings.MODID, name = MobSettings.MODNAME, version = MobSettings.VERSION, dependencies = MobSettings.DEPEND, updateJSON = "https://raw.githubusercontent.com/TheDragonTeam/VersionUpdater/master/MobSettings.json")
public class MobSettings {

    public static final String MODID = "mobsettings";
    public static final String VERSION = "1.1.0";
    public static final String MODNAME = "Mobs Settings";
    public static final String DEPEND = "required-after:thedragoncore@[" + TheDragonCore.VERSION + ",);";
    public static final String CLIENTPROXY = "net.thedragonteam.mobsettings.proxy.ClientProxy";
    public static final String COMMONPROXY = "net.thedragonteam.mobsettings.proxy.CommonProxy";

    @SidedProxy(clientSide = MobSettings.CLIENTPROXY, serverSide = MobSettings.COMMONPROXY)

    public static CommonProxy proxy;

    public static Logger logger = LogManager.getLogger(MobSettings.MODNAME);

    public static ModConfigProcessor configProcessor = new ModConfigProcessor();

    public static Configuration configuration;

    @Mod.Instance(MODID)
    public static MobSettings instance;

    public static File configDir;

    public static File getConfigDir() {
        return configDir;
    }

    public MobSettings() {
        LogHelper.info("Welcoming Minecraft");
    }


    @SideOnly(Side.CLIENT)
    @EventHandler
    public void initClient(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsMobSettings());
    }

    @SideOnly(Side.SERVER)
    @EventHandler
    public void initServer(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsMobSettings());
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MobDrops());

        configuration = new Configuration(event.getSuggestedConfigurationFile());
        configProcessor.processConfig(MSConfig.class, configuration);

        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.preInit"));
        configDir = new File(event.getModConfigurationDirectory() + "/" + MobSettings.MODID);
        configDir.mkdirs();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.postInit"));
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }
}