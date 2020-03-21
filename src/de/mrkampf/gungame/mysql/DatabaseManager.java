/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */

package de.mrkampf.gungame.mysql;

import de.mrkampf.gungame.Main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class DatabaseManager {

    private Main main; //Plugin main class

    /**
     * Constructor
     *
     * @param main Main
     */
    public DatabaseManager(Main main) {
        this.main = main; //Fill class variable
    }

    /**
     * Is user exist in database
     *
     * @param uuid UUID
     * @return boolean
     */
    public boolean isUserExist(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        try {
            ps = main.mySQL.getConnection().prepareStatement("SELECT UUID FROM gungame WHERE UUID = ?"); //Create basis sql command
            ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            ResultSet rs = ps.executeQuery(); //Execute the sql command
            return rs.next(); //Return the result
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't loading information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
        return false; //Return false
    }

    /**
     * Update the kill stats
     *
     * @param uuid UUID
     */
    public void updateKills(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        int Kills = (getKills(uuid) + 1);
        try {
            ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET kills = ? WHERE UUID = ?"); //Create basis sql command
            ps.setInt(1, Kills); //Update sql command and prepare the kills
            ps.setString(2, uuid.toString()); //Update sql command and prepare the uuid
            ps.executeQuery(); //Execute the sql command
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't change information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
    }

    /**
     * Update the death stats
     *
     * @param uuid UUID
     */
    public void updateDeath(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        int Death = (1 + getDeaths(uuid));
        try {
            ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET deaths = ? WHERE UUID= ?"); //Create basis sql command
            ps.setInt(1, Death); //Update sql command and prepare the death
            ps.setString(2, uuid.toString()); //Update sql command and prepare the uuid
            ps.executeQuery(); //Execute the sql command
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't change information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
    }

    /**
     * Update player level
     *
     * @param uuid UUID
     */
    public void updateLevel(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        int Level = (1 + getLevel(uuid));
        try {
            ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET level = ? WHERE UUID= ?"); //Create basis sql command
            ps.setInt(1, Level); //Update sql command and prepare the level
            ps.setString(2, uuid.toString()); //Update sql command and prepare the uuid
            ps.executeQuery(); //Execute the sql command
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't change information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
    }

    /**
     * Reset level from player
     *
     * @param uuid UUID
     */
    public void resetLevel(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        int Level = 1;
        try {
            ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET level = ? WHERE UUID= ?"); //Create basis sql command
            ps.setInt(1, Level); //Update sql command and prepare the level
            ps.setString(2, uuid.toString()); //Update sql command and prepare the uuid
            ps.executeQuery(); //Execute the sql command
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't change information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
    }

    /**
     * Create the user in database
     *
     * @param uuid UUID
     */
    public void createUser(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        try {
            ps = main.mySQL.getConnection().prepareStatement("INSERT INTO gungame(UUID, level, deaths, kills) VALUES(?,?,?,?)"); //Create basis sql command
            ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            ps.setInt(2, 1); //Update sql command and prepare the level
            ps.setInt(3, 0); //Update sql command and prepare the deaths
            ps.setInt(4, 0); //Update sql command and prepare the kills
            ps.executeQuery(); //Execute the sql command
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't create player in database!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
    }

    /**
     * Delete user in database
     *
     * @param uuid UUID
     */
    public void delete(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        if (isUserExist(uuid)) {
            try {
                ps = main.mySQL.getConnection().prepareStatement("DELETE * FROM gungame WHERE UUID= ?"); //Create basis sql command
                ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            } catch (SQLException e) {
                System.out.println(main.CMDPrefix + "Error: Game can't delete information about player!"); //Error, sql command syntax error or connection problems
                e.printStackTrace(); //Output exception
            }
        } else {
            System.out.println("[MySQL] Der Spieler mit der UUID " + uuid.toString() + " konnte nicht gelöscht werden!");
        }
    }

    /**
     * Get kills from user
     *
     * @param uuid UUID
     */
    public Integer getKills(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        try {
            ps = main.mySQL.getConnection().prepareStatement("SELECT kills FROM gungame WHERE UUID = ?"); //Create basis sql command
            ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            ResultSet rs = ps.executeQuery(); //Execute the sql command
            while (rs.next()) { //Process result values
                return rs.getInt("kills"); //Return the kills
            }
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't loading information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
        return -1;
    }

    /**
     * Get deaths from user
     *
     * @param uuid UUID
     */
    public Integer getDeaths(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        try {
            ps = main.mySQL.getConnection().prepareStatement("SELECT deaths FROM gungame WHERE UUID = ?"); //Create basis sql command
            ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            ResultSet rs = ps.executeQuery(); //Execute the sql command
            while (rs.next()) { //Process result values
                return rs.getInt("deaths"); //Return the deaths
            }
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't loading information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
        return -1;
    }

    /**
     * Get level from player
     *
     * @param uuid UUID
     */
    public Integer getLevel(UUID uuid) {
        PreparedStatement ps; //Prepared statement
        try {
            ps = main.mySQL.getConnection().prepareStatement("SELECT level FROM gungame WHERE UUID=?"); //Create basis sql command
            ps.setString(1, uuid.toString()); //Update sql command and prepare the uuid
            ResultSet rs = ps.executeQuery(); //Execute the sql command
            while (rs.next()) { //Process result values
                return rs.getInt("level"); //Return the level
            }
        } catch (SQLException e) {
            System.out.println(main.CMDPrefix + "Error: Game can't loading information about player!"); //Error, sql command syntax error or connection problems
            e.printStackTrace(); //Output exception
        }
        return -1;
    }
}
