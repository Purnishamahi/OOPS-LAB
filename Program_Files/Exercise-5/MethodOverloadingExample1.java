class Calculator {
    int add(int a) {
        return a;
    }
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingExample1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5));        
        System.out.println(calc.add(5, 10));    
        System.out.println(calc.add(5, 10, 15));    }
}
