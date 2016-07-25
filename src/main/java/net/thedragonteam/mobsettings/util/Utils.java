package net.thedragonteam.mobsettings.util;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.discovery.ASMDataTable;

import java.util.Set;

public class Utils {
    public static ItemStack setUnbreakable(ItemStack stack) {
        NBTHelper.checkNBT(stack);
        stack.getTagCompound().setBoolean("Unbreakable", true);
        return stack;
    }

    public static void registerHandlers(Set<ASMDataTable.ASMData> eventHandlers) {
        for (ASMDataTable.ASMData data : eventHandlers) {
            try {
                Class<?> handlerClass = Class.forName(data.getClassName());
                Object handlerImpl = handlerClass.newInstance();
                MinecraftForge.EVENT_BUS.register(handlerImpl);
            } catch (Exception e) {
                // No-op
            }
        }
    }

}