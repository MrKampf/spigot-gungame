/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.DatabaseManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.ScoreboardManager;

public class Scoreboard {

    private Main main; //Main class
    private DatabaseManager databaseManager; //Database manager class

    /**
     * Constructor
     *
     * @param main Main
     */
    public Scoreboard(Main main) {
        this.main = main; //Fill class variable
        databaseManager = new DatabaseManager(main); //Fill class variable
    }

    /**
     * Update player scoreboard
     *
     * @param p Player
     */
    public void updatescoreboard(Player p) {
        scoreboardset(p, databaseManager.getLevel(p.getUniqueId()), databaseManager.getDeaths(p.getUniqueId()), databaseManager.getKills(p.getUniqueId())); //Set player scoreboard
    }

    /**
     * Set player scoreboard
     *
     * @param p Player
     * @param level Int
     * @param death Int
     * @param kills Int
     */
    public static void scoreboardset(Player p, int level, int death, int kills) {
        ScoreboardManager sbm = Bukkit.getScoreboardManager(); //Load scoreboard manager
        org.bukkit.scoreboard.Scoreboard sm = sbm.getNewScoreboard(); //Create new scoreboard
        Objective score = sm.registerNewObjective("aaa", "bbb"); //Register new objective
        score.setDisplayName("§*******.eu §7- §aGunGame"); //Set display name
        score.setDisplaySlot(DisplaySlot.SIDEBAR); //Set display position
        score.getScore("§1").setScore(4); //Set score
        score.getScore("§fLevel:§e" + level).setScore(3); //Set score level
        score.getScore("§fDeath:§e" + death).setScore(2); //Set score death
        score.getScore("§fKills:§a" + kills).setScore(1); //Set score kill
        p.setScoreboard(sm); //Set scoreboard by player
    }
}
