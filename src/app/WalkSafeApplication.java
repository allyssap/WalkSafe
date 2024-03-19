package app;

import hazards.HazardTemplate;
import ui.ConsoleUI;
import viewers.HazardListViewer;

public class WalkSafeApplication implements HazardTemplate {
	public ConsoleUI UI;

	public WalkSafeApplication(String mode) {
		System.out.println("Starting Application...\n\n");

		@SuppressWarnings("unused")
		HazardListViewer viewer = new HazardListViewer();
		
		if (mode.compareToIgnoreCase("console")==0)
		{
			System.out.println("Entering console mode...\n\n");
			UI = new ConsoleUI();
			UI.MenuSelect();
		}
	}

}
