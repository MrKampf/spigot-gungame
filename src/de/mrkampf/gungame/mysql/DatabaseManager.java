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

	private Main main;

	public DatabaseManager(Main main) {
		this.main = main;
	}

	public boolean isUserExist(UUID uuid){
		PreparedStatement ps;
		try {
			ps = main.mySQL.getConnection().prepareStatement("SELECT UUID FROM gungame WHERE UUID = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't loading information about player!");
			e.printStackTrace();
		}
		return false;
	}
	
	public void updateKills(UUID uuid) {
		PreparedStatement ps;
		int Kills = (getKills(uuid)+1);
		try {
			ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET kills = ? WHERE UUID = ?");
			ps.setInt(1, Kills);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't change information about player!");
			e.printStackTrace();
		}
	}
	
	public void updateDeath(UUID uuid) {
		PreparedStatement ps;
		int Death = (1+getDeaths(uuid));
		try {
			ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET deaths = ? WHERE UUID= ?");
			ps.setInt(1, Death);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't change information about player!");
			e.printStackTrace();
		}
	}
	
	public void updateLevel(UUID uuid) {
		PreparedStatement ps;
		int Level = (1+getLevel(uuid));
		try {
			ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET level = ? WHERE UUID= ?");
			ps.setInt(1, Level);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't change information about player!");
			e.printStackTrace();
		}
	}
	
	public void resetLevel(UUID uuid) {
		PreparedStatement ps;
		int Level = 1;
		try {
			ps = main.mySQL.getConnection().prepareStatement("UPDATE gungame SET level = ? WHERE UUID= ?");
			ps.setInt(1, Level);
			ps.setString(2, uuid.toString());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't change information about player!");
			e.printStackTrace();
		}
	}
	
	public void createUser(UUID uuid) {
		PreparedStatement ps;
		try {
			ps = main.mySQL.getConnection().prepareStatement("INSERT INTO gungame(UUID, level, deaths, kills) VALUES(?,?,?,?)");
			ps.setString(1, uuid.toString());
			ps.setInt(2, 1);
			ps.setInt(3, 0);
			ps.setInt(4, 0);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't create player in database!");
			e.printStackTrace();
		}
	}
	
	public void delete(UUID uuid){
		PreparedStatement ps;
		if(isUserExist(uuid)){
			try {
				ps = main.mySQL.getConnection().prepareStatement("DELETE * FROM gungame WHERE UUID= ?");
				ps.setString(1, uuid.toString());
			} catch (SQLException e) {
				System.out.println(main.CMDPrefix+"Error: Game can't delete information about player!");
				e.printStackTrace();
			}
		}else{
			System.out.println("[MySQL] Der Spieler mit der UUID "+ uuid.toString()+" konnte nicht gelöscht werden!");
		}
	}
	
	public Integer getKills(UUID uuid){
		PreparedStatement ps;
		try {
			ps = main.mySQL.getConnection().prepareStatement("SELECT kills FROM gungame WHERE UUID = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt("kills");
			}
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't loading information about player!");
			e.printStackTrace();
		}
		return -1;
	}
	
	public Integer getDeaths(UUID uuid){
		PreparedStatement ps;
		try {
			ps = main.mySQL.getConnection().prepareStatement("SELECT deaths FROM gungame WHERE UUID = ?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt("deaths");
			}
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't loading information about player!");
			e.printStackTrace();
		}
		return -1;
	}
	
	public Integer getLevel(UUID uuid){
		PreparedStatement ps;
		try {
			ps = main.mySQL.getConnection().prepareStatement("SELECT level FROM gungame WHERE UUID=?");
			ps.setString(1, uuid.toString());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return rs.getInt("level");
			}
		} catch (SQLException e) {
			System.out.println(main.CMDPrefix+"Error: Game can't loading information about player!");
			e.printStackTrace();
		}
		return -1;
	}
}
