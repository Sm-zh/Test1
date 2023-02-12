import java.util.Date;

public class Problem3  {
    public static void main(String[] args) {
        Account a = new Account(1122, 20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.printf("Balance: %.2f $\nMonthly Interest: %.2f $\nDate: %S", a.getBalance(), a.getMonthlyInterest(), a.getDate());
    }
}

class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();

    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate)/12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate()/100);
    }

    public void withdraw(double withdrawnMoney) {
        balance -= withdrawnMoney;
    }

    public void deposit(double depositedMoney) {
        balance += depositedMoney;
    } 

}
