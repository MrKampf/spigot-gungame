/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */
package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.utils.configManager.Get;
import de.mrkampf.gungame.utils.configManager.Set;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private Main main; //Main class
    private File file; //Config file
    private FileConfiguration cfg; //Config configuration

    /**
     * Constructor
     *
     * @param main Main
     */
    public ConfigManager(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Get file configuration
     *
     * @return FileConfiguration
     */
    public FileConfiguration fileConfiguration() {
        try {
            cfg = YamlConfiguration.loadConfiguration(main.file);
        } catch (Exception e) {
            System.out.println(main.CMDPrefix + "Error: Config file is not loaded! File configuration can't load!");
        }
        return cfg;
    }

    /**
     * Get config file
     *
     * @return File
     */
    public File getConfig() {
        loadConfig();
        return file;
    }

    /**
     * Loading config file
     */
    private void loadConfig() {
        if (!isConfigExist()) {
            createDefaultConfig();
            System.out.println(main.CMDPrefix + "Create default config.yml");
        }
        file = new File("plugins/GunGame", "config.yml");
        if (!file.exists()) {
            System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: Can not find the config.yml file!");
        }
    }

    /**
     * Exist default config
     *
     * @return boolean
     */
    public boolean isConfigExist() {
        File testLoad = new File("plugins/GunGame", "config.yml");
        return testLoad.exists();
    }

    /**
     * Create default config file
     */
    public void createDefaultConfig() {
        cfg = main.getConfig();
        cfg.addDefault("gungame.settings.debug", false);
        cfg.addDefault("gungame.settings.mysql.host", "127.0.0.1");
        cfg.addDefault("gungame.settings.mysql.port", 3306);
        cfg.addDefault("gungame.settings.mysql.user", "example");
        cfg.addDefault("gungame.settings.mysql.password", "example");
        cfg.addDefault("gungame.settings.mysql.database", "gungame");
        System.out.println(main.CMDPrefix + ConsoleColors.YELLOW + "Warning! - The default mysql data are ip: 127.0.0.1, port: 3006, user: example, password: example, database: gungame");
        cfg.addDefault("gungame.spawn.World", "world");
        cfg.addDefault("gungame.spawn.X", 0);
        cfg.addDefault("gungame.spawn.Y", 0);
        cfg.addDefault("gungame.spawn.Z", 0);
        cfg.addDefault("gungame.spawn.Yaw", 0);
        cfg.addDefault("gungame.spawn.Pitch", 0);
        System.out.println(main.CMDPrefix + ConsoleColors.YELLOW + "Warning! - The default spawn coordination are X:0 Y:0 Z:0 in the World: world");
        cfg.addDefault("gungame.spawn.Protection", 16);
        System.out.println(main.CMDPrefix + ConsoleColors.YELLOW + "Warning! - The default spawn protection radius are 16 blocks!");
        cfg.options().copyDefaults(true);
        main.saveConfig();
    }

    /**
     * Get default language value from config
     *
     * @return String
     */
    public String getDefaultLanguage() {
        try {
            return cfg.getString("gungame.settings.language.default");
        } catch (Exception e) {
            System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: Default language value can't find in config file!");
        }
        return "en";
    }

    /**
     * Get mysql connection data
     *
     * @return Map
     */
    public Map<String, String> getMySQLData() {
        Map<String, String> mysqlData = new HashMap<>();
        try {
            mysqlData.put("host", main.cfg.getString("gungame.settings.mysql.host"));
            mysqlData.put("port", main.cfg.getString("gungame.settings.mysql.port"));
            mysqlData.put("user", main.cfg.getString("gungame.settings.mysql.user"));
            mysqlData.put("password", main.cfg.getString("gungame.settings.mysql.password"));
            mysqlData.put("database", main.cfg.getString("gungame.settings.mysql.database"));
        } catch (Exception e) {
            System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: Mysql values can't find in config file!");
        }
        return mysqlData;
    }

    /**
     * get Set class
     *
     * @return Set
     */
    public Set set() {
        return new Set(main);
    }

    /**
     * get Get class
     *
     * @return Set
     */
    public Get get() {
        return new Get(main);
    }

}
