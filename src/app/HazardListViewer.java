package app;
/***
 * 
 * @author allyssapoulin
 * purpose: viewer for official hazard list - the list should only exist once, but can be reloaded
 * Will be used in UI classes
 */


public class HazardListViewer {

	public static OfficialHazardList hazards;

	public HazardListViewer()
	{
		view();
	}
	
	private static void view() {
		if(hazards.size() == 0) {
			hazards = new OfficialHazardList();
			hazards.loadHazards();
		}
		else {
			///reload the hazards in the existing list
			hazards.loadHazards();
		}
		
		//System.out.print(hazards.toString());
	}

}
