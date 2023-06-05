package assignment5.problem1;

public class Rectangle extends Shape{
    protected double width;
    protected double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calculateArea() {
        return width * height;
    }

    @Override
    protected double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }
}
