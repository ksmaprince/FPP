package assignment2;

//Assignment Problem 4
public class Prog4 {
    public static void main(String[] args) {
        float var_1 = 1.27f;
        float var_2 = 3.881f;
        float var_3 = 9.6f;

        //Sum with integer casting
        int sum1 = (int) (var_1 + var_2 + var_3);

        //Sum with Math function
        int sum2 = Math.round(var_1) + Math.round(var_2) + Math.round(var_3);

        //Output each result
        System.out.println("Sum (int) : " + sum1);
        System.out.println("Sum (Math.round) : " + sum2);

    }
}
