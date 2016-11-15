import java.util.Scanner;

public class passcode
{
	static String username, password;
	public static void main(String[]args)
	{
		System.out.println("What is your username and password?");
		passCheck();\
		if (username.equalsIgnoreCase("Mclovins") && password.equalsIgnoreCase("LmaoLmao"))
		{
		System.out.println("Access granted");
		}
		else
		{
		System.out.println("Access denied");
		recursion();
		}
}
	
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Username: ");
		username = kb.next();
		System.out.println("Password: ");
		password = kb.next();
		
		if (username.equalsIgnoreCase("Mclovins"))
		{
			if (username.equalsIgnoreCase("Mclovins"))
			{
				System.out.println("username is correct! ");
			}
			else 
			{
				System.out.println("username is incorrect! ");
				recursion();
			}
		}
		if (password.equalsIgnoreCase("LmaoLmao"))
		{
			if (password.equalsIgnoreCase("LmaoLmao"))
			{
			System.out.println("password is correct! ");
			}
			else
			{
				System.out.println("password is incorrect! ");
				recursion();
			}
		}
	}	
	
	public static void recursion()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Username: ");
		username = kb.next();
		System.out.println("Password: ");
		password = kb.next();
		
		if (username.equalsIgnoreCase("Mclovins"))
		{
			if (username.equalsIgnoreCase("Mclovins"))
			{
				System.out.println("username is correct! ");
			}
			else 
			{
				System.out.println("username is incorrect! ");
				recursion();
			}
		}
		if (password.equalsIgnoreCase("LmaoLmao"))
		{
			if (password.equalsIgnoreCase("LmaoLmao"))
			{
			System.out.println("password is correct! ");
			}
			else
			{
				System.out.println("password is incorrect! ");
				recursion();
			}
		}
	}
}