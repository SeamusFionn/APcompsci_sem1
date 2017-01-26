import java.util.Scanner;

public class CarDrifter
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter paint: ");
		String Paint = kb.nextLine();
		System.out.println("Please enter interior: ");
		String Interior = kb.nextLine();
		System.out.println("Please enter engine: ");
		String Engine = kb.nextLine();
		System.out.println("Please enter tires: ");
		String Tires = kb.nextLine();
		
		Car object = new Car(Paint, Interior, Engine, Tires);
		System.out.println("Here is thy car, drifter...");
		System.out.println("Paint-       " + object.getPaint());
		System.out.println("Interior-    " + object.getInterior());
		System.out.println("Engine-      " + object.getEngine());
		System.out.println("Tires-       " + object.getTires());
	}
}