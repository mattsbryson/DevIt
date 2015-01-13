
public class clipOptions {

	
	
	
	public clipOptions(int clipOptionsID, int clipID, int option1, int option2,
			int option3, int option4, int correct) {
		super();
		this.clipOptionsID = clipOptionsID;
		this.clipID = clipID;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correct = correct;
	}
	
	public int getClipOptionsID() {
		return clipOptionsID;
	}
	public void setClipOptionsID(int clipOptionsID) {
		this.clipOptionsID = clipOptionsID;
	}
	public int getClipID() {
		return clipID;
	}
	public void setClipID(int clipID) {
		this.clipID = clipID;
	}
	public int getOption1() {
		return option1;
	}
	public void setOption1(int option1) {
		this.option1 = option1;
	}
	public int getOption2() {
		return option2;
	}
	public void setOption2(int option2) {
		this.option2 = option2;
	}
	public int getOption3() {
		return option3;
	}
	public void setOption3(int option3) {
		this.option3 = option3;
	}
	public int getOption4() {
		return option4;
	}
	public void setOption4(int option4) {
		this.option4 = option4;
	}
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct = correct;
	}




	int clipOptionsID;
	int clipID;
	int option1;
	int option2;
	int option3;
	int option4;
	int correct;
}
