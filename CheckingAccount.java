public class CheckingAccount extends Account{

    public CheckingAccount() {
        super();
    }


    public double checkBalance(Account account) {
        super.setBalance(account.getBalance());
        return getBalance();
    }

}
