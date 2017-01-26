public class Car
{
	private String Paint, Interior, Engine, Tires;
	public Car()
	{
		Paint = "";
		Interior = "";
		Engine = "";
		Tires = "";
	}
	public Car(String P, String I, String E, String T)
	{
		Paint = P;
		Interior = I;
		Engine = E;
		Tires = T;
	}
	public String getPaint()
	{
		return Paint;
	}
	public String getInterior()
	{
		return Interior;
	}
	public String getEngine()
	{
		return Engine;
	}
	public String getTires()
	{
		return Tires;
	}
}