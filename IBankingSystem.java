public interface IBankingSystem {
    void createAccount(BankAccount account);
    void deposit(float amount,Account account);
    void withdraw(float amount,BankAccount account);
    void viewBalance(BankAccount account);
}
