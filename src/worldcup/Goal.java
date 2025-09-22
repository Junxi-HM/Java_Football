package worldcup;

public class Goal {
	private int size;
	
	public Goal(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void scored() {
		System.out.println("Scored");
	}

}
