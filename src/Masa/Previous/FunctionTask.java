package Masa.Previous;

public class FunctionTask {
    public static void main(String[] args) {
        int b = 5;
        int c = 7;

        printFunction(b,c);
        getX(b,c);

    }
    private static void printFunction(int b, int c){
        System.out.println(b+"x+"+c+"=0");
    }
    private static int getX(double b, double c){
        double result = -c/b;
        System.out.println("x="+result);
        return (int) result;
    }
}
