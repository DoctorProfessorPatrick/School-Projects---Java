
public class Main {

	public static void main(String[] args) 
	{
		Player p1 = new Player ("John");
		Item sword = new Item ("sword", "rusty sword, still capable of doing damage.");
		
		p1.pickup(sword);
	}

}
