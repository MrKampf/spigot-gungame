/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class GunGameEngine {

    public static ArrayList<ItemStack[]> LevelNormal = new ArrayList<ItemStack[]>();

	/**
	 * Level items
	 *
	 * TODO Change to config loaded items
	 */
	public static void setLevelNormal() {
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 1", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 1", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 2", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 2", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 3", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 3", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 3", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 4", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 4", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 4", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 4", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 5", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 5", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 5", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 5", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 5", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 6", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 6", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 6", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 6", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 6", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 7", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 7", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 7", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 7", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 7", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 8", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 8", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 8", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 8", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 8", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 9", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 9", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 9", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 9", null, null, 0),
                ItemManager.CreateWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 9", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 10", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 10", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 10", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 10", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 10", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 11", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 11", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 11", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 11", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 11", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 12", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 12", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 12", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 12", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 12", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 13", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 13", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 13", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 13", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 13", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 14", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 14", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 14", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 14", null, null, 0),
                ItemManager.CreateWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 14", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 15", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 15", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 15", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 15", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 15", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 16", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 16", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 16", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 16", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 16", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 17", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 17", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 17", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 17", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 17", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 18", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 18", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 18", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 18", null, null, 0),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 18", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 19", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 19", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 20", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 21", null, null, 0),
                ItemManager.CreateWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 22", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 22", null, null, 0),
                ItemManager.CreateWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 23", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 23", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 23", null, null, 0),
                ItemManager.CreateWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 23", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 23", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 24", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 24", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 24", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 24", null, null, 0),
                ItemManager.CreateWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 24", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 25", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 25", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 25", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 25", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 25", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 26", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 26", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 26", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 26", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 26", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 27", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 27", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 27", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 27", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 27", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 28", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 28", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 28", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 28", null, null, 0),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 28", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 29", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 29", null, null, 0),
        });
        LevelNormal.add(new ItemStack[]{
                ItemManager.CreateWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 30", null, Enchantment.DAMAGE_ALL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
                ItemManager.CreateWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
        });
    }

    /**
     * Change level from a player
     *
     * @param p     Player
     * @param Level Int
     * @return boolean
     */
    public static boolean levelChange(Player p, int Level) {
        if (Level < 31) { //If level under 31
            ItemStack[] Items = LevelNormal.get(Level); //Get items from items level storage
            p.getInventory().clear(); //Clean player inventory
            p.getInventory().setHelmet(null); //Remove player armor helmet
            p.getInventory().setChestplate(null); //Remove player chestplate
            p.getInventory().setLeggings(null); //Remove player leggings
            p.getInventory().setBoots(null); //Remove player boots
            for (ItemStack Item : Items) { //Process all items from level
                if (ItemManager.isArmor(Item) != null) { //Is item from type armor
                    if (ItemManager.isArmor(Item).equals("helmet")) { //Is item helmet
                        p.getInventory().setHelmet(Item); //Set helmet
                    } else if (ItemManager.isArmor(Item).equals("chestplate")) { //Is item chestplate
                        p.getInventory().setChestplate(Item); //Set chestplate
                    } else if (ItemManager.isArmor(Item).equals("leggings")) { //Is item leggings
                        p.getInventory().setLeggings(Item); //Set leggings
                    } else if (ItemManager.isArmor(Item).equals("boots")) { //Is item boots
                        p.getInventory().setBoots(Item); //Set boots
                    }
                } else {
                    p.getInventory().addItem(Item); //Add item to inventory
                }
            }
            p.updateInventory(); //Update inventory from player
            return true; //Return successful
        } else {
            return false; //Return error
        }
    }
}
