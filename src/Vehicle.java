
public class Vehicle {
	private String color;
	
	public Vehicle(String color) {
		this.color = color;
	}
	
	public String getColor() {
		System.out.println("GetColor no Vehicle");
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void sound() {
		System.out.println("What is the sound of a generic vehicle?");
	}
}
