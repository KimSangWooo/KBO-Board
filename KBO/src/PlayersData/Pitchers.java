package PlayersData;

public class Pitchers {
	private String name = null;
	private String team = null;
	private String position = null;
	private String era = null;
	private String wins = null;
	private String loses = null;
	private String saves = null;
	private String kk = null;
	private String inningInt = null;
	private String inningFlo = null;

	public Pitchers(String name, String team, String position, String era, String wins, String loses, String saves,
			String kk, String inningInt, String inningFlo) {
		super();
		this.name = name;
		this.team = team;
		this.position = position;
		this.era = era;
		this.wins = wins;
		this.loses = loses;
		this.saves = saves;
		this.kk = kk;
		this.inningInt = inningInt;
		this.inningFlo = inningFlo;
	}
	
	public Pitchers(String name, String team, String era) {
		super();
		this.name = name;
		this.team = team;
		this.era = era;
	}
	
	public Pitchers(int i, String name, String team, String wins) {
		super();
		i = 0;
		this.name = name;
		this.team = team;
		this.wins = wins;
	}
	
	public Pitchers(char c, String name, String team, String kk) {
		super();
		c = 'd';
		this.name = name;
		this.team = team;
		this.kk = kk;
	}
	
	public Pitchers(String v, String name, String team, String save) {
		super();
		v = "ธÞที";
		this.name = name;
		this.team = team;
		this.saves = save;
	}
	
	public Pitchers(int i, String name, String team, String inningInt, String inningFlo) {
		super();
		i = 0;
		this.name = name;
		this.team = team;
		this.inningInt = inningInt;
		this.inningFlo = inningFlo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEra() {
		return era;
	}

	public void setEra(String era) {
		this.era = era;
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

	public String getSaves() {
		return saves;
	}

	public void setSaves(String saves) {
		this.saves = saves;
	}

	public String getKk() {
		return kk;
	}

	public void setKk(String kk) {
		this.kk = kk;
	}

	public String getInningInt() {
		return inningInt;
	}

	public void setInningInt(String inning) {
		this.inningInt = inning;
	}

	public String getInningFlo() {
		return inningFlo;
	}

	public void setInningFlo(String inningFlo) {
		this.inningFlo = inningFlo;
	}

}
