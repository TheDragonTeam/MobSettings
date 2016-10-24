/*
 * Copyright (c) TheDragonTeam 2016.
 */

package net.thedragonteam.mobsettings;

import net.thedragonteam.thedragonlib.config.ModConfigProperty;

/**
 * net.thedragonteam.mobsettings
 * MobSettings created by sokratis12GR on 7/31/2016 11:50 AM.
 */
public class MSConfig {

    //Debug
    @ModConfigProperty(category = "Debug", name = "debugMode", comment = "Enable/Disable debug Mode")
    public static boolean debugMode = false;

    //Creeper
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperMobDrops", comment = "Add Mob Drops to the Mob \"Creeper\" \nExample: \"minecraft:dirt\"")
    public static String creeperMobDrops = "";
    @ModConfigProperty(category = "Mobs.Creeper", name = "creeperAmountMobDrops", comment = "Add How many Mob drops the Mob \"Creeper\" will drop when killed")
    public static int creeperAmountMobDrops = 1;

    //Skeleton
    @ModConfigProperty(category = "Mobs.Mobs.Skeleton", name = "skeletonMobDrops", comment = "Add Mob Drops to the Mob \"Skeleton\" \nExample: \"minecraft:dirt\"")
    public static String skeletonMobDrops = "";
    @ModConfigProperty(category = "Mobs.Skeleton", name = "skeletonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Skeleton\" will drop when killed")
    public static int skeletonAmountMobDrops = 1;

    //Spider
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderMobDrops", comment = "Add Mob Drops to the Mob \"Spider\" \nExample: \"minecraft:dirt\"")
    public static String spiderMobDrops = "";
    @ModConfigProperty(category = "Mobs.Spider", name = "spiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Spider\" will drop when killed")
    public static int spiderAmountMobDrops = 1;

    //Zombie
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieMobDrops", comment = "Add Mob Drops to the Mob \"Zombie\" \nExample: \"minecraft:dirt\"")
    public static String zombieMobDrops = "";
    @ModConfigProperty(category = "Mobs.Zombie", name = "zombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Zombie\" will drop when killed")
    public static int zombieAmountMobDrops = 1;

    //Slime
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeMobDrops", comment = "Add Mob Drops to the Mob \"Slime\" \nExample: \"minecraft:dirt\"")
    public static String slimeMobDrops = "";
    @ModConfigProperty(category = "Mobs.Slime", name = "slimeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Slime\" will drop when killed")
    public static int slimeAmountMobDrops = 1;

    //Ghast
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastMobDrops", comment = "Add Mob Drops to the Mob \"Ghast\" \nExample: \"minecraft:dirt\"")
    public static String ghastMobDrops = "";
    @ModConfigProperty(category = "Mobs.Ghast", name = "ghastAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ghast\" will drop when killed")
    public static int ghastAmountMobDrops = 1;

    //PigZombie
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieMobDrops", comment = "Add Mob Drops to the Mob \"Pig Zombie\" \nExample: \"minecraft:dirt\"")
    public static String pigZombieMobDrops = "";
    @ModConfigProperty(category = "Mobs.PigZombie", name = "pigZombieAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig Zombie\" will drop when killed")
    public static int pigZombieAmountMobDrops = 1;

    //Enderman
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanMobDrops", comment = "Add Mob Drops to the Mob \"Enderman\" \nExample: \"minecraft:dirt\"")
    public static String endermanMobDrops = "";
    @ModConfigProperty(category = "Mobs.Enderman", name = "endermanAmountMobDrops", comment = "Add How many Mob drops the Mob \"Enderman\" will drop when killed")
    public static int endermanAmountMobDrops = 1;

    //CaveSpider
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderMobDrops", comment = "Add Mob Drops to the Mob \"Cave Spider\" \nExample: \"minecraft:dirt\"")
    public static String caveSpiderMobDrops = "";
    @ModConfigProperty(category = "Mobs.CaveSpider", name = "caveSpiderAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cave Spider\" will drop when killed")
    public static int caveSpiderAmountMobDrops = 1;

    //Silverfish
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishMobDrops", comment = "Add Mob Drops to the Mob \"Silverfish\" \nExample: \"minecraft:dirt\"")
    public static String silverfishMobDrops = "";
    @ModConfigProperty(category = "Mobs.Silverfish", name = "silverfishAmountMobDrops", comment = "Add How many Mob drops the Mob \"Silverfish\" will drop when killed")
    public static int silverfishAmountMobDrops = 1;


    //Blaze
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeMobDrops", comment = "Add Mob Drops to the Mob \"Blaze\" \nExample: \"minecraft:dirt\"")
    public static String blazeMobDrops = "";
    @ModConfigProperty(category = "Mobs.Blaze", name = "blazeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Blaze\" will drop when killed")
    public static int blazeAmountMobDrops = 1;

    //MagmaCube
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeMobDrops", comment = "Add Mob Drops to the Mob \"Magma Cube\" \nExample: \"minecraft:dirt\"")
    public static String magmaCubeMobDrops = "";
    @ModConfigProperty(category = "Mobs.MagmaCube", name = "magmaCubeAmountMobDrops", comment = "Add How many Mob drops the Mob \"Magma Cube\" will drop when killed")
    public static int magmaCubeAmountMobDrops = 1;

    //Bat
    @ModConfigProperty(category = "Mobs.Bat", name = "batMobDrops", comment = "Add Mob Drops to the Mob \"Bat\" \nExample: \"minecraft:dirt\"")
    public static String batMobDrops = "";
    @ModConfigProperty(category = "Mobs.Bat", name = "batAmountMobDrops", comment = "Add How many Mob drops the Mob \"Bat\" will drop when killed")
    public static int batAmountMobDrops = 1;

    //Witch
    @ModConfigProperty(category = "Mobs.Witch", name = "witchMobDrops", comment = "Add Mob Drops to the Mob \"Witch\" \nExample: \"minecraft:dirt\"")
    public static String witchMobDrops = "";
    @ModConfigProperty(category = "Mobs.Witch", name = "witchAmountMobDrops", comment = "Add How many Mob drops the Mob \"Witch\" will drop when killed")
    public static int witchAmountMobDrops = 1;

    //Endermite
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteMobDrops", comment = "Add Mob Drops to the Mob \"Endermite\" \nExample: \"minecraft:dirt\"")
    public static String endermiteMobDrops = "";
    @ModConfigProperty(category = "Mobs.Endermite", name = "endermiteAmountMobDrops", comment = "Add How many Mob drops the Mob \"Endermite\" will drop when killed")
    public static int endermiteAmountMobDrops = 1;

    //Guardian
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianMobDrops", comment = "Add Mob Drops to the Mob \"Guardian\" \nExample: \"minecraft:dirt\"")
    public static String guardianMobDrops = "";
    @ModConfigProperty(category = "Mobs.Guardian", name = "guardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Guardian\" will drop when killed")
    public static int guardianAmountMobDrops = 1;

    //Shulker
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerMobDrops", comment = "Add Mob Drops to the Mob \"Shulker\" \nExample: \"minecraft:dirt\"")
    public static String shulkerMobDrops = "";
    @ModConfigProperty(category = "Mobs.Shulker", name = "shulkerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Shulker\" will drop when killed")
    public static int shulkerAmountMobDrops = 1;

    //Pig
    @ModConfigProperty(category = "Mobs.Pig", name = "pigMobDrops", comment = "Add Mob Drops to the Mob \"Pig\" \nExample: \"minecraft:dirt\"")
    public static String pigMobDrops = "";
    @ModConfigProperty(category = "Mobs.Pig", name = "pigAmountMobDrops", comment = "Add How many Mob drops the Mob \"Pig\" will drop when killed")
    public static int pigAmountMobDrops = 1;

    //Sheep
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepMobDrops", comment = "Add Mob Drops to the Mob \"Sheep\" \nExample: \"minecraft:dirt\"")
    public static String sheepMobDrops = "";
    @ModConfigProperty(category = "Mobs.Sheep", name = "sheepAmountMobDrops", comment = "Add How many Mob drops the Mob \"Sheep\" will drop when killed")
    public static int sheepAmountMobDrops = 1;

    //Cow
    @ModConfigProperty(category = "Mobs.Cow", name = "cowMobDrops", comment = "Add Mob Drops to the Mob \"Cow\" \nExample: \"minecraft:dirt\"")
    public static String cowMobDrops = "";
    @ModConfigProperty(category = "Mobs.Cow", name = "cowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Cow\" will drop when killed")
    public static int cowAmountMobDrops = 1;

    //Chicken
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenMobDrops", comment = "Add Mob Drops to the Mob \"Chicken\" \nExample: \"minecraft:dirt\"")
    public static String chickenMobDrops = "";
    @ModConfigProperty(category = "Mobs.Chicken", name = "chickenAmountMobDrops", comment = "Add How many Mob drops the Mob \"Chicken\" will drop when killed")
    public static int chickenAmountMobDrops = 1;

    //Squid
    @ModConfigProperty(category = "Mobs.Squid", name = "squidMobDrops", comment = "Add Mob Drops to the Mob \"Squid\" \nExample: \"minecraft:dirt\"")
    public static String squidMobDrops = "";
    @ModConfigProperty(category = "Mobs.Squid", name = "squidAmountMobDrops", comment = "Add How many Mob drops the Mob \"Squid\" will drop when killed")
    public static int squidAmountMobDrops = 1;

    /** */

    //Wolf
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfMobDrops", comment = "Add Mob Drops to the Mob \"Wolf\" \nExample: \"minecraft:dirt\"")
    public static String wolfMobDrops = "";
    @ModConfigProperty(category = "Mobs.Wolf", name = "wolfAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wolf\" will drop when killed")
    public static int wolfAmountMobDrops = 1;

    //MooshroomCow
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowMobDrops", comment = "Add Mob Drops to the Mob \"Mooshroom Cow\" \nExample: \"minecraft:dirt\"")
    public static String mooshroomCowMobDrops = "";
    @ModConfigProperty(category = "Mobs.MooshroomCow", name = "mooshroomCowAmountMobDrops", comment = "Add How many Mob drops the Mob \"Mooshroom Cow\" will drop when killed")
    public static int mooshroomCowAmountMobDrops = 1;

    //Ocelot
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotMobDrops", comment = "Add Mob Drops to the Mob \"Ocelot\" \nExample: \"minecraft:dirt\"")
    public static String ocelotMobDrops = "";
    @ModConfigProperty(category = "Mobs.Ocelot", name = "ocelotAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ocelot\" will drop when killed")
    public static int ocelotAmountMobDrops = 1;

    //Horse
    @ModConfigProperty(category = "Mobs.Horse", name = "horseMobDrops", comment = "Add Mob Drops to the Mob \"Horse\" \nExample: \"minecraft:dirt\"")
    public static String horseMobDrops = "";
    @ModConfigProperty(category = "Mobs.Horse", name = "horseAmountMobDrops", comment = "Add How many Mob drops the Mob \"Horse\" will drop when killed")
    public static int horseAmountMobDrops = 1;

    //Rabbit
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitMobDrops", comment = "Add Mob Drops to the Mob \"Rabbit\" \nExample: \"minecraft:dirt\"")
    public static String rabbitMobDrops = "";
    @ModConfigProperty(category = "Mobs.Rabbit", name = "rabbitAmountMobDrops", comment = "Add How many Mob drops the Mob \"Rabbit\" will drop when killed")
    public static int rabbitAmountMobDrops = 1;

    //Villager
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerMobDrops", comment = "Add Mob Drops to the Mob \"Villager\" \nExample: \"minecraft:dirt\"")
    public static String villagerMobDrops = "";
    @ModConfigProperty(category = "Mobs.Villager", name = "villagerAmountMobDrops", comment = "Add How many Mob drops the Mob \"Villager\" will drop when killed")
    public static int villagerAmountMobDrops = 1;

    //EnderDragon
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonMobDrops", comment = "Add Mob Drops to the Mob \"Ender Dragon\" \nExample: \"minecraft:dirt\"")
    public static String enderDragonMobDrops = "";
    @ModConfigProperty(category = "Mobs.EnderDragon", name = "enderDragonAmountMobDrops", comment = "Add How many Mob drops the Mob \"Ender Dragon\" will drop when killed")
    public static int enderDragonAmountMobDrops = 1;

    //WitherBoss
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossMobDrops", comment = "Add Mob Drops to the Mob \"Wither Boss\" \nExample: \"minecraft:dirt\"")
    public static String witherBossMobDrops = "";
    @ModConfigProperty(category = "Mobs.WitherBoss", name = "witherBossAmountMobDrops", comment = "Add How many Mob drops the Mob \"Wither Boss\" will drop when killed")
    public static int witherBossAmountMobDrops = 1;

    //ElderGuardian
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianMobDrops", comment = "Add Mob Drops to the Mob \"Elder Guardian\" \nExample: \"minecraft:dirt\"")
    public static String elderGuardianMobDrops = "";
    @ModConfigProperty(category = "Mobs.ElderGuardian", name = "elderGuardianAmountMobDrops", comment = "Add How many Mob drops the Mob \"Elder Guardian\" will drop when killed")
    public static int elderGuardianAmountMobDrops = 1;
}
