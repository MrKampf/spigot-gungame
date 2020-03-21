/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GunGameEngine {
	
	public static ArrayList<ItemStack[]> LevelNormal = new ArrayList<ItemStack[]>();
	
	public static void setLevelNormal() {
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 1", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 1", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 2", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 2", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 3", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 3", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 3", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 4", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 4", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 4", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 4", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.STONE_SWORD, 0, 1, "§bLevel 5", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 5", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 5", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 5", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 5", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 6", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_HELMET, 0, 1, "§bLevel 6", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 6", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 6", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 6", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 7", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 7", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_CHESTPLATE, 0, 1, "§bLevel 7", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 7", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 7", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 8", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 8", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 8", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_LEGGINGS, 0, 1, "§bLevel 8", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 8", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 9", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 9", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 9", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 9", null, null, 0),
				CreateItemWithMaterial(Material.LEATHER_BOOTS, 0, 1, "§bLevel 9", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 10", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 10", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 10", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 10", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 10", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 11", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.GOLD_HELMET, 0, 1, "§bLevel 11", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 11", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 11", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 11", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 12", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 12", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_CHESTPLATE, 0, 1, "§bLevel 12", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 12", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 12", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 13", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 13", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 13", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_LEGGINGS, 0, 1, "§bLevel 13", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 13", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 14", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 14", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 14", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 14", null, null, 0),
				CreateItemWithMaterial(Material.GOLD_BOOTS, 0, 1, "§bLevel 14", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.GOLD_SWORD, 0, 1, "§bLevel 15", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 15", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 15", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 15", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 15", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 16", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_HELMET, 0, 1, "§bLevel 16", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 16", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 16", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 16", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 17", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 17", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_CHESTPLATE, 0, 1, "§bLevel 17", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 17", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 17", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 18", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 18", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 18", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_LEGGINGS, 0, 1, "§bLevel 18", null, null, 0),
				CreateItemWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 18", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 19", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 19", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.CHAINMAIL_BOOTS, 0, 1, "§bLevel 19", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.IRON_SWORD, 0, 1, "§bLevel 20", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 20", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 21", null, null, 0),
				CreateItemWithMaterial(Material.IRON_HELMET, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 21", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 22", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 22", null, null, 0),
				CreateItemWithMaterial(Material.IRON_CHESTPLATE, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 22", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 23", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 23", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 23", null, null, 0),
				CreateItemWithMaterial(Material.IRON_LEGGINGS, 0, 1, "§bLevel 23", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 23", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 24", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 24", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 24", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 24", null, null, 0),
				CreateItemWithMaterial(Material.IRON_BOOTS, 0, 1, "§bLevel 24", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 25", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 25", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 25", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 25", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 25", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 26", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 26", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 26", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 26", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 26", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 27", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 27", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 27", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 27", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 27", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 28", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 28", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 28", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 28", null, null, 0),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 28", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 29", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 29", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 29", null, null, 0),
		});
		LevelNormal.add(new ItemStack[]{
				CreateItemWithMaterial(Material.DIAMOND_SWORD, 0, 1, "§bLevel 30", null, Enchantment.DAMAGE_ALL, 1),
				CreateItemWithMaterial(Material.DIAMOND_HELMET, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_CHESTPLATE, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_LEGGINGS, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
				CreateItemWithMaterial(Material.DIAMOND_BOOTS, 0, 1, "§bLevel 30", null, Enchantment.PROTECTION_ENVIRONMENTAL, 1),
		});
	}
	
	public static void levelChange(Player p,int Level){
		if(Level<31) {
			ItemStack[] Items = LevelNormal.get(Level);
			p.getInventory().clear();
            p.getInventory().setHelmet(null);
            p.getInventory().setChestplate(null);
            p.getInventory().setLeggings(null);
            p.getInventory().setBoots(null);
			for(ItemStack Item : Items) {
				if(!isArmor(Item).equals("no")) {
					if(isArmor(Item).equals("helmet")) {
						p.getInventory().setHelmet(Item);
					}else if(isArmor(Item).equals("chestplate")) {
						p.getInventory().setChestplate(Item);
					}else if(isArmor(Item).equals("leggings")) {
						p.getInventory().setLeggings(Item);
					}else if(isArmor(Item).equals("boots")) {
						p.getInventory().setBoots(Item);
					}
				}else {
					p.getInventory().addItem(Item);
				}
			}
			p.updateInventory();
		}
	}
	
	public static String isArmor(ItemStack Item) {
		switch(Item.getType().toString()) {
			case "LEATHER_HELMET":
				return "helmet";
			case "LEATHER_CHESTPLATE":
				return "chestplate";
			case "LEATHER_LEGGINGS":
				return "leggings";
			case "LEATHER_BOOTS":
				return "boots";
			case "CHAINMAIL_HELMET":
				return "helmet";
			case "CHAINMAIL_CHESTPLATE":
				return "chestplate";
			case "CHAINMAIL_LEGGINGS":
				return "leggings";
			case "CHAINMAIL_BOOTS":
				return "boots";
			case "GOLD_HELMET":
				return "helmet";
			case "GOLD_CHESTPLATE":
				return "chestplate";
			case "GOLD_LEGGINGS":
				return "leggings";
			case "GOLD_BOOTS":
				return "boots";
			case "IRON_HELMET":
				return "helmet";
			case "IRON_CHESTPLATE":
				return "chestplate";
			case "IRON_LEGGINGS":
				return "leggings";
			case "IRON_BOOTS":
				return "boots";
			case "DIAMOND_HELMET":
				return "helmet";
			case "DIAMOND_CHESTPLATE":
				return "chestplate";
			case "DIAMOND_LEGGINGS":
				return "leggings";
			case "DIAMOND_BOOTS":
				return "boots";
			default:
				return "no";
		}
	}
	
	public static ItemStack CreateItemWithMaterial(Material material, int subid, int amount, String Displayname, ArrayList<String> lore, Enchantment ench, int enchlvl){
		ItemStack is = new ItemStack(material,amount,(short) subid);
		ItemMeta im = is.getItemMeta();
		if(Displayname!=null)im.setDisplayName(Displayname);
		if(lore!=null)im.setLore(lore);
		if(ench!=null)im.addEnchant(ench, enchlvl, true);
		is.setItemMeta(im);
		return is;
	}
}
