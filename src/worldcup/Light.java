package worldcup;

public class Light {
	private String colour;
	private boolean state;
	
	public Light(String colour, boolean state) {
		super();
		this.colour = colour;
		this.state = state;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public void light() {
		if (state) {
			System.out.println("Switching OFF the lights");
			state = false;
		} else {
			System.out.println("Switching ON the lights");
			state = true;
		}
	}
	
}
