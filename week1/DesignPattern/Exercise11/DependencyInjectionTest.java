package week1.DesignPattern.Exercise11;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create a CustomerRepository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        // Create a CustomerService instance with the repository injected
        CustomerService customerService = new CustomerService(customerRepository);
        
        // Use the service to get customer details
        String customerName = customerService.getCustomerName("12345");
        
        // Display the customer name
        System.out.println("Customer Name: " + customerName);
    }
}
