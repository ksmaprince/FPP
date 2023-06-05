package assignment5.problem1;

public class Main {
    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }
        System.out.println("Total Area :" + totalArea);
        System.out.println("Total Perimeter : " + totalPerimeter);
        System.out.println();
    }

    public static void main(String[] args) {
        Shape[] circleShapes = {new Circle("GREEN", 2.1),
                new Circle("BLUE", 1.5),
                new Circle("GREEN", 2.0),
                new Circle("RED", 4.5),
                new Circle("ORANGE", 3.1),
                new Circle("BROWN", 3.7)
        };

        System.out.println("Circle Shape");
        printTotal(circleShapes);

        Shape[] rectangleShapes = {
                new Rectangle("ORANGE", 1.0, 4.1),
                new Rectangle("GREEN", 2.1, 1.0),
                new Rectangle("BLUE", 3.5, 2.0),
                new Rectangle("RED", 4.5, 1.0),
                new Rectangle("PURPLE", 3.1, 6.0)
        };
        System.out.println("Rectangle Shape");
        printTotal(rectangleShapes);

        Rectangle[] squareShapes = {
                new Square("BLUE", 4.0),
                new Square("RED", 2.2),
                new Square("BLUE", 3.5),
                new Square("RED", 2.8)
        };
        System.out.println("Square Shape");
        printTotal(squareShapes);


        Shape[] allShapes = {
                new Circle("GREEN", 2.1),
                new Circle("BLUE", 3.5),
                new Rectangle("ORANGE", 2.0, 3.1),
                new Rectangle("GREEN", 4.1, 1.9),
                new Square("BLUE", 3.5),
                new Square("RED", 2.8)
        };
        System.out.println("All Shape");
        printTotal(allShapes);

    }
}
