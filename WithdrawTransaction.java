public class WithdrawTransaction extends Transaction{
    float amount;

    public WithdrawTransaction(float amount) {
        this.amount=amount;

    }

    @Override
    void performTransaction(BankAccount bankAccount) {
        super.performTransaction(bankAccount);
        bankAccount.withdraw(amount);

    }
}
