package app;

/***
 * 
 * @author allyssapoulin
 * purpose: inherited from Hazards. Creates a hazard that is could become an offfical hazard. 
 * verification required in the form of multiple reports.
 * 
 * Usage: will need to be used by the reporting class, to determine if the hazard is official
 *
 */
public class Reported_Hazard extends Hazard {
		private int id;
		private int severity;
		private String address;
		private String street;
		private int numberofReports;
		
		/***
		 * 
		 * @param id, id of the hazard
		 * @param severity, severity level of the hazard represented by an integer
		 * @param address, a string of the address block or number
		 * @param street, a string of the road name
		 * upon creation, it is assumed that 1 report of the hazard exists
		 */
		public Reported_Hazard(int id, int severity, String address, String street) {
			this.id=id;
			this.severity = severity;
			this.address = address;
			this.street = street;
			this.numberofReports = 1;
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
		public int getNumberofReports(int numberOfReports) {
			return this.numberofReports;
		}
		public void setNumberofReports(int numberOfReports) {
			this.numberofReports = numberOfReports;
		}
		
		@Override
		public String toString() {
			return "A reported Hazard " + this.id + " is a level " + this.severity + " hazard. Located at " + this.location[0] + ", " + this.location[1] + ". This Hazard has been reported " + this.numberofReports + " times.";
		}
}
