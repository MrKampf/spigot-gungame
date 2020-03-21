/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events;

import de.mrkampf.gungame.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    private Main main; //Plugin main class
    private String eventPrefix = "blockbreak";

    /**
     * Constructor
     *
     * @param main Main
     */
    public BlockBreak(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Block break event handler
     *
     * @param e BlockBreakEvent
     */
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        Player p = e.getPlayer(); //Loading player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e BlockBreakEvent
     */
    public void playerEvent(Player p, BlockBreakEvent e) {
        if (p.hasPermission(main.permission + eventPrefix) && //Has player permission for this event
                Main.edit) { //And is the edit mode enabled
            e.setCancelled(false); //Player can block break
        } else { //The player has either no sufficient permission or the edit mode is not active
            e.setCancelled(true); //Player can't block break
        }
    }

}
