package assignment8.prob3;

import java.util.*;

public class Main {

    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployeename().compareTo(o2.getEmployeename());
            }
        });
        List<Marketing> listMore100 = new ArrayList();
        for (Marketing marketing: list){
            if (marketing.saleamoount>1000)
                listMore100.add(marketing);
        }
        return listMore100;
    }
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        marketingList.add(new Marketing("Smith", "AAA", 800));
        marketingList.add(new Marketing("John", "BBB", 1200));
        marketingList.add(new Marketing("Randy", "CCC", 1500));
        marketingList.add(new Marketing("Richard", "DDD", 900));
        marketingList.add(new Marketing("Henry", "EEE", 890));
        marketingList.add(new Marketing("Peter", "FFF", 1000));
        marketingList.add(new Marketing("Michale", "GGG", 1500));
        marketingList.add(new Marketing("Paul", "HHH", 800));

        marketingList.remove(3);
        System.out.println("Size: "+ marketingList.size());
        System.out.println(marketingList);

        //Sort by SaleAmount
        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                if (o1.saleamoount > o2.saleamoount) return 1;
                else if (o1.saleamoount < o2.getSaleamoount()) return -1;
                else return 0;
            }
        });
        System.out.println(marketingList);

        List<Marketing> list = listMoreThan1000(marketingList);
        System.out.println(list);
    }
}
