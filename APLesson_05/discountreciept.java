import java.util.Scanner;

public class discountreciept
{
	static double priceone;
	static double pricetwo;
	static double pricethree;
	static double pricefour;
	static String itemone;
	static String itemtwo;
	static String itemthree;
	static String itemfour;
	
	static double subtotal;
	static double discount;
	static double tax = 0.08;
	static double total;
	
	public static void main(String[]args)
	{
		//inputs
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your first item?");
		itemone = keyboard.next();
		System.out.println("What is the price?");
		priceone = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", priceone);
		System.out.println("What is your second item?");
		itemtwo = keyboard.next();
		System.out.println("What is the price?");
		pricetwo = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", pricetwo);
		System.out.println("What is your third item?");
		itemthree = keyboard.next();
		System.out.println("What is the price?");
		pricethree = keyboard.nextDouble();
		System.out.printf("%4.2f? thank you.\n", pricethree);
		System.out.println("What is your fourth item?");
		itemfour = keyboard.next();
		System.out.println("What is the price?");
		pricefour = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", pricefour);
		
		//calculate
		subtotal = priceone + pricetwo + pricethree + pricefour;
		disc();
		double discounted = (1 - discount) * subtotal;
		double taxed = subtotal * tax;
		
		//printing stuff
		System.out.println("<<<<<<<<<<__Reciept__>>>>>>>>>>");
		format(itemone, priceone);
		format(itemtwo, pricetwo);
		format(itemthree, pricethree);
		format(itemfour, pricefour);
		
		format("Subtotal: ", subtotal);
		format("Discount: ", discounted);
		format("Tax: ", subtotal * tax);
		format("Total: ", discounted + taxed);
		
		System.out.println("\n__________________________________");
		System.out.println("* Thank you for your support *");		
	}
	public static void disc()
	{
		if (subtotal >= 2000)
		{
			discount = 0.15;
		}	
		if (!(subtotal >= 2000))
		{
			discount = 0.0;
		}	
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%10s  %.2f \n", item, price);
	}
}
