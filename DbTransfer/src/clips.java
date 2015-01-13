import java.sql.Date;


public class clips {

	
	
	public clips(int clipID, int active, int movieID, String title,
			double difficulity, int length, Date created, int played,
			Date lastPlayed, int audio) {
		super();
		this.clipID = clipID;
		this.active = active;
		this.movieID = movieID;
		this.title = title;
		this.difficulity = difficulity;
		this.length = length;
		this.created = created;
		this.played = played;
		this.lastPlayed = lastPlayed;
		this.audio = audio;
	}
	
	
	
	public int getClipID() {
		return clipID;
	}
	public void setClipID(int clipID) {
		this.clipID = clipID;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public int getMovieID() {
		return movieID;
	}
	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDifficulity() {
		return difficulity;
	}
	public void setDifficulity(double difficulity) {
		this.difficulity = difficulity;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public Date getLastPlayed() {
		return lastPlayed;
	}
	public void setLastPlayed(Date lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	public int getAudio() {
		return audio;
	}
	public void setAudio(int audio) {
		this.audio = audio;
	}



	int clipID;
	int active;
	int movieID;
	String title; 
	double difficulity; 
	int length;
	Date created; 
	int played; 
	Date lastPlayed;
	int audio;
}
