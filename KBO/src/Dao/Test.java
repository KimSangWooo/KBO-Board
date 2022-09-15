package Dao;

import java.sql.SQLException;
import java.util.List;

import TeamsData.Team;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		TeamDao dao = new TeamDao();
		List<Team> list = dao.allTeams();

		System.out.println(list);
	}

}
