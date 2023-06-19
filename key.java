
import java.util.Scanner;
public class key 
{
	Scanner scan = new Scanner(System.in);
	String choice;
	String left ="left";
	String right = "right";
	String [] key1 = new String [] {left};
	String [] key2 = new String [] {right};
	String [] key3 = new String [] {left, right};
	
	public boolean use(player key)
	{
		System.out.println("What door will you choose to use this key on, left or right?");
		choice = scan.next();
		if (choice.contains(left))
		{
			if (key.equals(key1)||key.equals(key3))
				System.out.println("The key opens the door.");
				return true;
		}
		
		if (choice.contains(right))
		{
			if (key.equals(key2)||key.equals(key3))
				System.out.println("The key opens the door.");
				return true;
			
		}
		else
		return false;		
			
	}
	
}
