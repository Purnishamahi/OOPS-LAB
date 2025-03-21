class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();

        Bike bike = new Bike();
        bike.startEngine();
        bike.ride();
    }
}
