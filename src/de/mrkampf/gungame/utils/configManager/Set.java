/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils.configManager;

import de.mrkampf.gungame.Main;
import org.bukkit.entity.Player;

import java.io.IOException;

public class Set {

    private Main main; //Main class

    public Set(Main main) {
        this.main = main;
    }

    /**
     * Save the updated config
     *
     * @return boolean
     */
    private boolean save() {
        try {
            main.cfg.save(main.file);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Set new spawn point
     *
     * @param p Player
     * @return boolean
     */
    public boolean spawn(Player p) {
        main.cfg.set("gungame.spawn.World", p.getWorld().getName());
        main.cfg.set("gungame.spawn.X", p.getLocation().getX());
        main.cfg.set("gungame.spawn.Y", p.getLocation().getY());
        main.cfg.set("gungame.spawn.Z", p.getLocation().getZ());
        main.cfg.set("gungame.spawn.Yaw", (double) p.getLocation().getYaw());
        main.cfg.set("gungame.spawn.Pitch", (double) p.getLocation().getPitch());
        return save();
    }

    /**
     * Set new spawn protection radius
     *
     * @param radius int
     * @return boolean
     */
    public boolean spawnProtection(int radius) {
        main.cfg.set("gungame.spawn.Protection", radius);
        return save();
    }
}
