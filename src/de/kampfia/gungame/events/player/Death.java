package de.kampfia.gungame.events.player;

import de.kampfia.gungame.Main;
import de.kampfia.gungame.utils.ConsoleColors;
import de.kampfia.gungame.utils.GunGameManager;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Death implements Listener {

    private Main main; //Plugin main class
    private GunGameManager gunGameManager; //GunGameManager class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Death(Main main) {
        this.main = main; //Fill class variable
        this.gunGameManager = new GunGameManager(main); //Fill class variable
    }

    /**
     * Player death event handler
     *
     * @param e PlayerDeathEvent
     */
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity(); //Set entity to type player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e PlayerDeathEvent
     */
    public void playerEvent(Player p, PlayerDeathEvent e) {
        try {
            if (!Main.dead.contains(p)) { //Contains the array list the killed player?
                Main.dead.add(p); //Add player to dead array list
                gunGameManager.PlayerDeath(p); //With this we update the stats and the inventory from this player
                if (p.getKiller() != null) { //If killer from type player
                    Player killer = p.getKiller(); //Set killer
                    if (p != killer) { //Is killer not empty
                        gunGameManager.PlayerKilled(killer); //With this we update the stats and the inventory from this player
                        e.setDeathMessage(main.Prefix + ChatColor.GRAY + "The player " + ChatColor.RED + p.getName() + ChatColor.GRAY + " was killed by the player" + ChatColor.LIGHT_PURPLE + killer.getName() + ChatColor.GRAY + "!"); //Send message to all players
                    }
                } else {
                    e.setDeathMessage(main.Prefix + ChatColor.GRAY + "The player " + ChatColor.RED + p.getName() + ChatColor.GRAY + " was killed!"); //Send message to all players
                }
                e.getDrops().clear(); //Let no items drop
            } else { //Contain the array list the killed player
                System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: The killed player was already in dead list!");
				e.setDeathMessage(main.Prefix + ChatColor.GRAY + "The player " + ChatColor.RED + p.getName() + ChatColor.GRAY + " was killed!"); //Send message to all players
				e.getDrops().clear(); //Let no items drop
            }
        } catch (Exception ex) { //If exception
            System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: This dead created are error!");
            System.out.println(ex.getMessage()); //Send error message to console
			e.setDeathMessage(main.Prefix + ChatColor.GRAY + "The player " + ChatColor.RED + p.getName() + ChatColor.GRAY + " was killed!"); //Send message to all players
			e.getDrops().clear(); //Let no items drop
        }
    }

}
