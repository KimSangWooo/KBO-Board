package ResultData;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import TeamsData.Team;
import jdbc.DBUtil;

public class ResultDao {

	public void insertResult() throws SQLException, IOException { // 결과값 넣기
		ResultCrawling r = new ResultCrawling();

		List<Result> list = r.resultC();

		String query = "INSERT INTO result (hometeam, awayteam, result, homescore, awayscore) VALUES (?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (int i = 0; i < list.size(); i++) {
				pstmt.setString(1, list.get(i).getHometeam());
				pstmt.setString(2, list.get(i).getAwayteam());
				pstmt.setString(3, list.get(i).getResult());
				pstmt.setString(4, list.get(i).getHomescore());
				pstmt.setString(5, list.get(i).getAwayscore());

				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);

		}
	}

	private Result resultMapping(ResultSet rs) throws SQLException { // 팀정보
		String hometeam = rs.getString("hometeam");
		String homescore = rs.getString("homescore");
		String result = rs.getString("result");
		String awayteam = rs.getString("awayteam");
		String awayscore = rs.getString("awayscore");

		return new Result(hometeam, awayteam, result, homescore, awayscore);
	}

	public List<Result> allResult() throws SQLException, ClassNotFoundException { // 팀전체
		String query = "SELECT * FROM result";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Result> list = new ArrayList<>();
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

	public void deleteR() throws SQLException, ClassNotFoundException { // 결과삭제
		String query = "delete from result";

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
