import java.util.Scanner;

public class ATMInterface
{
    public static void main(String args[])
    {
        int amount,flag=1;
        ATM atm=new ATM();
        System.out.println("Welcome to the ATM");
        Scanner scanner=new Scanner(System.in);
        while(flag==1)
        {
            System.out.println("\n1.Withdraw 2.Deposit 3.Check Balance 4.Exit");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("\nEnter Amount to Withdraw: ");
                    amount=scanner.nextInt();
                    atm.withDraw(amount);
                    break;
            
                case 2:
                    System.out.print("\nEnter Amount to Deposit: ");
                    amount=scanner.nextInt();
                    atm.deposit(amount);
                    break;
    
                case 3:
                    atm.checkBalance();
                    break;
    
                case 4:
                    System.out.println("\nThank You for using the ATM!\n");
                    flag=0;
                    break;
    
                default:
                    System.out.println("\nEnter valid choice!");
                    break;
            }
        }
        scanner.close();
    }
}