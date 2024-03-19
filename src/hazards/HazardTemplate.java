package hazards;

public interface HazardTemplate {

	public static final int NUMBER_OF_FIELDS = 7;
	public static final String[] FIELD_LABELS = {"Service Request", "Departments", "Block/Address", "Street", "Ward", "Method Recieved", "Create Date"};
	public static final String[] FIELD_TYPES = {"String", "String", "String", "String",  "String", "String", "Date"};
	public static final String FILE_NAME = "Sidewalk_Construction_Repair_YTD.csv";
	public static final String DELIMITER = ",";
	public static final int PRIMARY_KEY_FIELD_INDEX = 1; // id
	
}
