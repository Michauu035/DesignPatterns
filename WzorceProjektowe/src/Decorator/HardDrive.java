package Decorator;

public class HardDrive extends Component {
    private double price;
    private String name;
    private String capacity;

    public HardDrive(ComputerInterface _computer, String name, String capacity, double price) {
        super(_computer);
        this.capacity = capacity;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getComponents() {
        return super.getComponents() + name + capacity + "\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
