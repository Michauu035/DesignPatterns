package Decorator;

import java.util.List;

public abstract class ComputerInterface {
    public List<String> components;

    public abstract String getComponents();

    public abstract double getPrice();
}
