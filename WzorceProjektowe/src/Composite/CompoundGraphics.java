package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphics implements Graphics {
    List<Graphics> children = new ArrayList<Graphics>();

    void add(Graphics child) {
        children.add(child);
    }

    void remove(Graphics child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphics child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphics child : children) {
            child.draw();
        }
    }
}
