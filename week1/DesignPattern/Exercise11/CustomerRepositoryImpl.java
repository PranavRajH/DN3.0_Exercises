package week1.DesignPattern.Exercise11;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // For demonstration purposes, returning a dummy customer name
        return "Customer Name for ID: " + id;
    }
}
