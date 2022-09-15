package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import PlayersData.Hitter;
import PlayersData.Pitchers;
import TeamsData.Team;
import jdbc.DBUtil;

public class PlayerDao {

	private Hitter hresultMapping(ResultSet rs) throws SQLException {
		String name = rs.getString("name");
		String team = rs.getString("team");
		String position = rs.getString("position");
		String avg = rs.getString("avg");
		String rbi = rs.getString("rbi");
		String homerun = rs.getString("homerun");
		String hits = rs.getString("hits");
		String ops = rs.getString("ops");
		String pa = rs.getString("pa");

		return new Hitter(name, team, position, avg, rbi, homerun, hits, ops, pa);
	}

	private Pitchers presultMapping(ResultSet rs) throws SQLException {
		String name = rs.getString("name");
		String team = rs.getString("team");
		String position = rs.getString("position");
		String era = rs.getString("era");
		String wins = rs.getString("wins");
		String loses = rs.getString("loses");
		String saves = rs.getString("saves");
		String kk = rs.getString("kk");
		String firstInning = rs.getString("inning_int");
		String secondInning = rs.getString("inning_float");

		return new Pitchers(name, team, position, era, wins, loses, saves, kk, firstInning, secondInning);
	}

	private Player resultMapping(ResultSet rs) throws SQLException {

		String name = rs.getString("name");
		String position = rs.getString("position");

		return new Player(name, position);

	}

	public Hitter hitterRead(String name) throws SQLException, ClassNotFoundException { // 타자한명 검색

		String query = "select * from players WHERE name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return hresultMapping(rs);
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
		}
		return null;
	}

	public Pitchers pitcherRead(String name) throws SQLException, ClassNotFoundException { // 투쑤한명 검색

		String query = "select * from players WHERE name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return presultMapping(rs);
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
		}
		return null;
	}

	public List<Pitchers> eraTop5() throws SQLException, ClassNotFoundException { // 평균자책 top5

		String query = "select name, team, era from players where inning_int > 120  order by era limit 0,5";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pitchers> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String era = String.valueOf(rs.getDouble("era"));

				list.add(new Pitchers(name, team, era));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Pitchers> winsTop5() throws SQLException, ClassNotFoundException { // 다승 top5

		String query = "select name, team, wins from players order by wins desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pitchers> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String wins = String.valueOf(rs.getInt("wins"));

				list.add(new Pitchers(1, name, team, wins));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Pitchers> kTop5() throws SQLException, ClassNotFoundException { // 탈삼진 top5

		String query = "select name, team, kk from players order by kk desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pitchers> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String kk = String.valueOf(rs.getInt("kk"));

				list.add(new Pitchers('c', name, team, kk));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Pitchers> saveTop5() throws SQLException, ClassNotFoundException { // 세이브

		String query = "select name, team, saves from players order by saves desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pitchers> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String save = String.valueOf(rs.getInt("saves"));

				list.add(new Pitchers("메롱", name, team, save));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Pitchers> inningTop5() throws SQLException, ClassNotFoundException { // 이닝top5

		String query = "SELECT name, team, inning_int, inning_float FROM players ORDER BY inning_int*1 desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pitchers> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String inning = rs.getString("inning_int");
				String inningf = rs.getString("inning_float");

				list.add(new Pitchers(1, name, team, inning, inningf));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Hitter> avgTop5() throws SQLException, ClassNotFoundException { // 타율 top5

		String query = "select name, team, avg from players where pa > 350 order by avg desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Hitter> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String avg = rs.getNString("avg");

				list.add(new Hitter(name, team, avg));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Hitter> homrunTop5() throws SQLException, ClassNotFoundException { // 홈런 top5

		String query = "select name, team, homerun from players order by homerun*1 desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Hitter> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String homerun = rs.getString("homerun");

				list.add(new Hitter(1, name, team, homerun));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Hitter> opsTop5() throws SQLException, ClassNotFoundException { // opstop5

		String query = "select name, team, ops from players where pa > 335 order by ops*1 desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Hitter> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String ops = rs.getString("ops");

				list.add(new Hitter('t', name, team, ops));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Hitter> hitTop5() throws SQLException, ClassNotFoundException { // 안타top5

		String query = "select name, team, hits from players order by hits*1 desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Hitter> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String hits = rs.getString("hits");

				list.add(new Hitter(0.044, name, team, hits));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public List<Hitter> rbiTop5() throws SQLException, ClassNotFoundException { // 타점 top5

		String query = "select name, team, rbi  from players order by rbi*1 desc";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Hitter> list = new ArrayList<>();

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				String team = rs.getString("team");
				String rbi = rs.getString("rbi");

				list.add(new Hitter("떘떘", name, team, rbi));
			}
		} finally {
			DBUtil.closeRS(rs);
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);
		}
		return list;
	}

	public String getPosition(String name) throws ClassNotFoundException, SQLException { // 포지션 검색

		String query = "select name, position from players WHERE name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				return resultMapping(rs).getPosition();
			} else {
				return null;
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeRS(rs);
			DBUtil.closeStmt(pstmt);
		}
	}

}
