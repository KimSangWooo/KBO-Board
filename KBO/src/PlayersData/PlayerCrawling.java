package PlayersData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PlayerCrawling {
	List<String> ssgPitcherUrl = new ArrayList<String>();
	List<String> ssgHitterUrl = new ArrayList<>();
	List<String> lottePitcherUrl = new ArrayList<String>();
	List<String> lotteHitterUrl = new ArrayList<>();
	List<String> kiwoomPitcherUrl = new ArrayList<>();
	List<String> kiwoomHitterUrl = new ArrayList<>();
	List<String> ncPitcherUrl = new ArrayList<String>();
	List<String> ncHitterUrl = new ArrayList<String>();
	List<String> lgPitcherUrl = new ArrayList<String>();
	List<String> lgHitterUrl = new ArrayList<String>();
	List<String> ktPitcherUrl = new ArrayList<String>();
	List<String> ktHitterUrl = new ArrayList<String>();
	List<String> hhPitcherUrl = new ArrayList<String>();
	List<String> hhHitterUrl = new ArrayList<String>();
	List<String> kiaPitcherUrl = new ArrayList<String>();
	List<String> kiaHitterUrl = new ArrayList<String>();
	List<String> doosanPitcherUrl = new ArrayList<String>();
	List<String> doosanHitterUrl = new ArrayList<String>();
	List<String> samsungPitcherUrl = new ArrayList<String>();
	List<String> samsungHitterUrl = new ArrayList<String>();

	List<Pitchers> ssgPitchers = new ArrayList<Pitchers>();
	List<Hitter> ssgHitters = new ArrayList<Hitter>();
	List<Pitchers> lottePitchers = new ArrayList<Pitchers>();
	List<Hitter> lotteHitters = new ArrayList<Hitter>();
	List<Pitchers> kiwoomPitchers = new ArrayList<>();
	List<Hitter> kiwoomHitters = new ArrayList<>();
	List<Pitchers> ncPitchers = new ArrayList<>();
	List<Hitter> ncHitters = new ArrayList<>();
	List<Pitchers> lgPitchers = new ArrayList<>();
	List<Hitter> lgHitters = new ArrayList<>();
	List<Pitchers> ktPitchers = new ArrayList<>();
	List<Hitter> ktHitters = new ArrayList<>();
	List<Pitchers> hhPitchers = new ArrayList<>();
	List<Hitter> hhHitters = new ArrayList<>();
	List<Pitchers> kiaPitchers = new ArrayList<Pitchers>();
	List<Hitter> kiaHitters = new ArrayList<Hitter>();
	List<Pitchers> doosanPitchers = new ArrayList<Pitchers>();
	List<Hitter> doosanHitters = new ArrayList<Hitter>();
	List<Pitchers> samsungPitchers = new ArrayList<Pitchers>();
	List<Hitter> samsungHitters = new ArrayList<Hitter>();

	String name = null;
	String team = null;
	String position = "????";
	String era = null;
	String win = null;
	String lose = null;
	String save = null;
	String kk = null;
	String inningInt = null;
	String inningFlo = null;
	String avg = null;
	String rbi = null;
	String homerun = null;
	String hits = null;
	String ops = null;
	String pa = null;

	public void addSsgPitcherUrl(String url) {
		ssgPitcherUrl.add(url);
	}

	public void addSsgHitterUrl(String url) {
		ssgHitterUrl.add(url);
	}

	public void addLottePitcherUrl(String url) {
		lottePitcherUrl.add(url);
	}

	public void addLotteHitterUrl(String url) {
		lotteHitterUrl.add(url);
	}

	public void addkiwoonPitcherUrl(String url) {
		kiwoomPitcherUrl.add(url);
	}

	public void addkiwoonHitterUrl(String url) {
		kiwoomHitterUrl.add(url);
	}

	public void addNcPitcherUrl(String url) {
		ncPitcherUrl.add(url);
	}

	public void addNcHitterUrl(String url) {
		ncHitterUrl.add(url);
	}

	public void addLgPitcherUrl(String url) {
		lgPitcherUrl.add(url);
	}

	public void addLgHitterUrl(String url) {
		lgHitterUrl.add(url);
	}

	public void addKtPitcherUrl(String url) {
		ktPitcherUrl.add(url);
	}

	public void addKtHitterUrl(String url) {
		ktHitterUrl.add(url);
	}

	public void addHhPitcherUrl(String url) {
		hhPitcherUrl.add(url);
	}

	public void addHhHitterUrl(String url) {
		hhHitterUrl.add(url);
	}

	public void addkiaPitcherUrl(String url) {
		kiaPitcherUrl.add(url);
	}

	public void addkiaHitterUrl(String url) {
		kiaHitterUrl.add(url);
	}

	public void adddoosanPitcherUrl(String url) {
		doosanPitcherUrl.add(url);
	}

	public void adddoosanHitterUrl(String url) {
		doosanHitterUrl.add(url);
	}

	public void addsamsungPitcherUrl(String url) {
		samsungPitcherUrl.add(url);
	}

	public void addsamsungHitterUrl(String url) {
		samsungHitterUrl.add(url);
	}

	public void pitcherWork(List<Pitchers> teamPitcher, List<String> teamUrl, String teams) throws IOException {

		for (int i = 0; i < teamUrl.size(); i++) {
			Document doc = Jsoup.connect(teamUrl.get(i)).timeout(7500).get();

			Elements el = doc.getElementsByAttributeValue("class", "tbl-type02 tbl-type02-pd0 mb35");
			Elements el2 = doc.getElementsByAttributeValue("class", "odd");
			Elements el3 = doc.getElementsByAttributeValue("class", "tbl-type02 mb35");
			Elements el4 = doc.getElementsByAttributeValue("colspan", "17");

			String[] firstSplit = el.get(0).text().split(" ");
			String[] secondSplit = el2.get(0).text().split(" ");
			String[] thirdSplit = el3.get(0).text().split(" ");

			try {

				name = secondSplit[1];

				if (!el4.text().equals("?????? ????????.")) {
					team = firstSplit[17];
				} else {
					team = teams;
				}

				position = "????";

				if (!el4.text().equals("?????? ????????.")) {
					era = firstSplit[18];
				} else {
					era = "0.00";
				}

				if (!el4.text().equals("?????? ????????.")) {
					win = firstSplit[22];
				} else {
					win = "0";
				}

				if (!el4.text().equals("?????? ????????.")) {
					lose = firstSplit[23];
				} else {
					lose = "0";
				}

				if (!el4.text().equals("?????? ????????.")) {
					save = firstSplit[24];
				} else {
					save = "0";
				}

				if (!el4.text().equals("?????? ????????.")) {
					kk = thirdSplit[17];
				} else {
					kk = "0";
				}

				if (!el4.text().equals("?????? ????????.")) {
					inningInt = firstSplit[29];
				} else {
					inningInt = "0";
				}

				if (firstSplit[30].contains("/")) {
					inningFlo = "." + firstSplit[30].charAt(0);
				} else {
					inningFlo = ".0";
				}
				try {
					teamPitcher.add(new Pitchers(name, team, position, era, win, lose, save, kk, inningInt, inningFlo));
				} catch (Exception e) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void hitterWork(List<Hitter> teamHitter, List<String> teamUrl, String teams) throws IOException {
		for (int i = 0; i < teamUrl.size(); i++) {

			Document doc = Jsoup.connect(teamUrl.get(i)).timeout(7500).get();

			Elements el = doc.getElementsByAttributeValue("class", "tbl-type02 mb10");
			Elements el2 = doc.getElementsByAttributeValue("class", "odd");
			Elements el3 = doc.getElementsByAttributeValue("class", "tbl-type02 mb35");
			Elements el4 = doc.getElementsByAttributeValue("id",
					"cphContents_cphContents_cphContents_playerProfile_lblPosition");

			Elements el5 = doc.getElementsByAttributeValue("colspan", "16");

			String[] firstSplit = el.get(0).text().split(" ");
			String[] secondSplit = el2.get(0).text().split(" ");
			String[] thirdSplit = el3.get(0).text().split(" ");

			try {

				name = secondSplit[1];

				if (!el5.text().equals("?????? ????????.")) {
					team = firstSplit[16];
				} else {
					team = teams;
				}

				position = el4.get(0).text();

				if (!el5.text().equals("?????? ????????.")) {
					avg = firstSplit[17];
				} else {
					avg = "0.000";
				}

				if (!el5.text().equals("?????? ????????.")) {
					rbi = firstSplit[27];
				} else {
					rbi = "0";
				}

				if (!el5.text().equals("?????? ????????.")) {
					homerun = firstSplit[25];
				} else {
					homerun = "0";
				}

				if (!el5.text().equals("?????? ????????.")) {
					hits = firstSplit[22];
				} else {
					hits = "0";
				}

				if (!el5.text().equals("?????? ????????.")) {
					ops = thirdSplit[23];
				} else {
					ops = "0";
				}

				if (!el5.text().equals("?????? ????????.")) {
					pa = firstSplit[19];
				} else {
					pa = "0";
				}

				try {
					teamHitter.add(new Hitter(name, team, position, avg, rbi, homerun, hits, ops, pa));
				} catch (Exception e) {
					e.printStackTrace();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public List<Pitchers> ssgPitcherC() throws IOException {
		String url = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=72523";
		ssgPitcherUrl.add(url);// ??????
		String url2 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51867";
		ssgPitcherUrl.add(url2);// ??????
		String url3 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77829";
		ssgPitcherUrl.add(url3);// ??????
		String url4 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52844";
		ssgPitcherUrl.add(url4);// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76430");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68830");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65411");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79847");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65343");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73211");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52833");// ????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52808");// ????????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62869");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64893");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52864");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50812");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60841");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64896");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61895");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62937");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52873");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50859");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52867"); // ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64861"); // ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52868"); // ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60768");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51895");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52809");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66858");// ??????\
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65058");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51897"); // ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68848"); // ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51809");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64768");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68856");// ??????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51863");// ????
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68092");// ??????

		pitcherWork(ssgPitchers, ssgPitcherUrl, "SSG");

		return ssgPitchers;
	}

	public List<Hitter> ssgHitterC() throws IOException {

		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51868");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71837");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69810"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62864"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50848"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76802"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64499"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52806");// ????????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67893"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52804"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66864"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61743");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60558"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64890");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67807"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63440"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65869");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76812"); // ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68869");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50820");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51865");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69802");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68805");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75847");// ????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76267");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50854");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62884");// ????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51817");// ??????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52827");// ????
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62895");// ??????

		hitterWork(ssgHitters, ssgHitterUrl, "SSG");

		return ssgHitters;
	}

	public List<Pitchers> lottePitcherC() throws IOException {

		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79358");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63543");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65522");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78536");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68585");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68589");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50573");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62528");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64596");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51516");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51586");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67539");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67454");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65643");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66556");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64021");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52528");// ????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50563");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63512");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69539");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51594");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50558");// ??????????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52557");// ????????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50036");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52530");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68529");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64565");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68556");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51546");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65067");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79545");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52558");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68036");// ????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64718");// ??????
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50556");// ??????

		pitcherWork(lottePitchers, lottePitcherUrl, "????");

		return lottePitchers;
	}

	public List<Hitter> lotteHitterC() throws IOException {

		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65515");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65514");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69517");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69500");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67504");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52514");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65506");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66749");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51551");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52547");// ????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62802");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64501");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69508");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64022");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79608");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52591");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71564");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69453");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68504");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68507");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78513");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68518");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60523");// ????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52516");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64717");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63895");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68362");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68525");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52568");// ??????
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50500");// ??????

		hitterWork(lotteHitters, lotteHitterUrl, "????");

		return lotteHitters;
	}

	public List<Pitchers> kiwoomPitcherC() throws IOException {

		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50393");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50360");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66018");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67828");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51301");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69367");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67391");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65392");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51393");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62360");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52394");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60336");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50397");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66305");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69328");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65348");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52391");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68341");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52308");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67365");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61268");// ????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67360");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69343");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69399");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52397");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67603");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64051");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50354");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51359");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78148");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63342");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69360");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52330");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65320");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64350");// ??????
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62363");// ??????

		pitcherWork(kiwoomPitchers, kiwoomPitcherUrl, "????");

		return kiwoomPitchers;
	}

	public List<Hitter> kiwoomHitterC() throws IOException {

		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64906");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68346");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51303");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65898");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69306");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63920");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64984");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67304");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51344");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50357");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64657");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52348");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68302");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68305");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65357");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50312");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68330");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69366");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67363");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74163");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51307");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67341");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51302");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79456");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64340");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65586");// ??????
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52366");// ????????

		hitterWork(kiwoomHitters, kiwoomHitterUrl, "????");

		return kiwoomHitters;
	}

	public List<Pitchers> ncPitcherC() throws IOException {

		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61295");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65933");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60339");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52995");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68928");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68900");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51901");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67954");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50992");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67956");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52950");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69940");// ????????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65949");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52994");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63914");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69962");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68902");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61411");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76118");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62929");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51948");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77211");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65964");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60263");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52901");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63959");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52902");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69969");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50995");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52903");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51967");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69991");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68639");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51994");// ??????
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62655");// ??????

		pitcherWork(ncPitchers, ncPitcherUrl, "NC");

		return ncPitchers;
	}

	public List<Hitter> ncHitterC() throws IOException {

		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63963");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65462");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67900");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60288");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51907");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50902");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62931");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66965");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52904");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79215");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64944");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62907");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74465");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66928");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69995");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77532");// ?????? ????????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76232");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68904");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51996");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63905");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76849");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67993");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78361");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76720");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61869");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63450");// ????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67905");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65905");// ??????
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66963");// ??????

		hitterWork(ncHitters, ncHitterUrl, "NC");

		return ncHitters;
	}

	public List<Pitchers> lgPitcherC() throws IOException {
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51143");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67119");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60337");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68130");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50157");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52140");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75867");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63103");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63145");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65109");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67143");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51111");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73801");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67116");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50126");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65117");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61145");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69134");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69108");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52168");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67164");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61891");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69113");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61101");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69159");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52149");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76650");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65241");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79140");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62146");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52163");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69103");// ????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52145");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63248");// ??????
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52119");// ??????

		pitcherWork(lgPitchers, lgPitcherUrl, "LG");

		return lgPitchers;
	}

	public List<Hitter> lgHitterC() throws IOException {

		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52125");// ????????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69100");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66112");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77564");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66162");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76290");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66113");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52112");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69102");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68119");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72133");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64100");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62415");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78168");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50150");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68110");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65207");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65115");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79109");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61102");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60566");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51100");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68106");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52154");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61186");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78135");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67123");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79150");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79192");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65157");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64101");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77243");// ??????
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66108");// ??????

		hitterWork(lgHitters, lgHitterUrl, "LG");

		return lgHitters;

	}

	public List<Pitchers> ktPitcherC() throws IOException {

		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64001");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65048");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65062");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66064");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50040");// ??????????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60559");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52060");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65516");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52043");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50030");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51057");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68067");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64017");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73738");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64041");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65056");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52063");// ????????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67048");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69035");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65057");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68896");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75340");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67045");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64047");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65060");// ????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51060");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69032");// ????????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78517");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52065");// ??????
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51058");// ??????

		pitcherWork(ktPitchers, ktPitcherUrl, "KT");

		return ktPitchers;
	}

	public List<Hitter> ktHitterC() throws IOException {

		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68050");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68069");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69055");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51003");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64004");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64014");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66462");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62558");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65040");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52025");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67063");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50007");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64007");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=73113");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75125");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68003");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64166");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64012");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62556");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64006");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67006");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52001");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52009");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68002");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64504");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51013");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50092");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66702");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78548");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64115");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51009");// ????????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65096");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68089");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64868");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50054");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50096");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67005");// ??????
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76313");// ??????

		hitterWork(ktHitters, ktHitterUrl, "KT");

		return ktHitters;

	}

	public List<Pitchers> hhPitcherC() throws IOException {

		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50705");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51713");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51715");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67711");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65764");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65769");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66741");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63765");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50720");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52707");// ????????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64029");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52701");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67703");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69762");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52731");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61156");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60140");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50758");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63464");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69213");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63961");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65616");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68797");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52715");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63749");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62611");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79764");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77318");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74857");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51796");// ????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65707");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51722");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50815");// ????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52720");// ????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50726");// ??????
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64760");// ??????

		pitcherWork(hhPitchers, hhPitcherUrl, "????");

		return hhPitchers;
	}

	public List<Hitter> hhHitterC() throws IOException {

		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66710");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52769");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69702");// ????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66715");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66704");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63704");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69737");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50709");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69727");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51767");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67760");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69766");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52765");// ????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65703");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64266");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68700");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66657");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60343");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50704");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51762");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63700");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51706");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66706");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51764");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68743");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78288");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52712");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62700");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69706");// ??????
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52764");// ??????

		hitterWork(hhHitters, hhHitterUrl, "????");

		return hhHitters;

	}

	public List<Pitchers> kiaPitcherC() throws IOException {

		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52659");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67604");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63628");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69745");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68616");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68659");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64580");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63894");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52661");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69516");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66630");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66660");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52637");// ????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52645");// ????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51645");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63638");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67646");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66663");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77637");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67640");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68619");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51668");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51648");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65665");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62754");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51665");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50641");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69645");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63950");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66609");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50662");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50650");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52639");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52606");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61666");// ??????
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78247");// ??????

		pitcherWork(kiaPitchers, kiaPitcherUrl, "KIA");

		return kiaPitchers;
	}

	public List<Hitter> kiaHitterC() throws IOException {

		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61700");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61353");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51640");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66614");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52605");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67610");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78603");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65653");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62947");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78629");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66615");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62234");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79365");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50657");// ????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67609");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64646");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52630");// ??????????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66662");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69636");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68614");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52667");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63260");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67644");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64560");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66833");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62893");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65464");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72443");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63722");// ??????
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65610");// ??????

		hitterWork(kiaHitters, kiaHitterUrl, "KIA");

		return kiaHitters;

	}

	public List<Pitchers> doosanPitcherC() throws IOException {

		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68220");// ????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50203");// ????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77263");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51294");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51230");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67246");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60181");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69104");// ????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67259");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51257");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63292");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68249");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50205");// ????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65639");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67266");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52257");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52234");// ????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66160");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62242");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52202");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64805");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66291");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52295");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76329");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62951");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78352");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74513");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52203");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64202");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68242");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50296");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51264");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67263");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68260");// ??????
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61643");// ??????

		pitcherWork(doosanPitchers, doosanPitcherUrl, "????");

		return doosanPitchers;
	}

	public List<Hitter> doosanHitterC() throws IOException {

		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51298");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62244");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67202");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64011");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63202");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64213");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63123");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68204");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65269");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74206");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64468");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66203");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69203");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52294");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64086");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51203");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64153");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77248");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68205");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69209");// ??????????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79240");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66207");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62925");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51269");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69238");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52267");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63257");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78224");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69207");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50202");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50293");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52299");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79231");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66209");// ??????
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66233");// ??????

		hitterWork(doosanHitters, doosanHitterUrl, "????");

		return doosanHitters;

	}

	public List<Pitchers> samsungPitcherC() throws IOException {

		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64498");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61365");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52460");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66492");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68403");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62920");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67419");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65844");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61396");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50411");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77446");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50404");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52457");// ????????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52440");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68415");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75421");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73117");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69446");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63960");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50464");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60146");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51454");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63492");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51460");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66493");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77927");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66451");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68501");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50449");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51462");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65496");// ??????
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50441");// ??????

		pitcherWork(samsungPitchers, samsungPitcherUrl, "????");

		return samsungPitchers;
	}

	public List<Hitter> samsungHitterC() throws IOException {

		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74540");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65412");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64793");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65132");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78122");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69428");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52400");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64610");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68407");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51403");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79402");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52430");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50458");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64407");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66406");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78756");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75334");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66409");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75566");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52415");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68466");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69416");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61197");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62404");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66838");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67449");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63435");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52424");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61404");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51417");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69418");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64469");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68463");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51468");// ??????
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51463");// ??????

		hitterWork(samsungHitters, samsungHitterUrl, "????");

		return samsungHitters;

	}

}
