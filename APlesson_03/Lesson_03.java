import java.util.Scanner; //Import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user import
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = keyboard.next();
		
		System.out.println("Woah sameeee! " + teacher + " is legit bae");
		
	}
}