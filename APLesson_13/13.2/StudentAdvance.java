public class StudentAdvance extends Advance
{
	public StudentAdvance(int dl)
	{
		super(dl);
	}
	public int getPrice()
	{
		return super.getPrice() / 2;
	}
	
	public String toString()
	{
		return super.toString() +"\n Student ID Required!! ";		
	}
}