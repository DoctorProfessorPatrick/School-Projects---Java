
public class Main {

	public static void main(String[] args) 
	{
		Human Tom = new Human ("Tom");
		Pet Rocky = new Pet ("Rocky");
		Pet Mittens = new Pet ("Mittens");
		Tom.adopt(Rocky);
		Tom.adopt(Mittens);
		
		System.out.println(Tom);

	}

}
