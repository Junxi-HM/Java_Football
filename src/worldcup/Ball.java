package worldcup;

public class Ball {
	String material;
	
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Ball() {
		this.material = "Polyvinyl chloride";
	}
	
	public Ball(String material) {
		super();
		this.material = material;
	}
	
	public Ball() {
		this.material = "pvc";
	}

	

	public void move() {
		System.out.println(" moving the ball");
	}
}
