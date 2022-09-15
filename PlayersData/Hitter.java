package PlayersData;

public class Hitter {
	private String name;
	private String team;
	private String position;
	private String avg;
	private String rbi;
	private String homerun;
	private String hits;
	private String ops;
	private String pa;

	public Hitter(String name, String team, String position, String avg, String rbi, String homerun, String hits,
			String ops, String pa) {
		super();
		this.name = name;
		this.team = team;
		this.position = position;
		this.avg = avg;
		this.rbi = rbi;
		this.homerun = homerun;
		this.hits = hits;
		this.ops = ops;
		this.pa = pa;
	}
	
	public Hitter(String name, String team, String avg) {
		super();
		this.name = name;
		this.team = team;
		this.avg = avg;
	
	}
	
	public Hitter(int t, String name, String team, String homerun) {
		super();
		t = 1;
		this.name = name;
		this.team = team;
		this.homerun = homerun;
	
	}
	
	public Hitter(char t, String name, String team, String ops) {
		super();
		t = 'v';
		this.name = name;
		this.team = team;
		this.ops = ops;
	
	}
	
	public Hitter(double t, String name, String team, String hits) {
		super();
		t = 0.000 ;
		this.name = name;
		this.team = team;
		this.hits = hits;
	
	}
	
	public Hitter(String t, String name, String team, String rbi) {
		super();
		t = "¶§¶­" ;
		this.name = name;
		this.team = team;
		this.rbi = rbi;
	
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
	public String getAvg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getRbi() {
		return rbi;
	}
	public void setRbi(String rbi) {
		this.rbi = rbi;
	}
	public String getHomerun() {
		return homerun;
	}
	public void setHomerun(String homerun) {
		this.homerun = homerun;
	}
	public String getHits() {
		return hits;
	}
	public void setHits(String hits) {
		this.hits = hits;
	}
	public String getOps() {
		return ops;
	}
	public void setOps(String ops) {
		this.ops = ops;
	}
	public String getPa() {
		return pa;
	}
	public void setPa(String pa) {
		this.pa = pa;
	}
	
	

}
