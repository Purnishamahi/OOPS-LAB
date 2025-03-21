class Bank {
    void deposit(int amount) {
        System.out.println("Deposited cash: $" + amount);
    }
    void deposit(String checkNumber, int amount) {
        System.out.println("Deposited check #" + checkNumber + " of $" + amount);
    }
    void deposit(int amount, String bankName) {
        System.out.println("Deposited $" + amount + " via online transfer from " + bankName);
    }
}

public class MethodOverloadingExample2 {
    public static void main(String[] args) {
        Bank myBank = new Bank();
        myBank.deposit(500);                  
        myBank.deposit("CHK12345", 1000);     
        myBank.deposit(2000, "Chase Bank");  
    }
}
