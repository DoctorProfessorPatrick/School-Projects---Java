
public class tool 
{
	String name;
	int num;
	int uses;
	String description;
	
	public tool(String n, String d)
	{
		name =n;

		description =d;
	}
	public void use(player p)
	{

		for(int i = 0; i<=num; i++)
		{
			if(this.equals(player.inventory[i])&&uses>0)
			{
				uses++;
				System.out.println("You have used " + name +".");
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
