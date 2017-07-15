/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.client.gui

import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.common.config.ConfigElement
import net.minecraftforge.fml.client.config.GuiConfig
import net.minecraftforge.fml.client.config.IConfigElement
import net.thedragonteam.mobsettings.MobSettings.configuration
import net.thedragonteam.mobsettings.Reference
import net.thedragonteam.thedragonlib.util.TextHelper
import java.util.*

class ConfigGui(parentScreen: GuiScreen) : GuiConfig(parentScreen, getConfigElements(parentScreen), Reference.MODID, true, true, TextHelper.localize("gui." + Reference.MODID + ".config.title")) {
    companion object {
        private val list = ArrayList<IConfigElement>()

        private fun getConfigElements(parent: GuiScreen): List<IConfigElement> {
            list.add(ConfigElement(configuration.getCategory("mobs")))
            return list
        }
    }
}