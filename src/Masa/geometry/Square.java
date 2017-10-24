package Masa.geometry;

public class Square extends Rectangle {
    static Square getSquare(double a){
        Square square = new Square();
        square.width = a;
        square.height = a;
        return square;
    }
}

