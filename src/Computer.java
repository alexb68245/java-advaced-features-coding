import java.util.Objects;

public class Computer {

    private String processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, String graphicsCard, int ram, String company, String model) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Computer", "Graph Card", 10, "Computer", "Computer");
        Computer computer1 = new Computer("Computer1", "Graph", 30, "Company", "Model");
        System.out.println(computer1.toString());
        System.out.println(computer1.hashCode());
        System.out.println(computer1.getCompany().equals(computer.getCompany()));
    }
}
