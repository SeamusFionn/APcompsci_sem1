import java.util.Scanner;

public class InvR
{
	public static void main (String[]args)
	{
		String IM = "";
		String I = "";
		String C = "";
		double P = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("do you want to enter a category and or price? ||yes or no||");
		String user = kb.nextLine();
		
		if (user.equals("yes") || user.equals("Yes"))
		{
			System.out.println("Enter manufacturer: ");
			IM = kb.nextLine();
			
			System.out.println("Enter item: ");
			I = kb.nextLine();
			
			System.out.println("Enter category: ");
			C = kb.nextLine();
			
			System.out.println("Enter price: ");
			P = kb.nextDouble();
			
			Inv rando = new Inv(IM, I, C, P);
			
			System.out.println(rando);
		}
		
		else
		{
			System.out.println("Please enter manufacturer: ");
			IM = kb.nextLine();
			
			System.out.println("Please enter item: ");
			I = kb.nextLine();
			
			Inv rando2 = new Inv(IM, I);
			
			System.out.println(rando2);
		}
	}
}