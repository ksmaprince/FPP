package assignment3b;

public class Prog1 {
    static int count = 0;
    Prog1(){
        count++;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Prog1 instance = null;
        for (int i = 0; i<3; i++){
            instance = new Prog1();
        }
        System.out.println("Number of instances created: "+instance.getCount());
    }
}
