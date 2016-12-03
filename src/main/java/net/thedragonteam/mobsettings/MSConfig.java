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
    //Skeleton
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton\" will drop when killed")
    public static int[] skeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Skeleton\" will drop when killed")
    public static int skeletonNumberOfDrops = 0;
    //Spider
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMobDrops", comment = "Add Mob Drops to the Mob \"Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] spiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Spider\" will drop when killed")
    public static int[] spiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Spider\" will drop when killed")
    public static int spiderNumberOfDrops = 0;
    //Zombie
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMobDrops", comment = "Add Mob Drops to the Mob \"Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie\" will drop when killed")
    public static int[] zombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Zombie\" will drop when killed")
    public static int zombieNumberOfDrops = 0;
    //Slime
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMobDrops", comment = "Add Mob Drops to the Mob \"Slime\" \nExample: \"minecraft:dirt\"")
    public static String[] slimeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Slime\" will drop when killed")
    public static int[] slimeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Slime\" will drop when killed")
    public static int slimeNumberOfDrops = 0;
    //Ghast
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMobDrops", comment = "Add Mob Drops to the Mob \"Ghast\" \nExample: \"minecraft:dirt\"")
    public static String[] ghastMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ghast\" will drop when killed")
    public static int[] ghastAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ghast\" will drop when killed")
    public static int ghastNumberOfDrops = 0;
    //PigZombie
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMobDrops", comment = "Add Mob Drops to the Mob \"Pig Zombie\" \nExample: \"minecraft:dirt\"")
    public static String[] pigZombieMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig Zombie\" will drop when killed")
    public static int[] pigZombieAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Pig Zombie\" will drop when killed")
    public static int pigZombieNumberOfDrops = 0;
    //Enderman
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMobDrops", comment = "Add Mob Drops to the Mob \"Enderman\" \nExample: \"minecraft:dirt\"")
    public static String[] endermanMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAmountMobDrops", comment = "Add How many Mob drops the Mob \"Enderman\" will drop when killed")
    public static int[] endermanAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Enderman\" will drop when killed")
    public static int endermanNumberOfDrops = 0;
    //CaveSpider
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMobDrops", comment = "Add Mob Drops to the Mob \"Cave Spider\" \nExample: \"minecraft:dirt\"")
    public static String[] caveSpiderMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cave Spider\" will drop when killed")
    public static int[] caveSpiderAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Cave Spider\" will drop when killed")
    public static int caveSpiderNumberOfDrops = 0;
    //Silverfish
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMobDrops", comment = "Add Mob Drops to the Mob \"Silverfish\" \nExample: \"minecraft:dirt\"")
    public static String[] silverfishMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAmountMobDrops", comment = "Add How many Mob drops the Mob \"Silverfish\" will drop when killed")
    public static int[] silverfishAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Silverfish\" will drop when killed")
    public static int silverfishNumberOfDrops = 0;
    //Blaze
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMobDrops", comment = "Add Mob Drops to the Mob \"Blaze\" \nExample: \"minecraft:dirt\"")
    public static String[] blazeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Blaze\" will drop when killed")
    public static int[] blazeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Blaze\" will drop when killed")
    public static int blazeNumberOfDrops = 0;
    //MagmaCube
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMobDrops", comment = "Add Mob Drops to the Mob \"Magma Cube\" \nExample: \"minecraft:dirt\"")
    public static String[] magmaCubeMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Magma Cube\" will drop when killed")
    public static int[] magmaCubeAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Magma Cube\" will drop when killed")
    public static int magmaCubeNumberOfDrops = 0;
    //Bat
    @ModConfigProperty(category = "Mobs.Bat", name = "batMobDrops", comment = "Add Mob Drops to the Mob \"Bat\" \nExample: \"minecraft:dirt\"")
    public static String[] batMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batAmountMobDrops", comment = "Add How many Mob drops the Mob \"Bat\" will drop when killed")
    public static int[] batAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Bat", name = "batNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Bat\" will drop when killed")
    public static int batNumberOfDrops = 0;
    //Witch
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMobDrops", comment = "Add Mob Drops to the Mob \"Witch\" \nExample: \"minecraft:dirt\"")
    public static String[] witchMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAmountMobDrops", comment = "Add How many Mob drops the Mob \"Witch\" will drop when killed")
    public static int[] witchAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Witch", name = "witchNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Witch\" will drop when killed")
    public static int witchNumberOfDrops = 0;
    //Endermite
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMobDrops", comment = "Add Mob Drops to the Mob \"Endermite\" \nExample: \"minecraft:dirt\"")
    public static String[] endermiteMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAmountMobDrops", comment = "Add How many Mob drops the Mob \"Endermite\" will drop when killed")
    public static int[] endermiteAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Endermite\" will drop when killed")
    public static int endermiteNumberOfDrops = 0;
    //Guardian
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMobDrops", comment = "Add Mob Drops to the Mob \"Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] guardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Guardian\" will drop when killed")
    public static int[] guardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Guardian\" will drop when killed")
    public static int guardianNumberOfDrops = 0;
    //Shulker
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMobDrops", comment = "Add Mob Drops to the Mob \"Shulker\" \nExample: \"minecraft:dirt\"")
    public static String[] shulkerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Shulker\" will drop when killed")
    public static int[] shulkerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Shulker\" will drop when killed")
    public static int shulkerNumberOfDrops = 0;
    //Pig
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMobDrops", comment = "Add Mob Drops to the Mob \"Pig\" \nExample: \"minecraft:dirt\"")
    public static String[] pigMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig\" will drop when killed")
    public static int[] pigAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Pig", name = "pigNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Pig\" will drop when killed")
    public static int pigNumberOfDrops = 0;
    //Sheep
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMobDrops", comment = "Add Mob Drops to the Mob \"Sheep\" \nExample: \"minecraft:dirt\"")
    public static String[] sheepMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAmountMobDrops", comment = "Add How many Mob drops the Mob \"Sheep\" will drop when killed")
    public static int[] sheepAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Sheep\" will drop when killed")
    public static int sheepNumberOfDrops = 0;
    //Cow
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMobDrops", comment = "Add Mob Drops to the Mob \"Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] cowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cow\" will drop when killed")
    public static int[] cowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Cow", name = "cowNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Cow\" will drop when killed")
    public static int cowNumberOfDrops = 0;
    //Chicken
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMobDrops", comment = "Add Mob Drops to the Mob \"Chicken\" \nExample: \"minecraft:dirt\"")
    public static String[] chickenMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAmountMobDrops", comment = "Add How many Mob drops the Mob \"Chicken\" will drop when killed")
    public static int[] chickenAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Skeleton", name = "chickenNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Skeleton\" will drop when killed")
    public static int chickenNumberOfDrops = 0;
    //Squid
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMobDrops", comment = "Add Mob Drops to the Mob \"Squid\" \nExample: \"minecraft:dirt\"")
    public static String[] squidMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAmountMobDrops", comment = "Add How many Mob drops the Mob \"Squid\" will drop when killed")
    public static int[] squidAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Squid", name = "squidNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Squid\" will drop when killed")
    public static int squidNumberOfDrops = 0;
    //Wolf
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMobDrops", comment = "Add Mob Drops to the Mob \"Wolf\" \nExample: \"minecraft:dirt\"")
    public static String[] wolfMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wolf\" will drop when killed")
    public static int[] wolfAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wolf\" will drop when killed")
    public static int wolfNumberOfDrops = 0;
    //MooshroomCow
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMobDrops", comment = "Add Mob Drops to the Mob \"Mooshroom Cow\" \nExample: \"minecraft:dirt\"")
    public static String[] mooshroomCowMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Mooshroom Cow\" will drop when killed")
    public static int[] mooshroomCowAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomNumberOfDrops", comment = "Add how many drops will be added to the Mob \"MooshroomCow\" will drop when killed")
    public static int mooshroomNumberOfDrops = 0;
    //Ocelot
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMobDrops", comment = "Add Mob Drops to the Mob \"Ocelot\" \nExample: \"minecraft:dirt\"")
    public static String[] ocelotMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ocelot\" will drop when killed")
    public static int[] ocelotAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ocelot\" will drop when killed")
    public static int ocelotNumberOfDrops = 0;
    //Horse
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMobDrops", comment = "Add Mob Drops to the Mob \"Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] horseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Horse\" will drop when killed")
    public static int[] horseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Horse", name = "horseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Horse\" will drop when killed")
    public static int horseNumberOfDrops = 0;
    //Rabbit
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMobDrops", comment = "Add Mob Drops to the Mob \"Rabbit\" \nExample: \"minecraft:dirt\"")
    public static String[] rabbitMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAmountMobDrops", comment = "Add How many Mob drops the Mob \"Rabbit\" will drop when killed")
    public static int[] rabbitAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Rabbit\" will drop when killed")
    public static int rabbitNumberOfDrops = 0;
    //Villager
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMobDrops", comment = "Add Mob Drops to the Mob \"Villager\" \nExample: \"minecraft:dirt\"")
    public static String[] villagerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Villager\" will drop when killed")
    public static int[] villagerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Villager\" will drop when killed")
    public static int villagerNumberOfDrops = 0;
    //EnderDragon
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMobDrops", comment = "Add Mob Drops to the Mob \"Ender Dragon\" \nExample: \"minecraft:dirt\"")
    public static String[] enderDragonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ender Dragon\" will drop when killed")
    public static int[] enderDragonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Ender Dragon\" will drop when killed")
    public static int enderDragonNumberOfDrops = 0;
    //WitherBoss
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMobDrops", comment = "Add Mob Drops to the Mob \"Wither Boss\" \nExample: \"minecraft:dirt\"")
    public static String[] witherBossMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Boss\" will drop when killed")
    public static int[] witherBossAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wither Boss\" will drop when killed")
    public static int witherBossNumberOfDrops = 0;
    //ElderGuardian
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMobDrops", comment = "Add Mob Drops to the Mob \"Elder Guardian\" \nExample: \"minecraft:dirt\"")
    public static String[] elderGuardianMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Elder Guardian\" will drop when killed")
    public static int[] elderGuardianAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Elder Guardian\" will drop when killed")
    public static int elderGuardianNumberOfDrops = 0;
    //Evoker
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerMobDrops", comment = "Add Mob Drops to the Mob \"Evoker\" \nExample: \"minecraft:dirt\"")
    public static String[] evokerMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Evoker\" will drop when killed")
    public static int[] evokerAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Evoker", name = "evokerNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Evoker\" will drop when killed")
    public static int evokerNumberOfDrops = 0;
    //PolarBear
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearMobDrops", comment = "Add Mob Drops to the Mob \"Polar Bear\" \nExample: \"minecraft:dirt\"")
    public static String[] polarBearMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearAmountMobDrops", comment = "Add How many Mob drops the Mob \"Polar Bear\" will drop when killed")
    public static int[] polarBearAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.PolarBear", name = "polarBearNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Polar Bear\" will drop when killed")
    public static int polarBearNumberOfDrops = 0;
    //Vex
    @ModConfigProperty(category = "Mobs.Vex", name = "vexMobDrops", comment = "Add Mob Drops to the Mob \"Vex\" \nExample: \"minecraft:dirt\"")
    public static String[] vexMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vex\" will drop when killed")
    public static int[] vexAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vex", name = "vexNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Vex\" will drop when killed")
    public static int vexNumberOfDrops = 0;
    //Stray
    @ModConfigProperty(category = "Mobs.Stray", name = "strayMobDrops", comment = "Add Mob Drops to the Mob \"Stray\" \nExample: \"minecraft:dirt\"")
    public static String[] strayMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayAmountMobDrops", comment = "Add How many Mob drops the Mob \"Stray\" will drop when killed")
    public static int[] strayAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Stray", name = "strayNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Stray\" will drop when killed")
    public static int strayNumberOfDrops = 0;
    //Husk
    @ModConfigProperty(category = "Mobs.Husk", name = "huskMobDrops", comment = "Add Mob Drops to the Mob \"Husk\" \nExample: \"minecraft:dirt\"")
    public static String[] huskMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskAmountMobDrops", comment = "Add How many Mob drops the Mob \"Husk\" will drop when killed")
    public static int[] huskAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Husk", name = "huskNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Husk\" will drop when killed")
    public static int huskNumberOfDrops = 0;
    //Vindicator
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorMobDrops", comment = "Add Mob Drops to the Mob \"Vindicator\" \nExample: \"minecraft:dirt\"")
    public static String[] vindicatorMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorAmountMobDrops", comment = "Add How many Mob drops the Mob \"Vindicator\" will drop when killed")
    public static int[] vindicatorAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Vindicator", name = "vindicatorNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Vindicator\" will drop when killed")
    public static int vindicatorNumberOfDrops = 0;
    //WitherSkeleton
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonMobDrops", comment = "Add Mob Drops to the Mob \"Wither Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String[] witherSkeletonMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Skeleton\" will drop when killed")
    public static int[] witherSkeletonAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.WitherSkeleton", name = "witherSkeletonNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Wither Skeleton\" will drop when killed")
    public static int witherSkeletonNumberOfDrops = 0;
    //Llama
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaMobDrops", comment = "Add Mob Drops to the Mob \"Llama\" \nExample: \"minecraft:dirt\"")
    public static String[] llamaMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaAmountMobDrops", comment = "Add How many Mob drops the Mob \"Llama\" will drop when killed")
    public static int[] llamaAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.Llama", name = "llamaNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Llama\" will drop when killed")
    public static int llamaNumberOfDrops = 0;
    //ZombieHorse
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseMobDrops", comment = "Add Mob Drops to the Mob \"Zombie Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] zombieHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie Horse\" will drop when killed")
    public static int[] zombieHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.ZombieHorse", name = "zombieHorseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Zombie Horse\" will drop when killed")
    public static int zombieHorseNumberOfDrops = 0;
    //SkeletonHorse
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton Horse\" \nExample: \"minecraft:dirt\"")
    public static String[] skeletonHorseMobDrops = new String[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton Horse\" will drop when killed")
    public static int[] skeletonHorseAmountMobDrops = new int[]{};
    @ModConfigProperty(category = "Mobs.SkeletonHorse", name = "skeletonHorseNumberOfDrops", comment = "Add how many drops will be added to the Mob \"Skeleton Horse\" will drop when killed")
    public static int skeletonHorseNumberOfDrops = 0;
}
