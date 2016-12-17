/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings.registry;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;

import static net.minecraft.entity.EnumCreatureType.MONSTER;
import static net.minecraft.world.biome.Biome.getBiome;
import static net.minecraftforge.fml.common.registry.EntityRegistry.addSpawn;
import static net.minecraftforge.fml.common.registry.EntityRegistry.removeSpawn;
import static net.thedragonteam.mobsettings.MSConfig.*;

public class MobSpawns {

    public static void addMobSpawns() {
        for (int i = 0; i <= (creeperNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityCreeper.class, creeperWeightedProbs[i], creeperMinSpawns[i], creeperMaxSpawns[i], MONSTER, getBiome(creeperAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (skeletonNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySkeleton.class, skeletonWeightedProbs[i], skeletonMinSpawns[i], skeletonMaxSpawns[i], MONSTER, getBiome(skeletonAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (spiderNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySpider.class, spiderWeightedProbs[i], spiderMinSpawns[i], spiderMaxSpawns[i], MONSTER, getBiome(spiderAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (zombieNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityZombie.class, zombieWeightedProbs[i], zombieMinSpawns[i], zombieMaxSpawns[i], MONSTER, getBiome(zombieAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (slimeNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySlime.class, slimeWeightedProbs[i], slimeMinSpawns[i], slimeMaxSpawns[i], MONSTER, getBiome(slimeAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ghastNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityGhast.class, ghastWeightedProbs[i], ghastMinSpawns[i], ghastMaxSpawns[i], MONSTER, getBiome(ghastAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (pigZombieNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityPigZombie.class, pigZombieWeightedProbs[i], pigZombieMinSpawns[i], pigZombieMaxSpawns[i], MONSTER, getBiome(pigZombieAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (endermanNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityEnderman.class, endermanWeightedProbs[i], endermanMinSpawns[i], endermanMaxSpawns[i], MONSTER, getBiome(endermanAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (caveSpiderNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityCaveSpider.class, caveSpiderWeightedProbs[i], caveSpiderMinSpawns[i], caveSpiderMaxSpawns[i], MONSTER, getBiome(caveSpiderAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (silverfishNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySilverfish.class, silverfishWeightedProbs[i], silverfishMinSpawns[i], silverfishMaxSpawns[i], MONSTER, getBiome(silverfishAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (blazeNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityBlaze.class, blazeWeightedProbs[i], blazeMinSpawns[i], blazeMaxSpawns[i], MONSTER, getBiome(blazeAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (magmaCubeNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityMagmaCube.class, magmaCubeWeightedProbs[i], magmaCubeMinSpawns[i], magmaCubeMaxSpawns[i], MONSTER, getBiome(magmaCubeAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (batNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityBat.class, batWeightedProbs[i], batMinSpawns[i], batMaxSpawns[i], MONSTER, getBiome(batAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witchNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityWitch.class, witchWeightedProbs[i], witchMinSpawns[i], witchMaxSpawns[i], MONSTER, getBiome(witchAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (endermiteNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityEndermite.class, endermiteWeightedProbs[i], endermiteMinSpawns[i], endermiteMaxSpawns[i], MONSTER, getBiome(endermiteAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (guardianNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityGuardian.class, guardianWeightedProbs[i], guardianMinSpawns[i], guardianMaxSpawns[i], MONSTER, getBiome(guardianAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (shulkerNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityShulker.class, shulkerWeightedProbs[i], shulkerMinSpawns[i], shulkerMaxSpawns[i], MONSTER, getBiome(shulkerAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (pigNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityPig.class, pigWeightedProbs[i], pigMinSpawns[i], pigMaxSpawns[i], MONSTER, getBiome(pigAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (sheepNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySheep.class, sheepWeightedProbs[i], sheepMinSpawns[i], sheepMaxSpawns[i], MONSTER, getBiome(sheepAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (cowNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityCow.class, cowWeightedProbs[i], cowMinSpawns[i], cowMaxSpawns[i], MONSTER, getBiome(cowAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (chickenNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityChicken.class, chickenWeightedProbs[i], chickenMinSpawns[i], chickenMaxSpawns[i], MONSTER, getBiome(chickenAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (squidNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySquid.class, squidWeightedProbs[i], squidMinSpawns[i], squidMaxSpawns[i], MONSTER, getBiome(squidAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (wolfNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityWolf.class, wolfWeightedProbs[i], wolfMinSpawns[i], wolfMaxSpawns[i], MONSTER, getBiome(wolfAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (mooshroomCowNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityMooshroom.class, mooshroomCowWeightedProbs[i], mooshroomCowMinSpawns[i], mooshroomCowMaxSpawns[i], MONSTER, getBiome(mooshroomCowAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ocelotNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityOcelot.class, ocelotWeightedProbs[i], ocelotMinSpawns[i], ocelotMaxSpawns[i], MONSTER, getBiome(ocelotAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (horseNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityHorse.class, horseWeightedProbs[i], horseMinSpawns[i], horseMaxSpawns[i], MONSTER, getBiome(horseAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (rabbitNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityRabbit.class, rabbitWeightedProbs[i], rabbitMinSpawns[i], rabbitMaxSpawns[i], MONSTER, getBiome(rabbitAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (villagerNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityVillager.class, villagerWeightedProbs[i], villagerMinSpawns[i], villagerMaxSpawns[i], MONSTER, getBiome(villagerAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (enderDragonNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityDragon.class, enderDragonWeightedProbs[i], enderDragonMinSpawns[i], enderDragonMaxSpawns[i], MONSTER, getBiome(enderDragonAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witherBossNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityWither.class, witherBossWeightedProbs[i], witherBossMinSpawns[i], witherBossMaxSpawns[i], MONSTER, getBiome(witherBossAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (elderGuardianNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityElderGuardian.class, elderGuardianWeightedProbs[i], elderGuardianMinSpawns[i], elderGuardianMaxSpawns[i], MONSTER, getBiome(elderGuardianAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (evokerNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityEvoker.class, evokerWeightedProbs[i], evokerMinSpawns[i], evokerMaxSpawns[i], MONSTER, getBiome(evokerAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (polarBearNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityPolarBear.class, polarBearWeightedProbs[i], polarBearMinSpawns[i], polarBearMaxSpawns[i], MONSTER, getBiome(polarBearAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (vexNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityVex.class, vexWeightedProbs[i], vexMinSpawns[i], vexMaxSpawns[i], MONSTER, getBiome(vexAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (strayNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityStray.class, strayWeightedProbs[i], strayMinSpawns[i], strayMaxSpawns[i], MONSTER, getBiome(strayAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (vindicatorNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityVindicator.class, vindicatorWeightedProbs[i], vindicatorMinSpawns[i], vindicatorMaxSpawns[i], MONSTER, getBiome(vindicatorAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witherSkeletonNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityWitherSkeleton.class, witherSkeletonWeightedProbs[i], witherSkeletonMinSpawns[i], witherSkeletonMaxSpawns[i], MONSTER, getBiome(witherSkeletonAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (huskNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityHusk.class, huskWeightedProbs[i], huskMinSpawns[i], huskMaxSpawns[i], MONSTER, getBiome(huskAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (llamaNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityLlama.class, llamaWeightedProbs[i], llamaMinSpawns[i], llamaMaxSpawns[i], MONSTER, getBiome(llamaAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (skeletonHorseNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySkeletonHorse.class, skeletonHorseWeightedProbs[i], skeletonHorseMinSpawns[i], skeletonHorseMaxSpawns[i], MONSTER, getBiome(skeletonHorseAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (zombieHorseNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityZombieHorse.class, zombieHorseWeightedProbs[i], zombieHorseMinSpawns[i], zombieHorseMaxSpawns[i], MONSTER, getBiome(zombieHorseAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ironGolemNumberOfAddedSpawns - 1); i++)
            addSpawn(EntityIronGolem.class, ironGolemWeightedProbs[i], ironGolemMinSpawns[i], ironGolemMaxSpawns[i], MONSTER, getBiome(ironGolemAddedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (snowGolemNumberOfAddedSpawns - 1); i++)
            addSpawn(EntitySnowman.class, snowGolemWeightedProbs[i], snowGolemMinSpawns[i], snowGolemMaxSpawns[i], MONSTER, getBiome(snowGolemAddedSpawnBiomeIDs[i]));
    }

    public static void removeMobSpawns() {
        for (int i = 0; i <= (creeperNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityCreeper.class, MONSTER, getBiome(creeperRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (skeletonNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySkeleton.class, MONSTER, getBiome(skeletonRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (spiderNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySpider.class, MONSTER, getBiome(spiderRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (zombieNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityZombie.class, MONSTER, getBiome(zombieRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (slimeNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySlime.class, MONSTER, getBiome(slimeRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ghastNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityGhast.class, MONSTER, getBiome(ghastRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (pigZombieNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityPigZombie.class, MONSTER, getBiome(pigZombieRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (endermanNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityEnderman.class, MONSTER, getBiome(endermanRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (caveSpiderNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityCaveSpider.class, MONSTER, getBiome(caveSpiderRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (silverfishNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySilverfish.class, MONSTER, getBiome(silverfishRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (blazeNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityBlaze.class, MONSTER, getBiome(blazeRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (magmaCubeNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityMagmaCube.class, MONSTER, getBiome(magmaCubeRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (batNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityBat.class, MONSTER, getBiome(batRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witchNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityWitch.class, MONSTER, getBiome(witchRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (endermiteNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityEndermite.class, MONSTER, getBiome(endermiteRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (guardianNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityGuardian.class, MONSTER, getBiome(guardianRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (shulkerNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityShulker.class, MONSTER, getBiome(shulkerRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (pigNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityPig.class, MONSTER, getBiome(pigRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (sheepNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySheep.class, MONSTER, getBiome(sheepRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (cowNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityCow.class, MONSTER, getBiome(cowRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (chickenNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityChicken.class, MONSTER, getBiome(chickenRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (squidNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySquid.class, MONSTER, getBiome(squidRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (wolfNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityWolf.class, MONSTER, getBiome(wolfRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (mooshroomCowNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityMooshroom.class, MONSTER, getBiome(mooshroomCowRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ocelotNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityOcelot.class, MONSTER, getBiome(ocelotRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (horseNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityHorse.class, MONSTER, getBiome(horseRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (rabbitNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityRabbit.class, MONSTER, getBiome(rabbitRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (villagerNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityVillager.class, MONSTER, getBiome(villagerRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (enderDragonNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityDragon.class, MONSTER, getBiome(enderDragonRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witherBossNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityWither.class, MONSTER, getBiome(witherBossRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (elderGuardianNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityElderGuardian.class, MONSTER, getBiome(elderGuardianRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (evokerNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityEvoker.class, MONSTER, getBiome(evokerRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (polarBearNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityPolarBear.class, MONSTER, getBiome(polarBearRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (vexNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityVex.class, MONSTER, getBiome(vexRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (strayNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityStray.class, MONSTER, getBiome(strayRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (vindicatorNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityVindicator.class, MONSTER, getBiome(vindicatorRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (witherSkeletonNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityWitherSkeleton.class, MONSTER, getBiome(witherSkeletonRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (huskNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityHusk.class, MONSTER, getBiome(huskRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (llamaNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityLlama.class, MONSTER, getBiome(llamaRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (skeletonHorseNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySkeletonHorse.class, MONSTER, getBiome(skeletonHorseRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (zombieHorseNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityZombieHorse.class, MONSTER, getBiome(zombieHorseRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (ironGolemNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntityIronGolem.class, MONSTER, getBiome(ironGolemRemovedSpawnBiomeIDs[i]));
        for (int i = 0; i <= (snowGolemNumberOfRemovedSpawns - 1); i++)
            removeSpawn(EntitySnowman.class, MONSTER, getBiome(snowGolemRemovedSpawnBiomeIDs[i]));
    }
}
