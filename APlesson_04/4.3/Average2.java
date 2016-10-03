import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Average2 calc = new Average2();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your First number? ");
		double num1 = kb.nextDouble();
		System.out.println("What is your second number? ");
		double num2 = kb.nextDouble();
		System.out.println("What is your third number? ");
		double num3 = kb.nextDouble();
		System.out.println("The average of "+ num1 + ", "+ num2 + ",and "+ num3 + " is "+ calc.calcavg(num1, num2, num3) +".");
	}
	
	public double calcavg(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
}