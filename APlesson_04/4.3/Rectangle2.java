import java.util.Scanner;
public class Rectangle2 
{
	public static void main(String[]args)
	{
		Rectangle2 calc = new Rectangle2();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your Length? ");
		double l = kb.nextDouble();
		System.out.println("What is your width? ");
		double w = kb.nextDouble();
		System.out.println("Your rectangle is "+ calc.calcPerim(l, w) +" ft around");
	}
	
	public double calcPerim(double l, double w)
	{
		return 2*(l * w);
	}
}