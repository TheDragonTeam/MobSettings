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

    //Creeper
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMobDrops", comment = "Add Mob Drops to the Mob \"Creeper\" \nExample: \"minecraft:dirt\"")
    public static String[] creeperMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperAmountMobDrops", comment = "Add How many Mob drops the Mob \"Creeper\" will drop when killed")
    public static int[] creeperAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Creeper\" will drop when killed")
    public static int creeperNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperWeightedProbs", comment = "Add weighted probabilities to the Mob \"Creeper\"'s spawn rates")
    public static int[] creeperWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMinSpawns", comment = "Add the min amount of the Mob \"Creeper\" that will spawn in the biome")
    public static int[] creeperMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMaxSpawns", comment = "Add the max amount of the Mob \"Creeper\" that will spawn in the biome")
    public static int[] creeperMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Creeper\"  will spawn in")
    public static int[] creeperAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Creeper\" will spawn in")
    public static int creeperNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Creeper\"  wont spawn in")
    public static int[] creeperRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Creeper\" wont spawn in")
    public static int creeperNumberOfRemovedSpawns = 0;
    //Skeleton
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton\" will drop when killed")
    public static int[] skeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Skeleton\" will drop when killed")
    public static int skeletonNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Skeleton\"'s spawn rates")
    public static int[] skeletonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMinSpawns", comment = "Add the min amount of the Mob \"Skeleton\" that will spawn in the biome")
    public static int[] skeletonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMaxSpawns", comment = "Add the max amount of the Mob \"Skeleton\" that will spawn in the biome")
    public static int[] skeletonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Skeleton\"  will spawn in")
    public static int[] skeletonAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Skeleton\" will spawn in")
    public static int skeletonNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Skeleton\"  wont spawn in")
    public static int[] skeletonRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Skeleton\" wont spawn in")
    public static int skeletonNumberOfRemovedSpawns = 0;
    //Spider
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMobDrops", comment = "Add Mob Drops to the Mob \"Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] spiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Spider\" will drop when killed")
    public static int[] spiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Spider\" will drop when killed")
    public static int spiderNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderWeightedProbs", comment = "Add weighted probabilities to the Mob \"Spider\"'s spawn rates")
    public static int[] spiderWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMinSpawns", comment = "Add the min amount of the Mob \"Spider\" that will spawn in the biome")
    public static int[] spiderMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMaxSpawns", comment = "Add the max amount of the Mob \"Spider\" that will spawn in the biome")
    public static int[] spiderMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Spider\"  will spawn in")
    public static int[] spiderAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Spider\" will spawn in")
    public static int spiderNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Spider\"  wont spawn in")
    public static int[] spiderRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Spider\" wont spawn in")
    public static int spiderNumberOfRemovedSpawns = 0;
    //Zombie
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMobDrops", comment = "Add Mob Drops to the Mob \"Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie\" will drop when killed")
    public static int[] zombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Zombie\" will drop when killed")
    public static int zombieNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieWeightedProbs", comment = "Add weighted probabilities to the Mob \"Zombie\"'s spawn rates")
    public static int[] zombieWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMinSpawns", comment = "Add the min amount of the Mob \"Zombie\" that will spawn in the biome")
    public static int[] zombieMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMaxSpawns", comment = "Add the max amount of the Mob \"Zombie\" that will spawn in the biome")
    public static int[] zombieMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Zombie\"  will spawn in")
    public static int[] zombieAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Zombie\" will spawn in")
    public static int zombieNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Zombie\"  wont spawn in")
    public static int[] zombieRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Zombie\" wont spawn in")
    public static int zombieNumberOfRemovedSpawns = 0;
    //Slime
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMobDrops", comment = "Add Mob Drops to the Mob \"Slime\" \nExample: \"minecraft:dirt\"")
    public static String[] slimeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Slime\" will drop when killed")
    public static int[] slimeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Slime\" will drop when killed")
    public static int slimeNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Slime\"'s spawn rates")
    public static int[] slimeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMinSpawns", comment = "Add the min amount of the Mob \"Slime\" that will spawn in the biome")
    public static int[] slimeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMaxSpawns", comment = "Add the max amount of the Mob \"Slime\" that will spawn in the biome")
    public static int[] slimeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Slime\"  will spawn in")
    public static int[] slimeAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Slime\" will spawn in")
    public static int slimeNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Slime\"  wont spawn in")
    public static int[] slimeRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Slime\" wont spawn in")
    public static int slimeNumberOfRemovedSpawns = 0;
    //Ghast
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMobDrops", comment = "Add Mob Drops to the Mob \"Ghast\" \nExample: \"minecraft:dirt\"")
    public static String[] ghastMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ghast\" will drop when killed")
    public static int[] ghastAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ghast\" will drop when killed")
    public static int ghastNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ghast\"'s spawn rates")
    public static int[] ghastWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMinSpawns", comment = "Add the min amount of the Mob \"Ghast\" that will spawn in the biome")
    public static int[] ghastMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMaxSpawns", comment = "Add the max amount of the Mob \"Ghast\" that will spawn in the biome")
    public static int[] ghastMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ghast\"  will spawn in")
    public static int[] ghastAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Ghast\" will spawn in")
    public static int ghastNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ghast\"  wont spawn in")
    public static int[] ghastRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Ghast\" wont spawn in")
    public static int ghastNumberOfRemovedSpawns = 0;
    //PigZombie
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMobDrops", comment = "Add Mob Drops to the Mob \"Pig Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] pigZombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig Zombie\" will drop when killed")
    public static int[] pigZombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Pig Zombie\" will drop when killed")
    public static int pigZombieNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieWeightedProbs", comment = "Add weighted probabilities to the Mob \"Pig Zombie\"'s spawn rates")
    public static int[] pigZombieWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMinSpawns", comment = "Add the min amount of the Mob \"Pig Zombie\" that will spawn in the biome")
    public static int[] pigZombieMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMaxSpawns", comment = "Add the max amount of the Mob \"Pig Zombie\" that will spawn in the biome")
    public static int[] pigZombieMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Pig Zombie\"  will spawn in")
    public static int[] pigZombieAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Pig Zombie\" will spawn in")
    public static int pigZombieNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Pig Zombie\"  wont spawn in")
    public static int[] pigZombieRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Pig Zombie\" wont spawn in")
    public static int pigZombieNumberOfRemovedSpawns = 0;
    //Enderman
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMobDrops", comment = "Add Mob Drops to the Mob \"Enderman\" \nExample: \"minecraft:dirt\"")
    public static String[] endermanMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAmountMobDrops", comment = "Add How many Mob drops the Mob \"Enderman\" will drop when killed")
    public static int[] endermanAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Enderman\" will drop when killed")
    public static int endermanNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanWeightedProbs", comment = "Add weighted probabilities to the Mob \"Enderman\"'s spawn rates")
    public static int[] endermanWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMinSpawns", comment = "Add the min amount of the Mob \"Enderman\" that will spawn in the biome")
    public static int[] endermanMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMaxSpawns", comment = "Add the max amount of the Mob \"Enderman\" that will spawn in the biome")
    public static int[] endermanMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Enderman\"  will spawn in")
    public static int[] endermanAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Enderman\" will spawn in")
    public static int endermanNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Enderman\"  wont spawn in")
    public static int[] endermanRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Enderman\" wont spawn in")
    public static int endermanNumberOfRemovedSpawns = 0;
    //CaveSpider
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMobDrops", comment = "Add Mob Drops to the Mob \"Cave Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] caveSpiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cave Spider\" will drop when killed")
    public static int[] caveSpiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Cave Spider\" will drop when killed")
    public static int caveSpiderNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderWeightedProbs", comment = "Add weighted probabilities to the Mob \"Cave Spider\"'s spawn rates")
    public static int[] caveSpiderWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMinSpawns", comment = "Add the min amount of the Mob \"Cave Spider\" that will spawn in the biome")
    public static int[] caveSpiderMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMaxSpawns", comment = "Add the max amount of the Mob \"Cave Spider\" that will spawn in the biome")
    public static int[] caveSpiderMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Cave Spider\"  will spawn in")
    public static int[] caveSpiderAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Cave Spider\" will spawn in")
    public static int caveSpiderNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Cave Spider\"  wont spawn in")
    public static int[] caveSpiderRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Cave Spider\" wont spawn in")
    public static int caveSpiderNumberOfRemovedSpawns = 0;
    //Silverfish
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMobDrops", comment = "Add Mob Drops to the Mob \"Silverfish\" \nExample: \"minecraft:dirt\"")
    public static String[] silverfishMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAmountMobDrops", comment = "Add How many Mob drops the Mob \"Silverfish\" will drop when killed")
    public static int[] silverfishAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Silverfish\" will drop when killed")
    public static int silverfishNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishWeightedProbs", comment = "Add weighted probabilities to the Mob \"Silverfish\"'s spawn rates")
    public static int[] silverfishWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMinSpawns", comment = "Add the min amount of the Mob \"Silverfish\" that will spawn in the biome")
    public static int[] silverfishMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMaxSpawns", comment = "Add the max amount of the Mob \"Silverfish\" that will spawn in the biome")
    public static int[] silverfishMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Silverfish\"  will spawn in")
    public static int[] silverfishAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Silverfish\" will spawn in")
    public static int silverfishNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Silverfish\"  wont spawn in")
    public static int[] silverfishRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Silverfish\" wont spawn in")
    public static int silverfishNumberOfRemovedSpawns = 0;
    //Blaze
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMobDrops", comment = "Add Mob Drops to the Mob \"Blaze\" \nExample: \"minecraft:dirt\"")
    public static String[] blazeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Blaze\" will drop when killed")
    public static int[] blazeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Blaze\" will drop when killed")
    public static int blazeNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Blaze\"'s spawn rates")
    public static int[] blazeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMinSpawns", comment = "Add the min amount of the Mob \"Blaze\" that will spawn in the biome")
    public static int[] blazeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMaxSpawns", comment = "Add the max amount of the Mob \"Blaze\" that will spawn in the biome")
    public static int[] blazeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Blaze\"  will spawn in")
    public static int[] blazeAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Blaze\" will spawn in")
    public static int blazeNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Blaze\"  wont spawn in")
    public static int[] blazeRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Blaze\" wont spawn in")
    public static int blazeNumberOfRemovedSpawns = 0;
    //MagmaCube
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMobDrops", comment = "Add Mob Drops to the Mob \"Magma Cube\" \nExample: \"minecraft:dirt\"")
    public static String[] magmaCubeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Magma Cube\" will drop when killed")
    public static int[] magmaCubeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Magma Cube\" will drop when killed")
    public static int magmaCubeNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeWeightedProbs", comment = "Add weighted probabilities to the Mob \"Magma Cube\"'s spawn rates")
    public static int[] magmaCubeWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMinSpawns", comment = "Add the min amount of the Mob \"Magma Cube\" that will spawn in the biome")
    public static int[] magmaCubeMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMaxSpawns", comment = "Add the max amount of the Mob \"Magma Cube\" that will spawn in the biome")
    public static int[] magmaCubeMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Magma Cube\"  will spawn in")
    public static int[] magmaCubeAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Magma Cube\" will spawn in")
    public static int magmaCubeNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Magma Cube\"  wont spawn in")
    public static int[] magmaCubeRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Magma Cube\" wont spawn in")
    public static int magmaCubeNumberOfRemovedSpawns = 0;
    //Bat
    @ModConfigProperty(category = "Mobs.Bat", name = "batMobDrops", comment = "Add Mob Drops to the Mob \"Bat\" \nExample: \"minecraft:dirt\"")
    public static String[] batMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batAmountMobDrops", comment = "Add How many Mob drops the Mob \"Bat\" will drop when killed")
    public static int[] batAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Bat\" will drop when killed")
    public static int batNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Bat", name = "batWeightedProbs", comment = "Add weighted probabilities to the Mob \"Bat\"'s spawn rates")
    public static int[] batWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batMinSpawns", comment = "Add the min amount of the Mob \"Bat\" that will spawn in the biome")
    public static int[] batMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batMaxSpawns", comment = "Add the max amount of the Mob \"Bat\" that will spawn in the biome")
    public static int[] batMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Bat\"  will spawn in")
    public static int[] batAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Bat\" will spawn in")
    public static int batNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Bat", name = "batRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Bat\"  wont spawn in")
    public static int[] batRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Bat\" wont spawn in")
    public static int batNumberOfRemovedSpawns = 0;
    //Witch
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMobDrops", comment = "Add Mob Drops to the Mob \"Witch\" \nExample: \"minecraft:dirt\"")
    public static String[] witchMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAmountMobDrops", comment = "Add How many Mob drops the Mob \"Witch\" will drop when killed")
    public static int[] witchAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Witch\" will drop when killed")
    public static int witchNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Witch", name = "witchWeightedProbs", comment = "Add weighted probabilities to the Mob \"Witch\"'s spawn rates")
    public static int[] witchWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMinSpawns", comment = "Add the min amount of the Mob \"Witch\" that will spawn in the biome")
    public static int[] witchMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMaxSpawns", comment = "Add the max amount of the Mob \"Witch\" that will spawn in the biome")
    public static int[] witchMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Witch\"  will spawn in")
    public static int[] witchAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Witch\" will spawn in")
    public static int witchNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Witch", name = "witchRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Witch\"  wont spawn in")
    public static int[] witchRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Witch\" wont spawn in")
    public static int witchNumberOfRemovedSpawns = 0;
    //Endermite
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMobDrops", comment = "Add Mob Drops to the Mob \"Endermite\" \nExample: \"minecraft:dirt\"")
    public static String[] endermiteMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAmountMobDrops", comment = "Add How many Mob drops the Mob \"Endermite\" will drop when killed")
    public static int[] endermiteAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Endermite\" will drop when killed")
    public static int endermiteNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteWeightedProbs", comment = "Add weighted probabilities to the Mob \"Endermite\"'s spawn rates")
    public static int[] endermiteWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMinSpawns", comment = "Add the min amount of the Mob \"Endermite\" that will spawn in the biome")
    public static int[] endermiteMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMaxSpawns", comment = "Add the max amount of the Mob \"Endermite\" that will spawn in the biome")
    public static int[] endermiteMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Endermite\"  will spawn in")
    public static int[] endermiteAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Endermite\" will spawn in")
    public static int endermiteNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Endermite\"  wont spawn in")
    public static int[] endermiteRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Endermite\" wont spawn in")
    public static int endermiteNumberOfRemovedSpawns = 0;
    //Guardian
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMobDrops", comment = "Add Mob Drops to the Mob \"Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] guardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Guardian\" will drop when killed")
    public static int[] guardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Guardian\" will drop when killed")
    public static int guardianNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianWeightedProbs", comment = "Add weighted probabilities to the Mob \"Guardian\"'s spawn rates")
    public static int[] guardianWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMinSpawns", comment = "Add the min amount of the Mob \"Guardian\" that will spawn in the biome")
    public static int[] guardianMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMaxSpawns", comment = "Add the max amount of the Mob \"Guardian\" that will spawn in the biome")
    public static int[] guardianMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Guardian\"  will spawn in")
    public static int[] guardianAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Guardian\" will spawn in")
    public static int guardianNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Guardian\"  wont spawn in")
    public static int[] guardianRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Guardian\" wont spawn in")
    public static int guardianNumberOfRemovedSpawns = 0;
    //Shulker
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMobDrops", comment = "Add Mob Drops to the Mob \"Shulker\" \nExample: \"minecraft:dirt\"")
    public static String[] shulkerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Shulker\" will drop when killed")
    public static int[] shulkerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Shulker\" will drop when killed")
    public static int shulkerNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Shulker\"'s spawn rates")
    public static int[] shulkerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMinSpawns", comment = "Add the min amount of the Mob \"Shulker\" that will spawn in the biome")
    public static int[] shulkerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMaxSpawns", comment = "Add the max amount of the Mob \"Shulker\" that will spawn in the biome")
    public static int[] shulkerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Shulker\"  will spawn in")
    public static int[] shulkerAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Shulker\" will spawn in")
    public static int shulkerNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Shulker\"  wont spawn in")
    public static int[] shulkerRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Shulker\" wont spawn in")
    public static int shulkerNumberOfRemovedSpawns = 0;
    //Pig
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMobDrops", comment = "Add Mob Drops to the Mob \"Pig\" \nExample: \"minecraft:dirt\"")
    public static String[] pigMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig\" will drop when killed")
    public static int[] pigAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Pig\" will drop when killed")
    public static int pigNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Pig", name = "pigWeightedProbs", comment = "Add weighted probabilities to the Mob \"Pig\"'s spawn rates")
    public static int[] pigWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMinSpawns", comment = "Add the min amount of the Mob \"Pig\" that will spawn in the biome")
    public static int[] pigMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMaxSpawns", comment = "Add the max amount of the Mob \"Pig\" that will spawn in the biome")
    public static int[] pigMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Pig\"  will spawn in")
    public static int[] pigAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Pig\" will spawn in")
    public static int pigNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Pig", name = "pigRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Pig\"  wont spawn in")
    public static int[] pigRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Pig\" wont spawn in")
    public static int pigNumberOfRemovedSpawns = 0;
    //Sheep
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMobDrops", comment = "Add Mob Drops to the Mob \"Sheep\" \nExample: \"minecraft:dirt\"")
    public static String[] sheepMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAmountMobDrops", comment = "Add How many Mob drops the Mob \"Sheep\" will drop when killed")
    public static int[] sheepAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Sheep\" will drop when killed")
    public static int sheepNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepWeightedProbs", comment = "Add weighted probabilities to the Mob \"Sheep\"'s spawn rates")
    public static int[] sheepWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMinSpawns", comment = "Add the min amount of the Mob \"Sheep\" that will spawn in the biome")
    public static int[] sheepMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMaxSpawns", comment = "Add the max amount of the Mob \"Sheep\" that will spawn in the biome")
    public static int[] sheepMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Sheep\"  will spawn in")
    public static int[] sheepAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Sheep\" will spawn in")
    public static int sheepNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Sheep\"  wont spawn in")
    public static int[] sheepRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Sheep\" wont spawn in")
    public static int sheepNumberOfRemovedSpawns = 0;
    //Cow
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMobDrops", comment = "Add Mob Drops to the Mob \"Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] cowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cow\" will drop when killed")
    public static int[] cowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Cow\" will drop when killed")
    public static int cowNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Cow", name = "cowWeightedProbs", comment = "Add weighted probabilities to the Mob \"Cow\"'s spawn rates")
    public static int[] cowWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMinSpawns", comment = "Add the min amount of the Mob \"Cow\" that will spawn in the biome")
    public static int[] cowMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMaxSpawns", comment = "Add the max amount of the Mob \"Cow\" that will spawn in the biome")
    public static int[] cowMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Cow\"  will spawn in")
    public static int[] cowAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Cow\" will spawn in")
    public static int cowNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Cow", name = "cowRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Cow\"  wont spawn in")
    public static int[] cowRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Cow\" wont spawn in")
    public static int cowNumberOfRemovedSpawns = 0;
    //Chicken
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMobDrops", comment = "Add Mob Drops to the Mob \"Chicken\" \nExample: \"minecraft:dirt\"")
    public static String[] chickenMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAmountMobDrops", comment = "Add How many Mob drops the Mob \"Chicken\" will drop when killed")
    public static int[] chickenAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Chicken\" will drop when killed")
    public static int chickenNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenWeightedProbs", comment = "Add weighted probabilities to the Mob \"Chicken\"'s spawn rates")
    public static int[] chickenWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMinSpawns", comment = "Add the min amount of the Mob \"Chicken\" that will spawn in the biome")
    public static int[] chickenMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMaxSpawns", comment = "Add the max amount of the Mob \"Chicken\" that will spawn in the biome")
    public static int[] chickenMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Chicken\"  will spawn in")
    public static int[] chickenAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Chicken\" will spawn in")
    public static int chickenNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Chicken\"  wont spawn in")
    public static int[] chickenRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Chicken\" wont spawn in")
    public static int chickenNumberOfRemovedSpawns = 0;
    //Squid
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMobDrops", comment = "Add Mob Drops to the Mob \"Squid\" \nExample: \"minecraft:dirt\"")
    public static String[] squidMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAmountMobDrops", comment = "Add How many Mob drops the Mob \"Squid\" will drop when killed")
    public static int[] squidAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Squid\" will drop when killed")
    public static int squidNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Squid", name = "squidWeightedProbs", comment = "Add weighted probabilities to the Mob \"Squid\"'s spawn rates")
    public static int[] squidWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMinSpawns", comment = "Add the min amount of the Mob \"Squid\" that will spawn in the biome")
    public static int[] squidMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMaxSpawns", comment = "Add the max amount of the Mob \"Squid\" that will spawn in the biome")
    public static int[] squidMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Squid\"  will spawn in")
    public static int[] squidAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Squid\" will spawn in")
    public static int squidNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Squid", name = "squidRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Squid\"  wont spawn in")
    public static int[] squidRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Squid\" wont spawn in")
    public static int squidNumberOfRemovedSpawns = 0;
    //Wolf
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMobDrops", comment = "Add Mob Drops to the Mob \"Wolf\" \nExample: \"minecraft:dirt\"")
    public static String[] wolfMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wolf\" will drop when killed")
    public static int[] wolfAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wolf\" will drop when killed")
    public static int wolfNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wolf\"'s spawn rates")
    public static int[] wolfWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMinSpawns", comment = "Add the min amount of the Mob \"Wolf\" that will spawn in the biome")
    public static int[] wolfMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMaxSpawns", comment = "Add the max amount of the Mob \"Wolf\" that will spawn in the biome")
    public static int[] wolfMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wolf\"  will spawn in")
    public static int[] wolfAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Wolf\" will spawn in")
    public static int wolfNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wolf\"  wont spawn in")
    public static int[] wolfRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Wolf\" wont spawn in")
    public static int wolfNumberOfRemovedSpawns = 0;
    //MooshroomCow
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMobDrops", comment = "Add Mob Drops to the Mob \"Mooshroom Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] mooshroomCowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Mooshroom Cow\" will drop when killed")
    public static int[] mooshroomCowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Mooshroom Cow\" will drop when killed")
    public static int mooshroomCowNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowWeightedProbs", comment = "Add weighted probabilities to the Mob \"Mooshroom Cow\"'s spawn rates")
    public static int[] mooshroomCowWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMinSpawns", comment = "Add the min amount of the Mob \"Mooshroom Cow\" that will spawn in the biome")
    public static int[] mooshroomCowMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMaxSpawns", comment = "Add the max amount of the Mob \"Mooshroom Cow\" that will spawn in the biome")
    public static int[] mooshroomCowMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Mooshroom Cow\"  will spawn in")
    public static int[] mooshroomCowAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Mooshroom Cow\" will spawn in")
    public static int mooshroomCowNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Mooshroom Cow\"  wont spawn in")
    public static int[] mooshroomCowRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Mooshroom Cow\" wont spawn in")
    public static int mooshroomCowNumberOfRemovedSpawns = 0;
    //Ocelot
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMobDrops", comment = "Add Mob Drops to the Mob \"Ocelot\" \nExample: \"minecraft:dirt\"")
    public static String[] ocelotMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ocelot\" will drop when killed")
    public static int[] ocelotAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ocelot\" will drop when killed")
    public static int ocelotNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ocelot\"'s spawn rates")
    public static int[] ocelotWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMinSpawns", comment = "Add the min amount of the Mob \"Ocelot\" that will spawn in the biome")
    public static int[] ocelotMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMaxSpawns", comment = "Add the max amount of the Mob \"Ocelot\" that will spawn in the biome")
    public static int[] ocelotMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ocelot\"  will spawn in")
    public static int[] ocelotAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Ocelot\" will spawn in")
    public static int ocelotNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ocelot\"  wont spawn in")
    public static int[] ocelotRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Ocelot\" wont spawn in")
    public static int ocelotNumberOfRemovedSpawns = 0;
    //Horse
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMobDrops", comment = "Add Mob Drops to the Mob \"Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] horseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Horse\" will drop when killed")
    public static int[] horseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Horse\" will drop when killed")
    public static int horseNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Horse", name = "horseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Horse\"'s spawn rates")
    public static int[] horseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMinSpawns", comment = "Add the min amount of the Mob \"Horse\" that will spawn in the biome")
    public static int[] horseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMaxSpawns", comment = "Add the max amount of the Mob \"Horse\" that will spawn in the biome")
    public static int[] horseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Horse\"  will spawn in")
    public static int[] horseAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Horse\" will spawn in")
    public static int horseNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Horse", name = "horseRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Horse\"  wont spawn in")
    public static int[] horseRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Horse\" wont spawn in")
    public static int horseNumberOfRemovedSpawns = 0;
    //Rabbit
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMobDrops", comment = "Add Mob Drops to the Mob \"Rabbit\" \nExample: \"minecraft:dirt\"")
    public static String[] rabbitMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAmountMobDrops", comment = "Add How many Mob drops the Mob \"Rabbit\" will drop when killed")
    public static int[] rabbitAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Rabbit\" will drop when killed")
    public static int rabbitNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitWeightedProbs", comment = "Add weighted probabilities to the Mob \"Rabbit\"'s spawn rates")
    public static int[] rabbitWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMinSpawns", comment = "Add the min amount of the Mob \"Rabbit\" that will spawn in the biome")
    public static int[] rabbitMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMaxSpawns", comment = "Add the max amount of the Mob \"Rabbit\" that will spawn in the biome")
    public static int[] rabbitMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Rabbit\"  will spawn in")
    public static int[] rabbitAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Rabbit\" will spawn in")
    public static int rabbitNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Rabbit\"  wont spawn in")
    public static int[] rabbitRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Rabbit\" wont spawn in")
    public static int rabbitNumberOfRemovedSpawns = 0;
    //Villager
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMobDrops", comment = "Add Mob Drops to the Mob \"Villager\" \nExample: \"minecraft:dirt\"")
    public static String[] villagerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Villager\" will drop when killed")
    public static int[] villagerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Villager\" will drop when killed")
    public static int villagerNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Villager\"'s spawn rates")
    public static int[] villagerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMinSpawns", comment = "Add the min amount of the Mob \"Villager\" that will spawn in the biome")
    public static int[] villagerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMaxSpawns", comment = "Add the max amount of the Mob \"Villager\" that will spawn in the biome")
    public static int[] villagerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Villager\"  will spawn in")
    public static int[] villagerAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Villager\" will spawn in")
    public static int villagerNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Villager\"  wont spawn in")
    public static int[] villagerRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Villager\" wont spawn in")
    public static int villagerNumberOfRemovedSpawns = 0;
    //EnderDragon
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMobDrops", comment = "Add Mob Drops to the Mob \"Ender Dragon\" \nExample: \"minecraft:dirt\"")
    public static String[] enderDragonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ender Dragon\" will drop when killed")
    public static int[] enderDragonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ender Dragon\" will drop when killed")
    public static int enderDragonNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Ender Dragon\"'s spawn rates")
    public static int[] enderDragonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMinSpawns", comment = "Add the min amount of the Mob \"Ender Dragon\" that will spawn in the biome")
    public static int[] enderDragonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMaxSpawns", comment = "Add the max amount of the Mob \"Ender Dragon\" that will spawn in the biome")
    public static int[] enderDragonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ender Dragon\"  will spawn in")
    public static int[] enderDragonAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Ender Dragon\" will spawn in")
    public static int enderDragonNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Ender Dragon\"  wont spawn in")
    public static int[] enderDragonRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Ender Dragon\" wont spawn in")
    public static int enderDragonNumberOfRemovedSpawns = 0;
    //WitherBoss
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMobDrops", comment = "Add Mob Drops to the Mob \"Wither Boss\" \nExample: \"minecraft:dirt\"")
    public static String[] witherBossMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Boss\" will drop when killed")
    public static int[] witherBossAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wither Boss\" will drop when killed")
    public static int witherBossNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wither Boss\"'s spawn rates")
    public static int[] witherBossWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMinSpawns", comment = "Add the min amount of the Mob \"Wither Boss\" that will spawn in the biome")
    public static int[] witherBossMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMaxSpawns", comment = "Add the max amount of the Mob \"Wither Boss\" that will spawn in the biome")
    public static int[] witherBossMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wither Boss\"  will spawn in")
    public static int[] witherBossAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Wither Boss\" will spawn in")
    public static int witherBossNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wither Boss\"  wont spawn in")
    public static int[] witherBossRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Wither Boss\" wont spawn in")
    public static int witherBossNumberOfRemovedSpawns = 0;
    //ElderGuardian
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMobDrops", comment = "Add Mob Drops to the Mob \"Elder Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] elderGuardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Elder Guardian\" will drop when killed")
    public static int[] elderGuardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Elder Guardian\" will drop when killed")
    public static int elderGuardianNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianWeightedProbs", comment = "Add weighted probabilities to the Mob \"Elder Guardian\"'s spawn rates")
    public static int[] elderGuardianWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMinSpawns", comment = "Add the min amount of the Mob \"Elder Guardian\" that will spawn in the biome")
    public static int[] elderGuardianMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMaxSpawns", comment = "Add the max amount of the Mob \"Elder Guardian\" that will spawn in the biome")
    public static int[] elderGuardianMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Elder Guardian\"  will spawn in")
    public static int[] elderGuardianAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Elder Guardian\" will spawn in")
    public static int elderGuardianNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Elder Guardian\"  wont spawn in")
    public static int[] elderGuardianRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Elder Guardian\" wont spawn in")
    public static int elderGuardianNumberOfRemovedSpawns = 0;
    //Evoker
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMobDrops", comment = "Add Mob Drops to the Mob \"Evoker\" \nExample: \"minecraft:dirt\"")
    public static String[] evokerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Evoker\" will drop when killed")
    public static int[] evokerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Evoker\" will drop when killed")
    public static int evokerNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerWeightedProbs", comment = "Add weighted probabilities to the Mob \"Evoker\"'s spawn rates")
    public static int[] evokerWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMinSpawns", comment = "Add the min amount of the Mob \"Evoker\" that will spawn in the biome")
    public static int[] evokerMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMaxSpawns", comment = "Add the max amount of the Mob \"Evoker\" that will spawn in the biome")
    public static int[] evokerMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Evoker\"  will spawn in")
    public static int[] evokerAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Evoker\" will spawn in")
    public static int evokerNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Evoker\"  wont spawn in")
    public static int[] evokerRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Evoker\" wont spawn in")
    public static int evokerNumberOfRemovedSpawns = 0;
    //PolarBear
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMobDrops", comment = "Add Mob Drops to the Mob \"Polar Bear\" \nExample: \"minecraft:dirt\"")
    public static String[] polarBearMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearAmountMobDrops", comment = "Add How many Mob drops the Mob \"Polar Bear\" will drop when killed")
    public static int[] polarBearAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Polar Bear\" will drop when killed")
    public static int polarBearNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearWeightedProbs", comment = "Add weighted probabilities to the Mob \"Polar Bear\"'s spawn rates")
    public static int[] polarBearWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMinSpawns", comment = "Add the min amount of the Mob \"Polar Bear\" that will spawn in the biome")
    public static int[] polarBearMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMaxSpawns", comment = "Add the max amount of the Mob \"Polar Bear\" that will spawn in the biome")
    public static int[] polarBearMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Polar Bear\"  will spawn in")
    public static int[] polarBearAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Polar Bear\" will spawn in")
    public static int polarBearNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Polar Bear\"  wont spawn in")
    public static int[] polarBearRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Polar Bear\" wont spawn in")
    public static int polarBearNumberOfRemovedSpawns = 0;
    //Vex
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMobDrops", comment = "Add Mob Drops to the Mob \"Vex\" \nExample: \"minecraft:dirt\"")
    public static String[] vexMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vex\" will drop when killed")
    public static int[] vexAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Vex\" will drop when killed")
    public static int vexNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Vex", name = "vexWeightedProbs", comment = "Add weighted probabilities to the Mob \"Vex\"'s spawn rates")
    public static int[] vexWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMinSpawns", comment = "Add the min amount of the Mob \"Vex\" that will spawn in the biome")
    public static int[] vexMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMaxSpawns", comment = "Add the max amount of the Mob \"Vex\" that will spawn in the biome")
    public static int[] vexMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Vex\"  will spawn in")
    public static int[] vexAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Vex\" will spawn in")
    public static int vexNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Vex", name = "vexRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Vex\"  wont spawn in")
    public static int[] vexRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Vex\" wont spawn in")
    public static int vexNumberOfRemovedSpawns = 0;
    //Stray
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMobDrops", comment = "Add Mob Drops to the Mob \"Stray\" \nExample: \"minecraft:dirt\"")
    public static String[] strayMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayAmountMobDrops", comment = "Add How many Mob drops the Mob \"Stray\" will drop when killed")
    public static int[] strayAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Stray\" will drop when killed")
    public static int strayNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Stray", name = "strayWeightedProbs", comment = "Add weighted probabilities to the Mob \"Stray\"'s spawn rates")
    public static int[] strayWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMinSpawns", comment = "Add the min amount of the Mob \"Stray\" that will spawn in the biome")
    public static int[] strayMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMaxSpawns", comment = "Add the max amount of the Mob \"Stray\" that will spawn in the biome")
    public static int[] strayMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Stray\"  will spawn in")
    public static int[] strayAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Stray\" will spawn in")
    public static int strayNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Stray", name = "strayRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Stray\"  wont spawn in")
    public static int[] strayRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Stray\" wont spawn in")
    public static int strayNumberOfRemovedSpawns = 0;
    //Husk
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMobDrops", comment = "Add Mob Drops to the Mob \"Husk\" \nExample: \"minecraft:dirt\"")
    public static String[] huskMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskAmountMobDrops", comment = "Add How many Mob drops the Mob \"Husk\" will drop when killed")
    public static int[] huskAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Husk\" will drop when killed")
    public static int huskNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Husk", name = "huskWeightedProbs", comment = "Add weighted probabilities to the Mob \"Husk\"'s spawn rates")
    public static int[] huskWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMinSpawns", comment = "Add the min amount of the Mob \"Husk\" that will spawn in the biome")
    public static int[] huskMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMaxSpawns", comment = "Add the max amount of the Mob \"Husk\" that will spawn in the biome")
    public static int[] huskMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Husk\"  will spawn in")
    public static int[] huskAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Husk\" will spawn in")
    public static int huskNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Husk", name = "huskRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Husk\"  wont spawn in")
    public static int[] huskRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Husk\" wont spawn in")
    public static int huskNumberOfRemovedSpawns = 0;
    //Vindicator
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMobDrops", comment = "Add Mob Drops to the Mob \"Vindicator\" \nExample: \"minecraft:dirt\"")
    public static String[] vindicatorMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vindicator\" will drop when killed")
    public static int[] vindicatorAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Vindicator\" will drop when killed")
    public static int vindicatorNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorWeightedProbs", comment = "Add weighted probabilities to the Mob \"Vindicator\"'s spawn rates")
    public static int[] vindicatorWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMinSpawns", comment = "Add the min amount of the Mob \"Vindicator\" that will spawn in the biome")
    public static int[] vindicatorMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMaxSpawns", comment = "Add the max amount of the Mob \"Vindicator\" that will spawn in the biome")
    public static int[] vindicatorMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Vindicator\"  will spawn in")
    public static int[] vindicatorAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Vindicator\" will spawn in")
    public static int vindicatorNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Vindicator\"  wont spawn in")
    public static int[] vindicatorRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Vindicator\" wont spawn in")
    public static int vindicatorNumberOfRemovedSpawns = 0;
    //WitherSkeleton
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMobDrops", comment = "Add Mob Drops to the Mob \"Wither Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] witherSkeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Skeleton\" will drop when killed")
    public static int[] witherSkeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wither Skeleton\" will drop when killed")
    public static int witherSkeletonNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonWeightedProbs", comment = "Add weighted probabilities to the Mob \"Wither Skeleton\"'s spawn rates")
    public static int[] witherSkeletonWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMinSpawns", comment = "Add the min amount of the Mob \"Wither Skeleton\" that will spawn in the biome")
    public static int[] witherSkeletonMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMaxSpawns", comment = "Add the max amount of the Mob \"Wither Skeleton\" that will spawn in the biome")
    public static int[] witherSkeletonMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wither Skeleton\"  will spawn in")
    public static int[] witherSkeletonAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Wither Skeleton\" will spawn in")
    public static int witherSkeletonNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Wither Skeleton\"  wont spawn in")
    public static int[] witherSkeletonRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Wither Skeleton\" wont spawn in")
    public static int witherSkeletonNumberOfRemovedSpawns = 0;
    //Llama
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMobDrops", comment = "Add Mob Drops to the Mob \"Llama\" \nExample: \"minecraft:dirt\"")
    public static String[] llamaMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaAmountMobDrops", comment = "Add How many Mob drops the Mob \"Llama\" will drop when killed")
    public static int[] llamaAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Llama\" will drop when killed")
    public static int llamaNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaWeightedProbs", comment = "Add weighted probabilities to the Mob \"Llama\"'s spawn rates")
    public static int[] llamaWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMinSpawns", comment = "Add the min amount of the Mob \"Llama\" that will spawn in the biome")
    public static int[] llamaMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMaxSpawns", comment = "Add the max amount of the Mob \"Llama\" that will spawn in the biome")
    public static int[] llamaMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Llama\"  will spawn in")
    public static int[] llamaAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Llama\" will spawn in")
    public static int llamaNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Llama\"  wont spawn in")
    public static int[] llamaRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Llama\" wont spawn in")
    public static int llamaNumberOfRemovedSpawns = 0;
    //ZombieHorse
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMobDrops", comment = "Add Mob Drops to the Mob \"Zombie Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie Horse\" will drop when killed")
    public static int[] zombieHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Zombie Horse\" will drop when killed")
    public static int zombieHorseNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Zombie Horse\"'s spawn rates")
    public static int[] zombieHorseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMinSpawns", comment = "Add the min amount of the Mob \"Zombie Horse\" that will spawn in the biome")
    public static int[] zombieHorseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMaxSpawns", comment = "Add the max amount of the Mob \"Zombie Horse\" that will spawn in the biome")
    public static int[] zombieHorseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Zombie Horse\"  will spawn in")
    public static int[] zombieHorseAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Zombie Horse\" will spawn in")
    public static int zombieHorseNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Zombie Horse\"  wont spawn in")
    public static int[] zombieHorseRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Zombie Horse\" wont spawn in")
    public static int zombieHorseNumberOfRemovedSpawns = 0;
    //SkeletonHorse
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton Horse\" will drop when killed")
    public static int[] skeletonHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Skeleton Horse\" will drop when killed")
    public static int skeletonHorseNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseWeightedProbs", comment = "Add weighted probabilities to the Mob \"Skeleton Horse\"'s spawn rates")
    public static int[] skeletonHorseWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMinSpawns", comment = "Add the min amount of the Mob \"Skeleton Horse\" that will spawn in the biome")
    public static int[] skeletonHorseMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMaxSpawns", comment = "Add the max amount of the Mob \"Skeleton Horse\" that will spawn in the biome")
    public static int[] skeletonHorseMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Skeleton Horse\"  will spawn in")
    public static int[] skeletonHorseAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Skeleton Horse\" will spawn in")
    public static int skeletonHorseNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Skeleton Horse\"  wont spawn in")
    public static int[] skeletonHorseRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Skeleton Horse\" wont spawn in")
    public static int skeletonHorseNumberOfRemovedSpawns = 0;
    //IronGolem
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMobDrops", comment = "Add Mob Drops to the Mob \"Iron Golem\" \nExample: \"minecraft:dirt\"")
    public static String[] ironGolemMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemAmountMobDrops", comment = "Add How many Mob drops the Mob \"Iron Golem\" will drop when killed")
    public static int[] ironGolemAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Iron Golem\" will drop when killed")
    public static int ironGolemNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemWeightedProbs", comment = "Add weighted probabilities to the Mob \"Iron Golem\"'s spawn rates")
    public static int[] ironGolemWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMinSpawns", comment = "Add the min amount of the Mob \"Iron Golem\" that will spawn in the biome")
    public static int[] ironGolemMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemMaxSpawns", comment = "Add the max amount of the Mob \"Iron Golem\" that will spawn in the biome")
    public static int[] ironGolemMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Iron Golem\"  will spawn in")
    public static int[] ironGolemAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Iron Golem\" will spawn in")
    public static int ironGolemNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Iron Golem\"  wont spawn in")
    public static int[] ironGolemRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.IronGolem", name = "ironGolemNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Iron Golem\" wont spawn in")
    public static int ironGolemNumberOfRemovedSpawns = 0;
    //SnowGolem
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMobDrops", comment = "Add Mob Drops to the Mob \"Snow Golem\" \nExample: \"minecraft:dirt\"")
    public static String[] snowGolemMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemAmountMobDrops", comment = "Add How many Mob drops the Mob \"Snow Golem\" will drop when killed")
    public static int[] snowGolemAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Snow Golem\" will drop when killed")
    public static int snowGolemNumberOfDrops = 0;
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemWeightedProbs", comment = "Add weighted probabilities to the Mob \"SnowGolem\"'s spawn rates")
    public static int[] snowGolemWeightedProbs = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMinSpawns", comment = "Add the min amount of the Mob \"Snow Golem\" that will spawn in the biome")
    public static int[] snowGolemMinSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemMaxSpawns", comment = "Add the max amount of the Mob \"Snow Golem\" that will spawn in the biome")
    public static int[] snowGolemMaxSpawns = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemAddedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Snow Golem\"  will spawn in")
    public static int[] snowGolemAddedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemNumberOfAddedSpawns", comment = "Add how many biomes the Mob \"Snow Golem\" will spawn in")
    public static int snowGolemNumberOfAddedSpawns = 0;
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemRemovedSpawnBiomeIDs", comment = "Add the biome id that the Mob \"Snow Golem\"  wont spawn in")
    public static int[] snowGolemRemovedSpawnBiomeIDs = new int[]{};
    @ModConfigProperty(category = "Mobs.SnowGolem", name = "snowGolemNumberOfRemovedSpawns", comment = "Add how many biomes the Mob \"Snow Golem\" wont spawn in")
    public static int snowGolemNumberOfRemovedSpawns = 0;
    //DeathType
    @ModConfigProperty(category = "Mobs.DeathType", name = "dropOnlyOnPlayerKill", comment = "Toggles the drops to only drop when a player killed the mob")
    public static boolean dropOnlyOnPlayerKill = true;
}
