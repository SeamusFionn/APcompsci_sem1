public abstract class Car implements Location
{
	public int ID;
	public Car()
	{
		ID = (int)(Math.random() * 999999) + 1;
	}
}