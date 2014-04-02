package hackerschool.workshop;
public class City {
	private String name;
	private String longitude;
	private String latitude;
	private String neighbourCities;
	
	public City(String name) {
		this.name = name;
	}
	
	public City(String name, String longitude, String latitude) {
		this(name);
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "City [name=" + name + ", longitude=" + longitude
				+ ", latitude=" + latitude + ", neighbourCities="
				+ neighbourCities + "]";
	}
	
	
}

