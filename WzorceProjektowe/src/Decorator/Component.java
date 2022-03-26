package Decorator;

public class Component extends ComputerInterface {
    protected ComputerInterface computer;

    public Component(ComputerInterface _computer) {
        computer = _computer;
    }

    @Override
    public String getComponents() {
        return computer.getComponents();
    }

    @Override
    public double getPrice() {
        return computer.getPrice();
    }
}
