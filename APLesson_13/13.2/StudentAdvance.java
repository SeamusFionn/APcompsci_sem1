public class StudentAdvance extends Advance
{
	StudentAdvance object3 = new StudentAdvance("StudentAdvance");
	public int getPrice()
	{
		int price /= 2;
	}
	
	public string toString()
	{
		System.out.println("Serial#: "+getSerialNo()+"\n price: "+getPrice()+"/n Student ID Required!! ");		
	}
}