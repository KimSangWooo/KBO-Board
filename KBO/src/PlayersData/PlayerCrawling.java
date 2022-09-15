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
	String position = "����";
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

				if (!el4.text().equals("����� �����ϴ�.")) {
					team = firstSplit[17];
				} else {
					team = teams;
				}

				position = "����";

				if (!el4.text().equals("����� �����ϴ�.")) {
					era = firstSplit[18];
				} else {
					era = "0.00";
				}

				if (!el4.text().equals("����� �����ϴ�.")) {
					win = firstSplit[22];
				} else {
					win = "0";
				}

				if (!el4.text().equals("����� �����ϴ�.")) {
					lose = firstSplit[23];
				} else {
					lose = "0";
				}

				if (!el4.text().equals("����� �����ϴ�.")) {
					save = firstSplit[24];
				} else {
					save = "0";
				}

				if (!el4.text().equals("����� �����ϴ�.")) {
					kk = thirdSplit[17];
				} else {
					kk = "0";
				}

				if (!el4.text().equals("����� �����ϴ�.")) {
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

				if (!el5.text().equals("����� �����ϴ�.")) {
					team = firstSplit[16];
				} else {
					team = teams;
				}

				position = el4.get(0).text();

				if (!el5.text().equals("����� �����ϴ�.")) {
					avg = firstSplit[17];
				} else {
					avg = "0.000";
				}

				if (!el5.text().equals("����� �����ϴ�.")) {
					rbi = firstSplit[27];
				} else {
					rbi = "0";
				}

				if (!el5.text().equals("����� �����ϴ�.")) {
					homerun = firstSplit[25];
				} else {
					homerun = "0";
				}

				if (!el5.text().equals("����� �����ϴ�.")) {
					hits = firstSplit[22];
				} else {
					hits = "0";
				}

				if (!el5.text().equals("����� �����ϴ�.")) {
					ops = thirdSplit[23];
				} else {
					ops = "0";
				}

				if (!el5.text().equals("����� �����ϴ�.")) {
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
		ssgPitcherUrl.add(url);// ��ȿ��
		String url2 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51867";
		ssgPitcherUrl.add(url2);// ��ǿ�
		String url3 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77829";
		ssgPitcherUrl.add(url3);// �豤��
		String url4 = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52844";
		ssgPitcherUrl.add(url4);// �赵��
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76430");// ����
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68830");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65411");// ���ֿ�
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79847");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65343");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73211");// �����
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52833");// ���
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52808");// �𸮸���
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62869");// ���¿�
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64893");// �ڹ�ȣ
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52864");// �ڻ���
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50812");// �ڽ���
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60841");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64896");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61895");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62937");// ���翵
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52873");// �����
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50859");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52867"); // ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64861"); // �̰ǿ�
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52868"); // �̱��
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60768");// ���¾�
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51895");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52809");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66858");// ������\
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65058");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51897"); // ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68848"); // ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51809");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64768");// ������
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68856");// �ֹ���
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51863");// ��Ʈ
		addSsgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68092");// �ѵμ�

		pitcherWork(ssgPitchers, ssgPitcherUrl, "SSG");

		return ssgPitchers;
	}

	public List<Hitter> ssgHitterC() throws IOException {

		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51868");// �����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71837");// �谭��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69810"); // ��Գ�
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62864"); // ��ν�
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50848"); // �輺��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76802"); // �輺��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64499"); // ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52806");// �󰡷���
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67893"); // �ڼ���
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52804"); // ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66864"); // �Ȼ���
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61743");// ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60558"); // ���°�
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64890");// ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67807"); // ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63440"); // �����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65869");// ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76812"); // �����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68869");// �����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50820");// ���ǻ�
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51865");// ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69802");// �ְ��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68805");// �ֻ��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75847");// ����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76267");// ����ȯ
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50854");// ������
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62884");// ����
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51817");// �߽ż�
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52827");// ũ��
		addSsgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62895");// ������

		hitterWork(ssgHitters, ssgHitterUrl, "SSG");

		return ssgHitters;
	}

	public List<Pitchers> lottePitcherC() throws IOException {

		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79358");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63543");// ���¹�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65522");// �谭��
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78536");// ����
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68585");// �赵��
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68589");// �赿��
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50573");// ��α�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62528");// �����
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64596");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51516");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51586");// ��â��
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67539");// ���վ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67454");// ����Ź
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65643");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66556");// �ڼ���
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64021");// �ڼ���
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52528");// ����
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50563");// �����
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63512");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69539");// ���ؿ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51594");// ���翵
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50558");// ��Ʈ���ϸ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52557");// ����ũ��
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50036");// �̰���
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52530");// �̹μ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68529");// �̽���
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64565");// ���κ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68556");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51546");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65067");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79545");// ����ȣ
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52558");// ������
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68036");// �ְ�
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64718");// �ֿ�ȯ
		addLottePitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50556");// ���ؿ�

		pitcherWork(lottePitchers, lottePitcherUrl, "�Ե�");

		return lottePitchers;
	}

	public List<Hitter> lotteHitterC() throws IOException {

		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65515");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65514");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69517");// ��¹�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69500");// ��μ�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67504");// ��μ�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52514");// �輼��
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65506");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66749");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51551");// ���¿�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52547");// ����
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62802");// �ڽ¿�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64501");// �輺��
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69508");// �ſ��
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64022");// ���߿�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79608");// ��ġȫ
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52591");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=71564");// �̴�ȣ
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69453");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68504");// ��ȣ��
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68507");// ��μ�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78513");// ���ؿ�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68518");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60523");// ����
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52516");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64717");// ���ÿ�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63895");// �ֹ���
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68362");// ������
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68525");// �ѵ���
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52568");// ���¾�
		addLotteHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50500");// Ȳ����

		hitterWork(lotteHitters, lotteHitterUrl, "�Ե�");

		return lotteHitters;
	}

	public List<Pitchers> kiwoomPitcherC() throws IOException {

		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50393");// �赿��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50360");// �赿��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66018");// �輱��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67828");// �輺��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51301");// �輺��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69367");// ���ι�
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67391");// �����
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65392");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51393");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62360");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52394");// �����
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60336");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50397");// �ڰ���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66305");// �ڽ���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69328");// ���ּ�
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65348");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52391");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68341");// �ȿ���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52308");// ���÷�
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67365");// �����
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61268");// ����
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67360");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69343");// ��Ű��
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69399");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52397");// �̸���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67603");// �̽�ȣ
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64051");// �̿���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50354");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51359");// ���翵
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78148");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63342");// �����
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69360");// ������
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52330");// �ֽ¿�
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65320");// �ֿ���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64350");// �Ͽ���
		addkiwoonPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62363");// ������

		pitcherWork(kiwoomPitchers, kiwoomPitcherUrl, "Ű��");

		return kiwoomPitchers;
	}

	public List<Hitter> kiwoomHitterC() throws IOException {

		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64906");// ���α�
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68346");// ���ȯ
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51303");// ��þ�
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65898");// �����
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69306");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63920");// ���ؿ�
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64984");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67304");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51344");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50357");// ����ȫ
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64657");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52348");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68302");// ����ȣ
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68305");// �����
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65357");// �ۼ���
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50312");// ���ؿ�
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68330");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69366");// �̸��
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67363");// �̺���
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74163");// �̿��
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51307");// ����ȫ
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67341");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51302");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79456");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64340");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65586");// ������
		addkiwoonHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52366");// Ǫ�̱פ�

		hitterWork(kiwoomHitters, kiwoomHitterUrl, "Ű��");

		return kiwoomHitters;
	}

	public List<Pitchers> ncPitcherC() throws IOException {

		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61295");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65933");// ��â��
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60339");// �����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52995");// ����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68928");// �����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68900");// �迵��
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51901");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67954");// ����ȣ
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50992");// ���°�
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67956");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52950");// �����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69940");// ��ģ��Ű
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65949");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52994");// �ڵ���
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63914");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69962");// �۸��
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68902");// �Ź���
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61411");// ��â��
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76118");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62929");// �̹�ȣ
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51948");// �̿���
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77211");// �̿���
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65964");// �̿켮
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60263");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52901");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63959");// ����ȣ
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52902");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69969");// �����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50995");// ������
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52903");// ���μ�
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51967");// �Ľ���
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69991");// ���ؼ�
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68639");// ���ؿ�
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51994");// �����
		addNcPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62655");// ȫ����

		pitcherWork(ncPitchers, ncPitcherUrl, "NC");

		return ncPitchers;
	}

	public List<Hitter> ncHitterC() throws IOException {

		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63963");// ����
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65462");// ���ȯ
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67900");// �����
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60288");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51907");// ���ֿ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50902");// ���Ѻ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62931");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66965");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52904");// ��Ƽ��
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79215");// �ڰǿ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64944");// �ڴ��
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62907");// �ڹο�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74465");// �ڼ���
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66928");// ���ؿ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69995");// ��ȣö
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77532");// �վƼ� �ФФФ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76232");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68904");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51996");// ���¾�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63905");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76849");// �̸��
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67993");// �����
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78361");// ���μ�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76720");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61869");// ������
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63450");// ����
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67905");// õ��ȯ
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65905");// �ֽ¹�
		addNcHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66963");// �ֿ���

		hitterWork(ncHitters, ncHitterUrl, "NC");

		return ncHitters;
	}

	public List<Pitchers> lgPitcherC() throws IOException {
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51143");// ��ȿ��
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67119");// ��켮
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60337");// �����
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68130");// �迵��
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50157");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52140");// ���ֿ�
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75867");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63103");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63145");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65109");// �����
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67143");// ���ֿ�
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51111");// �۽±�
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73801");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67116");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50126");// �̹�ȣ
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65117");// �̻��
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61145");// �̿���
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69134");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69108");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52168");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67164");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61891");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69113");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61101");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69159");// ���쿵
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52149");// ������
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76650");// ���ؼ�
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65241");// ä����
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79140");// �ֵ�ȯ
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62146");// �ּ���
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52163");// �ֿ���
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69103");// �̸�
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52145");// �÷���
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63248");// �Դ���
		addLgPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52119");// ������

		pitcherWork(lgPitchers, lgPitcherUrl, "LG");

		return lgPitchers;
	}

	public List<Hitter> lgHitterC() throws IOException {

		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52125");// �����þ�
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69100");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66112");// ��⿬
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77564");// ��μ�
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66162");// ���ּ�
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76290");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66113");// ��ȣ��
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52112");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69102");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68119");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72133");// �����
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64100");// �����
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62415");// ���ع�
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78168");// ����â
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50150");// ��ȣ��
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68110");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65207");// �Ź���
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65115");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79109");// ����ȯ
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61102");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60566");// �̻�ȣ
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51100");// �̿���
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68106");// �����
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52154");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61186");// ��õ��
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78135");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67123");// ����ȣ
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79150");// ������
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79192");// ä����
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65157");// �ֹ�â
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64101");// �Ѽ���
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77243");// �㵵ȯ
		addLgHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66108");// ȫâ��

		hitterWork(lgHitters, lgHitterUrl, "LG");

		return lgHitters;

	}

	public List<Pitchers> ktPitcherC() throws IOException {

		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64001");// ��ǥ
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65048");// ��μ�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65062");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66064");// ���¿�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50040");// �������̳�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60559");// �ڽÿ�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52060");// �ڿ���
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65516");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52043");// ���ڹ�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50030");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51057");// �Ź���
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68067");// �ź���
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64017");// �����
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73738");// �ȿ���
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64041");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65056");// �����
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52063");// �̻󤷿�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67048");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69035");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65057");// ��â��
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68896");// ��äȣ
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75340");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67045");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64047");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65060");// �ֱ�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51060");// ����
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69032");// ���ٽ�
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78517");// ����ȣ
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52065");// ������
		addKtPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51058");// ������

		pitcherWork(ktPitchers, ktPitcherUrl, "KT");

		return ktPitchers;
	}

	public List<Hitter> ktHitterC() throws IOException {

		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68050");// ����ȣ
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68069");// ���
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69055");// ����
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51003");// �ǵ���
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64004");// �����
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64014");// �躴��
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66462");// �輺��
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62558");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65040");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52025");// ���
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67063");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50007");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64007");// ����ö
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=73113");// �ڰ��
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75125");// �ں�ȣ
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68003");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64166");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64012");// �۹μ�
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62556");// �ź���
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64006");// �ɿ���
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67006");// ��ġ��
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52001");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52009");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68002");// �����
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64504");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51013");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50092");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66702");// �̽ÿ�
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78548");// �强��
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64115");// ���ؿ�
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51009");// ��������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65096");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68089");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64868");// ����ȣ
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50054");// õ��ȣ
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50096");// ������
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67005");// ȫ����
		addKtHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=76313");// Ȳ���

		hitterWork(ktHitters, ktHitterUrl, "KT");

		return ktHitters;

	}

	public List<Pitchers> hhPitcherC() throws IOException {

		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50705");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51713");// ��Կ�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51715");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67711");// ���Ź
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65764");// ��ο�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65769");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66741");// ���翵
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63765");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50720");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52707");// ��̷���
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64029");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52701");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67703");// �ڻ��
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69762");// ����ö
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52731");// ���ؿ�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61156");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60140");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50758");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63464");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69213");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63961");// ��ȣ��
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65616");// �̹ο�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68797");// �̽°�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52715");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63749");// ����ȣ
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62611");// ���ؼ�
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=79764");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77318");// ���ȯ
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74857");// �����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51796");// ����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65707");// ������
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51722");// ī����
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50815");// ŷ��
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52720");// ���
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50726");// �ѽ���
		addHhPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64760");// Ȳ����

		pitcherWork(hhPitchers, hhPitcherUrl, "��ȭ");

		return hhPitchers;
	}

	public List<Hitter> hhHitterC() throws IOException {

		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66710");// �����
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52769");// �Ǳ���
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69702");// ���
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66715");// ����ȯ
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66704");// ���¿�
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63704");// �����
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69737");// ���ȯ
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50709");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69727");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51767");// ��ȣ��
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67760");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69766");// ���ΰ�
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52765");// ����
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65703");// �̵���
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64266");// �̼���
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68700");// �̿���
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66657");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=60343");// ����â
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50704");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51762");// �����
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63700");// ���ȣ
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51706");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66706");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51764");// ���α�
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68743");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78288");// ������
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52712");// ��ũ��
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62700");// ���ּ�
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69706");// ���ȸ
		addHhHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52764");// ���μ�

		hitterWork(hhHitters, hhHitterUrl, "��ȭ");

		return hhHitters;

	}

	public List<Pitchers> kiaPitcherC() throws IOException {

		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52659");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67604");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63628");// ��â
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69745");// �赵��
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68616");// ��¹�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68659");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64580");// ���翭
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63894");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52661");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69516");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66630");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66660");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52637");// �
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52645");// �δ�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51645");// �ڰǿ�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63638");// ����ǥ
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67646");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66663");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77637");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67640");// ����ö
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68619");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51668");// �̽���
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51648");// ���Ǹ�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65665");// ���ؿ�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62754");// �ӱ⿵
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51665");// ��α�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50641");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69645");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63950");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66609");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50662");// ���ؿ�
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50650");// �ֿ���
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52639");// ������
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52606");// �ĳ��
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61666");// �ѽ���
		addkiaPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78247");// ȫ���

		pitcherWork(kiaPitchers, kiaPitcherUrl, "KIA");

		return kiaPitchers;
	}

	public List<Hitter> kiaHitterC() throws IOException {

		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61700");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61353");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51640");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66614");// ��Լ�
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52605");// �赵��
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67610");// �輮ȯ
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78603");// �輱��
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65653");// ��ȣ��
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62947");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78629");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66615");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62234");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79365");// �ڵ���
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50657");// �ڹ�
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67609");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64646");// ����ȣ
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52630");// ��ũ���׽�
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66662");// �Ź���
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69636");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68614");// ����ȯ
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52667");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63260");// �̿켺
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67644");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64560");// ��â��
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66833");// �Ӽ���
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62893");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65464");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=72443");// ������
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63722");// �ѽ���
		addkiaHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65610");// Ȳ����

		hitterWork(kiaHitters, kiaHitterUrl, "KIA");

		return kiaHitters;

	}

	public List<Pitchers> doosanPitcherC() throws IOException {

		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68220");// ����
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50203");// ����
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77263");// �谭��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51294");// �赵��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51230");// �赿��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67246");// ����
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60181");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69104");// ��ȣ
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67259");// �����
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51257");// �̶���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63292");// �ڼ���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68249");// �ڽ���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50205");// �ڿ�
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65639");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67266");// ��ġ��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52257");// �귣��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52234");// ��Ź
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66160");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62242");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52202");// ����ȣ
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64805");// �̽���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66291");// �̿���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52295");// �̿���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=76329");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62951");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=78352");// ��â��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=74513");// �����
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52203");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64202");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68242");// ��ö��
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50296");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51264");// �ֽ¿�
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67263");// �ֿ���
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68260");// ������
		adddoosanPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61643");// ȫ����

		pitcherWork(doosanPitchers, doosanPitcherUrl, "�λ�");

		return doosanPitchers;
	}

	public List<Hitter> doosanHitterC() throws IOException {

		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51298");// �ڼ���
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62244");// �ڻ���
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67202");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64011");// �Ƚ���
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63202");// �����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64213");// �ֿ���
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63123");// ����ȣ
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68204");// �ǹμ�
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65269");// �����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74206");// ����ȣ
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64468");// �ڰ��
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66203");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69203");// �۽�ȯ
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52294");// �Ź�ö
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64086");// �ż���
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51203");// ���缮
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64153");// �缮ȯ
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=77248");// ���Ļ�
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68205");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69209");// �丣������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79240");// ����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66207");// Ȳ����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62925");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51269");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69238");// �����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52267");// �赿��
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63257");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78224");// ����ȯ
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69207");// ���±�
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50202");// �ȱǼ�
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50293");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52299");// �����
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79231");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66209");// ������
		adddoosanHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66233");// ȫ��ȣ

		hitterWork(doosanHitters, doosanHitterUrl, "�λ�");

		return doosanHitters;

	}

	public List<Pitchers> samsungPitcherC() throws IOException {

		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=64498");// ���ع�
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61365");// ����
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52460");// �輭��
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66492");// �����
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68403");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=62920");// �뼺ȣ
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=67419");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65844");// �ڼ���
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=61396");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50411");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77446");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50404");// ��ĳ��
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52457");// ���Ʒ���
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=52440");// ����ȯ
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68415");// ��â��
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=75421");// ����ȯ
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=73117");// ��Թ�
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=69446");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63960");// �̻��
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50464");// �̽¹�
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=60146");// �̽���
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51454");// �̽���
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=63492");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51460");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66493");// �Ӵ���
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=77927");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=66451");// ���濬
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=68501");// ���ϴ�
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50449");// ������
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=51462");// ȫ����
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=65496");// ȫ����
		addsamsungPitcherUrl("https://www.koreabaseball.com/Record/Player/PitcherDetail/Basic.aspx?playerId=50441");// Ȳ����

		pitcherWork(samsungPitchers, samsungPitcherUrl, "�Ｚ");

		return samsungPitchers;
	}

	public List<Hitter> samsungHitterC() throws IOException {

		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=74540");// ����ȣ
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65412");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64793");// ��μ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=65132");// ���缺
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78122");// ���±�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69428");// �̺���
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52400");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64610");// ���ѿ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68407");// ���α�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51403");// �赿��
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=79402");// ����
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52430");// �迵��
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=50458");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64407");// ��ȣ��
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66406");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=78756");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75334");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66409");// �̼���
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=75566");// �̿���
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52415");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68466");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69416");// ���ؽ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61197");// �ֿ���
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=62404");// ���ڿ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=66838");// �赿��
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=67449");// �輺��
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=63435");// �輺ǥ
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=52424");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=61404");// �����
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51417");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=69418");// �ڽ±�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=64469");// ���ؼ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=68463");// ������
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51468");// ���ѿ�
		addsamsungHitterUrl("https://www.koreabaseball.com/Record/Player/HitterDetail/Basic.aspx?playerId=51463");// �Ƿ���

		hitterWork(samsungHitters, samsungHitterUrl, "�Ｚ");

		return samsungHitters;

	}

}
