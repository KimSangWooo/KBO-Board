package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import PlayersData.Hitter;
import TeamsData.Team;
import jdbc.DBUtil;

public class TeamDao {
	private Team resultMapping(ResultSet rs) throws SQLException { // ∆¿¡§∫∏
		String teamName = rs.getString("name");
		String teamRank = String.valueOf(rs.getInt("teamrank"));
		String games = rs.getString("games");
		String wins = rs.getString("wins");
		String loses = rs.getString("loses");
		String draws = rs.getString("draws");
		String rates = rs.getString("rate");
		String terms = rs.getString("terms");

		return new Team(teamName, teamRank, games, wins, loses, draws, rates, terms);
	}

	public List<Team> allTeams() throws SQLException, ClassNotFoundException { // ∆¿¿¸√º
		String query = "SELECT * FROM teams order by teamrank";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Team> list = new ArrayList<>();
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				list.add(resultMapping(rs));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
		return list;
	}

	public String onerank(String team) throws SQLException, ClassNotFoundException { // ∆¿º¯¿ß

		String query = "select teamrank from teams WHERE name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, team);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String rank = rs.getString("teamrank");
				return rank;
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
		}
		return null;
	}
}
