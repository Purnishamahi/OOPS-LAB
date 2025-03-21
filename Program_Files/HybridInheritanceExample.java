class Person {
    void showPersonDetails() {
        System.out.println("This is a person.");
    }
}
class Employee extends Person {
    void showEmployeeDetails() {
        System.out.println("This person is an employee.");
    }
}
class Manager extends Employee {
    void showManagerDetails() {
        System.out.println("This employee is a manager.");
    }
}
class Student extends Person {
    void showStudentDetails() {
        System.out.println("This person is a student.");
    }
}
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showPersonDetails();   
        manager.showEmployeeDetails();
        manager.showManagerDetails();  
        Student student = new Student();
        student.showPersonDetails();         
student.showStudentDetails();      }
}
