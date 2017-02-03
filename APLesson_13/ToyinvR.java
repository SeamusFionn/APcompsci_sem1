public class ToyinvR
{
	public static void main(String[]args)
	{
		Afigure object = new Afigure("Superman");
		
		
		
		Car object2 = new Car("Mazda");
		
		System.out.println(object.toString() + object2.toString());
		
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(store.toString()+"\n"+store.getMostFrequentToy()+"\n"+store.getMostFrequentType());
	}
}