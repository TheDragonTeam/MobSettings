/*
 * Copyright (c) TheDragonTeam 2006.
 */

package net.thedragonteam.mobsettings.registry

import net.minecraft.entity.boss.EntityDragon
import net.minecraft.entity.boss.EntityWither
import net.minecraft.entity.monster.*
import net.minecraft.entity.passive.*
import net.minecraftforge.event.entity.living.LivingDropsEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.thedragonteam.mobsettings.MSConfig.*
import net.thedragonteam.mobsettings.utils.ItemStackUtils.getItem

class MobDrops {

    @SubscribeEvent
    fun entityDeath(event: LivingDropsEvent) {
        when {
            dropOnlyOnPlayerKill -> when {
                event.source.getDamageType() == "player" -> entityDeaths(event)
            }
            !dropOnlyOnPlayerKill -> entityDeaths(event)
        }
    }

    fun entityDeaths(event: LivingDropsEvent) {
        when {
            event.entity is EntityCreeper -> creeperAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(creeperMobDrops[it]), creeperAmountMobDrops[it]) }
            event.entity is EntitySkeleton -> skeletonAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(skeletonMobDrops[it]), skeletonAmountMobDrops[it]) }
            event.entity is EntitySpider -> spiderAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(spiderMobDrops[it]), spiderAmountMobDrops[it]) }
            event.entity is EntityZombie -> zombieAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(zombieMobDrops[it]), zombieAmountMobDrops[it]) }
            event.entity is EntitySlime -> slimeAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(slimeMobDrops[it]), slimeAmountMobDrops[it]) }
            event.entity is EntityGhast -> ghastAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(ghastMobDrops[it]), ghastAmountMobDrops[it]) }
            event.entity is EntityPigZombie -> pigZombieAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(pigZombieMobDrops[it]), pigZombieAmountMobDrops[it]) }
            event.entity is EntityEnderman -> endermanAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(endermanMobDrops[it]), endermanAmountMobDrops[it]) }
            event.entity is EntityCaveSpider -> caveSpiderAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(caveSpiderMobDrops[it]), caveSpiderAmountMobDrops[it]) }
            event.entity is EntitySilverfish -> silverfishAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(silverfishMobDrops[it]), silverfishAmountMobDrops[it]) }
            event.entity is EntityBlaze -> blazeAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(blazeMobDrops[it]), blazeAmountMobDrops[it]) }
            event.entity is EntityMagmaCube -> magmaCubeAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(magmaCubeMobDrops[it]), magmaCubeAmountMobDrops[it]) }
            event.entity is EntityBat -> batAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(batMobDrops[it]), batAmountMobDrops[it]) }
            event.entity is EntityWitch -> witchAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(witchMobDrops[it]), witchAmountMobDrops[it]) }
            event.entity is EntityEndermite -> endermiteAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(endermiteMobDrops[it]), endermiteAmountMobDrops[it]) }
            event.entity is EntityGuardian -> guardianAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(guardianMobDrops[it]), guardianAmountMobDrops[it]) }
            event.entity is EntityShulker -> shulkerAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(shulkerMobDrops[it]), shulkerAmountMobDrops[it]) }
            event.entity is EntityPig -> pigAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(pigMobDrops[it]), pigAmountMobDrops[it]) }
            event.entity is EntitySheep -> sheepAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(sheepMobDrops[it]), sheepAmountMobDrops[it]) }
            event.entity is EntityCow -> cowAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(cowMobDrops[it]), cowAmountMobDrops[it]) }
            event.entity is EntityChicken -> chickenAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(chickenMobDrops[it]), chickenAmountMobDrops[it]) }
            event.entity is EntitySquid -> squidAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(squidMobDrops[it]), squidAmountMobDrops[it]) }
            event.entity is EntityWolf -> wolfAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(wolfMobDrops[it]), wolfAmountMobDrops[it]) }
            event.entity is EntityMooshroom -> mooshroomCowAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(mooshroomCowMobDrops[it]), mooshroomCowAmountMobDrops[it]) }
            event.entity is EntityOcelot -> ocelotAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(ocelotMobDrops[it]), ocelotAmountMobDrops[it]) }
            event.entity is EntityHorse -> horseAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(horseMobDrops[it]), horseAmountMobDrops[it]) }
            event.entity is EntityRabbit -> rabbitAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(rabbitMobDrops[it]), rabbitAmountMobDrops[it]) }
            event.entity is EntityVillager -> villagerAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(villagerMobDrops[it]), villagerAmountMobDrops[it]) }
            event.entity is EntityDragon -> enderDragonAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(enderDragonMobDrops[it]), enderDragonAmountMobDrops[it]) }
            event.entity is EntityWither -> witherBossAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(witherBossMobDrops[it]), witherBossAmountMobDrops[it]) }
            event.entity is EntityElderGuardian -> elderGuardianAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(elderGuardianMobDrops[it]), elderGuardianAmountMobDrops[it]) }
            event.entity is EntityEvoker -> evokerAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(evokerMobDrops[it]), evokerAmountMobDrops[it]) }
            event.entity is EntityPolarBear -> polarBearAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(polarBearMobDrops[it]), polarBearAmountMobDrops[it]) }
            event.entity is EntityVex -> vexAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(vexMobDrops[it]), vexAmountMobDrops[it]) }
            event.entity is EntityStray -> strayAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(strayMobDrops[it]), strayAmountMobDrops[it]) }
            event.entity is EntityVindicator -> vindicatorAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(vindicatorMobDrops[it]), vindicatorAmountMobDrops[it]) }
            event.entity is EntityWitherSkeleton -> witherSkeletonAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(witherSkeletonMobDrops[it]), witherSkeletonAmountMobDrops[it]) }
            event.entity is EntityHusk -> huskAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(huskMobDrops[it]), huskAmountMobDrops[it]) }
            event.entity is EntityLlama -> llamaAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(llamaMobDrops[it]), llamaAmountMobDrops[it]) }
            event.entity is EntitySkeletonHorse -> skeletonHorseAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(skeletonHorseMobDrops[it]), skeletonHorseAmountMobDrops[it]) }
            event.entity is EntityZombieHorse -> zombieHorseAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(zombieHorseMobDrops[it]), zombieHorseAmountMobDrops[it]) }
            event.entity is EntityIronGolem -> ironGolemAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(ironGolemMobDrops[it]), ironGolemAmountMobDrops[it]) }
            event.entity is EntitySnowman -> snowGolemAmountMobDrops.indices.forEach { event.entityLiving.dropItem(getItem(snowGolemMobDrops[it]), snowGolemAmountMobDrops[it]) }
        }
    }
}