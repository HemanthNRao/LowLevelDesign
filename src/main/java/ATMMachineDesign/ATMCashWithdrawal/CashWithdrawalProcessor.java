package ATMMachineDesign.ATMCashWithdrawal;

import ATMMachineDesign.ATM;

public class CashWithdrawalProcessor
{
    CashWithdrawalProcessor nextWithdrawalProcessor;
    CashWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor)
    {
        this.nextWithdrawalProcessor = cashWithdrawalProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount)
    {
        if(nextWithdrawalProcessor!=null)
        {
            nextWithdrawalProcessor.withdraw(atm, remainingAmount);
        }
    }
}
