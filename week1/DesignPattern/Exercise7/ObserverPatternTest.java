package week1.DesignPattern.Exercise7;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create a StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        Observer mobileApp1 = new MobileApp("App1");
        Observer webApp1 = new WebApp("WebApp1");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(webApp1);

        // Change stock price and notify observers
        System.out.println("Updating stock price to $150.0");
        stockMarket.setPrice(150.0);

        // Deregister an observer
        stockMarket.deregisterObserver(mobileApp1);

        // Change stock price again and notify remaining observers
        System.out.println("\nUpdating stock price to $200.0");
        stockMarket.setPrice(200.0);
    }
}
