package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;

public class DisplayBalance extends State
{
    @Override
    public void displayBalance(ATM atm, Card card)
    {
        System.out.println("Balance displayed");
        atm.setAtmState(new IdleState());
    }
}
