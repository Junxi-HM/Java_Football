package worldcup;

/**
 * Class to define the Person
 */
public abstract class Person {
	int age;
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void run() {
		System.out.println("running");
	}
}
