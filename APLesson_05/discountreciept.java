import java.util.Scanner;

public class discountreciept
{
	static double priceone;
	static double pricetwo;
	static double pricethree;
	static double pricefour;
	static double total;
	static double dotal;
	static double rtotal;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first item?");
		String Itemone = keyboard.next();
		System.out.println("What is the price?");
		double priceone = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", priceone);
		System.out.println("What is your second item?");
		String Itemtwo = keyboard.next();
		System.out.println("What is the price?");
		double pricetwo = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", pricetwo);
		System.out.println("What is your third item?");
		String Itemthree = keyboard.next();
		System.out.println("What is the price?");
		double pricethree = keyboard.nextDouble();
		System.out.printf("%4.2f? thank you.\n", pricethree);
		System.out.println("What is your fourth item?");
		String Itemfour = keyboard.next();
		System.out.println("What is the price?");
		double pricefour = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", pricefour);
		double total = priceone + pricetwo + pricethree + pricefour;
		boolean discount = total > 2000.00;
		boolean nodiscount = total < 2000.00;
		
		printreciept();
		
		if (discount)
		{
			double total = total * .15;
		}	
		if (nodiscount)
		{
			double total = total;
		}			
		
	}
	
	public static void printreciept()
	{
		System.out.println("");
	}	
}

NOTDONE