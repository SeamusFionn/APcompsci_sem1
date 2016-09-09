import java.util.Scanner; //Import Statement

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, Im a BMI calculator");
		System.out.println("Can I ask you a few questions?");
		System.out.println("What is your weight?");
		
		double w = keyboard.nextDouble();
		
		System.out.println("Thank you, can I ask for your hieght?");
		
		double h = keyboard.nextDouble();
		
		System.out.println("Thank you");

		double BMI = 703 * (w/(h * h));
		
		System.out.println("Thank you,your BMI is " + BMI);
		
	}
}