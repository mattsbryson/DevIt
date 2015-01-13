
public class awardTypes 
{

	public awardTypes(int awardTypesID, String type) {
		super();
		this.awardTypesID = awardTypesID;
		this.type = type;
	} 
	
	public int getAwardTypesID() {
		return awardTypesID;
	}
	public void setAwardTypesID(int awardTypesID) {
		this.awardTypesID = awardTypesID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	int awardTypesID;
	String type;
	
}
