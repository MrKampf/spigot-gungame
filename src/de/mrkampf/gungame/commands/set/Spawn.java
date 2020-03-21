/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.commands.set;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.utils.ConsoleColors;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * In this class we set the spawn point
 */
public class Spawn implements CommandExecutor {

    private Main main;
    private String cmdPrefix = "setspawn"; //The command
    private String syntax = "/setspawn"; //The command syntax

    /**
     * Constructor
     *
     * @param main Main
     */
    public Spawn(Main main) {
        this.main = main; //Fill class variable
    }


    /**
     * Command function
     *
     * @param cs    CommandSender
     * @param cmd   Command
     * @param label Command label
     * @param args  Command arguments
     * @return boolean
     */
    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase(cmdPrefix)) { //Check is label equals cmd prefix
            if (cs instanceof Player) { //Is command sender instance of player
                playerCommand((Player) cs, args); //Init player command function
            } else { //Is sender console
                consoleCommand(args); //Init console command function
            }
        }
        return false;
    }

    /**
     * Player is sender from this command, then use this function for process this command
     *
     * @param p    Player
     * @param args String[]
     */
    private void playerCommand(Player p, String[] args) {
        if (p.hasPermission(main.permission + cmdPrefix)) { //Has player permission to use this command
            boolean isSet = main.configManager.set().spawn(p); //Update spawn point
            if (isSet) {
                p.sendMessage(main.Prefix + ChatColor.GREEN + "The spawn point was updated!"); //Send message, the command was successful processed
            } else {
                p.sendMessage(main.Prefix + ChatColor.RED + "The spawn point wasn't updated!"); //Send message, the command wasn't successful processed
            }
        }
        //No permission error, command can be so invisible for not authorized player
    }

    /**
     * Console is sender from this command, then use this function for process this command
     *
     * @param args String[]
     */
    private void consoleCommand(String[] args) {
        System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: This syntax can only use a player. The console haven't are usable position."); //Return error message
    }
}
