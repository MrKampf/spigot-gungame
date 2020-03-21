package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.LevelLoader;
import org.bukkit.entity.Player;

public class GunGameManager {

	private Main main;
	private LevelLoader levelLoader;
	private scoreboard scoreboard;

	public GunGameManager(Main main){
		this.main = main;
		levelLoader = new LevelLoader(main);
		scoreboard = new scoreboard(main);
	}


	public void PlayerKilled(Player p) {
		int currentLevel = levelLoader.getLevel(p.getUniqueId());
		if(currentLevel<=30) {
			GunGameEngine.levelChange(p, (1+currentLevel));
			levelLoader.updateLevel(p.getUniqueId());
		}
		levelLoader.updateKills(p.getUniqueId());
		scoreboard.updatescoreboard(p);
		if(!p.isDead()&&!Main.dead.contains(p)) {
			p.setHealth(20);
		}
	}
	
	public void PlayerDeath(Player p) {
		GunGameEngine.levelChange(p,1);
		levelLoader.resetLevel(p.getUniqueId());
		levelLoader.updateDeath(p.getUniqueId());
		scoreboard.updatescoreboard(p);
	}
	
}
