class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Teacher extends Person {
    String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age); 
        this.subject = subject;
    }
    public void displaySubject() {
        System.out.println("Subject: " + subject);
    }
}
public class SingleInheritance1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Brown", 40, "History");
        teacher.displayInfo();    
        teacher.displaySubject();  
    }
}
