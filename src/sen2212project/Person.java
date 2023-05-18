package sen2212project;

public class Person {
	private String name;
	private int height; //in cm
	private String eyeColor;
	
	public Person(String name, int height, String eyeColor) {
		this.name = name;
		this.height = height;
		this.eyeColor = eyeColor;
	}
	public String getName() {
		return name;
	}
	public int getHeight() { 
		return height;
	}
	public String eyeColor() {
		return eyeColor;
	}
}
