package week1.DesignPattern.Exercise6;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create a ProxyImage for an image
        Image image1 = new ProxyImage("image1.jpg");

        // The image will be loaded and displayed only when display() is called
        System.out.println("First call to display:");
        image1.display();

        // The image is now cached, so no loading from the server
        System.out.println("\nSecond call to display:");
        image1.display();

        // Create another ProxyImage for a different image
        Image image2 = new ProxyImage("image2.jpg");

        // The second image will be loaded and displayed only when display() is called
        System.out.println("\nThird call to display:");
        image2.display();
    }
}
