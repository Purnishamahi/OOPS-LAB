class Bank {
    int getInterestRate() {
        return 0;
    }
}
class SBI extends Bank {
    int getInterestRate() {
        return 5;
    }
}

class HDFC extends Bank {
    int getInterestRate() {
        return 7;
    }
}
public class MethodOverridingExample1 {
    public static void main(String[] args) {
        Bank b1 = new SBI(); 
        Bank b2 = new HDFC();
        
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}
