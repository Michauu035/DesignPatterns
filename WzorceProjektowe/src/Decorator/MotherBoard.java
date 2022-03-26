package Decorator;

public class MotherBoard extends Component {
    private double price;
    private String name;

    public MotherBoard(ComputerInterface _computer, String name, double price) {
        super(_computer);
        this.price = price;
        this.name = name;
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
