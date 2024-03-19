package hazards;

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
		private String serviceRequest;
		private String description;
		private String department;
		private String address;
		private String street;
		private String ward;
		private String methodReceived;
		private String createdDate;
	
		private int numberofReports;
		
		/***
		 * 
		 * @param id, id of the hazard
		 * @param severity, severity level of the hazard represented by an integer
		 * @param address, a string of the address block or number
		 * @param street, a string of the road name
		 * upon creation, it is assumed that 1 report of the hazard exists
		 */
		public Reported_Hazard(String serviceRequest, String description, String department, String address, String street,
				String ward, String methodReceived, String createdDate) {
			super(createdDate, createdDate, createdDate, createdDate, createdDate, createdDate, createdDate, createdDate);
			this.serviceRequest = serviceRequest;
			this.description = description;
			this.department = department;
			this.address = address;
			this.street = street;
			this.ward = ward;
			this.methodReceived = methodReceived;
			this.createdDate = createdDate;
			this.numberofReports = 1;
		}

		///getters and setters
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
		@Override
		public String toString() {
			return this.serviceRequest + " at " + this.address + " " + this.street + ".";
		}
}
