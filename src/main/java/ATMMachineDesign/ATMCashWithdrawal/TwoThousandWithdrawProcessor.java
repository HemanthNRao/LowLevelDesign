package ATMMachineDesign.ATMCashWithdrawal;

import ATMMachineDesign.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawalProcessor
{
    public TwoThousandWithdrawProcessor(CashWithdrawalProcessor cashWithdrawalProcessor)
    {
        super(cashWithdrawalProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount)
    {
        int required = remainingAmount/2000;
        int balance = remainingAmount%2000;

        if(required <= atm.getNoOfTwoThousandNotes())
        {
            atm.deductTwoThousandNotes(required);
        }
        else if(required > atm.getNoOfTwoThousandNotes())
        {
            balance += (required-atm.getNoOfFiveHundredNotes()) * 2000;
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
        }
        if(balance != 0)
        {
            super.withdraw(atm, balance);
        }
    }
}
