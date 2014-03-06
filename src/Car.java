
public class Car extends Vehicle {
	private Integer numberOfPassengers;
	
	public Car(String color, Integer numberOfPassengers) {
		super(color);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public Integer getNumberOfPassengers() {
		return this.numberOfPassengers;
	}
	
	public void setNumberOfPassengers(Integer numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
	@Override
	public void sound() {
		System.out.println("Brum Brum");
	}
}
