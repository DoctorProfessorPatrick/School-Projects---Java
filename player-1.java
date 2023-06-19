import java.util.Arrays;
import java.util.Random;

public class player 
{
	String name;;
	int hp; 
	static double money;
	public static item [] inventory = new item [5];
	private int currentInv = 0;
	Random rnd = new Random();
	consumable con;
	tool too;
	
	public player ()
	{
		hp = 10+rnd.nextInt(20);
	}
	
	public player(String n, double m)
	{
		name =n;
		money =m;
	}
	
	public Boolean pickup(item i)
	{
		if(currentInv<inventory.length)
			{
			inventory[currentInv++]=i;
			return true;
			}
		else
			System.out.println("Cannot pick up item, inventory full.");
		return false;
	}
	
	public void useItem()
	{
		System.out.println("You used the " + name + " consumable.");
		
		con.remove(this);
		
	}
	
	public void sell()
	{
		System.out.println("You sold the " + name + " consumable");
		
		con.sell(this);
		
	}
	public void useTool()
	{
		too.use(this);
	}
	
	public String toString()
	{
		String str = "Name: " + name;
		str+= "\nInventory: " + Arrays.toString(inventory);
		str+= "\nMoney: " + money + "\nHP: " +hp ;
		return str;
	}

	public boolean pickup2(item p) {
		if(currentInv<inventory.length)
		{
		inventory[currentInv++]=p;
		return true;
		}
	else
		System.out.println("Cannot pick up item, inventory full.");
	return false;
		// TODO Auto-generated method stub
		
	}

	public boolean pickup1(item h) {
		if(currentInv<inventory.length)
		{
		inventory[currentInv++]=h;
		return true;
		}
	else
		System.out.println("Cannot pick up item, inventory full.");
	return false;
	}

}