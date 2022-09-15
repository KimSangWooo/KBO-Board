package ResultData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import TeamsData.Team;

public class ResultCrawling {
	String result = null;
	String homescore = null;
	String hometeam = null;
	String awayscore = null;
	String awayteam = null;


	List<Result> totalresult = new ArrayList<Result>();

	public void resultWork(int k) throws IOException {

		Document doc = Jsoup.connect(
				"https://www.google.com/search?q=kbo+%EC%96%B4%EC%A0%9C%EA%B2%BD%EA%B8%B0&ei=FbEOY-iQH5Ca2roP96-56Ak&ved=0ahUKEwio79ns7u_5AhUQjVYBHfdXDp0Q4dUDCA8&uact=5&oq=kbo+%EC%96%B4%EC%A0%9C%EA%B2%BD%EA%B8%B0&gs_lcp=Cgdnd3Mtd2l6EAMyBQghEKABOgcIABBHELADOgQIABBDOgQIABAeOgYIABAeEA86BggAEB4QCDoGCAAQHhAFOggIABAeEA8QCDoJCAAQQxBGEP0BOgsIABCABBCxAxCDAToLCC4QgAQQsQMQgwE6BQgAEIAEOgcIABCABBAKOgkIABANEEYQ_QFKBAhBGABKBAhGGABQngVY1htg9x1oA3ABeAKAAbABiAGsDZIBBDAuMTGYAQCgAQHIAQrAAQE&sclient=gws-wiz")
				.timeout(7500).get();
		
		Elements el = doc.getElementsByAttributeValue("class", "KAIX8d");
		String[] split = el.get(k).text().split(" ");

		for (int i = 0; i < split.length; i++) {
			if (split[0].equals("종료")) {
				result = "경기종료";
				awayscore = split[3];
				awayteam = split[4];
				homescore = split[5];
				hometeam = split[6];
			} else {
				result = "우천취소";
				awayscore = " ";
				awayteam = split[3];
				homescore = " ";
				hometeam = split[4];
			}
		}

		totalresult.add(new Result(hometeam, awayteam, result, homescore, awayscore));
	}
	
	public List<Result> resultC() throws IOException {
		
		resultWork(0);
		resultWork(1);
		resultWork(2);
		resultWork(3);
		resultWork(4);
		
		return totalresult;
	}
}
