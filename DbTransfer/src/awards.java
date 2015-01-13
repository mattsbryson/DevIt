
public class awards 
{
	
	public awards(int awardsID, int movieID, int roleID, int year, int awardTypeID, int won)
	{
		this.awardsID = awardsID;
		this.movieID = movieID;
		this.roleID = roleID;
		this.year = year;
		this.awardTypeID = awardTypeID;
		this.won = won;
	}
	
	
	public int getAwardsID() {
		return awardsID;
	}

	public void setAwardsID(int awardsID) {
		this.awardsID = awardsID;
	}

	public int getMovieID() {
		return movieID;
	}

	public void setMovieID(int movieID) {
		this.movieID = movieID;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getAwardTypeID() {
		return awardTypeID;
	}

	public void setAwardTypeID(int awardTypeID) {
		this.awardTypeID = awardTypeID;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}


	int awardsID;
	int movieID;
	int roleID;
	int year;
	int awardTypeID;
	int won;
	
}
