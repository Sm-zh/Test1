package HW2;

public class AccountTest {
    public static void main(String[] args) {
        Account account= new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account);

        Account savingAccount = new Saving(1123,20000);
        savingAccount.withdraw(2500);
        savingAccount.deposit(3000);
        System.out.println(savingAccount);

        Account checkingAccount = new Checking(1124,20000);
        ((Checking) checkingAccount).setOverDraftLimit(20000);
        checkingAccount.withdraw(20000);
        checkingAccount.deposit(3000);
        System.out.println(checkingAccount);

    }
}
