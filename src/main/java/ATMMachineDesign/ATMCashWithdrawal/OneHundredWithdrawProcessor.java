package ATMMachineDesign.ATMCashWithdrawal;

import ATMMachineDesign.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawalProcessor
{
    public OneHundredWithdrawProcessor(CashWithdrawalProcessor cashWithdrawalProcessor)
    {
        super(cashWithdrawalProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount)
    {
        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if(required <= atm.getNoOfTwoThousandNotes())
        {
            atm.deductTwoThousandNotes(required);
        }
        else if(required > atm.getNoOfTwoThousandNotes())
        {
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            balance += (required - atm.getNoOfTwoThousandNotes())*100;
        }

        if(balance != 0)
        {
            System.out.println("Something went wrong!");
        }
    }
}
