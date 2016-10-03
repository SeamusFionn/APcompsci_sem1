import java.util.Scanner; //Import Statement

public class calculation
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, Im a rectangle Surface area calculator");
		System.out.println("Can I ask you a few questions?");
		System.out.println("What is your width?");
		
		int w = keyboard.nextInt();
		
		System.out.println("Thank you, can I ask for your height?");
		
		int h = keyboard.nextInt();
		
		System.out.println("Thank you, what is the length? ");
		
		int l = keyboard.nextInt();

		int Surfacearea = 2*(w*1 + l*1 + h*1);
		
		System.out.println("Thank you, your Surface area is " + Surfacearea);
		
	}
}

