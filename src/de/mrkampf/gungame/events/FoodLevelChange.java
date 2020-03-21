/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange implements Listener {

    /**
     * Food level change event handler
     *
     * @param e FoodLevelChangeEvent
     */
    @EventHandler
    public void onFoodChange(FoodLevelChangeEvent e) {
        e.setCancelled(true); //Cancel this event
    }

}
