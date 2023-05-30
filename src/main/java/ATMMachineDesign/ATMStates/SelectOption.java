package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.Card;
import ATMMachineDesign.TransactionType;

public class SelectOption extends State
{
    @Override
    public void selectOperation(ATM atm, Card card, TransactionType type)
    {
        switch (type)
        {
            case CASH_WITHDRAWAL:atm.setAtmState(new WithdrawCash()); break;
            case DISPLAY_BALANCE:atm.setAtmState(new DisplayBalance()); break;
            default:
                System.out.println("Invalid choice");
                exit(atm, card);
        }
    }
}
