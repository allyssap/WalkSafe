package app;


public abstract class Hazard {
	
	int id;
	int severity;
	long[] location;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public long[] getLocation() {
		return location;
	}
	public void setLocation(long[] location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hazard " + this.id + " is a level " + this.severity + " hazard. Located at " + this.location[0] + ", " + this.location[1];
	}
}
