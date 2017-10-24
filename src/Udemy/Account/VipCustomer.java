package Udemy.Account;

public class VipCustomer {
    private String name;
    private double creditLine;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer(String name, double creditLine,String email){
        this.name=name;
        this.creditLine=creditLine;
        this.email=email;
    }

    public VipCustomer(){
        this("Default Name", 00000, "Default Email");
    }

    public VipCustomer(String name, double creditLine){
        this(name,creditLine, "Default Email");
    }
}
