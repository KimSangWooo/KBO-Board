package ResultData;

public class Result {
	private String hometeam;
	private String awayteam;
	private String result;
	private String homescore;
	private String awayscore;
	public Result(String hometeam, String awayteam, String result, String homescore, String awayscore) {
		super();
		this.hometeam = hometeam;
		this.awayteam = awayteam;
		this.result = result;
		this.homescore = homescore;
		this.awayscore = awayscore;
	}
	public String getHometeam() {
		return hometeam;
	}
	public void setHometeam(String hometeam) {
		this.hometeam = hometeam;
	}
	public String getAwayteam() {
		return awayteam;
	}
	public void setAwayteam(String awayteam) {
		this.awayteam = awayteam;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getHomescore() {
		return homescore;
	}
	public void setHomescore(String homescore) {
		this.homescore = homescore;
	}
	public String getAwayscore() {
		return awayscore;
	}
	public void setAwayscore(String awayscore) {
		this.awayscore = awayscore;
	}
	
	

}
