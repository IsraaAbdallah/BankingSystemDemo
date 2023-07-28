import java.util.ArrayList;

public class Bank implements IBankingSystem{
    private  ArrayList<BankAccount> accounts=new ArrayList<>();
     ArrayList<String> getAccounts() {
        ArrayList<String> holderNames = new ArrayList<>();
        for (var account : accounts) {
            holderNames.add("account holder is "+account.getHolderName()+" and account number is "+account.accNo);

        }
        return holderNames;
    }
    @Override
    public void createAccount(BankAccount account) {
        this.accounts.add(account);
    }


    @Override
    public void deposit(float amount,Account account) {
        account.setBalance(account.getBalance()+amount);
    }
    @Override
    public void withdraw(float amount,BankAccount account) {
        account.setBalance(account.getBalance()-amount);

    }

    @Override
    public void viewBalance(BankAccount account) {
        System.out.println(account.getBalance());

    }



}
