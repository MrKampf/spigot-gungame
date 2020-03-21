package de.mrkampf.gungame.events;

import de.mrkampf.gungame.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener{

	private Main main; //Plugin main class

	/**
	 * Constructor
	 *
	 * @param main Main
	 */
	public PlayerLeave(Main main) {
		this.main = main; //Fill class variable
	}

	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("team.quitmessage")){
			e.setQuitMessage(main.TeamPrefix+"§7["+ChatColor.RED+"-§7]§8"+p.getName());
		}else{
			e.setQuitMessage("§7["+ChatColor.RED+"-§7]§8"+p.getName());
		}
		
	}
}
