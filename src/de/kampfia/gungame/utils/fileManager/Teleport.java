package de.kampfia.gungame.utils.fileManager;

import de.kampfia.gungame.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Teleport {

    private Main main; //Main class

    public Teleport(Main main) {
        this.main = main;
    }

    /**
     * Teleport player to spawn
     * @param p Player
     */
    public void spawn(Player p) {
        String w = main.cfg.getString("gungame.spawn.World");
        double x = main.cfg.getDouble("gungame.spawn.X");
        double y = main.cfg.getDouble("gungame.spawn.Y");
        double z = main.cfg.getDouble("gungame.spawn.Z");
        double yaw = main.cfg.getDouble("gungame.spawn.Yaw");
        double pitch = main.cfg.getDouble("gungame.spawn.Pitch");
        Location loc = new Location(Bukkit.getWorld(w), x, y, z);
        loc.setPitch((float) pitch);
        loc.setYaw((float) yaw);
        p.teleport(loc);
    }
}
