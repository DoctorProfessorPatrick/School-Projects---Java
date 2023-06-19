
public class item 
{
	item name;
	String description;

	public item(item n, String d)
	{
		name = n;
		description = d;
	}
	
	
	
	public String toString()
	{
		String str = "Name: " + name + "\nDescription: " + description;
		return str;
	}

}
