package PlayersData;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import jdbc.DBUtil;

public class PlayerDaoImp implements PlayerDao {

	public void hitterInsert(List<Hitter> list) throws SQLException, ClassNotFoundException {

		String query = "INSERT INTO players (name, team, position, avg, rbi, homerun, hits, ops, pa) VALUES (?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (int i = 0; i < list.size(); i++) {
				pstmt.setString(1, list.get(i).getName());
				pstmt.setString(2, list.get(i).getTeam());
				pstmt.setString(3, list.get(i).getPosition());
				pstmt.setString(4, list.get(i).getAvg());
				pstmt.setString(5, list.get(i).getRbi());
				pstmt.setString(6, list.get(i).getHomerun());
				pstmt.setString(7, list.get(i).getHits());
				pstmt.setString(8, list.get(i).getOps());
				pstmt.setString(9, list.get(i).getPa());

				pstmt.executeUpdate();
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);

		}
	}

	public void pitcherInsert(List<Pitchers> list) throws SQLException, ClassNotFoundException {

		String query = "INSERT INTO players (name, team, position, era, wins, loses, saves, kk, inning_int, inning_float) VALUES (?,?,?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			for (int i = 0; i < list.size(); i++) {
				pstmt.setString(1, list.get(i).getName());
				pstmt.setString(2, list.get(i).getTeam());
				pstmt.setString(3, list.get(i).getPosition());
				pstmt.setDouble(4, Double.parseDouble(list.get(i).getEra()));
				pstmt.setInt(5, Integer.parseInt(list.get(i).getWins()));
				pstmt.setString(6, list.get(i).getLoses());
				pstmt.setInt(7, Integer.parseInt(list.get(i).getSaves()));
				pstmt.setInt(8, Integer.parseInt(list.get(i).getKk()));
				pstmt.setString(9, list.get(i).getInningInt());
				pstmt.setString(10, list.get(i).getInningFlo());

				pstmt.executeUpdate();
			}
		} finally {
			DBUtil.closeConn(conn);
			DBUtil.closeStmt(pstmt);

		}
	}

	@Override
	public void insertSSGpitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.ssgPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertSSGhitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.ssgHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertLottePitchers(List<Pitchers> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.lottePitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertLottehitters(List<Hitter> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.lotteHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertKiwoomPitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.kiwoomPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertKiwoomhitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.kiwoomHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertNcPitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.ncPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertNchitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.ncHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertLgPitchers(List<Pitchers> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.lgPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertLghitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.lgHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertKtPitchers(List<Pitchers> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.ktPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertKthitters(List<Hitter> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.ktHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertHhPitchers(List<Pitchers> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.hhPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertHhhitters(List<Hitter> list) throws SQLException, IOException {

		PlayerCrawling p = new PlayerCrawling();
		list = p.hhHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertKiaPitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.kiaPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void insertKiahitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.kiaHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertDoosanPitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.doosanPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertDoosanhitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.doosanHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertSamsungPitchers(List<Pitchers> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.samsungPitcherC();

		try {
			pitcherInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertSamsunghitters(List<Hitter> list) throws SQLException, IOException {
		PlayerCrawling p = new PlayerCrawling();
		list = p.samsungHitterC();

		try {
			hitterInsert(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteP() throws SQLException, ClassNotFoundException { // 선수삭제
		String query = "delete from players";

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
