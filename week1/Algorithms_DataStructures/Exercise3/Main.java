package Exercise3;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("1", "John Doe", 100.0),
            new Order("2", "Jane Doe", 50.0),
            new Order("3", "Alice Doe", 150.0),
            new Order("4", "Bob Doe", 200.0),
            new Order("5", "Eve Doe", 170.0)
        };

        System.out.println("Unsorted orders:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Sorting.bubbleSort(orders);

        System.out.println("\nSorted orders using bubble sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Sorting.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nSorted orders using quick sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
