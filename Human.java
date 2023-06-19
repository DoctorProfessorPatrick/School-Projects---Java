
public class Human 
{
	
	private String name;
	private double height;
	private double weight;
	private int age;
	
	public Human( String n, double h, double w, int a)
	{
		height =h;
		weight =w;
		name = n;
		age = a;
	}
	

	public void displayBMI(BMI n, double h, double w, double b)
	{
		height = h;
		weight =w;
		n.calculateBMI(h, w, b);
	}
	
	public String toString()
	{
		String str = "name: " +name;
		str+= "\nheight: " +height;
		str+= "\nweight: " +weight;
		str+= "\nage: " +age;
		
		return str;
	}
}
