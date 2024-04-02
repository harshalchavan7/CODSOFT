class ATM
{
    int balance;
    void withDraw(int amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            System.out.println("Withdraw successfull!");
        }
        else
        {
            System.out.println("Insufficient balance!");
        }
    }
    void deposit(int amount)
    {
        balance+=amount;
        System.out.println("Deposit successfull!");
    }
    void checkBalance()
    {
        System.out.println("\nYour balance is: "+balance);
    }
}