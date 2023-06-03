package assignment4;

//Write a method to display the digits of a given integer value n in reverse order
public class Prog1 {
    public static int reverseDigit(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            return reverseDigit(n / 10);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        reverseDigit(6341759);
    }
}
