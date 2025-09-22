package worldcup;

import java.util.ArrayList;

/**
 * Class to define the Field
 */
public class Field {
	private int size;
	private Light light;
	private ArrayList<Goal> goals;

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public ArrayList<Goal> getGoals() {
		return goals;
	}

	public void setGoals(ArrayList<Goal> goals) {
		this.goals = goals;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public Field(int size) {
		super();
		this.size = size;
	}
	
	public Field(int size, Light light, ArrayList<Goal> goals) {
		super();
		this.size = size;
		this.light = light;
		this.goals = goals;
	}

	public void light() {
		light.light();
	}
	
}
