/*
 * Copyright (c) TheDragonTeam 206.
 */

package net.thedragonteam.mobsettings;

import net.thedragonteam.thedragonlib.config.ModConfigProperty;

/**
 * net.thedragonteam.mobsettings
 * MobSettings created by sokratis2GR on 7/3/206 :50 AM.
 */
public class MSConfig {

    //Any
    //Creeper
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMobDrops", comment = "Add Mob Drops to the Mob \"Creeper\" \nExample: \"minecraft:dirt\"")
    public static String[] creeperMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperAmountMobDrops", comment = "Add How many Mob drops the Mob \"Creeper\" will drop when killed")
    public static int[] creeperAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperWeightedProbs", comment = "Add weighted probabilities to the Mob \"Creeper\"'s spawn rates")
    public static int[] creeperWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMinSpawns", comment = "Add the min amount of the Mob \"Creeper\" that will spawn in the biome")
    public static int[] creeperMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMaxSpawns", comment = "Add the max amount of the Mob \"Creeper\" that will spawn in the biome")
    public static int[] creeperMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Creeper\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] creeperAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Creeper\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] creeperRemovedSpawnBiomeNames = new String[]{};
    //Skeleton
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton\" will drop when killed")
    public static int[] skeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Skeleton\"'s spawn rates")
    public static int[] skeletonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMinSpawns", comment = "Add the min amount of the Mob \"Skeleton\" that will spawn in the biome")
    public static int[] skeletonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMaxSpawns", comment = "Add the max amount of the Mob \"Skeleton\" that will spawn in the biome")
    public static int[] skeletonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Skeleton\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] skeletonAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Skeleton\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] skeletonRemovedSpawnBiomeNames = new String[]{};
    //Spider
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMobDrops", comment = "Add Mob Drops to the Mob \"Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] spiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Spider\" will drop when killed")
    public static int[] spiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderWeightedProbs", comment = "Add weighted probabilities to the Mob \"Spider\"'s spawn rates")
    public static int[] spiderWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMinSpawns", comment = "Add the min amount of the Mob \"Spider\" that will spawn in the biome")
    public static int[] spiderMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMaxSpawns", comment = "Add the max amount of the Mob \"Spider\" that will spawn in the biome")
    public static int[] spiderMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Spider\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] spiderAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Spider\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] spiderRemovedSpawnBiomeNames = new String[]{};
    //Zombie
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMobDrops", comment = "Add Mob Drops to the Mob \"Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie\" will drop when killed")
    public static int[] zombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieWeightedProbs", comment = "Add weighted probabilities to the Mob \"Zombie\"'s spawn rates")
    public static int[] zombieWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMinSpawns", comment = "Add the min amount of the Mob \"Zombie\" that will spawn in the biome")
    public static int[] zombieMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMaxSpawns", comment = "Add the max amount of the Mob \"Zombie\" that will spawn in the biome")
    public static int[] zombieMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Zombie\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] zombieAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Zombie\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] zombieRemovedSpawnBiomeNames = new String[]{};
    //Slime
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMobDrops", comment = "Add Mob Drops to the Mob \"Slime\" \nExample: \"minecraft:dirt\"")
    public static String[] slimeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Slime\" will drop when killed")
    public static int[] slimeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Slime\"'s spawn rates")
    public static int[] slimeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMinSpawns", comment = "Add the min amount of the Mob \"Slime\" that will spawn in the biome")
    public static int[] slimeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMaxSpawns", comment = "Add the max amount of the Mob \"Slime\" that will spawn in the biome")
    public static int[] slimeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Slime\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] slimeAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Slime\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] slimeRemovedSpawnBiomeNames = new String[]{};
    //Ghast
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMobDrops", comment = "Add Mob Drops to the Mob \"Ghast\" \nExample: \"minecraft:dirt\"")
    public static String[] ghastMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ghast\" will drop when killed")
    public static int[] ghastAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ghast\"'s spawn rates")
    public static int[] ghastWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMinSpawns", comment = "Add the min amount of the Mob \"Ghast\" that will spawn in the biome")
    public static int[] ghastMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMaxSpawns", comment = "Add the max amount of the Mob \"Ghast\" that will spawn in the biome")
    public static int[] ghastMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ghast\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] ghastAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ghast\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] ghastRemovedSpawnBiomeNames = new String[]{};
    //PigZombie
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMobDrops", comment = "Add Mob Drops to the Mob \"Pig Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] pigZombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig Zombie\" will drop when killed")
    public static int[] pigZombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieWeightedProbs", comment = "Add weighted probabilities to the Mob \"Pig Zombie\"'s spawn rates")
    public static int[] pigZombieWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMinSpawns", comment = "Add the min amount of the Mob \"Pig Zombie\" that will spawn in the biome")
    public static int[] pigZombieMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMaxSpawns", comment = "Add the max amount of the Mob \"Pig Zombie\" that will spawn in the biome")
    public static int[] pigZombieMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Pig Zombie\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] pigZombieAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Pig Zombie\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] pigZombieRemovedSpawnBiomeNames = new String[]{};
    //Enderman
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMobDrops", comment = "Add Mob Drops to the Mob \"Enderman\" \nExample: \"minecraft:dirt\"")
    public static String[] endermanMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAmountMobDrops", comment = "Add How many Mob drops the Mob \"Enderman\" will drop when killed")
    public static int[] endermanAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanWeightedProbs", comment = "Add weighted probabilities to the Mob \"Enderman\"'s spawn rates")
    public static int[] endermanWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMinSpawns", comment = "Add the min amount of the Mob \"Enderman\" that will spawn in the biome")
    public static int[] endermanMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMaxSpawns", comment = "Add the max amount of the Mob \"Enderman\" that will spawn in the biome")
    public static int[] endermanMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Enderman\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] endermanAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Enderman\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] endermanRemovedSpawnBiomeNames = new String[]{};
    //CaveSpider
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMobDrops", comment = "Add Mob Drops to the Mob \"Cave Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] caveSpiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cave Spider\" will drop when killed")
    public static int[] caveSpiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderWeightedProbs", comment = "Add weighted probabilities to the Mob \"Cave Spider\"'s spawn rates")
    public static int[] caveSpiderWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMinSpawns", comment = "Add the min amount of the Mob \"Cave Spider\" that will spawn in the biome")
    public static int[] caveSpiderMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMaxSpawns", comment = "Add the max amount of the Mob \"Cave Spider\" that will spawn in the biome")
    public static int[] caveSpiderMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Cave Spider\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] caveSpiderAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Cave Spider\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] caveSpiderRemovedSpawnBiomeNames = new String[]{};
    //Silverfish
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMobDrops", comment = "Add Mob Drops to the Mob \"Silverfish\" \nExample: \"minecraft:dirt\"")
    public static String[] silverfishMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAmountMobDrops", comment = "Add How many Mob drops the Mob \"Silverfish\" will drop when killed")
    public static int[] silverfishAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishWeightedProbs", comment = "Add weighted probabilities to the Mob \"Silverfish\"'s spawn rates")
    public static int[] silverfishWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMinSpawns", comment = "Add the min amount of the Mob \"Silverfish\" that will spawn in the biome")
    public static int[] silverfishMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMaxSpawns", comment = "Add the max amount of the Mob \"Silverfish\" that will spawn in the biome")
    public static int[] silverfishMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Silverfish\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] silverfishAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Silverfish\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] silverfishRemovedSpawnBiomeNames = new String[]{};
    //Blaze
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMobDrops", comment = "Add Mob Drops to the Mob \"Blaze\" \nExample: \"minecraft:dirt\"")
    public static String[] blazeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Blaze\" will drop when killed")
    public static int[] blazeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Blaze\"'s spawn rates")
    public static int[] blazeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMinSpawns", comment = "Add the min amount of the Mob \"Blaze\" that will spawn in the biome")
    public static int[] blazeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMaxSpawns", comment = "Add the max amount of the Mob \"Blaze\" that will spawn in the biome")
    public static int[] blazeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Blaze\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] blazeAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Blaze\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] blazeRemovedSpawnBiomeNames = new String[]{};
    //MagmaCube
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMobDrops", comment = "Add Mob Drops to the Mob \"Magma Cube\" \nExample: \"minecraft:dirt\"")
    public static String[] magmaCubeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Magma Cube\" will drop when killed")
    public static int[] magmaCubeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Magma Cube\"'s spawn rates")
    public static int[] magmaCubeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMinSpawns", comment = "Add the min amount of the Mob \"Magma Cube\" that will spawn in the biome")
    public static int[] magmaCubeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMaxSpawns", comment = "Add the max amount of the Mob \"Magma Cube\" that will spawn in the biome")
    public static int[] magmaCubeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Magma Cube\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] magmaCubeAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Magma Cube\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] magmaCubeRemovedSpawnBiomeNames = new String[]{};
    //Bat
    @ModConfigProperty(category = "Mobs.Bat", name = "batMobDrops", comment = "Add Mob Drops to the Mob \"Bat\" \nExample: \"minecraft:dirt\"")
    public static String[] batMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batAmountMobDrops", comment = "Add How many Mob drops the Mob \"Bat\" will drop when killed")
    public static int[] batAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batWeightedProbs", comment = "Add weighted probabilities to the Mob \"Bat\"'s spawn rates")
    public static int[] batWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batMinSpawns", comment = "Add the min amount of the Mob \"Bat\" that will spawn in the biome")
    public static int[] batMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batMaxSpawns", comment = "Add the max amount of the Mob \"Bat\" that will spawn in the biome")
    public static int[] batMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Bat\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] batAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Bat\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] batRemovedSpawnBiomeNames = new String[]{};
    //Witch
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMobDrops", comment = "Add Mob Drops to the Mob \"Witch\" \nExample: \"minecraft:dirt\"")
    public static String[] witchMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAmountMobDrops", comment = "Add How many Mob drops the Mob \"Witch\" will drop when killed")
    public static int[] witchAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchWeightedProbs", comment = "Add weighted probabilities to the Mob \"Witch\"'s spawn rates")
    public static int[] witchWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMinSpawns", comment = "Add the min amount of the Mob \"Witch\" that will spawn in the biome")
    public static int[] witchMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMaxSpawns", comment = "Add the max amount of the Mob \"Witch\" that will spawn in the biome")
    public static int[] witchMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Witch\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] witchAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Witch\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] witchRemovedSpawnBiomeNames = new String[]{};
    //Endermite
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMobDrops", comment = "Add Mob Drops to the Mob \"Endermite\" \nExample: \"minecraft:dirt\"")
    public static String[] endermiteMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAmountMobDrops", comment = "Add How many Mob drops the Mob \"Endermite\" will drop when killed")
    public static int[] endermiteAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteWeightedProbs", comment = "Add weighted probabilities to the Mob \"Endermite\"'s spawn rates")
    public static int[] endermiteWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMinSpawns", comment = "Add the min amount of the Mob \"Endermite\" that will spawn in the biome")
    public static int[] endermiteMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMaxSpawns", comment = "Add the max amount of the Mob \"Endermite\" that will spawn in the biome")
    public static int[] endermiteMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Endermite\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] endermiteAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Endermite\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] endermiteRemovedSpawnBiomeNames = new String[]{};
    //Guardian
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMobDrops", comment = "Add Mob Drops to the Mob \"Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] guardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Guardian\" will drop when killed")
    public static int[] guardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianWeightedProbs", comment = "Add weighted probabilities to the Mob \"Guardian\"'s spawn rates")
    public static int[] guardianWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMinSpawns", comment = "Add the min amount of the Mob \"Guardian\" that will spawn in the biome")
    public static int[] guardianMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMaxSpawns", comment = "Add the max amount of the Mob \"Guardian\" that will spawn in the biome")
    public static int[] guardianMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Guardian\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] guardianAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Guardian\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] guardianRemovedSpawnBiomeNames = new String[]{};
    //Shulker
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMobDrops", comment = "Add Mob Drops to the Mob \"Shulker\" \nExample: \"minecraft:dirt\"")
    public static String[] shulkerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Shulker\" will drop when killed")
    public static int[] shulkerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Shulker\"'s spawn rates")
    public static int[] shulkerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMinSpawns", comment = "Add the min amount of the Mob \"Shulker\" that will spawn in the biome")
    public static int[] shulkerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMaxSpawns", comment = "Add the max amount of the Mob \"Shulker\" that will spawn in the biome")
    public static int[] shulkerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Shulker\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] shulkerAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Shulker\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] shulkerRemovedSpawnBiomeNames = new String[]{};
    //Pig
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMobDrops", comment = "Add Mob Drops to the Mob \"Pig\" \nExample: \"minecraft:dirt\"")
    public static String[] pigMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig\" will drop when killed")
    public static int[] pigAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigWeightedProbs", comment = "Add weighted probabilities to the Mob \"Pig\"'s spawn rates")
    public static int[] pigWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMinSpawns", comment = "Add the min amount of the Mob \"Pig\" that will spawn in the biome")
    public static int[] pigMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMaxSpawns", comment = "Add the max amount of the Mob \"Pig\" that will spawn in the biome")
    public static int[] pigMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Pig\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] pigAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Pig\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] pigRemovedSpawnBiomeNames = new String[]{};
    //Sheep
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMobDrops", comment = "Add Mob Drops to the Mob \"Sheep\" \nExample: \"minecraft:dirt\"")
    public static String[] sheepMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAmountMobDrops", comment = "Add How many Mob drops the Mob \"Sheep\" will drop when killed")
    public static int[] sheepAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepWeightedProbs", comment = "Add weighted probabilities to the Mob \"Sheep\"'s spawn rates")
    public static int[] sheepWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMinSpawns", comment = "Add the min amount of the Mob \"Sheep\" that will spawn in the biome")
    public static int[] sheepMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMaxSpawns", comment = "Add the max amount of the Mob \"Sheep\" that will spawn in the biome")
    public static int[] sheepMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Sheep\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] sheepAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Sheep\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] sheepRemovedSpawnBiomeNames = new String[]{};
    //Cow
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMobDrops", comment = "Add Mob Drops to the Mob \"Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] cowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cow\" will drop when killed")
    public static int[] cowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowWeightedProbs", comment = "Add weighted probabilities to the Mob \"Cow\"'s spawn rates")
    public static int[] cowWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMinSpawns", comment = "Add the min amount of the Mob \"Cow\" that will spawn in the biome")
    public static int[] cowMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMaxSpawns", comment = "Add the max amount of the Mob \"Cow\" that will spawn in the biome")
    public static int[] cowMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Cow\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] cowAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Cow\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] cowRemovedSpawnBiomeNames = new String[]{};
    //Chicken
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMobDrops", comment = "Add Mob Drops to the Mob \"Chicken\" \nExample: \"minecraft:dirt\"")
    public static String[] chickenMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAmountMobDrops", comment = "Add How many Mob drops the Mob \"Chicken\" will drop when killed")
    public static int[] chickenAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenWeightedProbs", comment = "Add weighted probabilities to the Mob \"Chicken\"'s spawn rates")
    public static int[] chickenWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMinSpawns", comment = "Add the min amount of the Mob \"Chicken\" that will spawn in the biome")
    public static int[] chickenMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMaxSpawns", comment = "Add the max amount of the Mob \"Chicken\" that will spawn in the biome")
    public static int[] chickenMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Chicken\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] chickenAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Chicken\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] chickenRemovedSpawnBiomeNames = new String[]{};
    //Squid
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMobDrops", comment = "Add Mob Drops to the Mob \"Squid\" \nExample: \"minecraft:dirt\"")
    public static String[] squidMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAmountMobDrops", comment = "Add How many Mob drops the Mob \"Squid\" will drop when killed")
    public static int[] squidAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidWeightedProbs", comment = "Add weighted probabilities to the Mob \"Squid\"'s spawn rates")
    public static int[] squidWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMinSpawns", comment = "Add the min amount of the Mob \"Squid\" that will spawn in the biome")
    public static int[] squidMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMaxSpawns", comment = "Add the max amount of the Mob \"Squid\" that will spawn in the biome")
    public static int[] squidMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Squid\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] squidAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Squid\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] squidRemovedSpawnBiomeNames = new String[]{};
    //Wolf
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMobDrops", comment = "Add Mob Drops to the Mob \"Wolf\" \nExample: \"minecraft:dirt\"")
    public static String[] wolfMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wolf\" will drop when killed")
    public static int[] wolfAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wolf\"'s spawn rates")
    public static int[] wolfWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMinSpawns", comment = "Add the min amount of the Mob \"Wolf\" that will spawn in the biome")
    public static int[] wolfMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMaxSpawns", comment = "Add the max amount of the Mob \"Wolf\" that will spawn in the biome")
    public static int[] wolfMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wolf\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] wolfAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wolf\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] wolfRemovedSpawnBiomeNames = new String[]{};
    //MooshroomCow
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMobDrops", comment = "Add Mob Drops to the Mob \"Mooshroom Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] mooshroomCowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Mooshroom Cow\" will drop when killed")
    public static int[] mooshroomCowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowWeightedProbs", comment = "Add weighted probabilities to the Mob \"Mooshroom Cow\"'s spawn rates")
    public static int[] mooshroomCowWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMinSpawns", comment = "Add the min amount of the Mob \"Mooshroom Cow\" that will spawn in the biome")
    public static int[] mooshroomCowMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMaxSpawns", comment = "Add the max amount of the Mob \"Mooshroom Cow\" that will spawn in the biome")
    public static int[] mooshroomCowMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Mooshroom Cow\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] mooshroomCowAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Mooshroom Cow\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] mooshroomCowRemovedSpawnBiomeNames = new String[]{};
    //Ocelot
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMobDrops", comment = "Add Mob Drops to the Mob \"Ocelot\" \nExample: \"minecraft:dirt\"")
    public static String[] ocelotMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ocelot\" will drop when killed")
    public static int[] ocelotAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ocelot\"'s spawn rates")
    public static int[] ocelotWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMinSpawns", comment = "Add the min amount of the Mob \"Ocelot\" that will spawn in the biome")
    public static int[] ocelotMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMaxSpawns", comment = "Add the max amount of the Mob \"Ocelot\" that will spawn in the biome")
    public static int[] ocelotMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ocelot\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] ocelotAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ocelot\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] ocelotRemovedSpawnBiomeNames = new String[]{};
    //Horse
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMobDrops", comment = "Add Mob Drops to the Mob \"Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] horseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Horse\" will drop when killed")
    public static int[] horseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Horse\"'s spawn rates")
    public static int[] horseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMinSpawns", comment = "Add the min amount of the Mob \"Horse\" that will spawn in the biome")
    public static int[] horseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMaxSpawns", comment = "Add the max amount of the Mob \"Horse\" that will spawn in the biome")
    public static int[] horseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Horse\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] horseAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Horse\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] horseRemovedSpawnBiomeNames = new String[]{};
    //Rabbit
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMobDrops", comment = "Add Mob Drops to the Mob \"Rabbit\" \nExample: \"minecraft:dirt\"")
    public static String[] rabbitMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAmountMobDrops", comment = "Add How many Mob drops the Mob \"Rabbit\" will drop when killed")
    public static int[] rabbitAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitWeightedProbs", comment = "Add weighted probabilities to the Mob \"Rabbit\"'s spawn rates")
    public static int[] rabbitWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMinSpawns", comment = "Add the min amount of the Mob \"Rabbit\" that will spawn in the biome")
    public static int[] rabbitMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMaxSpawns", comment = "Add the max amount of the Mob \"Rabbit\" that will spawn in the biome")
    public static int[] rabbitMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Rabbit\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] rabbitAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Rabbit\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] rabbitRemovedSpawnBiomeNames = new String[]{};
    //Villager
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMobDrops", comment = "Add Mob Drops to the Mob \"Villager\" \nExample: \"minecraft:dirt\"")
    public static String[] villagerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Villager\" will drop when killed")
    public static int[] villagerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Villager\"'s spawn rates")
    public static int[] villagerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMinSpawns", comment = "Add the min amount of the Mob \"Villager\" that will spawn in the biome")
    public static int[] villagerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMaxSpawns", comment = "Add the max amount of the Mob \"Villager\" that will spawn in the biome")
    public static int[] villagerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Villager\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] villagerAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Villager\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] villagerRemovedSpawnBiomeNames = new String[]{};
    //EnderDragon
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMobDrops", comment = "Add Mob Drops to the Mob \"Ender Dragon\" \nExample: \"minecraft:dirt\"")
    public static String[] enderDragonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ender Dragon\" will drop when killed")
    public static int[] enderDragonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ender Dragon\"'s spawn rates")
    public static int[] enderDragonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMinSpawns", comment = "Add the min amount of the Mob \"Ender Dragon\" that will spawn in the biome")
    public static int[] enderDragonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMaxSpawns", comment = "Add the max amount of the Mob \"Ender Dragon\" that will spawn in the biome")
    public static int[] enderDragonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ender Dragon\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] enderDragonAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Ender Dragon\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] enderDragonRemovedSpawnBiomeNames = new String[]{};
    //WitherBoss
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMobDrops", comment = "Add Mob Drops to the Mob \"Wither Boss\" \nExample: \"minecraft:dirt\"")
    public static String[] witherBossMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Boss\" will drop when killed")
    public static int[] witherBossAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wither Boss\"'s spawn rates")
    public static int[] witherBossWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMinSpawns", comment = "Add the min amount of the Mob \"Wither Boss\" that will spawn in the biome")
    public static int[] witherBossMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMaxSpawns", comment = "Add the max amount of the Mob \"Wither Boss\" that will spawn in the biome")
    public static int[] witherBossMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wither Boss\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] witherBossAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wither Boss\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] witherBossRemovedSpawnBiomeNames = new String[]{};
    //ElderGuardian
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMobDrops", comment = "Add Mob Drops to the Mob \"Elder Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] elderGuardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Elder Guardian\" will drop when killed")
    public static int[] elderGuardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianWeightedProbs", comment = "Add weighted probabilities to the Mob \"Elder Guardian\"'s spawn rates")
    public static int[] elderGuardianWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMinSpawns", comment = "Add the min amount of the Mob \"Elder Guardian\" that will spawn in the biome")
    public static int[] elderGuardianMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMaxSpawns", comment = "Add the max amount of the Mob \"Elder Guardian\" that will spawn in the biome")
    public static int[] elderGuardianMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Elder Guardian\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] elderGuardianAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Elder Guardian\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] elderGuardianRemovedSpawnBiomeNames = new String[]{};
    //Evoker
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMobDrops", comment = "Add Mob Drops to the Mob \"Evoker\" \nExample: \"minecraft:dirt\"")
    public static String[] evokerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Evoker\" will drop when killed")
    public static int[] evokerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Evoker\"'s spawn rates")
    public static int[] evokerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMinSpawns", comment = "Add the min amount of the Mob \"Evoker\" that will spawn in the biome")
    public static int[] evokerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMaxSpawns", comment = "Add the max amount of the Mob \"Evoker\" that will spawn in the biome")
    public static int[] evokerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Evoker\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] evokerAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Evoker\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] evokerRemovedSpawnBiomeNames = new String[]{};
    //PolarBear
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMobDrops", comment = "Add Mob Drops to the Mob \"Polar Bear\" \nExample: \"minecraft:dirt\"")
    public static String[] polarBearMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearAmountMobDrops", comment = "Add How many Mob drops the Mob \"Polar Bear\" will drop when killed")
    public static int[] polarBearAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearWeightedProbs", comment = "Add weighted probabilities to the Mob \"Polar Bear\"'s spawn rates")
    public static int[] polarBearWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMinSpawns", comment = "Add the min amount of the Mob \"Polar Bear\" that will spawn in the biome")
    public static int[] polarBearMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMaxSpawns", comment = "Add the max amount of the Mob \"Polar Bear\" that will spawn in the biome")
    public static int[] polarBearMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Polar Bear\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] polarBearAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Polar Bear\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] polarBearRemovedSpawnBiomeNames = new String[]{};
    //Vex
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMobDrops", comment = "Add Mob Drops to the Mob \"Vex\" \nExample: \"minecraft:dirt\"")
    public static String[] vexMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vex\" will drop when killed")
    public static int[] vexAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexWeightedProbs", comment = "Add weighted probabilities to the Mob \"Vex\"'s spawn rates")
    public static int[] vexWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMinSpawns", comment = "Add the min amount of the Mob \"Vex\" that will spawn in the biome")
    public static int[] vexMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMaxSpawns", comment = "Add the max amount of the Mob \"Vex\" that will spawn in the biome")
    public static int[] vexMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Vex\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] vexAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Vex\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] vexRemovedSpawnBiomeNames = new String[]{};
    //Stray
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMobDrops", comment = "Add Mob Drops to the Mob \"Stray\" \nExample: \"minecraft:dirt\"")
    public static String[] strayMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayAmountMobDrops", comment = "Add How many Mob drops the Mob \"Stray\" will drop when killed")
    public static int[] strayAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayWeightedProbs", comment = "Add weighted probabilities to the Mob \"Stray\"'s spawn rates")
    public static int[] strayWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMinSpawns", comment = "Add the min amount of the Mob \"Stray\" that will spawn in the biome")
    public static int[] strayMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMaxSpawns", comment = "Add the max amount of the Mob \"Stray\" that will spawn in the biome")
    public static int[] strayMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Stray\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] strayAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Stray\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] strayRemovedSpawnBiomeNames = new String[]{};
    //Husk
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMobDrops", comment = "Add Mob Drops to the Mob \"Husk\" \nExample: \"minecraft:dirt\"")
    public static String[] huskMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskAmountMobDrops", comment = "Add How many Mob drops the Mob \"Husk\" will drop when killed")
    public static int[] huskAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskWeightedProbs", comment = "Add weighted probabilities to the Mob \"Husk\"'s spawn rates")
    public static int[] huskWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMinSpawns", comment = "Add the min amount of the Mob \"Husk\" that will spawn in the biome")
    public static int[] huskMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMaxSpawns", comment = "Add the max amount of the Mob \"Husk\" that will spawn in the biome")
    public static int[] huskMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Husk\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] huskAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Husk\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] huskRemovedSpawnBiomeNames = new String[]{};
    //Vindicator
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMobDrops", comment = "Add Mob Drops to the Mob \"Vindicator\" \nExample: \"minecraft:dirt\"")
    public static String[] vindicatorMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vindicator\" will drop when killed")
    public static int[] vindicatorAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorWeightedProbs", comment = "Add weighted probabilities to the Mob \"Vindicator\"'s spawn rates")
    public static int[] vindicatorWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMinSpawns", comment = "Add the min amount of the Mob \"Vindicator\" that will spawn in the biome")
    public static int[] vindicatorMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMaxSpawns", comment = "Add the max amount of the Mob \"Vindicator\" that will spawn in the biome")
    public static int[] vindicatorMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Vindicator\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] vindicatorAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Vindicator\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] vindicatorRemovedSpawnBiomeNames = new String[]{};
    //WitherSkeleton
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMobDrops", comment = "Add Mob Drops to the Mob \"Wither Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] witherSkeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Skeleton\" will drop when killed")
    public static int[] witherSkeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wither Skeleton\"'s spawn rates")
    public static int[] witherSkeletonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMinSpawns", comment = "Add the min amount of the Mob \"Wither Skeleton\" that will spawn in the biome")
    public static int[] witherSkeletonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMaxSpawns", comment = "Add the max amount of the Mob \"Wither Skeleton\" that will spawn in the biome")
    public static int[] witherSkeletonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wither Skeleton\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] witherSkeletonAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Wither Skeleton\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] witherSkeletonRemovedSpawnBiomeNames = new String[]{};
    //Llama
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMobDrops", comment = "Add Mob Drops to the Mob \"Llama\" \nExample: \"minecraft:dirt\"")
    public static String[] llamaMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaAmountMobDrops", comment = "Add How many Mob drops the Mob \"Llama\" will drop when killed")
    public static int[] llamaAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaWeightedProbs", comment = "Add weighted probabilities to the Mob \"Llama\"'s spawn rates")
    public static int[] llamaWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMinSpawns", comment = "Add the min amount of the Mob \"Llama\" that will spawn in the biome")
    public static int[] llamaMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMaxSpawns", comment = "Add the max amount of the Mob \"Llama\" that will spawn in the biome")
    public static int[] llamaMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Llama\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] llamaAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Llama\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] llamaRemovedSpawnBiomeNames = new String[]{};
    //ZombieHorse
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMobDrops", comment = "Add Mob Drops to the Mob \"Zombie Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie Horse\" will drop when killed")
    public static int[] zombieHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Zombie Horse\"'s spawn rates")
    public static int[] zombieHorseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMinSpawns", comment = "Add the min amount of the Mob \"Zombie Horse\" that will spawn in the biome")
    public static int[] zombieHorseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMaxSpawns", comment = "Add the max amount of the Mob \"Zombie Horse\" that will spawn in the biome")
    public static int[] zombieHorseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Zombie Horse\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] zombieHorseAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Zombie Horse\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] zombieHorseRemovedSpawnBiomeNames = new String[]{};
    //SkeletonHorse
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton Horse\" will drop when killed")
    public static int[] skeletonHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Skeleton Horse\"'s spawn rates")
    public static int[] skeletonHorseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMinSpawns", comment = "Add the min amount of the Mob \"Skeleton Horse\" that will spawn in the biome")
    public static int[] skeletonHorseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMaxSpawns", comment = "Add the max amount of the Mob \"Skeleton Horse\" that will spawn in the biome")
    public static int[] skeletonHorseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Skeleton Horse\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] skeletonHorseAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Skeleton Horse\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] skeletonHorseRemovedSpawnBiomeNames = new String[]{};
    //IronGolem
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMobDrops", comment = "Add Mob Drops to the Mob \"Iron Golem\" \nExample: \"minecraft:dirt\"")
    public static String[] ironGolemMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemAmountMobDrops", comment = "Add How many Mob drops the Mob \"Iron Golem\" will drop when killed")
    public static int[] ironGolemAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemWeightedProbs", comment = "Add weighted probabilities to the Mob \"Iron Golem\"'s spawn rates")
    public static int[] ironGolemWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMinSpawns", comment = "Add the min amount of the Mob \"Iron Golem\" that will spawn in the biome")
    public static int[] ironGolemMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMaxSpawns", comment = "Add the max amount of the Mob \"Iron Golem\" that will spawn in the biome")
    public static int[] ironGolemMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Iron Golem\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] ironGolemAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Iron Golem\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] ironGolemRemovedSpawnBiomeNames = new String[]{};
    //SnowGolem
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMobDrops", comment = "Add Mob Drops to the Mob \"Snow Golem\" \nExample: \"minecraft:dirt\"")
    public static String[] snowGolemMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemAmountMobDrops", comment = "Add How many Mob drops the Mob \"Snow Golem\" will drop when killed")
    public static int[] snowGolemAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemWeightedProbs", comment = "Add weighted probabilities to the Mob \"SnowGolem\"'s spawn rates")
    public static int[] snowGolemWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMinSpawns", comment = "Add the min amount of the Mob \"Snow Golem\" that will spawn in the biome")
    public static int[] snowGolemMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMaxSpawns", comment = "Add the max amount of the Mob \"Snow Golem\" that will spawn in the biome")
    public static int[] snowGolemMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemAddedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Snow Golem\" will spawn in include modname \nExample: \"minecraft:beach\"")
    public static String[] snowGolemAddedSpawnBiomeNames = new String[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemRemovedSpawnBiomeNames", comment = "Add the biome name that the Mob \"Snow Golem\" wont spawn in. include modname \nExample: \"minecraft:beach\"")
    public static String[] snowGolemRemovedSpawnBiomeNames = new String[]{};
    //DeathType
    @ModConfigProperty(category = "Mobs.DeathType", name = "dropOnlyOnPlayerKill", comment = "Toggles the drops to only drop when a player killed the mob")
    public static boolean dropOnlyOnPlayerKill = true;
}
