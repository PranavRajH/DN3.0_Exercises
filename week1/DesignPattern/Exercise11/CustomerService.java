package week1.DesignPattern.Exercise11;

public class CustomerService {
    private CustomerRepository customerRepository;

    // Constructor injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String getCustomerName(String id) {
        return customerRepository.findCustomerById(id);
    }
}
