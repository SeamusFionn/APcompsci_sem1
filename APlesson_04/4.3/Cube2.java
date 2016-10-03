import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Cube2 calc = new Cube2();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your side? ");
		double side = kb.nextDouble();
		System.out.println("The surface area of a cube whose sides are "+ side +" in length is "+ calc.calcSurf(side));
	}
	
	public double calcSurf(double side)
	{
		return 6 * side * side;
	}
}