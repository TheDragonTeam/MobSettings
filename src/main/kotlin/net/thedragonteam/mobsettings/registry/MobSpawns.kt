/*
 * Copyright (c) TheDragonTeam 20i6.
 */

package net.thedragonteam.mobsettings.registry

import net.minecraft.entity.EnumCreatureType.MONSTER
import net.minecraft.entity.boss.EntityDragon
import net.minecraft.entity.boss.EntityWither
import net.minecraft.entity.monster.*
import net.minecraft.entity.passive.*
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn
import net.minecraftforge.fml.common.registry.EntityRegistry.removeSpawn
import net.minecraftforge.fml.common.registry.ForgeRegistries.BIOMES
import net.thedragonteam.mobsettings.MSConfig.*

object MobSpawns {

    fun addMobSpawns() {
        creeperAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityCreeper::class.java, creeperWeightedProbs[i], creeperMinSpawns[i], creeperMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(creeperAddedSpawnBiomeNames[i]))!!) }
        skeletonAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySkeleton::class.java, skeletonWeightedProbs[i], skeletonMinSpawns[i], skeletonMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(skeletonAddedSpawnBiomeNames[i]))!!) }
        spiderAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySpider::class.java, spiderWeightedProbs[i], spiderMinSpawns[i], spiderMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(spiderAddedSpawnBiomeNames[i]))!!) }
        zombieAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityZombie::class.java, zombieWeightedProbs[i], zombieMinSpawns[i], zombieMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(zombieAddedSpawnBiomeNames[i]))!!) }
        slimeAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySlime::class.java, slimeWeightedProbs[i], slimeMinSpawns[i], slimeMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(slimeAddedSpawnBiomeNames[i]))!!) }
        ghastAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityGhast::class.java, ghastWeightedProbs[i], ghastMinSpawns[i], ghastMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(ghastAddedSpawnBiomeNames[i]))!!) }
        pigZombieAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityPigZombie::class.java, pigZombieWeightedProbs[i], pigZombieMinSpawns[i], pigZombieMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(pigZombieAddedSpawnBiomeNames[i]))!!) }
        endermanAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityEnderman::class.java, endermanWeightedProbs[i], endermanMinSpawns[i], endermanMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(endermanAddedSpawnBiomeNames[i]))!!) }
        caveSpiderAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityCaveSpider::class.java, caveSpiderWeightedProbs[i], caveSpiderMinSpawns[i], caveSpiderMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(caveSpiderAddedSpawnBiomeNames[i]))!!) }
        silverfishAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySilverfish::class.java, silverfishWeightedProbs[i], silverfishMinSpawns[i], silverfishMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(silverfishAddedSpawnBiomeNames[i]))!!) }
        blazeAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityBlaze::class.java, blazeWeightedProbs[i], blazeMinSpawns[i], blazeMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(blazeAddedSpawnBiomeNames[i]))!!) }
        magmaCubeAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityMagmaCube::class.java, magmaCubeWeightedProbs[i], magmaCubeMinSpawns[i], magmaCubeMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(magmaCubeAddedSpawnBiomeNames[i]))!!) }
        batAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityBat::class.java, batWeightedProbs[i], batMinSpawns[i], batMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(batAddedSpawnBiomeNames[i]))!!) }
        witchAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityWitch::class.java, witchWeightedProbs[i], witchMinSpawns[i], witchMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(witchAddedSpawnBiomeNames[i]))!!) }
        endermiteAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityEndermite::class.java, endermiteWeightedProbs[i], endermiteMinSpawns[i], endermiteMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(endermiteAddedSpawnBiomeNames[i]))!!) }
        guardianAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityGuardian::class.java, guardianWeightedProbs[i], guardianMinSpawns[i], guardianMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(guardianAddedSpawnBiomeNames[i]))!!) }
        shulkerAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityShulker::class.java, shulkerWeightedProbs[i], shulkerMinSpawns[i], shulkerMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(shulkerAddedSpawnBiomeNames[i]))!!) }
        pigAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityPig::class.java, pigWeightedProbs[i], pigMinSpawns[i], pigMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(pigAddedSpawnBiomeNames[i]))!!) }
        sheepAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySheep::class.java, sheepWeightedProbs[i], sheepMinSpawns[i], sheepMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(sheepAddedSpawnBiomeNames[i]))!!) }
        cowAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityCow::class.java, cowWeightedProbs[i], cowMinSpawns[i], cowMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(cowAddedSpawnBiomeNames[i]))!!) }
        chickenAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityChicken::class.java, chickenWeightedProbs[i], chickenMinSpawns[i], chickenMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(chickenAddedSpawnBiomeNames[i]))!!) }
        squidAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySquid::class.java, squidWeightedProbs[i], squidMinSpawns[i], squidMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(squidAddedSpawnBiomeNames[i]))!!) }
        wolfAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityWolf::class.java, wolfWeightedProbs[i], wolfMinSpawns[i], wolfMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(wolfAddedSpawnBiomeNames[i]))!!) }
        mooshroomCowAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityMooshroom::class.java, mooshroomCowWeightedProbs[i], mooshroomCowMinSpawns[i], mooshroomCowMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(mooshroomCowAddedSpawnBiomeNames[i]))!!) }
        ocelotAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityOcelot::class.java, ocelotWeightedProbs[i], ocelotMinSpawns[i], ocelotMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(ocelotAddedSpawnBiomeNames[i]))!!) }
        horseAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityHorse::class.java, horseWeightedProbs[i], horseMinSpawns[i], horseMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(horseAddedSpawnBiomeNames[i]))!!) }
        rabbitAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityRabbit::class.java, rabbitWeightedProbs[i], rabbitMinSpawns[i], rabbitMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(rabbitAddedSpawnBiomeNames[i]))!!) }
        villagerAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityVillager::class.java, villagerWeightedProbs[i], villagerMinSpawns[i], villagerMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(villagerAddedSpawnBiomeNames[i]))!!) }
        enderDragonAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityDragon::class.java, enderDragonWeightedProbs[i], enderDragonMinSpawns[i], enderDragonMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(enderDragonAddedSpawnBiomeNames[i]))!!) }
        witherBossAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityWither::class.java, witherBossWeightedProbs[i], witherBossMinSpawns[i], witherBossMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(witherBossAddedSpawnBiomeNames[i]))!!) }
        elderGuardianAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityElderGuardian::class.java, elderGuardianWeightedProbs[i], elderGuardianMinSpawns[i], elderGuardianMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(elderGuardianAddedSpawnBiomeNames[i]))!!) }
        evokerAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityEvoker::class.java, evokerWeightedProbs[i], evokerMinSpawns[i], evokerMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(evokerAddedSpawnBiomeNames[i]))!!) }
        polarBearAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityPolarBear::class.java, polarBearWeightedProbs[i], polarBearMinSpawns[i], polarBearMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(polarBearAddedSpawnBiomeNames[i]))!!) }
        vexAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityVex::class.java, vexWeightedProbs[i], vexMinSpawns[i], vexMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(vexAddedSpawnBiomeNames[i]))!!) }
        strayAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityStray::class.java, strayWeightedProbs[i], strayMinSpawns[i], strayMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(strayAddedSpawnBiomeNames[i]))!!) }
        vindicatorAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityVindicator::class.java, vindicatorWeightedProbs[i], vindicatorMinSpawns[i], vindicatorMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(vindicatorAddedSpawnBiomeNames[i]))!!) }
        witherSkeletonAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityWitherSkeleton::class.java, witherSkeletonWeightedProbs[i], witherSkeletonMinSpawns[i], witherSkeletonMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(witherSkeletonAddedSpawnBiomeNames[i]))!!) }
        huskAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityHusk::class.java, huskWeightedProbs[i], huskMinSpawns[i], huskMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(huskAddedSpawnBiomeNames[i]))!!) }
        llamaAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityLlama::class.java, llamaWeightedProbs[i], llamaMinSpawns[i], llamaMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(llamaAddedSpawnBiomeNames[i]))!!) }
        skeletonHorseAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySkeletonHorse::class.java, skeletonHorseWeightedProbs[i], skeletonHorseMinSpawns[i], skeletonHorseMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(skeletonHorseAddedSpawnBiomeNames[i]))!!) }
        zombieHorseAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityZombieHorse::class.java, zombieHorseWeightedProbs[i], zombieHorseMinSpawns[i], zombieHorseMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(zombieHorseAddedSpawnBiomeNames[i]))!!) }
        ironGolemAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntityIronGolem::class.java, ironGolemWeightedProbs[i], ironGolemMinSpawns[i], ironGolemMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(ironGolemAddedSpawnBiomeNames[i]))!!) }
        snowGolemAddedSpawnBiomeNames.indices.forEach { i -> addSpawn(EntitySnowman::class.java, snowGolemWeightedProbs[i], snowGolemMinSpawns[i], snowGolemMaxSpawns[i], MONSTER, BIOMES.getValue(ResourceLocation(snowGolemAddedSpawnBiomeNames[i]))!!) }
    }

    fun removeMobSpawns() {
        creeperRemovedSpawnBiomeNames.forEach { removeSpawn(EntityCreeper::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        skeletonRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySkeleton::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        spiderRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySpider::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        zombieRemovedSpawnBiomeNames.forEach { removeSpawn(EntityZombie::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        slimeRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySlime::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        ghastRemovedSpawnBiomeNames.forEach { removeSpawn(EntityGhast::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        pigZombieRemovedSpawnBiomeNames.forEach { removeSpawn(EntityPigZombie::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        endermanRemovedSpawnBiomeNames.forEach { removeSpawn(EntityEnderman::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        caveSpiderRemovedSpawnBiomeNames.forEach { removeSpawn(EntityCaveSpider::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        silverfishRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySilverfish::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        blazeRemovedSpawnBiomeNames.forEach { removeSpawn(EntityBlaze::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        magmaCubeRemovedSpawnBiomeNames.forEach { removeSpawn(EntityMagmaCube::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        batRemovedSpawnBiomeNames.forEach { removeSpawn(EntityBat::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        witchRemovedSpawnBiomeNames.forEach { removeSpawn(EntityWitch::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        endermiteRemovedSpawnBiomeNames.forEach { removeSpawn(EntityEndermite::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        guardianRemovedSpawnBiomeNames.forEach { removeSpawn(EntityGuardian::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        shulkerRemovedSpawnBiomeNames.forEach { removeSpawn(EntityShulker::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        pigRemovedSpawnBiomeNames.forEach { removeSpawn(EntityPig::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        sheepRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySheep::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        cowRemovedSpawnBiomeNames.forEach { removeSpawn(EntityCow::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        chickenRemovedSpawnBiomeNames.forEach { removeSpawn(EntityChicken::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        squidRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySquid::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        wolfRemovedSpawnBiomeNames.forEach { removeSpawn(EntityWolf::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        mooshroomCowRemovedSpawnBiomeNames.forEach { removeSpawn(EntityMooshroom::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        ocelotRemovedSpawnBiomeNames.forEach { removeSpawn(EntityOcelot::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        horseRemovedSpawnBiomeNames.forEach { removeSpawn(EntityHorse::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        rabbitRemovedSpawnBiomeNames.forEach { removeSpawn(EntityRabbit::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        villagerRemovedSpawnBiomeNames.forEach { removeSpawn(EntityVillager::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        enderDragonRemovedSpawnBiomeNames.forEach { removeSpawn(EntityDragon::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        witherBossRemovedSpawnBiomeNames.forEach { removeSpawn(EntityWither::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        elderGuardianRemovedSpawnBiomeNames.forEach { removeSpawn(EntityElderGuardian::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        evokerRemovedSpawnBiomeNames.forEach { removeSpawn(EntityEvoker::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        polarBearRemovedSpawnBiomeNames.forEach { removeSpawn(EntityPolarBear::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        vexRemovedSpawnBiomeNames.forEach { removeSpawn(EntityVex::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        strayRemovedSpawnBiomeNames.forEach { removeSpawn(EntityStray::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        vindicatorRemovedSpawnBiomeNames.forEach { removeSpawn(EntityVindicator::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        witherSkeletonRemovedSpawnBiomeNames.forEach { removeSpawn(EntityWitherSkeleton::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        huskRemovedSpawnBiomeNames.forEach { removeSpawn(EntityHusk::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        llamaRemovedSpawnBiomeNames.forEach { removeSpawn(EntityLlama::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        skeletonHorseRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySkeletonHorse::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        zombieHorseRemovedSpawnBiomeNames.forEach { removeSpawn(EntityZombieHorse::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        ironGolemRemovedSpawnBiomeNames.forEach { removeSpawn(EntityIronGolem::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
        snowGolemRemovedSpawnBiomeNames.forEach { removeSpawn(EntitySnowman::class.java, MONSTER, BIOMES.getValue(ResourceLocation(it))!!) }
    }
}
