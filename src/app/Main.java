package app;

public class Main {

	public static void main(String[] args) {
		boolean err = true;
		WalkSafeApplication app;
		// System.out.println(args.length);

		if (args.length==1)
		{
			if (args[0].compareToIgnoreCase("console")==0)
			{
				app = new WalkSafeApplication("console");
				err=false;
			}
		}
	}

}
