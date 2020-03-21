package de.kampfia.gungame.events;

import de.kampfia.gungame.Main;
import de.kampfia.gungame.mysql.LevelLoader;
import de.kampfia.gungame.utils.GunGameEngine;
import de.kampfia.gungame.utils.scoreboard;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    private Main main;
    private LevelLoader levelLoader;
    private scoreboard scoreboard;

    public PlayerJoin(Main main) {
        this.main = main;
        this.levelLoader = new LevelLoader(main);
        this.scoreboard = new scoreboard(main);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("team.joinmessage")) {
            e.setJoinMessage(main.TeamPrefix + "§7[" + ChatColor.GREEN + "+§7]§8" + p.getName());
        } else {
            e.setJoinMessage("§7[" + ChatColor.GREEN + "+§7]§8" + p.getName());
        }
        if (!levelLoader.isUserExist(p.getUniqueId())) {
            levelLoader.createUser(p.getUniqueId());
            GunGameEngine.levelChange(p, 1);
        } else {
            GunGameEngine.levelChange(p, levelLoader.getLevel(p.getUniqueId()));
        }
        Main.dead.remove(p);
        scoreboard.updatescoreboard(p);
        main.fileManager.teleport().spawn(p);
        p.setGameMode(GameMode.ADVENTURE);
    }

}
