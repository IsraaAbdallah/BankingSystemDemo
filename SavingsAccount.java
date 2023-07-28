public class SavingsAccount extends Account{
    double monthlyInterestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(Account account) {
    }


    public double calculayeInterest(double yearInterest,BankAccount account){

        return monthlyInterestRate = yearInterest /12;

    }
    public void applyInterest(double interestRate,BankAccount account){

        account.setBalance(account.getBalance()*interestRate);
    }



}
