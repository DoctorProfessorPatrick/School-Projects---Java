import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int select = 0;
        int choice = 0;
        boolean login = false;
        
        System.out.println("Welcome to this ATM.");
        while (login ==false)
        	{
        	ATM.check();
        	if(ATM.check()==true)
        		login=true;
        	}
        do
        {try
                {
            do {
               
                    System.out.println("\tPlease select ATM Transactions");
                    System.out.println("\tPress [1] Deposit");
                    System.out.println("\tPress [2] Withdraw");
                    System.out.println("\tPress [3] Check Balance");
                    System.out.println("\tPress [4] Exit");
               
                    System.out.print("\n\tWhat would you like to do? ");
                    select = scan.nextInt();
   
                        if(select>4)
                        {
                            System.out.println("\n\tPlease select correct transaction.");
                        }
                        else
                        {
                        switch (select)
                        {
                            case 1:
                                System.out.print("\n\tEnter the amount of money to deposit: ");
                                Deposit.deposit = scan.nextDouble();
                                Balance.balance = Deposit.deposit + Balance.balance;
                                Deposit.depositMoney();
                                break;
                               
                            case 2:
                               
                                System.out.print("\n\tTo withdraw, make sure that you have sufficient balance in your account.");
                                System.out.println();
                                System.out.print("\tEnter amount of money to withdraw: ");
                                Withdraw.withdraw = scan.nextDouble();
                                Withdraw.withdrawMoney();
                                break;
                               
                            case 3:
                                Balance.checkBalance();
                                break;
                           
                            default:
                                System.out.print("\n\tTransaction exited.");
                                break;
                               
                        }
                    }               
                          
            }while(select>4);
           
            do {
                try
                {
                    System.out.println("\n\tWould you like to try another transaction?");
                    System.out.println("\n\tPress [1] Yes \n\tPress [2] No");
                    System.out.print("\tEnter choice: ");
                    choice = scan.nextInt();
               
                        if(choice>2)
                        {
                            System.out.print("\n\tPlease select correct choice.");
                        }
                    }
                   
                    catch(Exception e)
                    {
                        System.out.println("\tError Input! Please enter a number only.");
                        System.out.println("\tEnter yout choice:");
                        choice = scan.nextInt();
                    }
            } while(choice>2);
        }
        catch(Exception e)
                {
                    System.out.println("\tError Input! Please enter a number only.");
                    System.out.println("\tEnter your choice:");
                    select = scan.nextInt();
                }
               
        }while(choice<=1);
       
        System.out.println("\n\tThank you for using this ATM.");
    }


}
