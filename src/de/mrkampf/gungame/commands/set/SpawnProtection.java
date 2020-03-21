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

public class SpawnProtection implements CommandExecutor {

    private Main main; //Plugin main class
    private String cmdPrefix = "setspawnprotection"; //The command
    private String syntax = "/setspawnprotection <radius>"; //The command syntax

    /**
     * Constructor
     *
     * @param main Main
     */
    public SpawnProtection(Main main) {
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
                if (args.length == 1) {//Check length of args
                    int radius = Integer.parseInt(args[0]); //Init radius and fill this with radius
                    boolean isSet = main.configManager.set().spawnProtection(radius); //Update the spawn protection radius
                    if (isSet) { //Was updated from spawn protection successful
                        p.sendMessage(main.Prefix + ChatColor.GREEN +"The spawn protection radius, was changed to "+radius+"!"); //Send message, the command was successful processed
                    } else { //Update wasn't successful
                        p.sendMessage(main.Prefix + ChatColor.RED+"The update from spawn protection wasn't successful!"); // //Send message, the command wasn't successful processed
                    }
                } else { //If too many or too few arguments were given
					p.sendMessage(main.Prefix + ChatColor.RED + syntax); //Return command syntax
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
			if (args.length == 1) {//Check length of args
				int radius = Integer.parseInt(args[0]); //Init radius and fill this with radius
				boolean isSet = main.configManager.set().spawnProtection(radius); //Update the spawn protection radius
				if (isSet) { //Was updated from spawn protection successful
					System.out.println(main.CMDPrefix + ConsoleColors.GREEN +"The spawn protection radius, was changed to "+radius+"!"); //Send message, the command was successful processed
				} else { //Update wasn't successful
					System.out.println(main.CMDPrefix + ConsoleColors.RED+"The update from spawn protection wasn't successful!"); //Send message, the command wasn't successful processed
				}
			} else { //If too many or too few arguments were given
				System.out.println(main.CMDPrefix + ConsoleColors.RED + syntax); //Return command syntax
			}
		} catch (NumberFormatException e) { //If exception
			System.out.println(main.CMDPrefix + ConsoleColors.RED + syntax); //Return command syntax
		}
    }

}
