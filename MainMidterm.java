import java.util.Arrays;
import java.util.Random;
//These are both needed in order to use commands for arrays and random.

public class MainMidterm 
{

	public static void main(String[] args) 
	{
		
		int location = 0;
		//initialize this variable in order to be used later
		Random rand = new Random();
		int [] arr = new int[10];
		//creates the array with size 10
		int min = arr[0];
		//initializes the minimum which will be compared later
		for (int i =0; i<arr.length; i++)
		//using this to loop through to check all of the elements in the array, swapping whichever is lowest to the new min
		{
			
			arr[i]= rand.nextInt();
			//this creates the random numbers, can set a limit to be used, but this should work as well
			if (min>arr[i])
			{
				min = arr[i];
				location = i;
			}
			//this whole part checks each element, swapping with min. At the end, gives the location of the element to be used to swap later.
		}
		System.out.println(Arrays.toString(arr));
		//Validates the first part of the array, checking to see if the code worked
		System.out.println("The smallest number in this array is: " +min + " The process to swap the elements will now be done.");
		int temp = arr[location];
		arr[location] = arr[0];
		arr[0]=temp;
		//In order to swap the smallest number with the first element in the array
		System.out.println(Arrays.toString(arr));
		//Validates the swapping of elements
		
	}

}
