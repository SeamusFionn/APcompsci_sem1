public class Advance extends Ticket
{
	private int daysleft;
	Advance object2 = new Advance("Advance");
	
	Scanner kb = new Scanner(System.in);
	System.out.print("how many days are there left?");
	daysleft = kb.next();
	public int getPrice()
	{
		if(daysleft > 9)
		{
			int price = 30;
		}
		else
		{
			int price = 40;
		}
	}
}