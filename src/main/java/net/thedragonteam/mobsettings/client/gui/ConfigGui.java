/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.thedragonteam.mobsettings.Reference;

import java.util.ArrayList;
import java.util.List;

import static net.thedragonteam.mobsettings.MobSettings.configuration;
import static net.thedragonteam.thedragonlib.util.TextHelper.localize;

public class ConfigGui extends GuiConfig {
    public ConfigGui(GuiScreen parentScreen) {
        super(parentScreen, getConfigElements(parentScreen), Reference.MODID, true, true,
                localize("gui." + Reference.MODID + ".config.title"));
    }

    private static List<IConfigElement> getConfigElements(GuiScreen parent) {
        List<IConfigElement> list = new ArrayList<>();

        /* adds sections declared in ConfigHandler. toLowerCase() is used because the configuration class automatically does this, so must we. */
        list.add(new ConfigElement(configuration.getCategory("Mobs".toLowerCase())));

        return list;
    }
}