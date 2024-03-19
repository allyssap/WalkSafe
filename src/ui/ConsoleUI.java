package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import viewers.HazardListViewer;

public class ConsoleUI extends UIMain {
	
	public ConsoleUI(){
		super();
	}

	@Override
	public void displayMenu() {
		System.out.print("[1] View Official Hazards"
				+ "\n[2] View Unofficial Hazards"
				+ "\n[3] View all Hazards"
				+ "\n[4] Report Official Hazard"
				+ "\n[5] Report Unofficial Hazard"
				+ "\n[6] Edit Hazards"
				+ "\n[7] View Reports"
				+ "\n[X] Exit");
	}
	
	/***
	 * Functionality from Dr. Kobti's ConsoleViewer.Java 
	 */
	@Override
	public void MenuSelect(){
		boolean done = false;
		char selection;

		do
		{	
			displayMenu();
			selection = getSelection("1234567x");
			switch(selection)
			{
				case '1':
					System.out.println("Loading Official Hazards...");
					HazardListViewer.officialHazards.loadHazards();
					HazardListViewer.officialHazards.show();
					break;
				case '2':
					System.out.println("Sorry this option is not available yet");
					break;
			 	case '3':
			 		System.out.println("Sorry this option is not available yet");
					break;
				case '4':
					System.out.println("Sorry this option is not available yet");
					break;
				case '5':
					System.out.println("Sorry this option is not available yet");
					break;
				case '6':
					System.out.println("Sorry this option is not available yet");
					break;
				case '7':
					System.out.println("Sorry this option is not available yet");
					break;
				case 'X':
				case 'x':
					done = true;
					System.out.println("Closing WalkSafe Application");
					break;
				default:
					// should not happen if you did the input right!
			}	
		}while(!done);
		return;
	}
	
	@Override
	public char getSelection(String optionString)
	{
		Scanner sc = new Scanner(System.in);
		char c='x';
		String pattern = "["+optionString.toLowerCase() + optionString.toUpperCase()+"]";
		boolean done = false;
		do
		{
			try
			{
				c = sc.next(pattern).trim().charAt(0);	
				c =  Character.toLowerCase(c);
				done = true;
			}
			catch(InputMismatchException imme)
			{
				done = false;
			}
		}while(!done);

		System.out.println("user selection = ["+c+"]");
		return c;
	}

	@Override
	public void viewOfficialHazards() {
		// TODO Auto-generated method stub
		
	}


}
