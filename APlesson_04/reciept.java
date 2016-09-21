import java.util.Scanner;

public class reciept
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Taco Bell");
		System.out.println("What is your entree item?");
		String first = keyboard.next();
		System.out.println("" + first + "? very nice.");
		System.out.println("What is the price?");
		double firstone = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", firstone);
		System.out.println("What is your drink item item?");
		String second = keyboard.next();
		System.out.println("" + second + "? nice choice.");
		System.out.println("What is the price?");
		double secondtwo = keyboard.nextDouble();
		System.out.printf("%4.2f? Thank you.\n", secondtwo);
		System.out.println("What is your extra item?");
		String third = keyboard.next();
		System.out.println(""+ third + "? Thank you.");
		System.out.println("What is the price?");
		double thirdthree = keyboard.nextDouble();
		System.out.printf("%4.2f? thank you.\n", thirdthree);
		
		double g = .07;
		
		reciept form = new reciept();
		
		System.out.println(" ");
		System.out.println("<<<<<<<<<<__Reciept__>>>>>>>>>>");
		System.out.println("__________________________________");
		
		String word1 = ""+ first ;
		double number1 = firstone;
		
		form.format(word1, number1);
		
		String word3 = ""+ second ;
		double number3 = secondtwo;
		
		form.format(word3, number3);
		
		String word4 = ""+ third ;
		double number4 = thirdthree;
		
		form.format(word4, number4);
		
		System.out.println(" ");
		
		String word5 = "SubTotal:";
		double number5 = firstone + secondtwo + thirdthree;
		
		form.format(word5, number5);
		
		String word6 = "Tax:";
		double number6 = number5 * g;
		
		form.format(word6, number6);
		
		String word7 = "Total:";
		double number7 = number6 + number5;
		
		form.format(word7, number7);
		
		System.out.println("\n__________________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s  %4.2f", word, number);
	}
}