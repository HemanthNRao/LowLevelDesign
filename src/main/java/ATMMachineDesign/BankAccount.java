package ATMMachineDesign;

public class BankAccount
{
    int balance;

    public void updateBalance(int balance)
    {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }

    public void withdrawBalance(int amount)
    {
        balance -= amount;
    }
}
