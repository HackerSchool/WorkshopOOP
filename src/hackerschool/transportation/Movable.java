package hackerschool.transportation;

import hackerschool.workshop.City;


public interface Movable {
	public int move(City destination);
	
	public int move(double latitude, double longitude);
}
