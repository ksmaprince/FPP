package assignment2;

//Assignment Problem 6
public class Prog6 {

    static int min(int[] arrayOfInts){
        int min = arrayOfInts[0];
        for (int arrayOfInt : arrayOfInts) {
            if (min > arrayOfInt) {
                min = arrayOfInt;
            }
        }
        return min;
    }
    public static void main(String[] args) {

        int[] inputArr = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int minValue = min(inputArr);

        System.out.println("Minimum value: "+ minValue);
    }
}
