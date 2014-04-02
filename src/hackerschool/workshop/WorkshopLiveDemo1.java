package hackerschool.workshop;

public class WorkshopLiveDemo1 {
	private String workshopName;
	private String startHour;
	
	public WorkshopLiveDemo1(String workshopName, String startHour) {
		this.workshopName = workshopName;
		this.startHour = startHour;
	}
	
	@Override
	public String toString() {
		return "WorkshopLiveDemo1: workshopName=" + workshopName +
				" startHour=" + startHour;
	}
}
