package Builder;

public class VillaBuilder implements Builder {
    private int floors;
    private int windows;
    private double price;
    private int rooms;

    @Override
    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void setPrice(double price) {
        this.price = price * 4;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public House getResult() {
        return new House(price, floors, windows, rooms);
    }
}
