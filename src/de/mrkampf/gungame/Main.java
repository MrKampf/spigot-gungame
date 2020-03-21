package de.mrkampf.gungame;

import de.mrkampf.gungame.commands.set.Level;
import de.mrkampf.gungame.commands.set.Spawn;
import de.mrkampf.gungame.commands.set.SpawnProtection;
import de.mrkampf.gungame.events.*;
import de.mrkampf.gungame.events.entity.Damage;
import de.mrkampf.gungame.events.player.Death;
import de.mrkampf.gungame.mysql.MySQL;
import de.mrkampf.gungame.utils.ConsoleColors;
import de.mrkampf.gungame.utils.FileManager;
import de.mrkampf.gungame.utils.GunGameEngine;
import de.mrkampf.gungame.utils.LanguageManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Map;

public class Main extends JavaPlugin {

    public MySQL mySQL;

    public FileManager fileManager;
    public File file;
    public FileConfiguration cfg;

    public LanguageManager languageManager;
    public String defaultLanguage = "en";
    public Map<String, String> language;
    public Map<String, String> customLanguage;

    public String Prefix = "§7[§5GunGame§7]§f";
    public String CMDPrefix = "[GunGame]";
    public String permission = "gungame.";
    public String TeamPrefix = "§7[§bTeam§7]§7";
    public static boolean edit = false;
    public boolean debug = false;
    public static ArrayList<Player> dead = new ArrayList<Player>(); //With this, we check, what player is current dead

    public void onEnable() {
        fileManager = new FileManager(this); //Fill with file manager class
        languageManager = new LanguageManager(this); //Fill with language manager class

        file = fileManager.getConfig(); //Loading config file
        System.out.println(CMDPrefix + "Config.yml loaded"); //Send message, config file was loaded
        cfg = fileManager.fileConfiguration(); //Loading file configuration
        System.out.println(CMDPrefix + "Config.yml processed"); //Send message, config file was processed
        language = languageManager.getDefault(); //Loading the default language file
        debug = cfg.getBoolean("gungame.settings.debug"); //Loading debug setting

        mySQL = new MySQL(this); //Init Mysql class, this class must be loaded after loading the configuration. It needs the configuration to connect to the database.

        try {
            mySQL.connect(); //MySQL connection open
            System.out.println(CMDPrefix + " Connected to mysql database."); //Send message, the plugin was connected successful to mysql database
            PreparedStatement ps = mySQL.getConnection().prepareStatement("CREATE TABLE IF NOT EXISTS gungame (UUID VARCHAR(100), level INT, deaths INT, kills INT)"); //Check is table exist, if not exist, create this table.
            ps.executeUpdate(); //Execute sql command
        } catch (Exception e) { //If exception
            System.out.println(CMDPrefix + ConsoleColors.RED + "Error: Check is table needed exist, was broken off."); //Send message, the table if exist check or create process from table was broken off
            e.getMessage(); //Output error message
        }
        ChangeTime(); //Change time schedule
        registerEvents(); //Register all events for this plugin
        registerCommands(); //Register all commands for this plugin
        GunGameEngine.setLevelNormal();
        System.out.println(CMDPrefix + "Plugin loaded!"); //Send message, the plugin loading finished
    }

    /**
     * On disable plugin
     */
    public void onDisable() {
        for (Player p : Bukkit.getOnlinePlayers()) {
            p.kickPlayer(Prefix + ChatColor.GRAY + "The game server is restarting or going shutdown!"); //Kick player from server with reason
        }
        mySQL.disconnect(); //Connection to the database has been disconnected
    }

    /**
     * Register all commands for this plugin
     */
    private void registerCommands() {
        getCommand("setspawn").setExecutor(new Spawn(this)); //Set spawn command, with this can a player update the spawn point
        getCommand("setlevel").setExecutor(new Level(this)); //Set level command, with this can a player or console update level from a player
        getCommand("setspawnprotection").setExecutor(new SpawnProtection(this)); //Set spawn protection command, with this can a player or console update the spawn protection radius
    }

    /**
     * Register all events for this plugin
     */
    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new Death(this), this);
        Bukkit.getPluginManager().registerEvents(new Damage(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerMove(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerLeave(this), this);
        Bukkit.getPluginManager().registerEvents(new PlayerDrop(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerRespawn(this), this);
        Bukkit.getPluginManager().registerEvents(new WeatherChangeListener(), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreak(this), this);
        Bukkit.getPluginManager().registerEvents(new BlockPlace(this), this);
        Bukkit.getPluginManager().registerEvents(new FoodLevelChange(), this);
    }

    /**
     * Change server time
     */
    private void ChangeTime() {
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() { //Start schedule
            @Override
            public void run() { //Run function
                for (World w : Bukkit.getWorlds()) { //Loop all worlds
                    w.setTime(0); //Set time from world to 0
                }
            }
        }, 2000L); //Run this all 2000 ticks
    }
}