/*
 * Copyright (c) TheDragonTeam 2006.
 */

package net.thedragonteam.mobsettings.registry;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static net.thedragonteam.mobsettings.MSConfig.*;
import static net.thedragonteam.mobsettings.utils.ItemStackUtils.getItem;

public class MobDrops {

    @SubscribeEvent
    public void playerKilledEntity(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCreeper)
            for (int i = 0; i <= (creeperNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(creeperMobDrops[i]), creeperAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySkeleton)
            for (int i = 0; i <= (skeletonNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(skeletonMobDrops[i]), skeletonAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySpider)
            for (int i = 0; i <= (spiderNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(spiderMobDrops[i]), spiderAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityZombie)
            for (int i = 0; i <= (zombieNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(zombieMobDrops[i]), zombieAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySlime)
            for (int i = 0; i <= (slimeNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(slimeMobDrops[i]), slimeAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityGhast)
            for (int i = 0; i <= (ghastNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(ghastMobDrops[i]), ghastAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityPigZombie)
            for (int i = 0; i <= (pigZombieNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(pigZombieMobDrops[i]), pigZombieAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityEnderman)
            for (int i = 0; i <= (endermanNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(endermanMobDrops[i]), endermanAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityCaveSpider)
            for (int i = 0; i <= (caveSpiderNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(caveSpiderMobDrops[i]), caveSpiderAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySilverfish)
            for (int i = 0; i <= (silverfishNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(silverfishMobDrops[i]), silverfishAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityBlaze)
            for (int i = 0; i <= (blazeNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(blazeMobDrops[i]), blazeAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityMagmaCube)
            for (int i = 0; i <= (magmaCubeNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(magmaCubeMobDrops[i]), magmaCubeAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityBat)
            for (int i = 0; i <= (batNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(batMobDrops[i]), batAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityWitch)
            for (int i = 0; i <= (witchNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(witchMobDrops[i]), witchAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityEndermite)
            for (int i = 0; i <= (endermiteNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(endermiteMobDrops[i]), endermiteAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityGuardian)
            for (int i = 0; i <= (guardianNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(guardianMobDrops[i]), guardianAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityShulker)
            for (int i = 0; i <= (shulkerNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(shulkerMobDrops[i]), shulkerAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityPig)
            for (int i = 0; i <= (pigNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(pigMobDrops[i]), pigAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySheep)
            for (int i = 0; i <= (sheepNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(sheepMobDrops[i]), sheepAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityCow)
            for (int i = 0; i <= (cowNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(cowMobDrops[i]), cowAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityChicken)
            for (int i = 0; i <= (chickenNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(chickenMobDrops[i]), chickenAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySquid)
            for (int i = 0; i <= (squidNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(squidMobDrops[i]), squidAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityWolf)
            for (int i = 0; i <= (wolfNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(wolfMobDrops[i]), wolfAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityMooshroom)
            for (int i = 0; i <= (mooshroomNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(mooshroomCowMobDrops[i]), mooshroomCowAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityOcelot)
            for (int i = 0; i <= (ocelotNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(ocelotMobDrops[i]), ocelotAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityHorse)
            for (int i = 0; i <= (horseNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(horseMobDrops[i]), horseAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityRabbit)
            for (int i = 0; i <= (rabbitNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(rabbitMobDrops[i]), rabbitAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityVillager)
            for (int i = 0; i <= (villagerNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(villagerMobDrops[i]), villagerAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityDragon)
            for (int i = 0; i <= (enderDragonNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(enderDragonMobDrops[i]), enderDragonAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityWither)
            for (int i = 0; i <= (witherBossNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(witherBossMobDrops[i]), witherBossAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityElderGuardian)
            for (int i = 0; i <= (elderGuardianNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(elderGuardianMobDrops[i]), elderGuardianAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityEvoker)
            for (int i = 0; i <= (evokerNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(evokerMobDrops[i]), evokerAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityPolarBear)
            for (int i = 0; i <= (polarBearNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(polarBearMobDrops[i]), polarBearAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityVex)
            for (int i = 0; i <= (vexNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(vexMobDrops[i]), vexAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityStray)
            for (int i = 0; i <= (strayNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(strayMobDrops[i]), strayAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityVindicator)
            for (int i = 0; i <= (vindicatorNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(vindicatorMobDrops[i]), vindicatorAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityWitherSkeleton)
            for (int i = 0; i <= (witherSkeletonNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(witherSkeletonMobDrops[i]), witherSkeletonAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityHusk)
            for (int i = 0; i <= (huskNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(huskMobDrops[i]), huskAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityLlama)
            for (int i = 0; i <= (llamaNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(llamaMobDrops[i]), llamaAmountMobDrops[i]);
        if (event.getEntity() instanceof EntitySkeletonHorse)
            for (int i = 0; i <= (skeletonHorseNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(skeletonHorseMobDrops[i]), skeletonHorseAmountMobDrops[i]);
        if (event.getEntity() instanceof EntityZombieHorse)
            for (int i = 0; i <= (zombieHorseNumberOfDrops - 1); i++)
                event.getEntityLiving().dropItem(getItem(zombieHorseMobDrops[i]), zombieHorseAmountMobDrops[i]);
    }
}