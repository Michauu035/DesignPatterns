package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.buildBigHouse(builder);
        House h = builder.getResult();

        System.out.println(h.toString());
    }
}
