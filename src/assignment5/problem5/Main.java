package assignment5.problem5;

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("Dell", "Intel", 16, 2.4);
        Computer c2 = new Computer("HP", "AMD", 8, 2.4);
        Computer c3 = new Computer("Dell", "Intel", 16, 2.4);

        System.out.println("<<Printing Info .............>>");
        System.out.println("Computer-1: "+c1);
        System.out.println("Computer-2: "+c2);
        System.out.println("Computer-3: "+c3);
        System.out.println("===========================\n");

        System.out.println("<<Checking & Printing Equal()>>");
        System.out.println("Computer-1 == Computer2 => "+c1.equals(c2));
        System.out.println("Computer-1 == Computer3 => "+c1.equals(c3));
        System.out.println("Computer-2 == Computer3 => "+c2.equals(c3));
        System.out.println("===========================\n");

        System.out.println("<<Printing HashCode()>>");
        System.out.println("Hash Code(Computer1) "+c1.hashCode());
        System.out.println("Hash Code(Computer2) "+c2.hashCode());
        System.out.println("Hash Code(Computer3) "+c3.hashCode());
        System.out.println("===========================\n");

        System.out.println("<<Checking HashCode()>>");
        System.out.println("Computer-1 == Computer2 => "+(c1.hashCode() == c2.hashCode()));
        System.out.println("Computer-1 == Computer3 => "+(c1.hashCode() == c3.hashCode()));
        System.out.println("Computer-2 == Computer3 => "+(c2.hashCode() == c3.hashCode()));
    }
}
