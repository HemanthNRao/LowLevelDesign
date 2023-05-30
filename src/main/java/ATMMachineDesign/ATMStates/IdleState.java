package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;

public class IdleState extends State
{
    @Override
    public void insertCard(ATM atm, Card card)
    {
        System.out.println("Card inserted successfully");
    }
}
