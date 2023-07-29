public class DepositTransaction extends Transaction{
    float amount;
    public DepositTransaction(float amount) {
        this.amount = amount;
    }
    @Override
    void performTransaction(BankAccount bankAccount) {
        super.performTransaction(bankAccount);
        bankAccount.deposit(amount);

    }
}
