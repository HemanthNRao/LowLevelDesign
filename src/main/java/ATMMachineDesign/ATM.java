package ATMMachineDesign;

import ATMMachineDesign.ATMStates.IdleState;
import ATMMachineDesign.ATMStates.State;

public class ATM
{
    private static ATM atmObject = new ATM();
    State atmState;

    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;


    public void setAtmState(State atmState)
    {
        this.atmState = atmState;
    }

    public State getCurrentATMState()
    {
        return atmState;
    }

    public static ATM getATMObject()
    {
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public int getAtmBalance()
    {
        return atmBalance;
    }

    public int getNoOfTwoThousandNotes()
    {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes()
    {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes()
    {
        return noOfOneHundredNotes;
    }

    public void setATMBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes)
    {
        this.atmBalance = atmBalance;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }
    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }


}
