import java.util.Scanner;

public class IDcard
{
	public static void main(String[]args)
	{
		//creat objects 
		IDcard id = new IDcard();
		Scanner keyboard = new Scanner(System.in);
		//data for name
		System.out.println("Enter your first name");
		String fname = keyboard.next();
		System.out.println("Enter your Last Name");
		String lname = keyboard.next();
		//data for title
		System.out.println("Enter your title");
		String title = keyboard.next();
		keyboard.nextLine();
		//data for school site
		System.out.println("Enter the school");
		String site = keyboard.nextLine();
		//data for year
		System.out.println("Enter the school year");
		String year = keyboard.nextLine();
		//data for subject
		System.out.println("What is your subject");
		String sub = keyboard.nextLine();
		
		System.out.println("***********************************");
		id.format(site, year);
		id.format(fname, lname);
		id.format(title, sub);
		System.out.println("***********************************");
	}
	public void format(String word, String werd)
	{
		System.out.printf("* %10s  %5s *\n", word, werd);
	}
}
