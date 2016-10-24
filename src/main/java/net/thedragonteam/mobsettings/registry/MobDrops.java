/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.registry;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.thedragonteam.mobsettings.MSConfig.*;

public class MobDrops {
    @SubscribeEvent
    public void playerKilledEntity(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCreeper) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(creeperMobDrops), creeperAmountMobDrops);
            if (debugMode)
                System.out.println(creeperMobDrops + " x " + creeperAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySkeleton) {
            EntityItem entityItem1 = event.getEntityLiving().dropItem(Item.getByNameOrId(skeletonMobDrops), skeletonAmountMobDrops);
            if (debugMode)
                System.out.println(skeletonMobDrops + " x " + skeletonAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySpider) {
            EntityItem entityItem2 = event.getEntityLiving().dropItem(Item.getByNameOrId(spiderMobDrops), spiderAmountMobDrops);
            if (debugMode)
                System.out.println(spiderMobDrops + " x " + spiderAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityZombie) {
            EntityItem entityItem3 = event.getEntityLiving().dropItem(Item.getByNameOrId(zombieMobDrops), zombieAmountMobDrops);
            if (debugMode)
                System.out.println(zombieMobDrops + " x " + zombieAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySlime) {
            EntityItem entityItem4 = event.getEntityLiving().dropItem(Item.getByNameOrId(slimeMobDrops), slimeAmountMobDrops);
            if (debugMode)
                System.out.println(slimeMobDrops + " x " + slimeAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityGhast) {
            EntityItem entityItem5 = event.getEntityLiving().dropItem(Item.getByNameOrId(ghastMobDrops), ghastAmountMobDrops);
            if (debugMode)
                System.out.println(ghastMobDrops + " x " + ghastAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityPigZombie) {
            EntityItem entityItem6 = event.getEntityLiving().dropItem(Item.getByNameOrId(pigZombieMobDrops), pigZombieAmountMobDrops);
            if (debugMode)
                System.out.println(pigZombieMobDrops + " x " + pigZombieAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityEnderman) {
            EntityItem entityItem7 = event.getEntityLiving().dropItem(Item.getByNameOrId(endermanMobDrops), endermanAmountMobDrops);
            if (debugMode)
                System.out.println(endermanMobDrops + " x " + endermanAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityCaveSpider) {
            EntityItem entityItem8 = event.getEntityLiving().dropItem(Item.getByNameOrId(caveSpiderMobDrops), caveSpiderAmountMobDrops);
            if (debugMode)
                System.out.println(caveSpiderMobDrops + " x " + caveSpiderAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySilverfish) {
            EntityItem entityItem9 = event.getEntityLiving().dropItem(Item.getByNameOrId(silverfishMobDrops), silverfishAmountMobDrops);
            if (debugMode)
                System.out.println(silverfishMobDrops + " x " + silverfishAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityBlaze) {
            EntityItem entityItem10 = event.getEntityLiving().dropItem(Item.getByNameOrId(blazeMobDrops), blazeAmountMobDrops);
            if (debugMode)
                System.out.println(blazeMobDrops + " x " + blazeAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityMagmaCube) {
            EntityItem entityItem11 = event.getEntityLiving().dropItem(Item.getByNameOrId(magmaCubeMobDrops), magmaCubeAmountMobDrops);
            if (debugMode)
                System.out.println(magmaCubeMobDrops + " x " + magmaCubeAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityBat) {
            EntityItem entityItem12 = event.getEntityLiving().dropItem(Item.getByNameOrId(batMobDrops), batAmountMobDrops);
            if (debugMode)
                System.out.println(batMobDrops + " x " + batAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityWitch) {
            EntityItem entityItem13 = event.getEntityLiving().dropItem(Item.getByNameOrId(witchMobDrops), witchAmountMobDrops);
            if (debugMode)
                System.out.println(witchMobDrops + " x " + witchAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityEndermite) {
            EntityItem entityItem14 = event.getEntityLiving().dropItem(Item.getByNameOrId(endermiteMobDrops), endermiteAmountMobDrops);
            if (debugMode)
                System.out.println(endermiteMobDrops + " x " + endermiteAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityGuardian && !((EntityGuardian) event.getEntity()).isElder()) {
            EntityItem entityItem15 = event.getEntityLiving().dropItem(Item.getByNameOrId(guardianMobDrops), guardianAmountMobDrops);
            if (debugMode)
                System.out.println(guardianMobDrops + " x " + guardianAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityShulker) {
            EntityItem entityItem16 = event.getEntityLiving().dropItem(Item.getByNameOrId(shulkerMobDrops), shulkerAmountMobDrops);
            if (debugMode)
                System.out.println(shulkerMobDrops + " x " + shulkerAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityPig) {
            EntityItem entityItem17 = event.getEntityLiving().dropItem(Item.getByNameOrId(pigMobDrops), pigAmountMobDrops);
            if (debugMode)
                System.out.println(pigMobDrops + " x " + pigAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySheep) {
            EntityItem entityItem18 = event.getEntityLiving().dropItem(Item.getByNameOrId(sheepMobDrops), sheepAmountMobDrops);
            if (debugMode)
                System.out.println(sheepMobDrops + " x " + sheepAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityCow) {
            EntityItem entityItem19 = event.getEntityLiving().dropItem(Item.getByNameOrId(cowMobDrops), cowAmountMobDrops);
            if (debugMode)
                System.out.println(cowMobDrops + " x " + cowAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityChicken) {
            EntityItem entityItem20 = event.getEntityLiving().dropItem(Item.getByNameOrId(chickenMobDrops), chickenAmountMobDrops);
            if (debugMode)
                System.out.println(chickenMobDrops + " x " + chickenAmountMobDrops);
        }
        if (event.getEntity() instanceof EntitySquid) {
            EntityItem entityItem21 = event.getEntityLiving().dropItem(Item.getByNameOrId(squidMobDrops), squidAmountMobDrops);
            if (debugMode)
                System.out.println(squidMobDrops + " x " + squidAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityWolf) {
            EntityItem entityItem22 = event.getEntityLiving().dropItem(Item.getByNameOrId(wolfMobDrops), wolfAmountMobDrops);
            if (debugMode)
                System.out.println(wolfMobDrops + " x " + wolfAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityMooshroom) {
            EntityItem entityItem23 = event.getEntityLiving().dropItem(Item.getByNameOrId(mooshroomCowMobDrops), mooshroomCowAmountMobDrops);
            if (debugMode)
                System.out.println(mooshroomCowMobDrops + " x " + mooshroomCowAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityOcelot) {
            EntityItem entityItem24 = event.getEntityLiving().dropItem(Item.getByNameOrId(ocelotMobDrops), ocelotAmountMobDrops);
            if (debugMode)
                System.out.println(ocelotMobDrops + " x " + ocelotAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityHorse) {
            EntityItem entityItem25 = event.getEntityLiving().dropItem(Item.getByNameOrId(horseMobDrops), horseAmountMobDrops);
            if (debugMode)
                System.out.println(horseMobDrops + " x " + horseAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityRabbit) {
            EntityItem entityItem26 = event.getEntityLiving().dropItem(Item.getByNameOrId(rabbitMobDrops), rabbitAmountMobDrops);
            if (debugMode)
                System.out.println(rabbitMobDrops + " x " + rabbitAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityVillager) {
            EntityItem entityItem27 = event.getEntityLiving().dropItem(Item.getByNameOrId(villagerMobDrops), villagerAmountMobDrops);
            if (debugMode)
                System.out.println(villagerMobDrops + " x " + villagerAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityDragon) {
            EntityItem entityItem28 = event.getEntityLiving().dropItem(Item.getByNameOrId(enderDragonMobDrops), enderDragonAmountMobDrops);
            if (debugMode)
                System.out.println(enderDragonMobDrops + " x " + enderDragonAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityWither) {
            EntityItem entityItem29 = event.getEntityLiving().dropItem(Item.getByNameOrId(witherBossMobDrops), witherBossAmountMobDrops);
            if (debugMode)
                System.out.println(witherBossMobDrops + " x " + witherBossAmountMobDrops);
        }
        if (event.getEntity() instanceof EntityGuardian && ((EntityGuardian) event.getEntity()).isElder()) {
            EntityItem entityItem30 = event.getEntityLiving().dropItem(Item.getByNameOrId(elderGuardianMobDrops), elderGuardianAmountMobDrops);
            if (debugMode)
                System.out.println(elderGuardianMobDrops + " x " + elderGuardianAmountMobDrops);
        }
    }
}