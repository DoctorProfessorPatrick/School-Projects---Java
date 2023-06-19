
public class Main {

	public static void main(String[] args) 
	{
		player p1 = new player("Bob", 0.0 );
		consumable potion = new consumable("Potion of healing", 3, 5.0, "A red liquid, with a warm glow. Looks tasty");
		tool hoe = new tool ("hoe", "An old farm tool, still usable.");
		p1.pickup2(potion);
		p1.pickup1(hoe);
		System.out.println(p1);
		//I had a different program running but the computer running it crashed, so I lost the copy I had, so I quickly came up with this one, albeit wrong
		
		
	}

}
