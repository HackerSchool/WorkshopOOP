package hackerschool.workshop;

import hackerschool.transportation.Car;
import hackerschool.transportation.Vehicle;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Vehicle> vehicles = new LinkedList<Vehicle>();
		vehicles.add(new Car("Black", 5));
		vehicles.add(new Car("Blue", 7));
		vehicles.add(new Car("Yellow", 2));

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
