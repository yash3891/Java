package AssignmentFeb1;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited amount : " + amount);
        System.out.println("Current Bank Account Balance : " + balance);
    }

    void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("Withdrawn amount : " + amount);
            System.out.println("Current Bank Account Balance : " + balance);
        } else {
            System.out.println("Withdrawal not allowed. Minimum balance should be 100.");
        }
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50); // Allowed
        savingsAccount.withdraw(150); // Not allowed
    }
}

