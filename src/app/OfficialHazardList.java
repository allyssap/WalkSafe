package app;

import java.util.ArrayList;

import hazards.Hazard;
import hazards.HazardTemplate;
import hazards.Official_Hazard;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/***
 * 
 * @author allyssapoulin
 * purpose: create a linked list from the CV file
 * Hazards in this list are considered official hazards.
 * 
 * Will be used in view classes
 */

public class OfficialHazardList implements HazardTemplate{
		public ArrayList<Hazard> hazardList;

		/** default constructor */
		private OfficialHazardList()
		{
			hazardList = new ArrayList<>();
		}

		/***
		 * load official hazards into list from the CSV file
		 * @return hazard at this location
		 */
		public int loadHazards()
		{
			try
			{
				String line = null;
				BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
				
				while ((line = br.readLine()) != null) 
				{	
					if (line.trim().length()==0) continue;	
				
					hazardList.add(new Official_Hazard(line));				
	  			}
				br.close();
			}
			catch(IOException ioe)
			{
				System.err.println(ioe);
			}
			
			return hazardList.size();
		}
		
		/***
		 * @param index, location of the hazard in the array, list must be loaded before usage
		 * @return hazard at this location
		 */
		public Hazard get(int index)
		{
			return hazardList.get(index);
		}
		
		/***
		 * get count of hazards in the arraylist, list must be loaded before usage
		 * @return size as int
		 */
		public int size()
		{
			return hazardList.size();
		}

		/***
		 * creates a string of all the hazards in the list, list must be loaded before usage
		 * @return hazards as string
		 */
		public String toString()
		{
			String s="";
			for (Hazard h : hazardList)	
			    s+=h+"\n";				

			return s;
		}
		/***
		 * change the severity of the hazard at the specified index
		 * @return true if the hazard was found and the severity was changed
		 */
//		public boolean changeHazardSeverity(int index, int severity) {
//			Hazard hazard = hazardList.get(index);
//			
//			if(hazard != null) {
//				hazard.setSeverity(severity);
//				return true;
//				
//			}
//			return false;
//		}
		/***
		 * add a hazard to the list
		 * @param hazard, the hazard to be added
		 * @return true if the hazard was added to the list, false otherwise
		 */
		public boolean addHazard(Hazard hazard) {
			return hazardList.add(hazard);
		}
		/***
		 * remove hazard from the list
		 * @param hazard, the hazard to be removed
		 * @return true if the hazard was removed from the list, false otherwise
		 */
		public boolean removeHazard(Hazard hazard) {
			return hazardList.remove(hazard);
			
		}
		/***
		 * find the hazard in the list
		 * @param hazard, the hazard being searched for
		 * @return true if the hazard was found, false otherwise
		 */
		public boolean findHazard(Hazard hazard) {
			for (Hazard h : hazardList) {
			    if(h == hazard) {
			    	return true;
			    }
			}
			return false;
		}
		
		public void show() {
			for (Hazard h : hazardList) {
			    System.out.println(h.toString());
			}
		}


}
