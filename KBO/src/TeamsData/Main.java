package TeamsData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

		TeamDao dao = new TeamDao();
		dao.deleteT();
		dao.insertTeam();

	}

}
