import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Circle2 calc = new Circle2();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your radius? ");
		double r = kb.nextDouble();
		System.out.println("The area of a circle with a radius of "+ r +" is " + calc.calcArea(r));
	}
	
	public double calcArea(double r)
	{
		return 3.14 * r * r;
	}
}