/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings;

public class Reference {

    public static final String MODID = "net/thedragonteam/mobsettings";
    public static final String VERSION = "1.12-3.1.0";
    public static final String MODNAME = "Mobs Settings";
    public static final String LIB_VERSION = "1.12-4.1.0";
    public static final String UPDATE_JSON = "https://download.nodecdn.net/containers/thedragonteam/mobsettings-updater.json";
    public static final String DEPEND = "required-after:forgelin;" + "required-after:thedragonlib@[" + LIB_VERSION + ",);";
    public static final String CLIENT_PROXY = "net.thedragonteam.mobsettings.proxy.ClientProxy";
    public static final String SEVER_PROXY = "net.thedragonteam.mobsettings.proxy.ServerProxy";
    public static final String GUI_FACTORY = "net.thedragonteam.mobsettings.client.gui.ConfigGuiFactory";
}
