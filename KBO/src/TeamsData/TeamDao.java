package TeamsData;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jdbc.DBUtil;

public class TeamDao {

	public void insertTeam() throws SQLException, IOException { //팀전체값넣기
		TeamCrawling t = new TeamCrawling();

		List<Team> list = t.teamC();

		String query = "INSERT INTO teams (name, teamrank, games, wins, loses, draws, rate, terms) VALUES (?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
				pstmt.setString(1, list.get(i).getName());
				pstmt.setInt(2, Integer.parseInt(list.get(i).getRank()));
				pstmt.setString(3, list.get(i).getGames());
				pstmt.setString(4, list.get(i).getWins());
				pstmt.setString(5, list.get(i).getLoses());
				pstmt.setString(6, list.get(i).getDraws());
				pstmt.setString(7, list.get(i).getRate());
				pstmt.setString(8, list.get(i).getGameterms());

				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);

		}
	}
	
	public void deleteT() throws SQLException, ClassNotFoundException { // 삭제
		String query = "delete from teams";

		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
		} finally {
			DBUtil.closeStmt(stmt);
			DBUtil.closeConn(conn);
		}
	}

}
