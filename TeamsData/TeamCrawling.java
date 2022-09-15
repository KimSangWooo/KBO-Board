package TeamsData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class TeamCrawling {

	public List<Team> teamC() throws IOException {
		List<Team> teams = new ArrayList<Team>();
		Document doc = Jsoup.connect("https://www.koreabaseball.com/TeamRank/TeamRank.aspx").timeout(7500).get();

		Elements el = doc.getElementsByAttributeValue("class", "tData");

		String[] firstSplit = el.get(0).text().split(" ");

		String f1Rank = firstSplit[12];
		String f1Team = firstSplit[13];
		String f1Games = firstSplit[14];
		String f1Wins = firstSplit[15];
		String f1Loses = firstSplit[16];
		String f1Draws = firstSplit[17];
		String f1Rate = firstSplit[18];
		String f1Terms = firstSplit[19];
		teams.add(new Team(f1Team, f1Rank, f1Games, f1Wins, f1Loses, f1Draws, f1Rate, f1Terms));

		String s2Rank = firstSplit[24];
		String s2Team = firstSplit[25];
		String s2Games = firstSplit[26];
		String s2Wins = firstSplit[27];
		String s2Loses = firstSplit[28];
		String s2Draws = firstSplit[29];
		String s2Rate = firstSplit[30];
		String s2Terms = firstSplit[31];
		teams.add(new Team(s2Team, s2Rank, s2Games, s2Wins, s2Loses, s2Draws, s2Rate, s2Terms));

		String t3Rank = firstSplit[36];
		String t3Team = firstSplit[37];
		String t3Games = firstSplit[38];
		String t3Wins = firstSplit[39];
		String t3Loses = firstSplit[40];
		String t3Draws = firstSplit[41];
		String t3Rate = firstSplit[42];
		String t3Terms = firstSplit[43];
		teams.add(new Team(t3Team, t3Rank, t3Games, t3Wins, t3Loses, t3Draws, t3Rate, t3Terms));

		String f4Rank = firstSplit[48];
		String f4Team = firstSplit[49];
		String f4Games = firstSplit[50];
		String f4Wins = firstSplit[51];
		String f4Loses = firstSplit[52];
		String f4Draws = firstSplit[53];
		String f4Rate = firstSplit[54];
		String f4Terms = firstSplit[55];
		teams.add(new Team(f4Team, f4Rank, f4Games, f4Wins, f4Loses, f4Draws, f4Rate, f4Terms));

		String f5Rank = firstSplit[60];
		String f5Team = firstSplit[61];
		String f5Games = firstSplit[62];
		String f5Wins = firstSplit[63];
		String f5Loses = firstSplit[64];
		String f5Draws = firstSplit[65];
		String f5Rate = firstSplit[66];
		String f5Terms = firstSplit[67];
		teams.add(new Team(f5Team, f5Rank, f5Games, f5Wins, f5Loses, f5Draws, f5Rate, f5Terms));

		String s6Rank = firstSplit[72];
		String s6Team = firstSplit[73];
		String s6Games = firstSplit[74];
		String s6Wins = firstSplit[75];
		String s6Loses = firstSplit[76];
		String s6Draws = firstSplit[77];
		String s6Rate = firstSplit[78];
		String s6Terms = firstSplit[79];
		teams.add(new Team(s6Team, s6Rank, s6Games, s6Wins, s6Loses, s6Draws, s6Rate, s6Terms));

		String s7Rank = firstSplit[84];
		String s7Team = firstSplit[85];
		String s7Games = firstSplit[86];
		String s7Wins = firstSplit[87];
		String s7Loses = firstSplit[88];
		String s7Draws = firstSplit[89];
		String s7Rate = firstSplit[90];
		String s7Terms = firstSplit[91];
		teams.add(new Team(s7Team, s7Rank, s7Games, s7Wins, s7Loses, s7Draws, s7Rate, s7Terms));

		String e8Rank = firstSplit[96];
		String e8Team = firstSplit[97];
		String e8Games = firstSplit[98];
		String e8Wins = firstSplit[99];
		String e8Loses = firstSplit[100];
		String e8Draws = firstSplit[101];
		String e8Rate = firstSplit[102];
		String e8Terms = firstSplit[103];
		teams.add(new Team(e8Team, e8Rank, e8Games, e8Wins, e8Loses, e8Draws, e8Rate, e8Terms));

		String n9Rank = firstSplit[108];
		String n9Team = firstSplit[109];
		String n9Games = firstSplit[110];
		String n9Wins = firstSplit[111];
		String n9Loses = firstSplit[112];
		String n9Draws = firstSplit[113];
		String n9Rate = firstSplit[114];
		String n9Terms = firstSplit[115];
		teams.add(new Team(n9Team, n9Rank, n9Games, n9Wins, n9Loses, n9Draws, n9Rate, n9Terms));

		String t10Rank = firstSplit[120];
		String t10Team = firstSplit[121];
		String t10Games = firstSplit[122];
		String t10Wins = firstSplit[123];
		String t10Loses = firstSplit[124];
		String t10Draws = firstSplit[125];
		String t10Rate = firstSplit[126];
		String t10Terms = firstSplit[127];
		teams.add(new Team(t10Team, t10Rank, t10Games, t10Wins, t10Loses, t10Draws, t10Rate, t10Terms));

		System.out.println(teams.get(0).getName());
		System.out.println(teams.get(0).getRank());
		System.out.println(teams.get(0).getGames());
		System.out.println(teams.get(0).getWins());
		System.out.println(teams.get(0).getLoses());
		System.out.println(teams.get(0).getDraws());
		System.out.println(teams.get(0).getRate());
		System.out.println(teams.get(0).getGameterms());

		return teams;
	}

}
