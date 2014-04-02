package hackerschool.transportation;

public abstract class Vehicle implements Movable {
	public String color;
	
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
	
	public abstract void sound();
}
