package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;

public class HasCard extends State
{
    @Override
    public boolean authenticatePin(ATM atm, Card card, String pin)
    {
        if(pin.equals("112211"))
        {
            System.out.println("User authenticated successfully!");
            atm.setAtmState(new SelectOption());
            return true;
        }
        else {
            System.out.println("Invalid PIN, Try again!");
            exit(atm, card);
            return false;
        }
    }
}
