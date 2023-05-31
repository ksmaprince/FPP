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
                double areaOfCircle = Math.PI * radius * radius;
                System.out.println("The area of Circle is: " + areaOfCircle);
            } break;
            case "R": {
                System.out.println("Enter the width of the Rectangle");
                double width = sc.nextDouble();
                System.out.println("Enter the height of the Rectangle");
                double height = sc.nextDouble();
                double areaOfRect = width * height;
                System.out.println("The area of Rectangle is: " + areaOfRect);
            } break;
            case "T": {
                System.out.println("Enter the base of the Triangle");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the Triangle");
                double height = sc.nextDouble();
                double areaOfTriangle = 0.5 * base * height;
                System.out.println("The area of Trangle is: " + areaOfTriangle);
            } break;

            default: {
                System.out.println("Incorrect input!");
            } break;

        }
        sc.close();
    }
}
