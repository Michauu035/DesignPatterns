package Decorator;

public class RAM extends Component {
    private double price;
    private String name;
    private int capacity;
    private int speed;

    public RAM(ComputerInterface _computer, String name, int capacity, int speed, double price) {
        super(_computer);
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String getComponents() {
        return super.getComponents() + name + capacity + "GB " + speed + "MHz \n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }

}
