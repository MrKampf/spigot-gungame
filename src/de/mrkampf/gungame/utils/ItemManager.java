/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemManager {

    /**
     * Create item stack
     *
     * @param material Material
     * @param subid Int
     * @param amount Int
     * @param Displayname String
     * @param lore ArrayList
     * @param ench Enchantment
     * @param enchlvl Int
     * @return ItemStack
     */
    public static ItemStack CreateWithMaterial(Material material, int subid, int amount, String Displayname, ArrayList<String> lore, Enchantment ench, int enchlvl) {
        ItemStack is = new ItemStack(material, amount, (short) subid); //Create item stack
        ItemMeta im = is.getItemMeta(); //Get item meta
        if (Displayname != null) im.setDisplayName(Displayname); //If display name set, when then set this
        if (lore != null) im.setLore(lore); //If lore set, when then set this
        if (ench != null) im.addEnchant(ench, enchlvl, true); //If enchant set, when then set this
        is.setItemMeta(im); //Set item meta
        return is; //Return item stack
    }

    /**
     * Is item from type armor
     *
     * @param Item ItemStack
     * @return string
     */
    public static String isArmor(ItemStack Item) {
        switch (Item.getType().toString()) { //Check type
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
                return null; //Is no armor
        }
    }
}
