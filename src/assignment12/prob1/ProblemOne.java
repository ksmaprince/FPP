package assignment12.prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        try {
            input = sc.nextInt();
            if (input < 0 || input > 100) throw new UnsupportedOperationException("Input must be 0 to 100.");
        } catch (InputMismatchException e) {
            System.out.println("Input must be integer value!");
            e.printStackTrace();
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported Operation: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Test Finally");
        }
    }
}
