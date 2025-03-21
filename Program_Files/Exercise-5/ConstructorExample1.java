class Student {
    String name;
    int rollNumber;
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    Student(Student s) {
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }

    void display() {
        System.out.println("Student: " + name + ", Roll No: " + rollNumber);
    }
}

public class ConstructorExample1 {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101);
        Student s2 = new Student(s1);
        s1.display();
        s2.display();
    }
}
