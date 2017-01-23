import java.util.Scanner;
public class miles
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("what is your distance? ");
		int d = kb.nextInt();
		System.out.println("what are your hours? ");
		int h = kb.nextInt();
		System.out.println("what are your minutes? ");
		int m = kb.nextInt();
		
		//new object being created...
		Mph object = new Mph(d, h, m);
		System.out.println(object.distance() + " miles in " + object.hours() + " hours = " + object.getMPH() + " mph");
		//set new values on existing object...
		object.setValues(500, 5, 30);
		System.out.println("\n" + object.distance() + " miles in " + object.hours() + " hours = " + object.getMPH() + " mph");
	}
}





 //print the info, formatted nicely....
   //make sure to use the accessors for the data
   //EX: 10 miles in 2 hours = 5 mph


   //run the modifier: setValues()
   //set new distance, hours, and minutes


   //print the info, formatted nicely....
   //EX: 10 miles in 2 hours = 5 mph