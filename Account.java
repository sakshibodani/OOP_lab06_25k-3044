//25k-3044 lab06 task 4
public class Account {
    double balance=50000.0;
}
class SavingsAccount extends Account{

}
class PremiumSavings extends SavingsAccount {
    double interestRate = 0.07;

    void calculateAndPrintInterest() {
        double interest = balance * interestRate;

        int finalInterest = (int) interest;
        System.out.println("The calculated interest is: " + finalInterest);
    }
}
    class AccountSystem {
        public static void main(String[] args) {
            PremiumSavings myAccount = new PremiumSavings();
            myAccount.calculateAndPrintInterest();
        }
    }
