package app;

/***
 * 
 * @author allyssapoulin
 * purpose: inherited from Hazards. Creates a hazard that is logged by an official and verified source.
 *
 */


public class Official_Hazard extends Hazard{
	
	private int id;
	private int severity;
	private String address;
	private String street;
	
	/***
	 * constructor for  creating a hazard based on the line in an CSV file, to be revised
	 * @param line, string from CSV file input
	 */
	public Official_Hazard(String line) {
	
		
	}

	/***
	 * secondary constructor for Official hazard reporting
	 * @param id, id of the hazard
	 * @param severity, severity level of the hazard represented by an integer
	 * @param address, a string of the address block or number
	 * @param street, a string of the road name
	 */
	public Official_Hazard(int id, int severity,  String address, String street) {
		this.id=id;
		this.severity = severity;
		this.address = address;
		this.street = street;	
	}
	
	///getters and setters
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getstreet() {
		return street;
	}
	public void setstreet(String street) {
		this.street = street;
	}
	
	@Override
	public String toString() {
		return "An official Hazard, Hazard " + this.id + " is a level " + this.severity + " hazard. Located at " + this.location[0] + ", " + this.location[1];
	}

}
