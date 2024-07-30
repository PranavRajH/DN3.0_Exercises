package week1.DesignPattern.Exercise7;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println("WebApp " + name + " received stock price update: $" + price);
    }
}
