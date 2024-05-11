

// ATM class and initialize accounts array
public class ATM {
    private Account[] accounts;

    // create ten accounts in an array with id 0-9, and initial balance $100
    public ATM() {
        accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
    }

    public void start() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        while (true) {
            // prompts the user to enter an id
            System.out.print("Enter an account id (0 to 9): ");
            int id = input.nextInt();
            // make sure id is correct
            if (id < 0 || id > 9) {
                System.out.println("Invalid account id. Please enter a number between 0 and 9.");
                continue;
            }
            // display main menu for account
            Account account = accounts[id];
            System.out.println("\nMain menu:\n");
            System.out.println("1: Check Balance");
            System.out.println("2: Withdraw");
            System.out.println("3: Deposit");
            System.out.println("4: Account Information");
            System.out.println("5: Exit (Choose a different account)");
            System.out.print("Please make a selection: ");
            int choice = input.nextInt();

            switch (choice) {
                // user input 1
                case 1:
                    System.out.println("\nThe current balance is: $" + account.getBalance() + "\n");
                    break;
                // user input 2
                case 2:
                    System.out.print("\nPlease enter the amount to withdraw: $");
                    double withdrawAmount = input.nextDouble();
                    double withdrawn = account.withdraw(withdrawAmount);
                    System.out.println("Amount withdrawn is: $" + withdrawn + "\n");
                    break;
                // user input 3
                case 3:
                    System.out.print("\nPlease enter the amount to deposit: $");
                    double depositAmount = input.nextDouble();
                    double newBalance = account.deposit(depositAmount);
                    System.out.println("Balance after deposit is: $" + newBalance + "\n");
                    break;
                // user input 4
                case 4:
                    System.out.println("Account was created on: " + account.getDateCreated());
                    System.out.println("Account interest rate is: " + account.getAnnualInterestRate() + "%");
                    System.out.println("Account Balance is: $" + account.getBalance());
                    break;
                // user input 5 repeat while loop
                case 5:
                    continue;
                // if user input not 1, 2, 3, 4, 5...
                default:
                    System.out.println("Error: Invalid choice. Please try again.");
            }
        }
    }

    // public class ATM runs main method
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.start();
    }
}
