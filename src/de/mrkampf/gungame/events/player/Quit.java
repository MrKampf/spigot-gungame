/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events.player;

import de.mrkampf.gungame.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Quit implements Listener {

    private Main main; //Plugin main class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Quit(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Player quit event handler
     *
     * @param e PlayerQuitEvent
     */
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer(); //Set player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e PlayerQuitEvent
     */
    public void playerEvent(Player p, PlayerQuitEvent e) {
        if (p.hasPermission(main.permission + "team.quitmessage")) { //Has player team quit permission
            e.setQuitMessage(main.TeamPrefix + ChatColor.GRAY + "[" + ChatColor.RED + "-" + ChatColor.GRAY + "]" + ChatColor.DARK_GRAY + p.getName()); //Send team quit message
        } else { //Hasn't team quit permission
            e.setQuitMessage(ChatColor.GRAY + "[" + ChatColor.RED + "-" + ChatColor.GRAY + "]" + ChatColor.DARK_GRAY + p.getName()); //Send player quit message
        }
    }
}
