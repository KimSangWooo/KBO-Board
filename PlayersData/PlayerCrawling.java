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
	String position = "투수";
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

				if (!el4.text().equals("기록이 없습니다.")) {
					team = firstSplit[17];
				} else {
					team = teams;
				}

				position = "투수";

				if (!el4.text().equals("기록이 없습니다.")) {
					era = firstSplit[18];
				} else {
					era = "0.00";
				}

				if (!el4.text().equals("기록이 없습니다.")) {
					win = firstSplit[22];
				} else {
					win = "0";
				}

				if (!el4.text().equals("기록이 없습니다.")) {
					lose = firstSplit[23];
				} else {
					lose = "0";
				}

				if (!el4.text().equals("기록이 없습니다.")) {
					save = firstSplit[24];
				} else {
					save = "0";
				}

				if (!el4.text().equals("기록이 없습니다.")) {
					kk = thirdSplit[17];
				} else {
					kk = "0";
				}

				if (!el4.text().equals("기록이 없습니다.")) {
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

				if (!el5.text().equals("기록이 없습니다.")) {
					team = firstSplit[16];
				} else {
					team = teams;
				}

				position = el4.get(0).text();

				if (!el5.text().equals("기록이 없습니다.")) {
					avg = firstSplit[17];
				} else {
					avg = "0.000";
				}

				if (!el5.text().equals("기록이 없습니다.")) {
					rbi = firstSplit[27];
				} else {
					rbi = "0";
				}

				if (!el5.text().equals("기록이 없습니다.")) {
					homerun = firstSplit[25];
				} else {
					homerun = "0";
				}

				if (!el5.text().equals("기록이 없습니다.")) {
					hits = firstSplit[22];
				} else {
					hits = "0";
				}

				if (!el5.text().equals("기록이 없습니다.")) {
					ops = thirdSplit[23];
				} else {
					ops = "0";
				}

				if (!el5.text().equals("기록이 없습니다.")) {
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
		ssgPitcherUrl.add(url);// 고효준
		String url2 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51867";
		ssgPitcherUrl.add(url2);// 김건우
		String url3 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77829";
		ssgPitcherUrl.add(url3);// 김광현
		String url4 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52844";
		ssgPitcherUrl.add(url4);// 김도현
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76430");// 김상수
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68830");// 김정우
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65411");// 김주온
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79847");// 김태훈
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65343");// 김택형
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73211");// 노경은
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52833");// 노바
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52808");// 모리만도
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62869");// 문승원
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64893");// 박민호
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52864");// 박상후
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50812");// 박시후
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60841");// 박종훈
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64896");// 서동민
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61895");// 서진용
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62937");// 신재영
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52873");// 신헌민
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50859");// 오원석
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52867"); // 윤태현
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64861"); // 이건욱
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52868"); // 이기순
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60768");// 이태양
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51895");// 장지훈
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52809");// 전영준
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66858");// 정동윤\
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65058");// 정성곤
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51897"); // 조병현
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68848"); // 조성휸
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51809");// 조요한
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64768");// 조이현
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68856");// 최민준
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51863");// 폰트
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68092");// 한두솔

		pitcherWork(ssgPitchers, ssgPitcherUrl, "SSG");

		return ssgPitchers;
	}

	public List<Hitter> ssgHitterC() throws IOException {

		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51868");// 고명준
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71837");// 김강민
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69810"); // 김규남
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62864"); // 김민식
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50848"); // 김성민
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76802"); // 김성현
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64499"); // 김재현
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52806");// 라가레스
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67893"); // 박성한
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52804"); // 석정우
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66864"); // 안상현
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61743");// 오준혁
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60558"); // 오태곤
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64890");// 유서준
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67807"); // 이정범
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63440"); // 이흥련
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65869");// 이현석
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76812"); // 이재원
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68869");// 전경원
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50820");// 전의산
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51865");// 조형우
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69802");// 최경모
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68805");// 최상민
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75847");// 최정
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76267");// 최주환
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50854");// 최지훈
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62884");// 최항
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51817");// 추신수
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52827");// 크론
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62895");// 한유섬

		hitterWork(ssgHitters, ssgHitterUrl, "SSG");

		return ssgHitters;
	}

	public List<Pitchers> lottePitcherC() throws IOException {

		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79358");// 강윤구
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63543");// 구승민
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65522");// 김강현
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78536");// 김대우
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68585");// 김도규
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68589");// 김동우
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50573");// 김민기
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62528");// 김원중
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64596");// 김유영
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51516");// 김진욱
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51586");// 김창훈
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67539");// 나균안
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67454");// 나원탁
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65643");// 문경찬
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66556");// 박선우
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64021");// 박세웅
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52528");// 반즈
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50563");// 박재민
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63512");// 박진형
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69539");// 서준원
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51594");// 송재영
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50558");// 스트레일리
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52557");// 스파크맨
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50036");// 이강준
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52530");// 이민석
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68529");// 이승헌
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64565");// 이인복
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68556");// 정성종
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51546");// 정우준
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65067");// 조무근
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79545");// 진명호
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52558");// 진승현
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68036");// 최건
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64718");// 최영환
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50556");// 최준용

		pitcherWork(lottePitchers, lottePitcherUrl, "롯데");

		return lottePitchers;
	}

	public List<Hitter> lotteHitterC() throws IOException {

		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65515");// 강로한
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65514");// 강태율
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69517");// 고승민
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69500");// 김민수
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67504");// 김민수
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52514");// 김세민
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65506");// 김재유
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66749");// 김주현
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51551");// 나승엽
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52547");// 렉스
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62802");// 박승욱
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64501");// 배성근
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69508");// 신용수
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64022");// 안중열
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79608");// 안치홍
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52591");// 윤동희
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71564");// 이대호
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69453");// 이학주
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68504");// 이호연
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68507");// 장두성
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78513");// 전준우
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68518");// 정보근
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60523");// 정훈
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52516");// 조세진
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64717");// 지시완
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63895");// 최민재
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68362");// 추재현
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68525");// 한동희
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52568");// 한태양
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50500");// 황성빈

		hitterWork(lotteHitters, lotteHitterUrl, "롯데");

		return lotteHitters;
	}

	public List<Pitchers> kiwoomPitcherC() throws IOException {

		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50393");// 김동욱
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50360");// 김동혁
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66018");// 김선기
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67828");// 김성민
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51301");// 김성진
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69367");// 김인범
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67391");// 김재웅
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65392");// 김정인
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51393");// 김준형
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62360");// 김태훈
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52394");// 노운현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60336");// 문성현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50397");// 박관진
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66305");// 박승주
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69328");// 박주성
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65348");// 박주현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52391");// 송정인
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68341");// 안우진
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52308");// 애플러
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67365");// 양기현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61268");// 양현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67360");// 오윤성
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69343");// 요키시
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69399");// 윤정현
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52397");// 이명종
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67603");// 이승호
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64051");// 이영준
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50354");// 이종민
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51359");// 장재영
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78148");// 정찬헌
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63342");// 조상우
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69360");// 조영건
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52330");// 주승우
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65320");// 최원태
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64350");// 하영민
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62363");// 한현희

		pitcherWork(kiwoomPitchers, kiwoomPitcherUrl, "키움");

		return kiwoomPitchers;
	}

	public List<Hitter> kiwoomHitterC() throws IOException {

		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64906");// 강민국
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68346");// 김수환
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51303");// 김시앙
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65898");// 김웅빈
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69306");// 김주형
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63920");// 김준완
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64984");// 김태진
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67304");// 김혜성
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51344");// 김휘집
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50357");// 박주홍
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64657");// 박준태
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52348");// 박찬혁
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68302");// 배현호
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68305");// 변상권
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65357");// 송성문
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50312");// 신준우
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68330");// 예진원
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69366");// 이명기
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67363");// 이병규
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74163");// 이용규
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51307");// 이재홍
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67341");// 이정후
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51302");// 이주형
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79456");// 이지영
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64340");// 임지열
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65586");// 전병우
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52366");// 푸이그ㄹ

		hitterWork(kiwoomHitters, kiwoomHitterUrl, "키움");

		return kiwoomHitters;
	}

	public List<Pitchers> ncPitcherC() throws IOException {

		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61295");// 강동연
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65933");// 구창모
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60339");// 김건태
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52995");// 김녹원
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68928");// 김시훈
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68900");// 김영규
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51901");// 김진우
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67954");// 김진호
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50992");// 김태경
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67956");// 김태현
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52950");// 더모디
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69940");// 루친스키
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65949");// 류진욱
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52994");// 박동수
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63914");// 손정욱
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69962");// 송명기
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68902");// 신민혁
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61411");// 심창민
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76118");// 원종현
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62929");// 이민호
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51948");// 이용준
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77211");// 이용찬
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65964");// 이우석
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60263");// 이재학
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52901");// 이주형
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63959");// 임정호
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52902");// 임지민
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69969");// 전사민
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50995");// 정구범
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52903");// 조민석
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51967");// 파슨스
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69991");// 하준수
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68639");// 하준영
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51994");// 한재승
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62655");// 홍성민

		pitcherWork(ncPitchers, ncPitcherUrl, "NC");

		return ncPitchers;
	}

	public List<Hitter> ncHitterC() throws IOException {

		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63963");// 권희동
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65462");// 김기환
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67900");// 김수윤
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60288");// 김응민
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51907");// 김주원
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50902");// 김한별
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62931");// 노진혁
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66965");// 도태훈
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52904");// 마티니
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79215");// 박건우
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64944");// 박대온
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62907");// 박민우
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74465");// 박석민
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66928");// 박준영
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69995");// 서호철
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77532");// 손아섭 ㅠㅠㅠㅠ
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76232");// 양의지
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68904");// 오영수
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51996");// 오태양
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63905");// 윤형준
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76849");// 이명기
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67993");// 이재용
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78361");// 전민수
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76720");// 정범모
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61869");// 정진기
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63450");// 정현
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67905");// 천재환
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65905");// 최승민
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66963");// 최우재

		hitterWork(ncHitters, ncHitterUrl, "NC");

		return ncHitters;
	}

	public List<Pitchers> lgPitcherC() throws IOException {
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51143");// 강효종
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67119");// 고우석
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60337");// 김대유
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68130");// 김영준
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50157");// 김윤식
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52140");// 김주완
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75867");// 김진성
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63103");// 류원석
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63145");// 배재준
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65109");// 백승현
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67143");// 손주영
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51111");// 송승기
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73801");// 송은범
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67116");// 오석주
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50126");// 이민호
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65117");// 이상규
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61145");// 이우찬
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69134");// 이정용
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69108");// 이지강
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52168");// 이지훈
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67164");// 이찬혁
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61891");// 임정우
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69113");// 임준형
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61101");// 임찬규
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69159");// 정우영
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52149");// 조원태
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76650");// 진해수
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65241");// 채지선
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79140");// 최동환
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62146");// 최성훈
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52163");// 최용하
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69103");// 켈리
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52145");// 플럿코
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63248");// 함덕주
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52119");// 허준혁

		pitcherWork(lgPitchers, lgPitcherUrl, "LG");

		return lgPitchers;
	}

	public List<Hitter> lgHitterC() throws IOException {

		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52125");// 가르시아
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69100");// 구본혁
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66112");// 김기연
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77564");// 김민성
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66162");// 김주성
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76290");// 김현수
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66113");// 김호은
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52112");// 루이즈
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69102");// 문보경
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68119");// 문성주
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72133");// 방용택
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64100");// 박재욱
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62415");// 박해민
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78168");// 스근창
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50150");// 손호영
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68110");// 송찬의
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65207");// 신민재
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65115");// 안익훈
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79109");// 오지환
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61102");// 유강남
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60566");// 이상호
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51100");// 이영빈
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68106");// 이재원
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52154");// 이주헌
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61186");// 이천웅
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78135");// 이형종
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67123");// 전준호
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79150");// 정주현
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79192");// 채은성
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65157");// 최민창
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64101");// 한석현
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77243");// 허도환
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66108");// 홍창기

		hitterWork(lgHitters, lgHitterUrl, "LG");

		return lgHitters;

	}

	public List<Pitchers> ktPitcherC() throws IOException {

		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64001");// 고영표
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65048");// 김민수
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65062");// 김재윤
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66064");// 김태오
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50040");// 데스파이네
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60559");// 박시영
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52060");// 박영현
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65516");// 배제성
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52043");// 벤자민
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50030");// 소형준
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51057");// 신범준
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68067");// 신병률
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64017");// 심재민
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73738");// 안영명
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64041");// 안현준
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65056");// 엄상백
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52063");// 이상ㅇ우
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67048");// 이정현
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69035");// 이정훈
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65057");// 이창재
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68896");// 이채호
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75340");// 전유수
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67045");// 조병욱
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64047");// 조현우
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65060");// 주권
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51060");// 지명성
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69032");// 쿠에바스
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78517");// 하준호
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52065");// 한지웅
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51058");// 한차현

		pitcherWork(ktPitchers, ktPitcherUrl, "KT");

		return ktPitchers;
	}

	public List<Hitter> ktHitterC() throws IOException {

		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68050");// 강백호
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68069");// 고명성
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69055");// 고성민
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51003");// 권동진
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64004");// 김민혁
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64014");// 김병희
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66462");// 김성훈
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62558");// 김준태
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65040");// 김태훈
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52025");// 라모스
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67063");// 문상인
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50007");// 문상준
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64007");// 문상철
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=73113");// 박경수
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75125");// 박병호
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68003");// 박준혁
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64166");// 배정대
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64012");// 송민섭
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62556");// 신본기
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64006");// 심우준
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67006");// 안치영
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52001");// 안현민
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52009");// 알포드
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68002");// 양승혁
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64504");// 오윤석
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51013");// 유줁규
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50092");// 윤준혁
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66702");// 이시원
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78548");// 장성우
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64115");// 장준원
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51009");// 전진영ㄴ
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65096");// 정주후
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68089");// 조대현
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64868");// 조용호
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50054");// 천성호
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50096");// 한지용
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67005");// 홍현빈
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76313");// 황재균

		hitterWork(ktHitters, ktHitterUrl, "KT");

		return ktHitters;

	}

	public List<Pitchers> hhPitcherC() throws IOException {

		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50705");// 강재민
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51713");// 김규연
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51715");// 김기중
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67711");// 김기탁
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65764");// 김민우
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65769");// 김범수
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66741");// 김재영
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63765");// 김종수
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50720");// 남지민
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52707");// 라미레즈
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64029");// 류희운
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52701");// 문동주
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67703");// 박상원
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69762");// 박윤철
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52731");// 박준영
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61156");// 송윤준
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60140");// 신정락
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50758");// 신지후
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63464");// 윤대경
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69213");// 윤스컴
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63961");// 윤호솔
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65616");// 이민우
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68797");// 이승관
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52715");// 이재민
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63749");// 이충호
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62611");// 임준섭
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79764");// 장민재
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77318");// 장시환
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74857");// 정우람
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51796");// 조은
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65707");// 주현상
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51722");// 카펜터
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50815");// 킹험
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52720");// 페냐
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50726");// 한승주
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64760");// 황영국

		pitcherWork(hhPitchers, hhPitcherUrl, "한화");

		return hhPitchers;
	}

	public List<Hitter> hhHitterC() throws IOException {

		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66710");// 강상원
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52769");// 권광민
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69702");// 김건
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66715");// 김인환
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66704");// 김태연
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63704");// 노수광
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69737");// 노시환
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50709");// 박정현
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69727");// 변우혁
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51767");// 송호정
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67760");// 원혁재
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69766");// 유로결
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52765");// 유민
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65703");// 이도윤
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64266");// 이성곤
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68700");// 이원석
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66657");// 이진영
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60343");// 이해창
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50704");// 임종찬
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51762");// 장규현
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63700");// 장운호
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51706");// 장지승
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66706");// 장진혁
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51764");// 정민규
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68743");// 정은원
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78288");// 최재훈
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52712");// 터크먼
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62700");// 하주석
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69706");// 허관회
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52764");// 허인서

		hitterWork(hhHitters, hhHitterUrl, "한화");

		return hhHitters;

	}

	public List<Pitchers> kiaPitcherC() throws IOException {

		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52659");// 강병우
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67604");// 강이준
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63628");// 고영창
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69745");// 김도현
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68616");// 김승범
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68659");// 김유신
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64580");// 김재열
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63894");// 김정빈
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52661");// 김찬민
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69516");// 김현수
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66630");// 김현준
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66660");// 남하준
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52637");// 놀린
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52645");// 로니
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51645");// 박건우
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63638");// 박준표
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67646");// 박진태
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66663");// 서덕원
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77637");// 양현종
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67640");// 유승철
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68619");// 윤중현
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51668");// 이승재
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51648");// 이의리
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65665");// 이준영
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62754");// 임기영
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51665");// 장민기
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50641");// 장재혁
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69645");// 장지수
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63950");// 장현식
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66609");// 전상현
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50662");// 정해영
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50650");// 최용준
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52639");// 최지민
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52606");// 파노니
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61666");// 한승혁
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78247");// 홍상삼

		pitcherWork(kiaPitchers, kiaPitcherUrl, "KIA");

		return kiaPitchers;
	}

	public List<Hitter> kiaHitterC() throws IOException {

		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61700");// 강경학
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61353");// 고종욱
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51640");// 권혁경
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66614");// 김규성
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52605");// 김도영
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67610");// 김석환
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78603");// 김선빈
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65653");// 김호령
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62947");// 나성범
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78629");// 나지완
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66615");// 류승현
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62234");// 류지혁
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79365");// 박동원
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50657");// 박민
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67609");// 박정우
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64646");// 박찬호
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52630");// 소크라테스
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66662");// 신범수
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69636");// 오선우
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68614");// 오정환
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52667");// 윤도현
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63260");// 이우성
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67644");// 이정훈
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64560");// 이창진
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66833");// 임석진
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62893");// 최정민
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65464");// 최정용
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72443");// 최형우
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63722");// 한승택
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65610");// 황대인

		hitterWork(kiaHitters, kiaHitterUrl, "KIA");

		return kiaHitters;

	}

	public List<Pitchers> doosanPitcherC() throws IOException {

		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68220");// 곽빈
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50203");// 권휘
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77263");// 김강률
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51294");// 김도윤
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51230");// 김동주
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67246");// 김명신
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60181");// 김지용
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69104");// 남호
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67259");// 문대원
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51257");// 미란다
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63292");// 박소준
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68249");// 박신지
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50205");// 박웅
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65639");// 박정수
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67266");// 박치국
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52257");// 브랜든
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52234");// 스탁
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66160");// 유재유
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62242");// 윤명준
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52202");// 유태호
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64805");// 이승진
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66291");// 이영하
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52295");// 이원재
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76329");// 이현승
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62951");// 이형범
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78352");// 임창민
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74513");// 장롤코
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52203");// 정유석
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64202");// 정은재
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68242");// 정철원
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50296");// 조제영
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51264");// 최승용
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67263");// 최원준
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68260");// 현도훈
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61643");// 홍건희

		pitcherWork(doosanPitchers, doosanPitcherUrl, "두산");

		return doosanPitchers;
	}

	public List<Hitter> doosanHitterC() throws IOException {

		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51298");// 박성제
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62244");// 박새혁
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67202");// 박유연
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64011");// 안승한
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63202");// 장승현
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64213");// 최용제
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63123");// 강승호
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68204");// 권민석
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65269");// 김민혁
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74206");// 김재호
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64468");// 박계범
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66203");// 서예일
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69203");// 송승환
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52294");// 신민철
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64086");// 신성현
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51203");// 안재석
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64153");// 양석환
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77248");// 오식빵
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68205");// 전민재
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69209");// 페르난데스
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79240");// 허경민
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66207");// 황경태
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62925");// 강진성
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51269");// 강현구
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69238");// 김대한
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52267");// 김동준
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63257");// 김인태
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78224");// 약재환
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69207");// 김태근
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50202");// 안권수
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50293");// 양찬열
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52299");// 전희범
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79231");// 정수빈
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66209");// 조수행
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66233");// 홍성호

		hitterWork(doosanHitters, doosanHitterUrl, "두산");

		return doosanHitters;

	}

	public List<Pitchers> samsungPitcherC() throws IOException {

		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64498");// 구준범
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61365");// 김대우
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52460");// 김서준
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66492");// 김승현
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68403");// 김윤수
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62920");// 노성호
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67419");// 문용익
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65844");// 박세웅
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61396");// 박정준
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50411");// 박주혁
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77446");// 백정현
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50404");// 뷰캐넌
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52457");// 수아레즈
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52440");// 신정환
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68415");// 양창섭
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75421");// 오승환
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73117");// 우규민
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69446");// 원태인
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63960");// 이상민
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50464");// 이승민
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60146");// 이승현
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51454");// 이승현
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63492");// 이재익
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51460");// 이재희
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66493");// 임대한
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77927");// 장필준
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66451");// 최충연
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68501");// 최하늘
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50449");// 허윤동
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51462");// 홍무원
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65496");// 홍정우
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50441");// 황동재

		pitcherWork(samsungPitchers, samsungPitcherUrl, "삼성");

		return samsungPitchers;
	}

	public List<Hitter> samsungHitterC() throws IOException {

		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74540");// 망민호
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65412");// 권정웅
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64793");// 김민수
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65132");// 김재성
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78122");// 김태군
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69428");// 이병헌
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52400");// 차동영
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64610");// 강한울
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68407");// 공민규
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51403");// 김동진
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79402");// 김상수
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52430");// 김영웅
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50458");// 김지찬
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64407");// 김호재
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66406");// 안주형
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78756");// 오선진
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75334");// 오재일
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66409");// 이성규
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75566");// 이원석
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52415");// 이재현
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68466");// 이태훈
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69416");// 이해승
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61197");// 최영진
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62404");// 구자욱
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66838");// 김동엽
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67449");// 김성윤
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63435");// 김성표
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52424");// 김재혁
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61404");// 김헌곤
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51417");// 김현준
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69418");// 박승규
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64469");// 송준석
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68463");// 윤정빈
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51468");// 주한울
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51463");// 피렐라

		hitterWork(samsungHitters, samsungHitterUrl, "삼성");

		return samsungHitters;

	}

}
