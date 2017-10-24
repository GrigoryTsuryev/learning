package Masa.geometry;

public class Rectangle {
    double height;
    double width;

    static Rectangle getRectangle(double height, double width){
        Rectangle rectangle = new Rectangle();
        rectangle.width = width;
        rectangle.height = height;
        return rectangle;
    }

    double getArea(){
        return height * width;
    }
}

