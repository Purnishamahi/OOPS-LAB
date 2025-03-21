
class Vehicle {
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    public void openDoors() {
        System.out.println("Car doors are opening");
    }
}

class ElectricCar extends Car {
    public void chargeBattery() {
        System.out.println("Charging battery");
    }
}

public class  MultilevelInheritance1{
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar();
        eCar.drive();         
        eCar.openDoors();     
        eCar.chargeBattery(); 
    }
}
