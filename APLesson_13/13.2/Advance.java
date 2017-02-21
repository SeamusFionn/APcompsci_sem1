public class Advance extends Ticket
{
	private int daysleft;
	public Advance(int dl)
	{
		super();
		daysleft = dl;
	}
	public int getPrice()
	{
		if(daysleft > 9)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}