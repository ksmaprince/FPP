package assignment4;

//Write a method to compute the sum of all elements of the array arr, of size n.
public class Prog3 {
    public static int sumArr(int[] a, int length) {
        if (length <= 0) {
            return 0;
        } else {
            return a[length - 1] + sumArr(a, length - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 2};
        System.out.println(sumArr(a, a.length));
    }
}
