import java.util.Scanner;
public class Reactangle 
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Length? ");
		l = kb.nextDouble();
		System.out.println("What is your width? ");
		w = kb.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static void calcPerim()
	{
	perimeter = 2*(l*w);
	}
	
	public static void print()
	{
		System.out.println("Your rectangle is "+ perimeter +" ft around");
	}
}	