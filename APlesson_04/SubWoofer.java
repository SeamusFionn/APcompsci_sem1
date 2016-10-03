import java.util.Scanner;

public class SubWoofer
{
	public static void main(String[]args)
	{
		SubWoofer Sub = new SubWoofer();
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double h = kb.nextDouble();
		System.out.println("What is your length in inches?");
		double l = kb.nextDouble();
		System.out.println("What is your width in inches?");
		double w = kb.nextDouble();
		System.out.println("your cubic feet = \n" + Sub.calcVol(h, l, w));
		//1728
		//when tested do 12 12 12
	}
	
	public double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}
