/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class WeatherChange implements Listener {

    /**
     * Player quit event handler
     *
     * @param e WeatherChangeEvent
     */
    @EventHandler
    public void OnWeatherChange(WeatherChangeEvent e) {
        e.setCancelled(true); //Cancel this event
    }
}
