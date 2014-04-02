package hackerschool.transportation;

import hackerschool.workshop.City;

public class Car extends Vehicle {
	private Integer numberOfPassengers;

	public Car() {
		super("Black");
		this.numberOfPassengers = 4;
	}

	private Car(Integer numberOfPassengers) {
		this();
		this.numberOfPassengers = numberOfPassengers;
	}

	public Car(String color, Integer numberOfPassengers) {
		this(numberOfPassengers);
		this.color = color;
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

	@Override
	public int move(City destination) {
		System.out.println("Eu movi para a cidade " + destination.getName());
		return 0;
	}

	@Override
	public String toString() {
		return "Car [numberOfPassengers=" + numberOfPassengers + "]";
	}

	@Override
	public int move(double latitude, double longitude) {
		System.out.println("Eu movi para lat: " + latitude + " lon: "
				+ longitude);
		return 0;
	}
}
