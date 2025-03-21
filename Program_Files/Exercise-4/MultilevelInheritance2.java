class Device {
    public void powerOn() {
        System.out.println("Device is powered on");
    }
}

class Computer extends Device {
    public void runSoftware() {
        System.out.println("Computer is running software");
    }
}

class Laptop extends Computer {
    public void useBattery() {
        System.out.println("Laptop is using battery");
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();      
        laptop.runSoftware();  
        laptop.useBattery();   
    }
}
