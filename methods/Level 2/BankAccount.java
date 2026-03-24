class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.accountHolder = "Vaishali";
        acc.accountNumber = 12345;
        acc.balance = 10000;

        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();
    }
}
