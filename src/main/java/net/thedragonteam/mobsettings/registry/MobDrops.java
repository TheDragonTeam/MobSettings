package net.thedragonteam.mobsettings.registry;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

import static net.thedragonteam.mobsettings.resources.ConfigHandler.*;

/**
 * Created by sokratis1GR on 4/4/2016.
 */

//TODO Use Switch Block w/ one method
public class MobDrops {
    Random random = new Random();

    /**
     * Creeper
     */
    @SubscribeEvent
    public void playerKilledCreeper(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCreeper) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(creeperMobDrops), creeperAmountMobDrops);
            if (debugMode)
                System.out.println(creeperMobDrops + " x " + creeperAmountMobDrops);
        }
    }

    /**
     * Skeleton
     */
    @SubscribeEvent
    public void playerKilledSkeleton(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySkeleton) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(skeletonMobDrops), skeletonAmountMobDrops);
            if (debugMode)
                System.out.println(skeletonMobDrops + " x " + skeletonAmountMobDrops);
        }
    }

    /**
     * Spider
     */
    @SubscribeEvent
    public void playerKilledSpider(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySpider) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(spiderMobDrops), spiderAmountMobDrops);
            if (debugMode)
                System.out.println(spiderMobDrops + " x " + spiderAmountMobDrops);
        }
    }

    /**
     * Zombie
     */
    @SubscribeEvent
    public void playerKilledZombie(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityZombie) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(zombieMobDrops), zombieAmountMobDrops);
            if (debugMode)
                System.out.println(zombieMobDrops + " x " + zombieAmountMobDrops);
        }
    }

    /**
     * Slime
     */
    @SubscribeEvent
    public void playerKilledSlime(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySlime) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(slimeMobDrops), slimeAmountMobDrops);
            if (debugMode)
                System.out.println(slimeMobDrops + " x " + slimeAmountMobDrops);
        }
    }

    /**
     * Ghast
     */
    @SubscribeEvent
    public void playerKilledGhast(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityGhast) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(ghastMobDrops), ghastAmountMobDrops);
            if (debugMode)
                System.out.println(ghastMobDrops + " x " + ghastAmountMobDrops);
        }
    }

    /**
     * Pig Zombie
     */
    @SubscribeEvent
    public void playerKilledPigZombie(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityPigZombie) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(pigZombieMobDrops), pigZombieAmountMobDrops);
            if (debugMode)
                System.out.println(pigZombieMobDrops + " x " + pigZombieAmountMobDrops);
        }
    }

    /**
     * Enderman
     */
    @SubscribeEvent
    public void playerKilledEnderman(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityEnderman) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(endermanMobDrops), endermanAmountMobDrops);
            if (debugMode)
                System.out.println(endermanMobDrops + " x " + endermanAmountMobDrops);
        }
    }

    /**
     * Cave Spider
     */
    @SubscribeEvent
    public void playerKilledCaveSpider(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCaveSpider) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(caveSpiderMobDrops), caveSpiderAmountMobDrops);
            if (debugMode)
                System.out.println(caveSpiderMobDrops + " x " + caveSpiderAmountMobDrops);
        }
    }

    /**
     * Silverfish
     */
    @SubscribeEvent
    public void playerKilledSilverfish(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySilverfish) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(silverfishMobDrops), silverfishAmountMobDrops);
            if (debugMode)
                System.out.println(silverfishMobDrops + " x " + silverfishAmountMobDrops);
        }
    }

    /**
     * Blaze
     */
    @SubscribeEvent
    public void playerKilledBlaze(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityBlaze) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(blazeMobDrops), blazeAmountMobDrops);
            if (debugMode)
                System.out.println(blazeMobDrops + " x " + blazeAmountMobDrops);
        }
    }

    /**
     * Magma Cube
     */
    @SubscribeEvent
    public void playerKilledMagmaCube(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityMagmaCube) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(magmaCubeMobDrops), magmaCubeAmountMobDrops);
            if (debugMode)
                System.out.println(magmaCubeMobDrops + " x " + magmaCubeAmountMobDrops);
        }
    }

    /**
     * Bat
     */
    @SubscribeEvent
    public void playerKilledBat(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityBat) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(batMobDrops), batAmountMobDrops);
            if (debugMode)
                System.out.println(batMobDrops + " x " + batAmountMobDrops);
        }
    }

    /**
     * Witch
     */
    @SubscribeEvent
    public void playerKilledWitch(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityWitch) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(witchMobDrops), witchAmountMobDrops);
            if (debugMode)
                System.out.println(witchMobDrops + " x " + witchAmountMobDrops);
        }
    }

    /**
     * Endermite
     */
    @SubscribeEvent
    public void playerKilledEndermite(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityEndermite) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(endermiteMobDrops), endermiteAmountMobDrops);
            if (debugMode)
                System.out.println(endermiteMobDrops + " x " + endermiteAmountMobDrops);
        }
    }

    /**
     * Guardian
     */
    @SubscribeEvent
    public void playerKilledGuardian(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityGuardian && !((EntityGuardian) event.getEntity()).isElder()) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(guardianMobDrops), guardianAmountMobDrops);
            if (debugMode)
                System.out.println(guardianMobDrops + " x " + guardianAmountMobDrops);
        }
    }

    /**
     * Shulker
     */
    @SubscribeEvent
    public void playerKilledShulker(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityShulker) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(shulkerMobDrops), shulkerAmountMobDrops);
            if (debugMode)
                System.out.println(shulkerMobDrops + " x " + shulkerAmountMobDrops);
        }
    }

    /**
     * Pig
     */
    @SubscribeEvent
    public void playerKilledPig(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityPig) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(pigMobDrops), pigAmountMobDrops);
            if (debugMode)
                System.out.println(pigMobDrops + " x " + pigAmountMobDrops);
        }
    }

    /**
     * Sheep
     */
    @SubscribeEvent
    public void playerKilledSheep(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySheep) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(sheepMobDrops), sheepAmountMobDrops);
            if (debugMode)
                System.out.println(sheepMobDrops + " x " + sheepAmountMobDrops);
        }
    }

    /**
     * Cow
     */
    @SubscribeEvent
    public void playerKilledCow(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityCow) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(cowMobDrops), cowAmountMobDrops);
            if (debugMode)
                System.out.println(cowMobDrops + " x " + cowAmountMobDrops);
        }
    }

    /**
     * Chicken
     */
    @SubscribeEvent
    public void playerKilledChicken(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityChicken) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(chickenMobDrops), chickenAmountMobDrops);
            if (debugMode)
                System.out.println(chickenMobDrops + " x " + chickenAmountMobDrops);
        }
    }

    /**
     * Squid
     */
    @SubscribeEvent
    public void playerKilledSquid(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntitySquid) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(squidMobDrops), squidAmountMobDrops);
            if (debugMode)
                System.out.println(squidMobDrops + " x " + squidAmountMobDrops);
        }
    }

    /**
     * Wolf
     */
    @SubscribeEvent
    public void playerKilledWolf(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityWolf) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(wolfMobDrops), wolfAmountMobDrops);
            if (debugMode)
                System.out.println(wolfMobDrops + " x " + wolfAmountMobDrops);
        }
    }

    /**
     * Mooshroom Cow
     */
    @SubscribeEvent
    public void playerKilledMooshroom(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityMooshroom) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(mooshroomCowMobDrops), mooshroomCowAmountMobDrops);
            if (debugMode)
                System.out.println(mooshroomCowMobDrops + " x " + mooshroomCowAmountMobDrops);
        }
    }

    /**
     * Ocelot
     */
    @SubscribeEvent
    public void playerKilledOcelot(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityOcelot) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(ocelotMobDrops), ocelotAmountMobDrops);
            if (debugMode)
                System.out.println(ocelotMobDrops + " x " + ocelotAmountMobDrops);
        }
    }

    /**
     * Horse
     */
    @SubscribeEvent
    public void playerKilledHorse(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityHorse) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(horseMobDrops), horseAmountMobDrops);
            if (debugMode)
                System.out.println(horseMobDrops + " x " + horseAmountMobDrops);
        }
    }

    /**
     * Rabbit
     */
    @SubscribeEvent
    public void playerKilledRabbit(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityRabbit) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(rabbitMobDrops), rabbitAmountMobDrops);
            if (debugMode)
                System.out.println(rabbitMobDrops + " x " + rabbitAmountMobDrops);
        }
    }

    /**
     * Villager
     */
    @SubscribeEvent
    public void playerKilledVillager(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityVillager) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(villagerMobDrops), villagerAmountMobDrops);
            if (debugMode)
                System.out.println(villagerMobDrops + " x " + villagerAmountMobDrops);
        }
    }

    /**
     * Ender Dragon
     */
    @SubscribeEvent
    public void playerKilledEnderDragon(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityDragon) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(enderDragonMobDrops), enderDragonAmountMobDrops);
            if (debugMode)
                System.out.println(enderDragonMobDrops + " x " + enderDragonAmountMobDrops);
        }
    }

    /**
     * Wither Boss
     */
    @SubscribeEvent
    public void playerKilledWither(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityWither) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(witherBossMobDrops), witherBossAmountMobDrops);
            if (debugMode)
                System.out.println(witherBossMobDrops + " x " + witherBossAmountMobDrops);
        }
    }

    /**
     * Elder Guardian
     */
    @SubscribeEvent
    public void playerKilledElderGuardian(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityGuardian && ((EntityGuardian) event.getEntity()).isElder()) {
            EntityItem entityItem = event.getEntityLiving().dropItem(Item.getByNameOrId(elderGuardianMobDrops), elderGuardianAmountMobDrops);
            if (debugMode)
                System.out.println(elderGuardianMobDrops + " x " + elderGuardianAmountMobDrops);
        }
    }
}
