package Udemy.Account;

public class Main {
    public static void main(String[] args) {
    Account myAccount = new Account(34534,4700, "Grigory Tsuryeb","tsurievga@gmail.com","4345345345");
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());

    myAccount.withdrawal(100);
    myAccount.deposit(50);
    myAccount.withdrawal(100);
    myAccount.deposit(51);
    myAccount.withdrawal(100);
    }
}
