package week1.DesignPattern.Exercise3;

public class Computer {
    // Attributes
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private String powerSupply;
    private String coolingSystem;
    private String motherboard;
    private String operatingSystem;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
        this.motherboard = builder.motherboard;
        this.operatingSystem = builder.operatingSystem;
    }

    // Getters for attributes
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getPowerSupply() { return powerSupply; }
    public String getCoolingSystem() { return coolingSystem; }
    public String getMotherboard() { return motherboard; }
    public String getOperatingSystem() { return operatingSystem; }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + 
               ", graphicsCard=" + graphicsCard + ", powerSupply=" + powerSupply + 
               ", coolingSystem=" + coolingSystem + ", motherboard=" + motherboard + 
               ", operatingSystem=" + operatingSystem + "]";
    }

    // Builder class
    public static class Builder {
        // Attributes for Builder
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String powerSupply;
        private String coolingSystem;
        private String motherboard;
        private String operatingSystem;

        // Setter methods for Builder
        public Builder setCPU(String CPU) { this.CPU = CPU; return this; }
        public Builder setRAM(String RAM) { this.RAM = RAM; return this; }
        public Builder setStorage(String storage) { this.storage = storage; return this; }
        public Builder setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; return this; }
        public Builder setPowerSupply(String powerSupply) { this.powerSupply = powerSupply; return this; }
        public Builder setCoolingSystem(String coolingSystem) { this.coolingSystem = coolingSystem; return this; }
        public Builder setMotherboard(String motherboard) { this.motherboard = motherboard; return this; }
        public Builder setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; return this; }

        // Build method
        public Computer build() {
            return new Computer(this);
        }
    }
}
