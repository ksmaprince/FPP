package assignment3b;

public class Prog2 {
    int field1 = executeField1();
    int field2 = executeField2();

    static int field3 = executeField3();

    Prog2(){
        System.out.println("No argument Constructor");
    }

    Prog2(int i){
        System.out.println("One argument Constructor");
    }

    static {
        System.out.println("2 - 1st static block initialize ...");
    }
    static {
        System.out.println("3 - 2nd static block initialize ...");
    }
    {
        System.out.println("6 - 1st instance block initialize ... ");
    }
    {
        System.out.println("7 - 2nd instance block initialize ... ");
    }
    public int executeField1(){
        System.out.println("4 - 1st instance field initialize ... ");
        return 1;
    }

    public int executeField2(){
        System.out.println("5 - 2nd instance field initialize ... ");
        return 1;
    }

    public static int executeField3(){
        System.out.println("1 - Static field initialize ... ");
        return 1;
    }

    public int instanceMethod1(){
        System.out.println("1st Instance Method invoke ... ");
        return 0;
    }

    public int instanceMethod2(){
        System.out.println("2nd Instance Method invoke ... ");
        return 0;
    }

    public static int staticMethod1(){
        System.out.println("1st Static Method invoke ...");
        return 0;
    }

    public static int staticMethod2(){
        System.out.println("2nd Static Method invoke ...");
        return 0;
    }

    public static void main(String[] args) {
        //Testing
        Prog2 p = new Prog2();
        System.out.println("========================================================");

        p.instanceMethod1();
        Prog2.staticMethod1();
        System.out.println("========================================================");

        Prog2 p1 = new Prog2(1);
        System.out.println("========================================================");

        p1.instanceMethod2();
        Prog2.staticMethod2();
        System.out.println("========================================================");

        new Prog2();
        System.out.println("========================================================");

        new Prog2(5);
        System.out.println("========================================================");

    }
}
