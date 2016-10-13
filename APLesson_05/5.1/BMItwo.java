import java.util.Scanner;

public class BMItwo
{
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your weight?");
		double weight = keyboard.nextDouble();
		System.out.println("please insert height in inches");
		System.out.println("What is your height?");
		double height = keyboard.nextDouble();
		//calculate
		BMI = 703 * (weight/(height * height));
		calcBMI();
		
		System.out.println("your BMI is " + BMI);
		System.out.println("your condition is " + condition);
	}
	
	public static double calcBMI()
	{
		if (BMI > 0.0)
		{
			condition = "Underweight";
		}	
		if (BMI > 18.50)
		{
			condition = "normal";
		}	
		if (BMI > 24.90)
		{
			condition = "Overweight";
		}	
		if (BMI > 29.90)
		{
			condition = "Obese";
		}	
		if (BMI > 34.90)
		{
			condition = "Very Obese";
		}	
		if (BMI > 39.90)
		{
			condition = "Morbidly Obese";
		}	
		
		return 0.0;
	}
}