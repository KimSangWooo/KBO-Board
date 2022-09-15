package PlayersData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface PlayerDao {

	public void insertSSGpitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertSSGhitters(List<Hitter> list) throws SQLException, IOException;

	public void insertLottePitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertLottehitters(List<Hitter> list) throws SQLException, IOException;

	public void insertKiwoomPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertKiwoomhitters(List<Hitter> list) throws SQLException, IOException;

	public void insertNcPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertNchitters(List<Hitter> list) throws SQLException, IOException;

	public void insertLgPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertLghitters(List<Hitter> list) throws SQLException, IOException;

	public void insertKtPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertKthitters(List<Hitter> list) throws SQLException, IOException;

	public void insertHhPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertHhhitters(List<Hitter> list) throws SQLException, IOException;

	public void insertKiaPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertKiahitters(List<Hitter> list) throws SQLException, IOException;

	public void insertDoosanPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertDoosanhitters(List<Hitter> list) throws SQLException, IOException;
	
	public void insertSamsungPitchers(List<Pitchers> list) throws SQLException, IOException;

	public void insertSamsunghitters(List<Hitter> list) throws SQLException, IOException;

}
