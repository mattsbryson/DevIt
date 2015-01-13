
public class genre {

	public genre(int genreID, String name) {
		super();
		this.genreID = genreID;
		this.name = name;
	}
	
	
	
	public int getGenreID() {
		return genreID;
	}
	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	int genreID; 
	String name;
}
