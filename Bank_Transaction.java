package Bank;

public class Bank_Transaction {
    String account_name;
    String accountholder_name;
    String account_type;
    String account_number;
    double balance;

    // Constructor
    public Bank_Transaction(String account_name, String accountholder_name, String account_type,
                            String account_number, double balance) {
        this.account_name = account_name;
        this.accountholder_name = accountholder_name;
        this.account_type = account_type;
        this.account_number = account_number;
        this.balance = balance;
    }

    public void displayTransaction() {
        System.out.println("Account Name: " + account_name);
        System.out.println("Account Holder Name: " + accountholder_name);
        System.out.println("Account Type: " + account_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        // Create Bank_Customer object
        Bank_Customer customer = new Bank_Customer("Aishwarya", 101, "Bangalore");
        customer.displayCustomer();

        System.out.println();

        // Create Bank_Transaction object
        Bank_Transaction transaction = new Bank_Transaction(
                "SBI",
                "Aishwarya",
                "Saving",
                "SBIN0012345",
                15000.00
        );
        transaction.displayTransaction();
    }
}
