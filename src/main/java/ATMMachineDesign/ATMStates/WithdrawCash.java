package ATMMachineDesign.ATMStates;

import ATMMachineDesign.ATM;
import ATMMachineDesign.ATMCashWithdrawal.CashWithdrawalProcessor;
import ATMMachineDesign.ATMCashWithdrawal.FiveHundredWithdrawProcessor;
import ATMMachineDesign.ATMCashWithdrawal.OneHundredWithdrawProcessor;
import ATMMachineDesign.ATMCashWithdrawal.TwoThousandWithdrawProcessor;
import ATMMachineDesign.Card;

public class WithdrawCash extends State
{
    @Override
    public void cashWithdrawal(ATM atm, Card card, int amount)
    {
        if(atm.getAtmBalance()<amount)
        {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm,card);
        }
        else if(card.getBankBalance()<amount)
        {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm, card);
        }
        else
        {
            card.deductBankBalance(amount);
            atm.deductATMBalance(amount);
            CashWithdrawalProcessor cashWithdrawalProcessor =
                    new TwoThousandWithdrawProcessor(
                            new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            cashWithdrawalProcessor.withdraw(atm, amount);
            exit(atm, card);

        }
    }
}
