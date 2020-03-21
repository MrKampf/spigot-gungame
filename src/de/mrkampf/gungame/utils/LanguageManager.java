/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */
package de.mrkampf.gungame.utils;

import de.mrkampf.gungame.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Language manager
 * TODO Support multi lang
 */
public class LanguageManager {

    private Map<String,String> loadingLanguage;
    private String basicPath = "plugins/GunGame/language";
    private File file;
    private FileConfiguration cfg;
    private Main main;

    /**
     * Constructor
     * @param main Main
     */
    public LanguageManager(Main main) {
        this.main = main;
    }

    /**
     * Get language for custom
     * @param lang String
     * @return HashMap
     */
    public Map<String, String> getCustom(String lang){
        loadingLanguage = new HashMap<>();
        getConfigFile(lang);
        if(!file.exists()){
            return getFallback();
        }

        return loadingLanguage;
    }

    /**
     * Get default language or fallback language when no language exist
     * @return HashMap
     */
    public Map<String, String> getDefault(){
        loadingLanguage = new HashMap<>();
        getConfigFile(main.defaultLanguage);
        if(!file.exists()){
            return getFallback();
        }

        return loadingLanguage;
    }

    /**
     * Get fallback language, when no language file exist
     * @return HashMap
     */
    public Map<String, String> getFallback(){
        loadingLanguage = new HashMap<>();
        loadingLanguage.put("prefix","GunGame");
        loadingLanguage.put("pluginEnableFinished","Plugin finished loading.");
        loadingLanguage.put("pluginDisableFinished","Plugin finished unloading.");

        return loadingLanguage;
    }

    /**
     * Loading config file and init yaml config
     * @param lang String
     */
    private void getConfigFile(String lang){
        file = new File(basicPath, lang+".yml");
        if(!file.exists()){
            return;
        }
        cfg = YamlConfiguration.loadConfiguration(file);
    }

    /**
     * Get value
     * @param langSelect String
     * @return String
     */
    public String get(String langSelect){
        Map<String, String> language = getLanguageMap();
        if(getLangValue(language,langSelect)!=null){
            return language.get(langSelect);
        }else{
            language = getFallback();
            return  getLangValue(language,langSelect);
        }
    }

    /**
     * Get lang value
     * @param language Map
     * @param langSelect String
     * @return String
     */
    private String getLangValue(Map<String, String> language, String langSelect){
        if(language.containsKey(langSelect)){
            return language.get(langSelect);
        }else{
            return null;
        }
    }

    /**
     * Get player language map
     * @return Map
     */
    private Map<String, String> getLanguageMap(){
        if(main.customLanguage!=null){
            return main.customLanguage;
        }else if(main.language!=null){
            return main.language;
        }
        return null;
    }

}
