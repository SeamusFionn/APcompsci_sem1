import java.util.Scanner;

public class Adv
{
	static String Gender, Name, Wake, Eat, Leave, desone, YN, A, B;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("you wake up...");
		System.out.println("you walk down stairs");
		morning();
		System.out.println("nice job your off to school");
	}
	
	public static void morning()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you do   A: *Eat*, B: *Leave*?");
		desone = kb.next();
	if (desone.equalsIgnoreCase("A"))	
	{
		if (desone.equalsIgnoreCase("A"))
			System.out.println("You you eat your food.");
		else
			recursion();
	}
	if (desone.equalsIgnoreCase("B"))
	{
		if (desone.equalsIgnoreCase("B"))
			System.out.println("You eat a bowl of cereal");
		else
			recursion();
	}
	else
	{
		recursion();
	}
	}
	
	public static void recursion()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you do   A: *Eat*, B: *Leave*?");
		desone = kb.next();
	if (desone.equalsIgnoreCase("A"))	
	{
		if (desone.equalsIgnoreCase("A"))
			System.out.println("You eat your food.");
		else
			recursion();
	}
	if (desone.equalsIgnoreCase("B"))
	{
		if (desone.equalsIgnoreCase("B"))
			System.out.println("You eat a bowl of cereal");
		else
			recursion();
	}
	else
	{
		recursion();
	}
	}
}