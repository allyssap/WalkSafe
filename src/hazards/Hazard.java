package hazards;


public abstract class Hazard implements HazardTemplate{
	
	int id;
	int severity;
	long[] location;
	

	public Hazard(String serviceRequest, String description, String department, String address, String street,
			String ward, String methodReceived, String createdDate) {};
			
	public Hazard(String line) {};
	
	@Override
	public String toString() {
		return "Hazard " + this.id + " is a level " + this.severity + " hazard. Located at " + this.location[0] + ", " + this.location[1];
	}
}
