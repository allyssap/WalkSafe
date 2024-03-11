package app;

import java.util.ArrayList;
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
		public OfficialHazardList()
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
			for (Hazard r : hazardList)	
			    s+=r+"\n";				


			return s;
		}

}
