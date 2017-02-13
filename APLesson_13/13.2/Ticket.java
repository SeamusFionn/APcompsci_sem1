public abstract class Ticket
{
	public Ticket(){	
	}
	
	public int getSerialNo()
	{
		return (int)(Math.random() * 7);
	}
	
	abstract int getPrice();
	
	public String toString()
	{
		return "Serial#: "+getSerialNo()+"\n price: "+getPrice();
	}
}



