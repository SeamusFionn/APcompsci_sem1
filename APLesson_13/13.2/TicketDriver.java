public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup object = new Walkup("Walkup");
		
		Advance object2 = new Advance("Advance");
		
		StudentAdvance object3 = new StudentAdvance("StudentAdvance");
		System.out.println(object.toString()+"\n"+object2.toString()+"\n"+object.toString());
	}
}