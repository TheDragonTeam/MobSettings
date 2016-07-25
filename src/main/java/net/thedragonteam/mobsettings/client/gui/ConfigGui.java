package net.thedragonteam.mobsettings.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.thedragonteam.mobsettings.MobSettings;
import net.thedragonteam.mobsettings.resources.ConfigHandler;
import net.thedragonteam.mobsettings.util.TextHelper;

import java.util.ArrayList;
import java.util.List;

public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), MobSettings.MODID, false, true,
                TextHelper.localize("gui." + MobSettings.MODID + ".config.title"));
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<IConfigElement>();

        /** adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we. */
        list.add(new ConfigElement(ConfigHandler.config.getCategory("DeBug".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Creeper".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Skeleton".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Spider".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Zombie".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Slime".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Ghast".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("PigZombie".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Enderman".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("CaveSpider".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Silverfish".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Blaze".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("MagmaCube".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Bat".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Witch".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Endermite".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Guardian".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Shulker".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Pig".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Sheep".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Cow".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Chicken".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Squid".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Wolf".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("MooshroomCow".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Ocelot".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Horse".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Rabbit".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Villager".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("EnderDragon".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("WitherBoss".toLowerCase())));
        list.add(new ConfigElement(ConfigHandler.config.getCategory("Guardian".toLowerCase())));
        return list;
    }
}