class BankAccount {
    void accountDetails() {
        System.out.println("This is a bank account.");
    }
}
class SavingsAccount extends BankAccount {
    void interestRate() {
        System.out.println("Savings Account has 4% interest.");
    }
}
class CurrentAccount extends BankAccount {
    void overdraftLimit() {
        System.out.println("Current Account has overdraft facility.");
    }
}
class LoanAccount extends SavingsAccount {
    void loanDetails() {
        System.out.println("Loan Account is linked to Savings Account.");
    }
}
public class HybridInheritanceBank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.accountDetails();      
    savings.interestRate();   
               CurrentAccount current = new CurrentAccount();
        current.accountDetails();  
        current.overdraftLimit();  // Own method

         LoanAccount loan = new LoanAccount();
        loan.accountDetails(); 
        loan.interestRate();  
        loan.loanDetails();   
    }
}
