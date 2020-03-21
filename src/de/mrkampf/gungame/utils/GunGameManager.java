/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.DatabaseManager;
import org.bukkit.entity.Player;

public class GunGameManager {

	private Main main;
	private DatabaseManager databaseManager;
	private Scoreboard scoreboard;

	public GunGameManager(Main main){
		this.main = main;
		databaseManager = new DatabaseManager(main);
		scoreboard = new Scoreboard(main);
	}


	public void PlayerKilled(Player p) {
		int currentLevel = databaseManager.getLevel(p.getUniqueId());
		if(currentLevel<=30) {
			GunGameEngine.levelChange(p, (1+currentLevel));
			databaseManager.updateLevel(p.getUniqueId());
		}
		databaseManager.updateKills(p.getUniqueId());
		scoreboard.updatescoreboard(p);
		if(!p.isDead()&&!Main.dead.contains(p)) {
			p.setHealth(20);
		}
	}
	
	public void PlayerDeath(Player p) {
		GunGameEngine.levelChange(p,1);
		databaseManager.resetLevel(p.getUniqueId());
		databaseManager.updateDeath(p.getUniqueId());
		scoreboard.updatescoreboard(p);
	}
	
}
