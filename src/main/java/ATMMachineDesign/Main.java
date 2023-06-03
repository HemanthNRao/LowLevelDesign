package ATMMachineDesign;

public class Main
{
    ATM atm;
    User user;

    public static void main(String args[]) {

        Main main = new Main();
        main.initialize();

        main.atm.printCurrentATMStatus();
        main.atm.getCurrentATMState().insertCard(main.atm, main.user.card);
        main.atm.getCurrentATMState().authenticatePin(main.atm, main.user.card, "112211");
        main.atm.getCurrentATMState().selectOperation(main.atm, main.user.card, TransactionType.CASH_WITHDRAWAL);
        main.atm.getCurrentATMState().cashWithdrawal(main.atm, main.user.card, 3200);
        main.atm.printCurrentATMStatus();


    }

    private void initialize() {

        //create ATM
        atm = ATM.getATMObject();
        atm.setATMBalance(3500, 1,1,10);

        //create User
        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private BankAccount createBankAccount() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 3500;

        return bankAccount;

    }

}
