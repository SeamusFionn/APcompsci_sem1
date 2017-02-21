public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup fun = new Walkup();
		Advance yay = new Advance(8);
		StudentAdvance lol = new StudentAdvance(15);
		
		System.out.println("\n" + fun);
		System.out.println("\n" +yay);
		System.out.println("\n" +lol);
	}
}