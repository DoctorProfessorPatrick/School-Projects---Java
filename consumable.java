
public class consumable 
{
	String name;
	int num;
	int uses;
	double value;
	String description;
	
	public consumable(String n, int u, double v, String d)
	{
		name =n;
		uses = u;
		value = v;
		description = d;
	}
	
	
	public void remove(player p)
	{
		for(int i = 0; i<=num; i++)
		{
			if(this.equals(player.inventory[i])&&uses>0)
			{
				uses--;
				
			}
			else
			if (this.equals(player.inventory[i])&&uses==0)
			{
				player.inventory[i]=null;

			}
			else
			{
				System.out.println("You are not in possesion of this item.");
			}
		}
		}
	public void sell(player p)
		{
			for(int i = 0; i<=num; i++)
			{
				if(this.equals(player.inventory[i])&&uses>0)
				{
					player.inventory[i]=null;
					player.money+=value;
				}
				else
				{
					System.out.println("You are not in possesion of this item.");
				}
			}

	}
	public String toString()
	{
		String str = "Name: " + name + "\nUses: " + uses;
		str+= "\nDescription: " + description;
		return str;
	}
}
