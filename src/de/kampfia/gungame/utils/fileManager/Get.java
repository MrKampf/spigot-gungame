package de.kampfia.gungame.utils.fileManager;

import de.kampfia.gungame.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;

public class Get {

    private Main main; //Main class

    public Get(Main main) {
        this.main = main;
    }

    /**
     * Get spawn point
     *
     * @return location
     */
    public Location spawn() {
        return new Location(Bukkit.getWorld(main.cfg.getString("gungame.spawn.World")),
                main.cfg.getDouble("gungame.spawn.X"),
                main.cfg.getDouble("gungame.spawn.Y"),
                main.cfg.getDouble("gungame.spawn.Z"),
                (float) main.cfg.getDouble("gungame.spawn.Yaw"),
                (float) main.cfg.getDouble("gungame.spawn.Pitch"));
    }

    /**
     * Get spawn protection radius
     *
     * @return boolean
     */
    public int spawnProtection() {
        return main.cfg.getInt("gungame.spawn.Protection");
    }
}
