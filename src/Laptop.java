public class Laptop extends Computer{

    private int battery;

    public Laptop(String processor, String graphicsCard, int ram, String company, String model, int battery) {
        super(processor, graphicsCard, ram, company, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                " ram= " + getRam() + "GB" +
                ", processor='" + getProcessor() + '\'' +
                ", battery=" + battery + "%" +
                '}';
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("processor",
            "graph",32, "hp", "model", 90);
        System.out.println(laptop.toString());
        laptop.getCompany();
        laptop.getModel();
    }
}
