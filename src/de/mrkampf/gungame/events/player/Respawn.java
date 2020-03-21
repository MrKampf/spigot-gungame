/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events.player;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.DatabaseManager;
import de.mrkampf.gungame.utils.GunGameEngine;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class Respawn implements Listener {

    private Main main; //Plugin main class
    private DatabaseManager databaseManager; //Database manager class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Respawn(Main main) {
        this.main = main; //Fill class variable
        this.databaseManager = new DatabaseManager(main); //Fill class variable
    }

    /**
     * Player join event handler
     *
     * @param e PlayerRespawnEvent
     */
    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        Player p = e.getPlayer(); //Set player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e PlayerRespawnEvent
     */
    public void playerEvent(Player p, PlayerRespawnEvent e) {
        Main.dead.remove(p);
        GunGameEngine.levelChange(p, databaseManager.getLevel(p.getUniqueId()));
        p.teleport(main.configManager.get().spawn()); //Teleport player to spawn
    }
}
