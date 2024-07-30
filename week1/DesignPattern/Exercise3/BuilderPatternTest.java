package week1.DesignPattern.Exercise3;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a gaming computer using the builder pattern
        Computer gamingComputer = new Computer.Builder()
            .setCPU("Intel i9")
            .setRAM("32GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA RTX 3080")
            .setPowerSupply("750W")
            .setCoolingSystem("Liquid Cooling")
            .setMotherboard("ASUS ROG")
            .setOperatingSystem("Windows 10")
            .build();

        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingComputer);

        // Create a work computer using the builder pattern
        Computer workComputer = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .setGraphicsCard("Integrated")
            .setPowerSupply("500W")
            .setCoolingSystem("Air Cooling")
            .setMotherboard("MSI")
            .setOperatingSystem("Windows 10")
            .build();

        System.out.println("\nWork Computer Configuration:");
        System.out.println(workComputer);

        // Create a budget computer using the builder pattern
        Computer budgetComputer = new Computer.Builder()
            .setCPU("AMD Ryzen 3")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .setGraphicsCard("Integrated")
            .setPowerSupply("450W")
            .setCoolingSystem("Air Cooling")
            .setMotherboard("Gigabyte")
            .setOperatingSystem("Linux")
            .build();

        System.out.println("\nBudget Computer Configuration:");
        System.out.println(budgetComputer);
    }
}
