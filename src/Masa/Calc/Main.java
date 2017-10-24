package Masa.Calc;

public class Main {
    public static void main(String[] args) {
        AddCalculation addCalculation = new AddCalculation();
        System.out.println(addCalculation.execute());
        addCalculation.print();
        MultiplyCalculation multiplyCalculation = new MultiplyCalculation();
        System.out.println(multiplyCalculation.execute());
        multiplyCalculation.print();
        SubtractCalculation substractCalculation = new SubtractCalculation();
        System.out.println(substractCalculation.execute());
        substractCalculation.print();
        DivideCalculation divideCalculation = new DivideCalculation();
        System.out.println(divideCalculation.execute());
        divideCalculation.print();
    }
}
