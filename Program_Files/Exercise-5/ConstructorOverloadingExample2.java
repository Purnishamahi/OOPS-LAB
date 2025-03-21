class Employee {
    String name;
    int id;
    String department;
    double salary;
    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.department = "Not Assigned";
        this.salary = 0.0;
    }
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "Not Assigned";
        this.salary = 30000.0; 
    }
    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = 35000.0; 
    }
    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("---------------------------");
    }
}

public class ConstructorOverloadingExample2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(); 
        Employee e2 = new Employee("Alice", 101); 
        Employee e3 = new Employee("Bob", 102, "HR"); 
        Employee e4 = new Employee("Charlie", 103, "IT", 60000.0);
        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}
