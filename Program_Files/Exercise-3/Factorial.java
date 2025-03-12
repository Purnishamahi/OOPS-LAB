import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int fact = 1;
        int i = num; 
        while (i > 0) {
            fact *= i;
            i--;      
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }
}
