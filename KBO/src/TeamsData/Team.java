package TeamsData;

public class Team {
	private String name;
	private String rank;
	private String games;
	private String wins;
	private String loses;
	private String draws;
	private String rate;
	private String gameterms;

	public Team(String name, String rank, String games, String wins, String loses, String draws, String rate, String gameterms) {
		super();
		this.name = name;
		this.rank = rank;
		this.games = games;
		this.wins = wins;
		this.loses = loses;
		this.draws = draws;
		this.rate = rate;
		this.gameterms = gameterms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getGames() {
		return games;
	}

	public void setGames(String games) {
		this.games = games;
	}

	public String getWins() {
		return wins;
	}

	public void setWins(String wins) {
		this.wins = wins;
	}

	public String getLoses() {
		return loses;
	}

	public void setLoses(String loses) {
		this.loses = loses;
	}

	public String getDraws() {
		return draws;
	}

	public void setDraws(String draws) {
		this.draws = draws;
	}

	public String getGameterms() {
		return gameterms;
	}

	public void setGameterms(String gameterms) {
		this.gameterms = gameterms;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", rank=" + rank + ", games=" + games + ", wins=" + wins + ", loses=" + loses
				+ ", draws=" + draws + ", rate=" + rate + ", gameterms=" + gameterms + "]";
	}
}
