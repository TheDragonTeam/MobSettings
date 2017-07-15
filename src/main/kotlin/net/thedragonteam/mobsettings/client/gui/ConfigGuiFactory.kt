/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.client.gui

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.GuiScreen
import net.minecraftforge.fml.client.IModGuiFactory

class ConfigGuiFactory : IModGuiFactory {

    override fun createConfigGui(parentScreen: GuiScreen?): GuiScreen {
        return ConfigGui(parentScreen!!)
    }

    override fun hasConfigGui(): Boolean {
        return true
    }

    override fun initialize(mc: Minecraft) {}

    override fun runtimeGuiCategories(): Set<IModGuiFactory.RuntimeOptionCategoryElement>? = null

}