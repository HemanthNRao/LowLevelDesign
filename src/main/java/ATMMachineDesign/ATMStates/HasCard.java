package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;

public class HasCard extends State
{
    @Override
    public boolean authenticatePin(ATM atm, Card card, String ping)
    {
        System.out.println("User authenticated successfully!");
        return true;
    }
}
