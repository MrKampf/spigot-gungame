package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.mysql.LevelLoader;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class scoreboard {

    private Main main;

    public scoreboard(Main main) {
        this.main = main;
    }

	public void updatescoreboard(Player p){
        LevelLoader levelLoader = new LevelLoader(main);
		scoreboardset(p, levelLoader.getLevel(p.getUniqueId()), levelLoader.getDeaths(p.getUniqueId()), levelLoader.getKills(p.getUniqueId()));
	}

	public static void scoreboardset(Player p, int level, int death, int kills){
		ScoreboardManager sbm = Bukkit.getScoreboardManager();
		Scoreboard sm = sbm.getNewScoreboard();
        Objective score = sm.registerNewObjective("aaa", "bbb");
        score.setDisplayName("§*******.eu §7- §aGunGame");
        score.setDisplaySlot(DisplaySlot.SIDEBAR);
        score.getScore("§1").setScore(4);
        score.getScore("§fLevel:§e"+level).setScore(3);
        score.getScore("§fDeath:§e"+death).setScore(2);
        score.getScore("§fKills:§a"+kills).setScore(1);
        p.setScoreboard(sm);
	}
}
