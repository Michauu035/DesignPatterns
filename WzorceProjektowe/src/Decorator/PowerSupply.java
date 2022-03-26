package Decorator;

public class PowerSupply extends Component {
    private double price;
    private String name;
    private int power;

    public PowerSupply(ComputerInterface _computer, String name, int power, double price) {
        super(_computer);
        this.name = name;
        this.price = price;
        this.power = power;
    }

    @Override
    public String getComponents() {
        return super.getComponents() + name + power + "W\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
