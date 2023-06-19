
public class BMI 
{
	private String name;
	private double height;
	private double weight;
	private double BMI;
	
	public BMI(String n, double h, double w, double b)
	{
		name = n;
		height = h;
		weight =w;
		BMI =b;
	}

	
	public void calculateBMI(Human h, Human w, double b)
	{
		b = w/Math.pow(h, 2);		
	}



	
}
