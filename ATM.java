import java.util.Scanner;
import java.io.*;

public class ATM
{
	public static boolean check() 
	{
	
	
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Username : ");
	    String username = scan.next();

	    System.out.println("Enter Password : ");
	    String password = scan.next();

	    if (username.equals(Verify.Username) && password.equals(Verify.Password)) {

	        System.out.println("Access Granted! Welcome!");
	        return true;
	        
	    }

	    else if (username.equals(Verify.Username)) 
	    {
	        System.out.println("Invalid Password!");
	    } 
	    else if (password.equals(Verify.Password)) 
	    {
	        System.out.println("Invalid Username!");
	    } 
	    else 
	    {
	        System.out.println("Invalid Username & Password!");
	    }
	    return false;

	}
	 public static void checkBalance()
	    {
	        System.out.println("\tYour current balance is " + Balance.getBalance());
	    }
	   
	    public static void withdrawMoney()
	    {
	        if(Balance.balance==0)
	        {
	            System.out.println("\tYour current balance is zero.");
	            System.out.println("\tYou cannot withdraw!");
	            System.out.println("\tYou need to deposit money first.");
	        }
	        else if(Balance.balance<Withdraw.withdraw)
	        {
	            System.out.println("\tYou do not have sufficient money to withdraw");
	            System.out.println("\tChecked your balance to see your money in the bank.");
	        }

	        else
	        {
	            Balance.balance = Balance.balance - Withdraw.withdraw;
	            System.out.println("\n\tYou withdraw the amount of: " + Withdraw.withdraw);
	        }
	    }
	                   
	    public static void depositMoney()
	    {
	        System.out.println("\tYou deposited the amount of: " + Deposit.getDeposit());
	    }
	   

}
