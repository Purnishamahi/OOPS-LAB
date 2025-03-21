abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {  
        this.name = name;
        this.id = id;
    }

    abstract void work();  
    void displayDetails() {  
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

class Developer extends Employee {
    Developer(String name, int id) {
        super(name, id);
    }

    void work() {
        System.out.println(name + " is coding...");
    }
}

public class  Abstarct3 {
    public static void main(String[] args) {
        Developer dev = new Developer("Alice", 101);
        dev.displayDetails();
        dev.work();
    }
}
