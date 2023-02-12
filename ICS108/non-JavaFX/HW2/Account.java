package HW2;

import java.util.Date;

public class Account {
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

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
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

    public String toString() {
        return "Id : "+id+"\n" + "Balance : " + balance + "$\n" + "Annual Interest Rate : " + annualInterestRate + "%\n" + "Account Creation Date : " + dateCreated + "\n";
    }

}
