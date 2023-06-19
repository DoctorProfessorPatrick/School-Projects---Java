import java.util.Arrays;

public class Human 
{
	String name;
	Pet [] pets = new Pet[2];
	Pet pet;
	int numOfPets = 0;
	
	public Human (String n)
	{
		name =n;
	}
	public void adopt(Pet n)
	{
		pets[numOfPets++]=n;
		n.adopted(this);
	}
	public String toString()
	{
		String s = "Name: " + name +"\nPets: " +Arrays.toString(pets);
		return s;
	}
}
