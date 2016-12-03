/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings;

public class Reference {

    public static final String MODID = "mobsettings";
    public static final String VERSION = "1.11-1.3.0";
    public static final String MODNAME = "Mobs Settings";
    public static final String LIB_VERSION = "1.10.2-1.0.3.0";
    public static final String UPDATE_JSON = "http://fdn.redstone.tech/TheDragonTeam/mobsettings/update.json";
    public static final String DEPEND = "required-after:thedragonlib@[" + LIB_VERSION + ",);";
    public static final String CLIENTPROXY = "net.thedragonteam.mobsettings.proxy.ClientProxy";
    public static final String SEVERPROXY = "net.thedragonteam.mobsettings.proxy.ServerProxy";
    public static final String GUIFACTORY = "net.thedragonteam.mobsettings.client.gui.ConfigGuiFactory";
}
