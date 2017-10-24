package Udemy.Banking;

public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("Sberbank");

        if (bank.addBranch("Otradnoe")) {
            System.out.println("Otradnoe branch creadted");
        }

        bank.addCustomer("Otradnoe", "Mike", 50.0);
        bank.addCustomer("Otradnoe", "Sveta", 60.0);
        bank.addCustomer("Otradnoe", "Masha", 84.0);

        bank.addBranch("Paveletskaya");
        bank.addCustomer("Paveletskaya", "Alex", 54.543);

        bank.addCustomerTransaction("Otradnoe", "Mike", 56);
        bank.addCustomerTransaction("Otradnoe", "Sveta", 54.3);
        bank.addCustomerTransaction("Paveletskaya", "Alex", 43.54);

        bank.listCustomer("Otradnoe", true);
        bank.listCustomer("Paveletskaya", false);

        bank.addBranch("Domodedovo");
        if (!bank.addCustomer("Paveletskaya", "Brain", 5.33)) {
            System.out.println("Error Paveletskaya branch does not exist");
        }
        if (!bank.addBranch("Otradnoe")) {
            System.out.println("Otradnoe is already exists");
        }
        if (!bank.addCustomerTransaction("Otradnoe", "George", 32)) {
            System.out.println("Gerorge in not exist in the branch");
        }
        if(!bank.addCustomer("Otradnoe", "Mike", 12.30)){
            System.out.println("Customer Mike is already exist");
        }
    }
}
