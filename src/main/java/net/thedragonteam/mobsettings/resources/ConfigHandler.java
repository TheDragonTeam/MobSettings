package net.thedragonteam.mobsettings.resources;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;

    /**
     * Settings
     */
    public static String creeperMobDrops, skeletonMobDrops, spiderMobDrops,
            zombieMobDrops, slimeMobDrops, ghastMobDrops, pigZombieMobDrops,
            endermanMobDrops, caveSpiderMobDrops, silverfishMobDrops, blazeMobDrops,
            magmaCubeMobDrops, batMobDrops, witchMobDrops, endermiteMobDrops,
            guardianMobDrops, shulkerMobDrops, pigMobDrops, sheepMobDrops,
            cowMobDrops, chickenMobDrops, squidMobDrops, wolfMobDrops,
            mooshroomCowMobDrops, ocelotMobDrops, horseMobDrops, rabbitMobDrops,
            villagerMobDrops, enderDragonMobDrops, witherBossMobDrops, elderGuardianMobDrops;

    public static int creeperAmountMobDrops, skeletonAmountMobDrops, spiderAmountMobDrops,
            zombieAmountMobDrops, slimeAmountMobDrops, ghastAmountMobDrops, pigZombieAmountMobDrops,
            endermanAmountMobDrops, caveSpiderAmountMobDrops, silverfishAmountMobDrops, blazeAmountMobDrops,
            magmaCubeAmountMobDrops, batAmountMobDrops, witchAmountMobDrops, endermiteAmountMobDrops,
            guardianAmountMobDrops, shulkerAmountMobDrops, pigAmountMobDrops, sheepAmountMobDrops,
            cowAmountMobDrops, chickenAmountMobDrops, squidAmountMobDrops, wolfAmountMobDrops,
            mooshroomCowAmountMobDrops, ocelotAmountMobDrops, horseAmountMobDrops, rabbitAmountMobDrops,
            villagerAmountMobDrops, enderDragonAmountMobDrops, witherBossAmountMobDrops, elderGuardianAmountMobDrops;

    public static boolean debugMode;

    public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
    }

    public static void syncConfig() {
        String category;

        category = "Debug".toLowerCase();

        debugMode = config.getBoolean("debugMode", category, false, "Enable/Disable debugMode");

        category = "Creeper".toLowerCase();
        creeperMobDrops = config.getString("creeperMobDrops", category, "", "Add Mob Drops to the Mob \"Creeper\" \nExample: \"minecraft:dirt\" ");
        creeperAmountMobDrops = config.getInt("creeperAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Creeper\" will drop when killed ");

        category = "Skeleton".toLowerCase();
        skeletonMobDrops = config.getString("skeletonMobDrops", category, "", "Add Mob Drops to the Mob \"Skeleton\" \nExample: \"minecraft:dirt\" ");
        skeletonAmountMobDrops = config.getInt("skeletonAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Skeleton\" will drop when killed ");

        category = "Spider".toLowerCase();
        spiderMobDrops = config.getString("spiderMobDrops", category, "", "Add Mob Drops to the Mob \"Spider\" \nExample: \"minecraft:dirt\" ");
        spiderAmountMobDrops = config.getInt("spiderAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Spider\" will drop when killed ");

        category = "Zombie".toLowerCase();
        zombieMobDrops = config.getString("zombieMobDrops", category, "", "Add Mob Drops to the Mob \"Zombie\" \nExample: \"minecraft:dirt\" ");
        zombieAmountMobDrops = config.getInt("zombieAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Zombie\" will drop when killed ");

        category = "Slime".toLowerCase();
        slimeMobDrops = config.getString("slimeMobDrops", category, "", "Add Mob Drops to the Mob \"Slime\" \nExample: \"minecraft:dirt\" ");
        slimeAmountMobDrops = config.getInt("slimeAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Slime\" will drop when killed ");

        category = "Ghast".toLowerCase();
        ghastMobDrops = config.getString("ghastMobDrops", category, "", "Add Mob Drops to the Mob \"Ghast\" \nExample: \"minecraft:dirt\" ");
        ghastAmountMobDrops = config.getInt("ghastAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Ghast\" will drop when killed ");

        category = "PigZombie".toLowerCase();
        pigZombieMobDrops = config.getString("pigZombieMobDrops", category, "", "Add Mob Drops to the Mob \"Pig Zombie\" \nExample: \"minecraft:dirt\" ");
        pigZombieAmountMobDrops = config.getInt("pigZombieAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Pig Zombie\" will drop when killed ");

        category = "Enderman".toLowerCase();
        endermanMobDrops = config.getString("endermanMobDrops", category, "", "Add Mob Drops to the Mob \"Enderman\" \nExample: \"minecraft:dirt\" ");
        endermanAmountMobDrops = config.getInt("endermanAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Enderman\" will drop when killed ");

        category = "CaveSpider".toLowerCase();
        caveSpiderMobDrops = config.getString("caveSpiderMobDrops", category, "", "Add Mob Drops to the Mob \"Cave Spider\" \nExample: \"minecraft:dirt\" ");
        caveSpiderAmountMobDrops = config.getInt("caveSpiderAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Cave Spider\" will drop when killed ");

        category = "Silverfish".toLowerCase();
        silverfishMobDrops = config.getString("silverfishMobDrops", category, "", "Add Mob Drops to the Mob \"Silverfish\" \nExample: \"minecraft:dirt\" ");
        silverfishAmountMobDrops = config.getInt("silverfishAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Silverfish\" will drop when killed ");

        category = "Blaze".toLowerCase();
        blazeMobDrops = config.getString("blazeMobDrops", category, "", "Add Mob Drops to the Mob \"Blaze\" \nExample: \"minecraft:dirt\" ");
        blazeAmountMobDrops = config.getInt("blazeAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Blaze\" will drop when killed ");

        category = "MagmaCube".toLowerCase();
        magmaCubeMobDrops = config.getString("magmaCubeMobDrops", category, "", "Add Mob Drops to the Mob \"Magma Cube\" \nExample: \"minecraft:dirt\" ");
        magmaCubeAmountMobDrops = config.getInt("magmaCubeAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Magma Cube\" will drop when killed ");

        category = "Bat".toLowerCase();
        batMobDrops = config.getString("batMobDrops", category, "", "Add Mob Drops to the Mob \"Bat\" \nExample: \"minecraft:dirt\" ");
        batAmountMobDrops = config.getInt("batAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Bat\" will drop when killed ");

        category = "Witch".toLowerCase();
        witchMobDrops = config.getString("witchMobDrops", category, "", "Add Mob Drops to the Mob \"Witch\" \nExample: \"minecraft:dirt\" ");
        witchAmountMobDrops = config.getInt("witchAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Witch\" will drop when killed ");

        category = "Endermite".toLowerCase();
        endermiteMobDrops = config.getString("endermiteMobDrops", category, "", "Add Mob Drops to the Mob \"Endermite\" \nExample: \"minecraft:dirt\" ");
        endermiteAmountMobDrops = config.getInt("endermiteAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Endermite\" will drop when killed ");

        category = "Guardian".toLowerCase();
        guardianMobDrops = config.getString("guardianMobDrops", category, "", "Add Mob Drops to the Mob \"Guardian\" \nExample: \"minecraft:dirt\" ");
        guardianAmountMobDrops = config.getInt("guardianAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Guardian\" will drop when killed ");

        category = "Shulker".toLowerCase();
        shulkerMobDrops = config.getString("shulkerMobDrops", category, "", "Add Mob Drops to the Mob \"Shulker\" \nExample: \"minecraft:dirt\" ");
        shulkerAmountMobDrops = config.getInt("shulkerAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Shulker\" will drop when killed ");

        category = "Pig".toLowerCase();
        pigMobDrops = config.getString("pigMobDrops", category, "", "Add Mob Drops to the Mob \"Pig\" \nExample: \"minecraft:dirt\" ");
        pigAmountMobDrops = config.getInt("pigAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Pig\" will drop when killed ");

        category = "Sheep".toLowerCase();
        sheepMobDrops = config.getString("sheepMobDrops", category, "", "Add Mob Drops to the Mob \"Sheep\" \nExample: \"minecraft:dirt\" ");
        sheepAmountMobDrops = config.getInt("sheepAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Sheep\" will drop when killed ");

        category = "Cow".toLowerCase();
        cowMobDrops = config.getString("cowMobDrops", category, "", "Add Mob Drops to the Mob \"Cow\" \nExample: \"minecraft:dirt\" ");
        cowAmountMobDrops = config.getInt("cowAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Cow\" will drop when killed ");

        category = "Chicken".toLowerCase();
        chickenMobDrops = config.getString("chickenMobDrops", category, "", "Add Mob Drops to the Mob \"Chicken\" \nExample: \"minecraft:dirt\" ");
        chickenAmountMobDrops = config.getInt("chickenAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Chicken\" will drop when killed ");

        category = "Squid".toLowerCase();
        squidMobDrops = config.getString("squidMobDrops", category, "", "Add Mob Drops to the Mob \"Squid\" \nExample: \"minecraft:dirt\" ");
        squidAmountMobDrops = config.getInt("squidAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Squid\" will drop when killed ");

        category = "Wolf".toLowerCase();
        wolfMobDrops = config.getString("wolfMobDrops", category, "", "Add Mob Drops to the Mob \"Wolf\" \nExample: \"minecraft:dirt\" ");
        wolfAmountMobDrops = config.getInt("wolfAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Wolf\" will drop when killed ");

        category = "MooshroomCow".toLowerCase();
        mooshroomCowMobDrops = config.getString("mooshroomCowMobDrops", category, "", "Add Mob Drops to the Mob \"Mooshroom Cow\" \nExample: \"minecraft:dirt\" ");
        mooshroomCowAmountMobDrops = config.getInt("mooshroomCowAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Mooshroom Cow\" will drop when killed ");

        category = "Ocelot".toLowerCase();
        ocelotMobDrops = config.getString("ocelotMobDrops", category, "", "Add Mob Drops to the Mob \"Ocelot\" \nExample: \"minecraft:dirt\" ");
        ocelotAmountMobDrops = config.getInt("ocelotAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Ocelot\" will drop when killed ");

        category = "Horse".toLowerCase();
        horseMobDrops = config.getString("horseMobDrops", category, "", "Add Mob Drops to the Mob \"Horse\" \nExample: \"minecraft:dirt\" ");
        horseAmountMobDrops = config.getInt("horseAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Horse\" will drop when killed ");

        category = "Rabbit".toLowerCase();
        rabbitMobDrops = config.getString("rabbitMobDrops", category, "", "Add Mob Drops to the Mob \"Rabbit\" \nExample: \"minecraft:dirt\" ");
        rabbitAmountMobDrops = config.getInt("rabbitAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Rabbit\" will drop when killed ");

        category = "Villager".toLowerCase();
        villagerMobDrops = config.getString("villagerMobDrops", category, "", "Add Mob Drops to the Mob \"Villager\" \nExample: \"minecraft:dirt\" ");
        villagerAmountMobDrops = config.getInt("villagerAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Villager\" will drop when killed ");

        category = "EnderDragon".toLowerCase();
        enderDragonMobDrops = config.getString("enderDragonMobDrops", category, "", "Add Mob Drops to the Mob \"Ender Dragon\" \nExample: \"minecraft:dirt\" ");
        enderDragonAmountMobDrops = config.getInt("enderDragonAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Ender Dragon\" will drop when killed ");

        category = "WitherBoss".toLowerCase();
        witherBossMobDrops = config.getString("witherBossMobDrops", category, "", "Add Mob Drops to the Mob \"Wither Boss\" \nExample: \"minecraft:dirt\" ");
        witherBossAmountMobDrops = config.getInt("witherBossAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Wither Boss\" will drop when killed ");

        category = "ElderGuardian".toLowerCase();
        elderGuardianMobDrops = config.getString("elderGuardianMobDrops", category, "", "Add Mob Drops to the Mob \"Elder Guardian\" \nExample: \"minecraft:dirt\" ");
        elderGuardianAmountMobDrops = config.getInt("elderGuardianAmountMobDrops", category, 1, 0, Integer.MAX_VALUE, "Add How many Mob drops the Mob \"Elder Guardian\" will drop when killed ");

        //config.getString(String name, String category, String[] defaultValue, String comment, String[] validValues)

        //config.getFloat(String name, String category, float defaultValue, float minValue, float maxValue, String comment);

        //config.get(String category, String key, int[] defaultValues, String comment, int minValue, int maxValue);

        //config.getString(String name, String category, String defaultValue, String comment, String[] validValues, String langKey);

        if (config.hasChanged())
            config.save();
    }
}
