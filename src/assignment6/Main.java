package assignment6;

public class Main {
    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('c', "Charlie");
        String s = t.get('b');
        System.out.println(s);

        System.out.println(t);
    }
}
