package de.mrkampf.gungame.events;

import de.mrkampf.gungame.Main;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener{

	private Main main; //Plugin main class

	/**
	 * Constructor
	 *
	 * @param main Main
	 */
	public PlayerMove(Main main) {
		this.main = main; //Fill class variable
	}
	
	@EventHandler
	public void onPlayerMoveEvent (PlayerMoveEvent event) {
		Player p = event.getPlayer();
		Block b = p.getLocation().getBlock();
		if(!p.isDead()&&!Main.dead.contains(p)) {
			if(b.getType() == Material.WATER || b.getType() == Material.STATIONARY_WATER){
				p.setHealth(0);
			}else {
				Main.dead.remove(p);
			}
		}
	}
}
