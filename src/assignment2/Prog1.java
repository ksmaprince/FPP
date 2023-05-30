package assignment2;

//Assignment Problem No.1
public class Prog1 {
    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        double PI = Math.PI;

        int x = rn.getRandomInt(1, 9);
        int y = rn.getRandomInt(3, 14);

        System.out.println("PI ^ x = " + Math.pow(PI, x));
        System.out.println("y ^ PI = " + Math.pow(y, PI));

    }
}
