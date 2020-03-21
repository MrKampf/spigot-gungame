/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.DatabaseManager;
import org.bukkit.entity.Player;

public class GunGameManager {

	private Main main; //Main class
	private DatabaseManager databaseManager; //Database manager class
	private Scoreboard scoreboard; //Scoreboard class

	/**
	 * Constructor
	 *
	 * @param main Main
	 */
	public GunGameManager(Main main){
		this.main = main; //Fill class variable
		databaseManager = new DatabaseManager(main); //Fill class variable
		scoreboard = new Scoreboard(main); //Fill class variable
	}

	/**
	 * Player has killed
	 *
	 * @param p Player
	 */
	public void PlayerKilled(Player p) {
		int currentLevel = databaseManager.getLevel(p.getUniqueId()); //Get current level
		if(currentLevel<30) { //Is level under 30
			GunGameEngine.levelChange(p, (1+currentLevel)); //Change level from player one up
			databaseManager.updateLevel(p.getUniqueId()); //Update mysql level record
		}
		databaseManager.updateKills(p.getUniqueId()); //Update mysql kills record
		scoreboard.updatescoreboard(p); //Player scoreboard update
		if(!p.isDead()&&//Isn't player dead
				!Main.dead.contains(p)) { //Isn't player contains in dead list
			p.setHealth(20); //Set health to max (20)
		}
	}

	/**
	 * Player was killed
	 *
	 * @param p Player
	 */
	public void PlayerDeath(Player p) {
		GunGameEngine.levelChange(p,1); //Reset level to 1
		databaseManager.resetLevel(p.getUniqueId()); //Reset level record
		databaseManager.updateDeath(p.getUniqueId()); //Update death record
		scoreboard.updatescoreboard(p); //Player scoreboard update
	}
	
}
