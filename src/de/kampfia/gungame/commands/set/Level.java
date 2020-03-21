package de.kampfia.gungame.commands.set;

import de.kampfia.gungame.Main;
import de.kampfia.gungame.utils.ConsoleColors;
import de.kampfia.gungame.utils.GunGameEngine;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * In this class we set the level from a player
 */
public class Level implements CommandExecutor {

    private Main main; //Plugin main class
    private String cmdPrefix = "setlevel"; //The command
    private String syntax = "/setlevel <level> <username>"; //The command syntax

    /**
     * Constructor
     *
     * @param main Main
     */
    public Level(Main main) {
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
            try {
                int level; //Init variable level
                switch (args.length) { //Check length of args
                    case 1: //Change level from himself
                        level = Integer.parseInt(args[0]); //Fill variable with new level
                        GunGameEngine.levelChange(p, level); //Change level to new level
                        p.sendMessage(main.Prefix + ChatColor.GREEN + "Your level was changed to " + level + "."); //Send message, the command was successful processed
                        break;
                    case 2: //Change level from other player
                        level = Integer.parseInt(args[0]); //Fill variable with new level
                        //TODO Check is player online or offline and create new function for set level from offline and online player
                        Player cp = Bukkit.getOfflinePlayer(args[1]).getPlayer(); //Init variable cp and fill with the offline player as player
                        GunGameEngine.levelChange(cp, level); //Change level to new level
                        cp.sendMessage(main.Prefix + ChatColor.GREEN + "Your level was changed to " + level + "."); //Send message to changed player, his level was changed
                        p.sendMessage(main.Prefix + ChatColor.GREEN + "The player " + cp.getDisplayName() + " has now level " + level + "."); //Send message, the command was successful processed
                        break;
                    default: //If too many or too few arguments were given
                        p.sendMessage(main.Prefix + ChatColor.RED + syntax); //Return command syntax
                        break;
                }
            } catch (NumberFormatException e) { //If exception
                p.sendMessage(main.Prefix + ChatColor.RED + syntax); //Return command syntax
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
        try {
            int level; //Init variable level
            switch (args.length) { //Check length of args
                case 1: //Change level from himself
                    System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: This syntax can only use a player. The console can't get a level."); //Return error message
                    break;
                case 2: //Change level from other player
                    level = Integer.parseInt(args[0]); //Fill variable with new level
                    //TODO Check is player online or offline and create new function for set level from offline and online player
                    Player cp = Bukkit.getOfflinePlayer(args[1]).getPlayer(); //Init variable cp and fill with the offline player as player
                    GunGameEngine.levelChange(cp, level); //Change level to new level
                    cp.sendMessage(main.Prefix + ChatColor.GREEN + "Your level was changed to " + level + "."); //Send message to changed player, his level was changed
                    System.out.println(main.CMDPrefix + ConsoleColors.GREEN + "The player " + cp.getDisplayName() + " has now the level " + level + "."); //Send message, the command was successful processed
                    break;
                default: //If too many or too few arguments were given
                    System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: Syntax is wrong. Syntax: " + syntax); //Return command syntax
                    break;
            }
        } catch (NumberFormatException e) { //If exception
            System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: Syntax is wrong. Syntax: " + syntax); //Return command syntax
        }
    }
}
