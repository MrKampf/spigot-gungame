/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItem implements Listener {

    /**
     * Player drop item event handler
     *
     * @param e PlayerDropItemEvent
     */
    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        //TODO Allow item drop in edit mode?
        e.setCancelled(true); //Cancel this event
    }
}
