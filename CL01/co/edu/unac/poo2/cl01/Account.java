package co.edu.unac.poo2.cl01;

public class Account {
    
    public String accountNumber;
    public User user;
    public char type; //S - Savings, C - Checks
    public double balance;

    public Account() {
    
    }

    public Account(String accountNumber, User user, char type, double balance) {
        this.accountNumber = accountNumber;
        this.user = user;
        this.type = type;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient balance. This transaction cannot be completed.");
        } else {
            balance -= amount;
            System.out.println("Withdraw completed. Your new balance is " + balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit completed. Your new balance is " + balance);
    }
}
