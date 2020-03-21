/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events.player;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.DatabaseManager;
import de.mrkampf.gungame.utils.GunGameEngine;
import de.mrkampf.gungame.utils.Scoreboard;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    private Main main; //Plugin main class
    private DatabaseManager databaseManager; //Database manager class
    private Scoreboard scoreboard; //Scoreboard class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Join(Main main) {
        this.main = main; //Fill class variable
        this.databaseManager = new DatabaseManager(main); //Fill class variable
        this.scoreboard = new Scoreboard(main); //Fill class variable
    }

    /**
     * Player join event handler
     *
     * @param e PlayerJoinEvent
     */
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer(); //Set player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e PlayerJoinEvent
     */
    public void playerEvent(Player p, PlayerJoinEvent e) {
        if (p.hasPermission(main.permission + "team.joinmessage")) { //Has player team join permission
            e.setJoinMessage(main.TeamPrefix + ChatColor.GRAY + "[" + ChatColor.GREEN + "+" + ChatColor.GRAY + "]" + ChatColor.DARK_GRAY + p.getName()); //Send team join message
        } else { //Hasn't team join permission
            e.setJoinMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + ChatColor.GRAY + "+" + ChatColor.GRAY + "]" + ChatColor.DARK_GRAY + p.getName()); //Send player join message
        }
        if (!databaseManager.isUserExist(p.getUniqueId())) { //If user exist in database
            databaseManager.createUser(p.getUniqueId()); //User not exist, add this user to database
            GunGameEngine.levelChange(p, 1); //Change user level to 1
        } else { //User already exist in database
            GunGameEngine.levelChange(p, databaseManager.getLevel(p.getUniqueId())); //Load user level and set user on this level
        }
        Main.dead.remove(p); //If user in dead list, remove him from list
        scoreboard.updatescoreboard(p); //Update scoreboard
        p.teleport(main.configManager.get().spawn()); //Teleport player to spawn
        p.setGameMode(GameMode.ADVENTURE); //Set player in adventure mode
    }

}
