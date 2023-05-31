package assignment3.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle\nEnter R for Rectangle\nEnter T for Triangle");
        String input = sc.next();

        switch (input) {
            case "C": {
                System.out.println("Enter the radius of the Circle");
                double radius = sc.nextDouble();
                Circle c = new Circle(radius);
                System.out.println("The area of Circle is: " + (Math.PI * c.getRadius() * c.getRadius()));
            }
            break;
            case "R": {
                System.out.println("Enter the width of the Rectangle");
                double width = sc.nextDouble();
                System.out.println("Enter the height of the Rectangle");
                double height = sc.nextDouble();
                Rectangle r = new Rectangle(width, height);
                System.out.println("The area of Rectangle is: " + (r.getWidth() * r.getHeight()));
            }
            break;
            case "T": {
                System.out.println("Enter the base of the Triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double height = sc.nextDouble();
                Triangle t = new Triangle(base, height);
                System.out.println("The area of Trangle is: " + (0.5 * t.getBase() * t.getHeight()));
            }
            break;

            default: {
                System.out.println("Incorrect input!");
            }
            break;

        }
        sc.close();
    }
}
