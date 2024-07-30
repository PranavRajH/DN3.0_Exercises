package Exercise1;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("1", "Product 1", 10, 100.0);
        Product product2 = new Product("2", "Product 2", 20, 200.0);
        Product product3 = new Product("3", "Product 3", 30, 300.0);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("Product 1: " + inventory.getProduct("1").getProductName());
        System.out.println("Product 2: " + inventory.getProduct("2").getProductName());
        System.out.println("Product 3: " + inventory.getProduct("3").getProductName());

        Product updatedProduct = new Product("1", "Product 1 Updated", 15, 150.0);
        inventory.updateProduct("1", updatedProduct);

        System.out.println("Product 1: " + inventory.getProduct("1").getProductName());
        System.out.println("Product 1 Quantity: " + inventory.getProduct("1").getQuantity());
        System.out.println("Product 1 Price: " + inventory.getProduct("1").getPrice());

        inventory.deleteProduct("1");

        System.out.println("Product 1: " + inventory.getProduct("1"));
    }
}
