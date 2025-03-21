abstract class ElectronicDevice {
    String brand;
    double price;

    ElectronicDevice(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    abstract void turnOn();
    abstract void turnOff();

    void showDetails() {
        System.out.println("Brand: " + brand + ", Price: $" + price);
    }
}

class Laptop extends ElectronicDevice {
    Laptop(String brand, double price) {
        super(brand, price);
    }

    void turnOn() {
        System.out.println(brand + " Laptop is turning on...");
    }

    void turnOff() {
        System.out.println(brand + " Laptop is shutting down...");
    }
}

public class Abstarct4 {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 1200);
        myLaptop.showDetails();
        myLaptop.turnOn();
        myLaptop.turnOff();
    }
}
