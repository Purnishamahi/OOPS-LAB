interface Display {
    void showMessage(String message);

    default void showDefault() {
        System.out.println("This is a default method in the interface.");
    }

    static void showStatic() {
        System.out.println("This is a static method in the interface.");
    }
}

class Screen implements Display {
    public void showMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class Interface3 {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.showMessage("Hello, World!");
        screen.showDefault();
        
        Display.showStatic();  
    }
}
