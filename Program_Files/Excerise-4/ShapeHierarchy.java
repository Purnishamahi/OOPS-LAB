class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}
class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle.");
    }
}
class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle.");
    }
}
public class ShapeHierarchy {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();  
        circle.drawCircle();

        Rectangle rectangle = new Rectangle();
        rectangle.draw(); 
        rectangle.drawRectangle();
    }
}
