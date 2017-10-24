package Udemy.Account;

public class Account {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this(543534,6786,"Default","test@mail.ru", "488399273");
    }
    public Account(long accountNumber, long balance, String customerName, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }


    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Deposit amount is " + depositAmount + " posessed. New balance" +this.balance);
    }
    public void withdrawal (double withdrawalAmount){
        if(balance-withdrawalAmount<=0){
            System.out.println("Only " + this.balance + " avalible. Withdrawal is not proccesed ");
        }else {
            balance-=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " proccessed. Remining balance is = " + balance);
        }
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
