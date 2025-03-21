interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square...");
    }
}

public class Interface4{
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        myCircle.draw();

        Shape mySquare = new Square();
        mySquare.draw();
    }
}
