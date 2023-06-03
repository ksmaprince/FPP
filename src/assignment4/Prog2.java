package assignment4;

//Write a method to count the number of digits in an integer value n. Assume that n is
//nonnegative and represented in base ten
public class Prog2 {
    public static int countDigit(int n) {
        if (n < 10) {
            return 1;
        } else {
            return 1 + countDigit(n / 10);
        }
    }

    public static void main(String[] args) {
        int numDigit = countDigit(47394);
        System.out.println("Number of digit: " + numDigit);
    }
}
