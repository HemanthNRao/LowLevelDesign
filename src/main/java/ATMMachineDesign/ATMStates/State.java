package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;
import ATMMachineDesign.TransactionType;

public abstract class State
{
    public void insertCard(ATM atm, Card card)
    {
        System.out.println("OOPs!, Something went wrong");
    }

    public boolean authenticatePin(ATM atm, Card card, String pin)
    {
        System.out.println("OOPs!, Something went wrong");
        return false;
    }

    public void selectOperation(ATM atm, Card card, TransactionType type)
    {
        System.out.println("OOPs!, Something went wrong");
    }

    public void cashWithdrawal(ATM atm, Card card, int amount)
    {
        System.out.println("OOPs!, Something went wrong");
    }

    public void displayBalance(ATM atm, Card card)
    {
        System.out.println("OOPs!, Something went wrong");
    }

    public void returnCard(ATM atm, Card card)
    {
        System.out.println("Please collect the card!");
    }

    public void exit(ATM atm, Card card)
    {
        returnCard(atm, card);
        atm.setAtmState(new IdleState());
        System.out.println("User exited!");
    }
}
