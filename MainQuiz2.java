import java.util.Arrays;

public class MainQuiz2 
{

	public static void main(String[] args) 
	{	//create the array;
		String [] arr = {"Hello", "World", "Apples", "Bananas"};
		//create a variable that will be called when it is initialized later on (the first in the array)
		String alpha;
		//create the first for loop, to search through the array above
		for (int i =0; i<arr.length; i++)
		{
			//this loop will be used to find what is first alphabetically
			for (int j =i+1; j<arr.length; j++)
			{
				//use this to compare strings to others in the array (had to look through the source), drew a blank here, the rest of the code I could not think up
				if (arr[i].compareTo(arr[j])>0)
				{
					System.out.println(arr[j]);
				}

			}
			
		}
		

	}

}
//would it have been easier to seperate them into char arrays?