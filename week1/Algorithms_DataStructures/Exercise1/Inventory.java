package Exercise1;

import java.util.HashMap;

public class Inventory {
    private HashMap<String, Product> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update an existing product
    public void updateProduct(String productId, Product updatedProduct) {
        if (inventory.containsKey(productId)) {
            inventory.put(productId, updatedProduct);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Get product details
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}
