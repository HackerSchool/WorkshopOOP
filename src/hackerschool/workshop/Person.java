package hackerschool.workshop;
import hackerschool.transportation.Movable;


public class Person implements Movable {

	@Override
	public int move(City destination) {
		System.out.println("Andei para " + destination.getName());
		return 0;
	}

	@Override
	public int move(double latitude, double longitude) {
		System.out.println("Andei para lat:" + latitude + " lon: " + longitude);
		return 0;
	}

}
