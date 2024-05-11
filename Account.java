
import java.util.Date;

// Account class and initialize variables
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // no-arg constructor that creates a default account
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // creates an account with the specified id and initial balance also sets the dateCreated
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // accessor and mutator methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // method that returns the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // withdraws a specified amount from the account balance
    public double withdraw(double amount) {
        // if withdrawal is too much withdraw what they have
        if (amount > balance) {
            amount = balance;
        }
        balance -= amount;
        return amount;
    }

    // deposits a specified amount to the account
    public double deposit(double amount) {
        balance += amount;
        return balance;
    }
}
