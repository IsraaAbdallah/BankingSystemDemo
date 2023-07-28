public class BankAccount {
    int accNo;
    private String holderName;
     private double balance;

    public BankAccount() {
    }

    public BankAccount(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(float amount){
        balance +=amount;
    }
    void withdraw (float amount){
        balance-=amount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance<0)
            System.out.println("Only positive number is allowed");
        else this.balance = balance;

    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
