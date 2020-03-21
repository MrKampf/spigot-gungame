package de.mrkampf.gungame.events;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.LevelLoader;
import de.mrkampf.gungame.utils.GunGameEngine;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class PlayerRespawn implements Listener{

	private Main main;
	private LevelLoader levelLoader;

	public PlayerRespawn(Main main) {
		this.main = main;
		levelLoader = new LevelLoader(main);
	}
	
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		Main.dead.remove(p);
		GunGameEngine.levelChange(p, levelLoader.getLevel(p.getUniqueId()));
		main.fileManager.teleport().spawn(p);
	}
}
