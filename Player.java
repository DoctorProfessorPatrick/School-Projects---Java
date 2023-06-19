import java.util.Arrays;

public class Player 
{
	String name;;
	private Item [] inventory = new Item [5];
	private int currentInv = 0;
	

	
	public Player(String n)
	{
		name =n;
	}
	
	public void pickup(Item i)
	{
		if(currentInv<inventory.length)
			inventory[currentInv++]=i;
		else
			System.out.println("Cannot pick up item, inventory full.");
	}
	

	
	public String toString()
	{
		String str = "Name: " + name;
		str+= "\nInventory: " + Arrays.toString(inventory);
		return str;
	}

}
