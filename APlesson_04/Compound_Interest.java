import java.util.Scanner;

public class Compound_Interest
{
	public static void main(String[]args)
	{
		Compound_Interest pay = new Compound_Interest();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Interest rate?");
		double r = kb.nextDouble();
		System.out.println("What is your Principal?");
		double p = kb.nextDouble();
		System.out.println("What is the number of times the loan is compounded per year?");
		double n = kb.nextDouble();
		System.out.println("How long is the life of your loan?");
		double t = kb.nextDouble();
		System.out.println("Your monthly payment will be \n$" + pay.payment(r, p, n, t));
	}
	
	public double payment(double r, double p, double n, double t)
	{
		return p*(Math.pow(1+r/n, n*t))/(t*12);
	}
}
