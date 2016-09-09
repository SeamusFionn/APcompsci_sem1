import java.util.Scanner;

public class RudeAI 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello My name is RudeAI");
		System.out.println("I'd like to ask you a few questions");
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println("your name is " + name + "?" + " I feel bad for anyone even associated with you");
		
		System.out.println("How old are you? ");
		
		String age = keyboard.next();
		
		System.out.println("Wow! " + age + " who wouldve thought. I thought you were a 40 year old highschool drop-out.");
		
		System.out.println("What do you do for fun? ");
		
		String activity = keyboard.next();
		
		System.out.println("Woah same! " + activity + " I loved that too, atleast when I was 5.");
		
		System.out.println("What kind of music do you like? ");
		
		String genre = keyboard.next();
		
		System.out.println("You like " + genre + " I personally like Tuvan Throat Singing. Nerd.");
		
		System.out.println("How many siblings do you have?");
		
		String number = keyboard.next();
		
		System.out.println("Oh " + number + " your probably the worst child.");
		
		System.out.println("What do you want to be when you grow up? ");
		
		String job = keyboard.next();
		
		System.out.println("I love " + job + " I hope you follow your dreams " + name + " sorry for being so mean.");
	}
}