public class Account extends BankAccount{
     private String accType;
     private String phone;
     private String  holderId;

    public Account() {

    }


    public Account(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
    }


    public Account(int accNo, String holderName, double balance, String accType, String phone, String holderId) {
        super(accNo, holderName, balance);
        this.accType = accType;
        this.phone = phone;
        this.holderId = holderId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }

}
