package Masa.geometry;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = {
                Rectangle.getRectangle(5,7),
                Rectangle.getRectangle(2,5),
                Square.getSquare(5),
                Square.getSquare(10)
        };
        double result = sumOfAreas(rectangles);
        System.out.println(result);
        System.out.println(minOfAreas(rectangles));
        System.out.println(maxOfAreas(rectangles));
    }

    static double sumOfAreas(Rectangle[] rectangles){
        double sum = 0;
        for (int i = 0; i < rectangles.length; i++) {
            sum += rectangles[i].getArea();
        }
        return sum;
    }

    static double minOfAreas(Rectangle[] rectangles){
        double min = rectangles[0].getArea();
        for (int i = 0; i < rectangles.length; i++) {
            double area =  rectangles[i].getArea();
            if( area < min){
                min = area;
            }
        }
        return min;
    }

    static double maxOfAreas(Rectangle[] rectangles){
        double max = rectangles[0].getArea();
        for (int i = 0; i < rectangles.length; i++) {
            double area =  rectangles[i].getArea();
            if( area > max){
                max = area;
            }
        }
        return max;
    }
}

