import java.util.Random;

public class User
{
	private String firstName, lastName, Avatar;
	private int userID;
	public User(String fN, String lN)
	{
	   firstName = fN;
	   lastName = lN;
	   Avatar = "undefined";
	   userID = (int)(Math.random() * 1000000);
	}
	public User(String fN, String lN, String Av)
	{
	   firstName = fN;
	   lastName = lN;
	   Avatar = Av;
	   userID = (int)(Math.random() * 1000000);
	}
	public String toString()
	{
	   return "User information- \nFirst Name- " + firstName + "\nLast Name- " + lastName + "\nAvatar name- " + Avatar +	"\nID#- " + userID;
	}
}