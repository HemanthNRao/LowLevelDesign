package ATMMachineDesign;

public class User
{
    Card card;
    BankAccount bankAccount;

    public Card getCard()
    {
        return card;
    }

    public BankAccount getBankAccount()
    {
        return bankAccount;
    }

    public void setCard(Card card)
    {
        this.card = card;
    }
}
