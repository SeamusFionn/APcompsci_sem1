public abstract class Ticket
{
	private int serialNo;
	public Ticket()
	{
		serialNo = (int)(Math.random() * 7)
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	abstract int getPrice();
	
	public String toString()
	{
		return "Serial#: "+getSerialNo()+"\n price: "+getPrice();
	}
}



