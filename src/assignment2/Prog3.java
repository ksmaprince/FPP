package assignment2;

//Assignment Problem No. 3
public class Prog3 {
    static String[] RemoveDups(String[] arr, String newStr) {
        //check the string contain in old array
        for (String str : arr) {
            if (str.equals(newStr)) {
                return arr;
            }
        }
        //Copy old array to new array
        String[] newArr = new String[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);

        //Add the new string to the last index of new array
        newArr[newArr.length - 1] = newStr;
        return newArr;
    }

    public static void main(String[] args) {

        String[] inputStrArr = {"horse", "dog", "cat", "horse", "dog", "cow", "dog", "tiger"};
        String[] noDupArr = {};

        //Checke duplicate and get a new no Duplicate array
        for (String s : inputStrArr) {
            noDupArr = RemoveDups(noDupArr, s);
        }

        //Output each value of the new array
        for (String s : noDupArr) {
            System.out.print(s + " ");
        }
    }
}
