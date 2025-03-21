class BankAccount {
    double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance); 
    }
    public void addInterest() {
        balance += balance * 0.05; 
        System.out.println("Interest added. New Balance: $" + balance);
    }
}
public class SingleInheritance2 {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000);
        savings.showBalance();   
        savings.addInterest();   
    }
}
