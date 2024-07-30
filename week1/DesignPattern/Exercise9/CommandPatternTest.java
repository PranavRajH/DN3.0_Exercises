package week1.DesignPattern.Exercise9;

public class CommandPatternTest {
    public static void main(String[] args) {
        // Create a Light object
        Light light = new Light();

        // Create command objects with the light as the receiver
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create the remote control and set commands
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        System.out.println("Pressing button to turn light on:");
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        System.out.println("Pressing button to turn light off:");
        remote.pressButton();
    }
}
