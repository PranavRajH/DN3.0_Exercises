package week1.DesignPattern.Exercise5;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate EmailNotifier with SMSNotifierDecorator
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate the SMSNotifier with SlackNotifierDecorator
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a notification with all decorators applied
        slackNotifier.send("Hello, this is a multi-channel notification!");
    }
}
