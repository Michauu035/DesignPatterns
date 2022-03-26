package Decorator;

public class Shop {
    public static void main(String[] args) {
        ComputerInterface komp = new Computer();
        komp = new MotherBoard(komp, "MSI MAG Z690 TOMAHAWK WIFI", 1439);
        komp = new CPU(komp, "Intel Core i7-12700K ", 2099.0);
        komp = new GPU(komp, "NVIDIA RTX 3070 8GB GDDR6 ", 5199.0);
        komp = new RAM(komp, "Crucial Ballistix ", 16, 3200, 360);
        komp = new RAM(komp, "Crucial Ballistix ", 16, 3200, 360);
        komp = new HardDrive(komp, "Kingston A2000 M.2 PCIe NVMe ", "1 TB", 399.0);
        komp = new PowerSupply(komp, "be quiet! Straight Power 11", 750, 649.0);

        System.out.println(komp.getComponents());
        System.out.println("Cena: " + komp.getPrice() + " zł.");
    }
}
