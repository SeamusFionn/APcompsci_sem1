import java.util.Scanner;

public class UserRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want a public avatar? ||yes or no||");
		String usr = kb.next();
		
		if (usr.equals("Yes") || usr.equals("yes"))
		{
			User pH2 = new User("professor", "handsome", "profhansizzle");
			System.out.println(pH2);
		}
		else
		{
			User pH = new User("professor", "h6andsome");
			System.out.println(pH);
		}
	}
}