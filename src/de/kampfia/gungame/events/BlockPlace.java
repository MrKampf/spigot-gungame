package de.kampfia.gungame.events;

import de.kampfia.gungame.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {

    private Main main; //Plugin main class
    private String eventPrefix = "blockplace";

    /**
     * Constructor
     *
     * @param main Main
     */
    public BlockPlace(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Block place event handler
     *
     * @param e BlockPlaceEvent
     */
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer(); //Loading player
        playerEvent(p, e); //Init player event
    }

    /**
     * Player is trigger from this event, then use this function for process this event
     *
     * @param p Player
     * @param e BlockPlaceEvent
     */
    public void playerEvent(Player p, BlockPlaceEvent e) {
        if (p.hasPermission(main.permission + eventPrefix) && //Has player permission for this event
                Main.edit) { //And is the edit mode enabled
            e.setCancelled(false); //Player can block place
        } else { //The player has either no sufficient permission or the edit mode is not active
            e.setCancelled(true); //Player can't block place
        }
    }

}
