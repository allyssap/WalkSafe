package viewers;

import app.OfficialHazardList;

/***
 * 
 * @author allyssapoulin
 * purpose: viewer for official hazard list - the list should only exist once, but can be reloaded
 * Will be used in UI classes
 */

public class HazardListViewer {

	public static OfficialHazardList officialHazards;

	public HazardListViewer()
	{
		view();
	}
	
	public static void view() {
		officialHazards = new OfficialHazardList();
		officialHazards.loadHazards();
	
		//System.out.print(hazards.toString());
	}

}
