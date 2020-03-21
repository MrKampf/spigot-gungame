package de.mrkampf.gungame.events.entity;

import de.mrkampf.gungame.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Damage implements Listener {

    private Main main; //Plugin main class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Damage(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Entity damage event handler
     *
     * @param e EntityDamageEvent
     */
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) { //If entity instance of player
            Player p = (Player) e.getEntity(); //Set entity to type player
            playerEvent(p, e); //Init player event
        }
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e EntityDamageEvent
     */
    public void playerEvent(Player p, EntityDamageEvent e) {
        if (checkSpawnProtection(p.getLocation())) { //Is player in spawn protection area
            e.setCancelled(true); //Player get no damage
        }
    }

    /**
     * Is player in spawn protection area
     *
     * @param ploc Location
     * @return boolean
     */
    public boolean checkSpawnProtection(Location ploc) {
        Location loc = main.fileManager.get().spawn(); //Get spawn location
        int Spawnprotection = main.fileManager.get().spawnProtection(); //Get spawn protection radius
        return ploc.distance(loc) < Spawnprotection; //Is player in spawn protection area
    }

}
