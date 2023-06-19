import java.lang.reflect.Array;
import java.util.Scanner;
//Need this to be able to take user input
public class MainQuiz 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to begin this process");
		//We need to set up variables for even, odd, and one other that will compare user input to separate even or odd
		int even=0;
		int odd=0;
		int i=0;
		//We must first get a set of numbers from the user, which will repeat in the nested for statement
		int num=scan.nextInt();
			//repeating for addition, stops at 0
			for (i =num; i!=0; i=i)
			{
				//this checks to see if it's even, adds the number to previous entered once it loops
				if (i%2==0)
					even = even+i;
				//checks if it's odd
				else
					odd= odd+i;
				//Takes in a new number, 0 finishes the whole process
				System.out.println("Enter any number other than 0 to continue! Enter 0 to see the final result!");
				i=scan.nextInt();				
			}
			System.out.println("The sum of the even numbers entered is:" +even);
			System.out.println("The sum of the odd numbers entered is:" +odd);
				
		}
		
		
}


