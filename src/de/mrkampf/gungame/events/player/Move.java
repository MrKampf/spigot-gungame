/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events.player;

import de.mrkampf.gungame.Main;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class Move implements Listener {

    private Main main; //Plugin main class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Move(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Player quit event handler
     *
     * @param e onPlayerMoveEvent
     */
    @EventHandler
    public void onPlayerMoveEvent(PlayerMoveEvent e) {
        Player p = e.getPlayer(); //Set player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e PlayerMoveEvent
     */
    public void playerEvent(Player p, PlayerMoveEvent e) {
        Block b = p.getLocation().getBlock(); //Capture the block on which the player is standing
        if (!p.isDead() && //Isn't player dead
                !Main.dead.contains(p)) { //Doesn't contains dead list this player
            if (b.getType() == Material.WATER || //Is standing block from material water
                    b.getType() == Material.STATIONARY_WATER) { //Or is this from material stationary water
                p.setHealth(0); //Set health to 0, this killed the player
            }
        }
    }
}
