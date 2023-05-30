import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*String name = "Robert";
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(0, name.length()));
        System.out.println(name.substring(0, 1));
        name.substring(0,0);
        System.out.println();

        System.out.println(name.indexOf('t'));
        System.out.println(name.indexOf("bert"));
        System.out.println();

        System.out.println(name.startsWith("Rob"));
        System.out.println(name.startsWith("R"));
        System.out.println(name.startsWith("bert"));
        System.out.println();
        String  space = " ";
        String lastName = "Stevens";
        System.out.println(name+space+lastName);
        System.out.println();
        System.out.println(name == "Robert");
        System.out.println(name.equals("Robert"));
        String newName = new String("Robert");
        System.out.println(newName == "Robert");
        System.out.println(newName.equals("Robert"));*/

        /*String movieName = "Harry Potter";
        System.out.println(movieName.substring(6, 12));

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);
        String str3 = new String("Hello");

        System.out.println(str2 == str3);
        String str4 = new String("Hello");

        System.out.println(str3 == str4);
        String str5 = str4;

        System.out.println(str4 == str5);*/

        int [] smallPrimes = {2, 3, 5, 7, 11};
        int [] copy = new int[5];
        System.arraycopy(smallPrimes, 0, copy, 0, 5);

        for (int smallPrime : smallPrimes) {
            System.out.print(smallPrime+" ");
        }
        System.out.println();

        for (int i : copy) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] luckyNums = {350, 400, 150, 200, 250};
        System.arraycopy(smallPrimes, 1, luckyNums, 3, 2);
        for (int luckyNum : luckyNums) {
            System.out.print(luckyNum+ " ");
        }
        System.out.println();

        Arrays.sort(luckyNums);
        for (int luckyNum : luckyNums) {
            System.out.print(luckyNum+ " ");
        }
    }
}