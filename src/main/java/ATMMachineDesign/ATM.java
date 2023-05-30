package ATMMachineDesign;

import ATMMachineDesign.ATMStates.State;

public class ATM
{
    State atmState;

    public void setAtmState(State atmState)
    {
        this.atmState = atmState;
    }
}
