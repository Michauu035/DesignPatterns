package Decorator;

public class CPU extends Component {
    private double price;
    private String name;

    public CPU(ComputerInterface _computer, String name, double price) {
        super(_computer);
        this.name = name;
        this.price = price;
    }

    @Override
    public String getComponents() {
        return super.getComponents() + name + "\n";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + price;
    }
}
