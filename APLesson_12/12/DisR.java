import java.util.Scanner;

public class DisR
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter x1: ");
		int x1 = kb.nextInt();
		System.out.println("Enter x2: ");
		int x2 = kb.nextInt();
		System.out.println("Enter y1: ");
		int y1 = kb.nextInt();
		System.out.println("Enter y2: ");
		int y2 = kb.nextInt();
		
		Dis object = new Dis(x1, x2, y1, y2);
		System.out.println("Your distance = " + object.getDis());
		Dis object2 = new Dis(2, -6, 4, -8);
		System.out.println("Your distance = " + object2.getDis());
	}
}