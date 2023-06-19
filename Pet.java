
public class Pet 
{
	String name;
	Human human;
	
	public Pet (String n)
	{
		name =n;
	}
	
	public void adopted(Human h)
	{
		human = h;
	}
	public String toString()
	{
		String s = name;
		return s;
	}
}
