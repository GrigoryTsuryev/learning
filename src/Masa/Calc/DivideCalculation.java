package Masa.Calc;

public class DivideCalculation implements MainClass {
    double a=3;
    double b=2;
    @Override
    public double execute() {
        return a*b;
    }

    @Override
    public void print() {
        System.out.println(a+"*"+b);
    }
}

