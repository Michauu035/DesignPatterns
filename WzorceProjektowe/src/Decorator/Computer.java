package Decorator;

public class Computer extends ComputerInterface {
    private double price = 0;
    private String name = "";

    public Computer() {
    }

    @Override
    public String getComponents() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
