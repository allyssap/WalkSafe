package hazards;


import java.util.StringTokenizer;
/***
 * 
 * @author allyssapoulin
 * purpose: inherited from Hazards. Creates a hazard that is logged by an official and verified source.
 *
 */


public class Official_Hazard extends Hazard{
	private String serviceRequest;
	private String description;
	private String department;
	private String address;
	private String street;
	private String ward;
	private String methodReceived;
	private String createdDate;
	
	
	/***
	 * constructor for  creating a hazard based on the line in an CSV file, to be revised
	 * @param line, string from CSV file input
	 */
	public Official_Hazard(String line) {
		super(line);
		
		StringTokenizer st = new StringTokenizer(line, DELIMITER);
		this.serviceRequest = st.nextToken();
		this.description = st.nextToken();
		this.department = st.nextToken();
		this.address = st.nextToken();
		this.street = st.nextToken();
		this.ward = st.nextToken();
		this.methodReceived = st.nextToken();
		//this.createdDate = st.nextToken();
	}

	/***
	 * secondary constructor for Official hazard reporting
	 */
	public Official_Hazard(String serviceRequest, String description, String department, String address, String street,
			String ward, String methodReceived, String createdDate) {
		super(createdDate, createdDate, createdDate, createdDate, ward, ward, createdDate, createdDate);
		this.serviceRequest = serviceRequest;
		this.description = description;
		this.department = department;
		this.address = address;
		this.street = street;
		this.ward = ward;
		this.methodReceived = methodReceived;
		this.createdDate = createdDate;
	}
	
	///getters and setters
	public String getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getMethodReceived() {
		return methodReceived;
	}

	public void setMethodReceived(String methodReceived) {
		this.methodReceived = methodReceived;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	@Override
	public String toString() {
		return this.serviceRequest + " at " + this.address + " " + this.street + ".";
	}

}
