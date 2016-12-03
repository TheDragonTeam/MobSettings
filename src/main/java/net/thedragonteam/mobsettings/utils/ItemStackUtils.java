/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.utils;

import net.minecraft.item.Item;

import static net.minecraft.item.Item.getByNameOrId;

public class ItemStackUtils {

    public static Item getItem(String item) {
        return getByNameOrId(item);
    }
}
