import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your radius? ");
		r = kb.nextDouble();
		
		calcArea();
		print();
	}
	
	public static void calcArea()
	{
	area = 3.14 * r * r;
	}
	
	public static void print()
	{
		System.out.println("The area of a circle with a radius of "+ r +" is " + area);
	}
}	