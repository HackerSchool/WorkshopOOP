public class City {
	private String name;
	private String longitude;
	private String latitude;
	private String neighbourCities;
	
	public City(String name) {
		this.name = name;
	}
	
	public City(String name, String longitude, String latitude) {
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	private String getLongitude() {
		return longitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String toString(){
		return "Name: "+name+"\nLongitude: "+longitude+"\nLatitude: "+latitude
				+ "\nNeighbourCities: " + neighbourCities;
	}
	
}

