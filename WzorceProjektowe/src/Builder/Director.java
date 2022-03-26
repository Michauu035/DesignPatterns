package Builder;

public class Director {
    public void buildSmallHouse(Builder builder) {
        builder.setFloors(1);
        builder.setRooms(3);
        builder.setWindows(4);
        builder.setPrice(120000);
    }

    public void buildBigHouse(Builder builder) {
        builder.setFloors(2);
        builder.setRooms(6);
        builder.setWindows(12);
        builder.setPrice(600000);
    }
}
