/*
 * Copyright (C) 2018-2020 Daniel Engelschalk - All Rights Reserved
 * Email: hello@mrkampf.com
 */
package de.mrkampf.gungame.mysql;

import de.mrkampf.gungame.Main;
import de.mrkampf.gungame.utils.ConsoleColors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MySQL {

    private Main main;

    private Map<String, String> connectionData = new HashMap<>();

    public static Connection con; //MySQL connection

    /**
     * Construction
     *
     * @param main
     */
    public MySQL(Main main) {
        this.main = main;
        this.connectionData = main.configManager.getMySQLData();
    }

    /**
     * Connect to mysql server and hold the connection in the con variable
     */
    public void connect() {
        if (!isConnected()) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + connectionData.get("host") + ":" + connectionData.get("port") + "/" + connectionData.get("database") + "?autoReconnect=true", connectionData.get("user"), connectionData.get("password")); //Connect to mysql server and safe in con variable
                System.out.println(main.CMDPrefix + "MySQL - Connected!");
            } catch (SQLException e) {
                System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: MySQL connection failed!");
                if (main.debug) { //IF debug enable
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Disconnect the mysql connection to server
     */
    public void disconnect() {
        if (isConnected()) { //Is connected to mysql server
            try {
                con.close(); //Close connection
                con = null; //Clear variable
                System.out.println(main.CMDPrefix + "MySQL - Disconnected!");
            } catch (SQLException e) {
                System.out.println(main.CMDPrefix + ConsoleColors.RED + "Error: MySQL disconnection failed!");
                if (main.debug) { //IF debug enable
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Check is connection active and initialized
     *
     * @return boolean
     */
    public boolean isConnected() {
        return (con != null); //Check is con variable not null
    }

    /**
     * Get mysql connection
     *
     * @return con
     */
    public Connection getConnection() {
        if (!isConnected()) { //Is connected to mysql server
            connect(); //Open connection to mysql server when is not connected
        }
        return con; //Return con variable
    }
}
