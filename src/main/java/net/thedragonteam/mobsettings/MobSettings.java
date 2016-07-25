package net.thedragonteam.mobsettings;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thedragonteam.mobsettings.proxy.CommonProxy;
import net.thedragonteam.mobsettings.registry.MobDrops;
import net.thedragonteam.mobsettings.resources.ConfigHandler;
import net.thedragonteam.mobsettings.resources.GlobalEventsMobSettings;
import net.thedragonteam.mobsettings.util.TextHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;


@Mod(modid = MobSettings.MODID, name = MobSettings.MODNAME, version = MobSettings.VERSION, dependencies = MobSettings.DEPEND, guiFactory = MobSettings.GUIFACTORY, updateJSON = "https://raw.githubusercontent.com/TheDragonTeam/VersionUpdater/master/MobSettings.json")
public class MobSettings {

    public static final String MODID = "mobsettings";
    public static final String VERSION = "1.10.2-1.0.0.0";
    public static final String MODNAME = "Mobs Settings";
    public static final String DEPEND = "";
    public static final String CLIENTPROXY = "net.thedragonteam.mobsettings.proxy.ClientProxy";
    public static final String COMMONPROXY = "net.thedragonteam.mobsettings.proxy.CommonProxy";
    public static final String GUIFACTORY = "net.thedragonteam.mobsettings.client.gui.ConfigGuiFactory";

    @SidedProxy(clientSide = MobSettings.CLIENTPROXY, serverSide = MobSettings.COMMONPROXY)

    public static CommonProxy proxy;

    public static Logger logger = LogManager.getLogger(MobSettings.MODNAME);

    @Mod.Instance(MODID)
    public static MobSettings instance;

    public static File configDir;

    public static File getConfigDir() {
        return configDir;
    }

    public GuiHandler GuiHandler = new GuiHandler();

    @SideOnly(Side.CLIENT)
    @EventHandler
    public void initClient(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsMobSettings());
        NetworkRegistry.INSTANCE.registerGuiHandler(this, GuiHandler);
    }

    @SideOnly(Side.SERVER)
    @EventHandler
    public void initServer(FMLInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.init"));
        MinecraftForge.EVENT_BUS.register(new GlobalEventsMobSettings());
        NetworkRegistry.INSTANCE.registerGuiHandler(this, GuiHandler);
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new MobDrops());
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.preInit"));
        configDir = new File(event.getModConfigurationDirectory() + "/" + MobSettings.MODID);
        configDir.mkdirs();
        ConfigHandler.init(new File(configDir.getPath(), MobSettings.MODID + ".cfg"));
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info(TextHelper.localize("info." + MobSettings.MODID + ".console.load.postInit"));
    }

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
    }

    public static class GuiHandler implements IGuiHandler {
        @Override
        public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            return null;
        }

        @Override
        public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
            return null;
        }
    }
}