  import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{ //to take input
    Scanner scan = new Scanner(System.in);
		// Take the user input here
    System.out.print("Enter two different numbers to begin this process: ");
		int user1 = scan.nextInt();
    int user2 = scan.nextInt();
    //I had difficulty using boolean for this, so I used a counter that I had looked up for help
    int count=0;
		System.out.println("The numbers that are prime between " +user1);
    System.out.print(" and " +user2);
    System.out.println(" are:");
    //This one executes if the second number is larger than the first
    if (user1<user2)
    {
      //To start off, we need to make a loop that will check from the first number to the second
      for(int i = user1; i <= user2; i++)
      {
        //this one will check to see if the numbers themselves are prime, I used p for prime
        for(int p = 2; p < i; p++)
        {
          //if the modus operandi is 0, the number is divisible by something else other than itself and 1, so this is in essence "false"
          if(i % p == 0)
          {
            count = 0;
            break;
          }
          else
          {
            count = 1;
          }
        }
        //This will print out the prime numbers
        if(count == 1)
        {
          System.out.println(i);
        }
      }
    }
    //repeat the same process here, but if the first number is larger instead of the second
    else if(user1>user2)
    {
      for(int i = user2; i <= user1; i++)
		  {
		  	for(int p = 2; p < i; p++)
		  	{
          if(i % p == 0)
          {
            count = 0;
            break;
          }
          else
          {
            count = 1;
          }
        }
        if(count == 1)
        {
          System.out.println(i);
        }
		  } 
    }
	}
}
