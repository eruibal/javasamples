public class Customer {
    // Fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    public static void main(String[] args) {
        Customer customer = new Customer();

        System.out.println(customer);
    }
    // Constructors
    // Constructor for all three fields
    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    // No-args constructor calling another constructor with literal values
    public Customer() {
        this("John Doe", 1000.0, "john.doe@example.com");
    }
    // Constructor with name and email parameters calling another constructor
    public Customer(String name, String emailAddress) {
        this(name, 1000.0, emailAddress);
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", credit='" + creditLimit + '\'' +
                ", email=" + emailAddress +
                '}';
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}