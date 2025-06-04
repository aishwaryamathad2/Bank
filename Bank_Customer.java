package Bank;

public class Bank_Customer {
    String cust_name;
    int customer_id;
    String customer_address;

    // Constructor
    public Bank_Customer(String cust_name, int customer_id, String customer_address) {
        this.cust_name = cust_name;
        this.customer_id = customer_id;
        this.customer_address = customer_address;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Address: " + customer_address);
    }
}
