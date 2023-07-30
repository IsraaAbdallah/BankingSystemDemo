

public class Main {
    public static void main(String[] args) {
        Account esraaAccount   = new Account(12345678,"Esraa",6000,"Advance","01012345678","1120865");
        BankAccount aliAccount= new BankAccount(8909054,"Ali",8000);
        Account abdallahAccount = new Account(2340987,"Abdallah",3000,"Advance","01012345678","1120865");

        esraaAccount.deposit(2000);
        System.out.println(esraaAccount.getBalance());

        abdallahAccount.deposit(33000);
        System.out.println(abdallahAccount.getBalance());
        aliAccount.withdraw(500);

        Bank bank =new Bank();
        bank.createAccount(esraaAccount);
        bank.createAccount( abdallahAccount);
        bank.createAccount(aliAccount);

        for (var acc:bank.getAccounts()) {
            System.out.println(acc);
        }

        bank.withdraw(1200,esraaAccount);

        System.out.println(esraaAccount.getBalance());
        System.out.println(aliAccount.getBalance());

        WithdrawTransaction withdrawTransaction=  new WithdrawTransaction(7000);
        withdrawTransaction.performTransaction(abdallahAccount);

        CheckingAccount checkingAccount = new CheckingAccount();
        System.out.println(checkingAccount.checkBalance(abdallahAccount));

        bank.viewBalance(aliAccount);
        System.out.println("try calculate interest and apply interest and checking balance");

        System.out.println(checkingAccount.checkBalance(esraaAccount));
        System.out.println(checkingAccount.checkBalance(abdallahAccount));
        SavingsAccount esraaSavings= new SavingsAccount(esraaAccount);
        SavingsAccount abdallahSavings= new SavingsAccount(abdallahAccount);

        esraaSavings.applyInterest(1.3,esraaAccount);
        abdallahSavings.applyInterest(abdallahSavings.calculayeInterest(35,abdallahAccount),abdallahAccount);
        System.out.println(checkingAccount.checkBalance(esraaAccount));
        System.out.println(checkingAccount.checkBalance(abdallahAccount));
    }
}