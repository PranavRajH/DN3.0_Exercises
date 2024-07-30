package Exercise2;

public class Main {
        public static void main(String[] args) {
        Product[] products = {
            new Product("1", "Apple", "Fruit"),
            new Product("2", "Banana", "Fruit"),
            new Product("3", "Carrot", "Vegetable"),
            new Product("4", "Orange", "Fruit"),
            new Product("5", "Tomato", "Fruit")
        };

        String productName = "Banana";
        Product product = Search.linearSearch(products, productName);
        if (product != null) {
            System.out.println("Product found: " + product);
        } else {
            System.out.println("Product not found");
        }
    }
}
