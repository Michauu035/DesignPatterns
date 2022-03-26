package Composite;

public class Main {
    public static void main(String[] args) {
        CompoundGraphics all = new CompoundGraphics();
        Dot dot1 = new Dot(100, 100);
        all.add(new Dot(1, 2));
        all.add(new Dot(1, 12));
        all.add(new Dot(1, 22));
        all.add(dot1);
        all.draw();
        System.out.println("==============");

        CompoundGraphics group = new CompoundGraphics();
        CompoundGraphics group2 = new CompoundGraphics();

        group.add(new Dot(-2, -12));
        group.add(new Dot(-2, -1));
        group.add(new Dot(-2, -12));

        group2.add(new Dot(3, 1));
        group2.add(new Dot(3, 2));
        group2.add(new Dot(3, 3));
        group.add(group2);

        all.add(group);

        all.remove(dot1);
        all.draw();
        System.out.println("==============");
        all.draw();

    }
}
