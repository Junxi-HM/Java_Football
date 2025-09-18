package worldcup;

public class Player extends Person{
	String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void passBall() {
		System.out.println("passing Ball");
		
	}
}
