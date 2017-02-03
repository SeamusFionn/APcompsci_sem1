public abstract class Toyinv
{
	private String name = "";
	private int count;
	
	public Toyinv()
	{
		count = 1;
	}
	
	public Toyinv(String name)
	{
		this.name = name;
		count = 1;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCount(int num)
	{
		count = num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	abstract String getType();
	
	public String toString()
	{
		return name + count;
	}
	
	public void addCount(){
		count += 1;
	}
}