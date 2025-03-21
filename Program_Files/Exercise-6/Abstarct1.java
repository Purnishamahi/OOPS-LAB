abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();

    void showUsage() {
        System.out.println("Use with caution.");
    }
}

class Fan extends Appliance {
    void turnOn() {
        System.out.println("Fan is turning on...");
    }

    void turnOff() {
        System.out.println("Fan is turning off...");
    }
}

public class Abstarct1 {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        myFan.turnOn();
        myFan.showUsage();
        myFan.turnOff();
    }
}
