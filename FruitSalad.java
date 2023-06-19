import java.util.Arrays;

public class FruitSalad 
{
	String name;
	static Fruit [] list = new Fruit[5];
	Fruit fruit;
	static int num;
	
	public FruitSalad(String n)
	{
		name =n;
	}
		
	public static void addFruit(Fruit f)
	{
		list[num++]=f;
	}
	
	public String toString()
	{
		String str= "Name: " +name +"\n"+Arrays.toString(list);
		return str;
	}

}
