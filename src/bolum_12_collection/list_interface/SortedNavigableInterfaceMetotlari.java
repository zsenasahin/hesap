package bolum_12_collection.list_interface;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedNavigableInterfaceMetotlari {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("1");
        treeSet.add("2");
        treeSet.add("3");
        treeSet.add("4");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("1",1);
        treeMap.put("2",2);
        treeMap.put("3",3);
        treeMap.put("4",4);

        //SortedSet ve SortedMap metotları
        System.out.println(treeMap.comparator());
        System.out.println(treeSet.comparator());

        TreeSet<String> yedekSet = (TreeSet<String>) treeSet.subSet("2","4");
        System.out.println(yedekSet);
        System.out.println(treeMap.subMap("2","4"));
        System.out.println(treeSet.headSet("2")); //baştan başla 2ye kadar git(2 dahil değil).
        System.out.println(treeMap.headMap("2")); //baştan başla 2ye kadar git(2 dahil değil).

        System.out.println(treeSet.tailSet("2")); //2den başla sona kadar git
        System.out.println(treeMap.tailMap("3")); //3ten başla sona kadar git

        System.out.println("Lower: " + treeSet.lower("3"));
        System.out.println("Lower: " + treeMap.lowerKey("3"));
        System.out.println("Floor: " + treeSet.floor("3")); //Verilen key değerine eşit veya ondan önce gelen en büyük değeri
        System.out.println("Floor: " + treeMap.floorKey("3")); //Verilen key değerine eşit veya ondan önce gelen en büyük değeri

        System.out.println("Ceiling: "  +treeSet.ceiling("3"));//Verilen key değerine eşit veya ondan bir büyük olan değeri verir.
        System.out.println("Ceiling: "  +treeMap.ceilingKey("3"));

        System.out.println("Higher: " +treeSet.higher("2")); //bir büyük
        System.out.println("Higher: " +treeMap.higherKey("2"));

        System.out.println(treeSet.pollFirst()); //ilk elemanı verir ve kaldırır
        System.out.println(treeMap);

        System.out.println(treeSet.pollLast()); //son elemanı verir ve kaldırır
        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
