package assignment2;

//Assignment Problem 5
public class Prog5 {
    public static int[] combine(int[]a, int[]b){

        int[] newArr = new int[a.length + b.length];

        //Copy first array to new Array
        System.arraycopy(a, 0, newArr, 0, a.length);

        int index = a.length;
        //Assign each value of the element of second array to the rest index of new array
        for (int i : b) {
            newArr[index++] = i;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = { 3,8,9,11};
        int[] combinedArr = combine(a, b);

        //Output each element of the combined Array.
        for (int element : combinedArr) {
            System.out.print(element + " ");
        }
    }
}
