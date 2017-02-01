public abstract class Toyinv
{
	private String name = "";
	private int count;
	
	public Toyinv()
	{
		count = 0;
	}
	
	public Toyinv(String name)
	{
		this.name = name;
		count = 0;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCount()
	{
		count = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count
	}
	
	abstract String getType();
	
	public String toString()
	{
		return name + count;
	}
}