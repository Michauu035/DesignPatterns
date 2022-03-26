package Builder;

public class House {
    private int floors;
    private int windows;
    private int rooms;
    private double price;

    public House(double price, int floors, int windows, int rooms) {
        this.floors = floors;
        this.price = price;
        this.windows = windows;
        this.rooms = rooms;
    }

    public String toString() {
        return String.format("floors: %d,\nrooms: %d,\nwindows: %d,\nprice: %.2f zł", floors, rooms, windows, price);
    }
}
