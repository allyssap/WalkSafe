package app;
/***
 * 
 * @author allyssapoulin
 * purpose: viewer for official hazard list - the list should only exist once, but can be reloaded
 * Will be used in UI classes
 */


public class HazardListViewer {

	public OfficialHazardList hazards;

	public HazardListViewer()
	{
		hazards = new OfficialHazardList();
		hazards.loadHazards();
		//System.out.print(hazards.toString());
	}

}
