package assignment8.prob1;

import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int size;
    public MyPersonList(){
        currentArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    //Add Element in last
    public void add(Person person){
        if (person == null) return;
        if (size == currentArray.length) resize();
        currentArray[size++] = person;
    }
    public Person get(int i){
        if (i<0 || i>=size){
            return null;
        }
        return currentArray[i];
    }

    private void resize(){
        System.out.println("Resizing");
        int len = currentArray.length;
        int newlen = 2 * len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray, 0, newArray,0, len);
        currentArray = newArray;
    }

    public boolean find(String s){
        if (s == null) return false;
        for (Person person: currentArray){
            if (person.getLast().equals(s)) return true;
        }
        return false;
    }

    public void insert(Person person, int pos){
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size+1 > currentArray.length){
            resize();
        }
        Person[] temp = new Person[currentArray.length+1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = person;

        System.arraycopy(currentArray, pos, temp, pos+1, currentArray.length-pos);
        currentArray = temp;
        ++size;
    }

    private boolean remove(Person person){
        if (size == 0) return false;
        if (person == null) return false;
        int index = -1;
        for (int i = 0; i<size; ++i){
            if (currentArray[i].getLast().equals(person.getLast())){
                index = i;
                break;
            }
        }
        if (index == -1) return false;// s is not found in the list
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index+1, temp, index, currentArray.length-(index + 1));
        currentArray = temp;
        --size;
        return true;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i<size-1; ++i){
            sb.append(currentArray[i]+", ");
        }
        sb.append(currentArray[size - 1]+"}");
        return sb.toString();
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public Object clone(){
        Person[] temp = Arrays.copyOf(currentArray, size);
        return temp;
    }

    public static void main(String[] args) {
        MyPersonList personList = new MyPersonList();
        personList.add(new Person("AAA", "AA1", 23));
        personList.add(new Person("BBB", "BB2", 26));
        personList.add(new Person("CCC", "CC3", 30));
        personList.add(new Person("DDD", "DD4", 18));
        System.out.println("\nNumber Element: "+personList.size);
        System.out.println("Length of the current array: "+personList.currentArray.length);

        personList.add(new Person("EEE", "EE5", 19));

        System.out.println("\nNumber Element: "+personList.size);
        System.out.println("Length of the current array: "+personList.currentArray.length);
        System.out.println(personList);

        personList.insert(new Person("XXX", "XX2", 21), 3);
        System.out.println("\nNumber Element: "+personList.size);
        System.out.println("Length of the current array: "+personList.currentArray.length);
        System.out.println(personList);


        personList.remove(new Person("DDD", "DD4", 20));
        System.out.println("\nNumber Element: "+personList.size);
        System.out.println("Length of the current array: "+personList.currentArray.length);
        System.out.println(personList);

        System.out.println(personList.find("EEE"));

        MyPersonList myPersonList2 = (MyPersonList) personList.clone();

        System.out.println(myPersonList2);

    }
}
