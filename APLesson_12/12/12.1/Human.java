public class Human
{
	private String Hair, Eyes, Skin;
	public Human()
	{
		Hair = "";
		Eyes = "";
		Skin = "";
	}
	public Human(String H, String E, String S)
	{
		Hair = H;
		Eyes = E;
		Skin = S;
	}
	public String getHair()
	{
		return Hair;
	}
	public String getEyes()
	{
		return Eyes;
	}
	public String getSkin()
	{
		return Skin;
	}
}