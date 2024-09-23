public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

   // Constructor
    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + " into the account. New balance: $" + accountBalance);
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }
    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= accountBalance) {
                accountBalance -= amount;
                System.out.println("Withdrawn $" + amount + " from the account. New balance: $" + accountBalance);
            } else {
                System.out.println("Insufficient funds. Withdrawal not allowed.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please withdraw a positive amount.");
        }
    }
    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static void main(String[] args) {
        // Create an instance of the Account class
        BankAccount myAccount = new BankAccount(123456, 1000.00, "John Doe", "john.doe@example.com", "123-456-7890");

        // Test deposit method
        myAccount.deposit(500.00);

        // Test withdraw method
        myAccount.withdraw(200.00);

        // Print final account information
        System.out.println("Final Account Information:");
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Customer Name: " + myAccount.getCustomerName());
        System.out.println("Email: " + myAccount.getEmail());
        System.out.println("Phone Number: " + myAccount.getPhoneNumber());
        System.out.println("Final Account Balance: $" + myAccount.getAccountBalance());
    }
}