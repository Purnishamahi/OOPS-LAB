class Student {
    String name;
    int age;
    double grade;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0; 
    }
    Student(int age, String name) {
        this.name = name;
        this.age = age;
        this.grade = 0.0; 
    }

    void display() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class ConstructorOverloadingExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);  
        Student s2 = new Student(22j, "Bob");    
        s1.display();
        s2.display();
    }
}
