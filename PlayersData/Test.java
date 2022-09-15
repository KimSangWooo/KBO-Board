package PlayersData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Test {

	public static void main(String[] args) throws IOException, SQLException {
		PlayerDaoImp pl = new PlayerDaoImp();
		PlayerCrawling c = new PlayerCrawling();

//		
		List<Pitchers> plist = c.ssgPitchers;
		List<Pitchers> plist2 = c.lgPitchers;
		List<Pitchers> plist3 = c.ktPitchers;
		List<Pitchers> plist4 = c.kiwoomPitchers;
		List<Pitchers> plist5 = c.kiaPitchers;
		List<Pitchers> plist6 = c.lottePitchers;
		List<Pitchers> plist7 = c.ncPitchers;
		List<Pitchers> plist8 = c.doosanPitchers;
		List<Pitchers> plist9 = c.samsungPitchers;
		List<Pitchers> plist10 = c.hhPitchers;
		try {
			pl.deleteP();
			pl.insertSSGpitchers(plist);
			pl.insertLgPitchers(plist2);
			pl.insertKtPitchers(plist3);
			pl.insertKiwoomPitchers(plist4);
			pl.insertKiaPitchers(plist5);
			pl.insertLottePitchers(plist6);
			pl.insertNcPitchers(plist7);
			pl.insertDoosanPitchers(plist8);
			pl.insertSamsungPitchers(plist9);
			pl.insertHhPitchers(plist10);

		} catch (Exception e) {
			e.printStackTrace();
		}
//		

		List<Hitter> hlist = c.ssgHitters;
		List<Hitter> hlist2 = c.lgHitters;
		List<Hitter> hlist3 = c.ktHitters;
		List<Hitter> hlist4 = c.kiwoomHitters;
		List<Hitter> hlist5 = c.kiaHitters;
		List<Hitter> hlist6 = c.lotteHitters;
		List<Hitter> hlist7 = c.ncHitters;
		List<Hitter> hlist8 = c.doosanHitters;
		List<Hitter> hlist9 = c.samsungHitters;
		List<Hitter> hlist10 = c.hhHitters;

		try {
			pl.insertSSGhitters(hlist);
			pl.insertLghitters(hlist2);
			pl.insertKthitters(hlist3);
			pl.insertKiwoomhitters(hlist4);
			pl.insertKiahitters(hlist5);
			pl.insertLottehitters(hlist6);
			pl.insertNchitters(hlist7);
			pl.insertDoosanhitters(hlist8);
			pl.insertSamsunghitters(hlist9);
			pl.insertHhhitters(hlist10);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
