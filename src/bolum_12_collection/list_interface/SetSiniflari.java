package bolum_12_collection.list_interface;

import java.util.*;

public class SetSiniflari {
    public static void main(String[] args) {
         HashSet<String> harfler = new HashSet<>();
         harfler.add("a");
         harfler.add("d");
         harfler.add("c");
         harfler.add("b");
         harfler.add("d");
         harfler.add("2");
         harfler.add("f");
         System.out.println(harfler);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("a");
        linkedHashSet.add("d");
        linkedHashSet.add("c");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("d");
        linkedHashSet.add("e");
        linkedHashSet.add("2");
        linkedHashSet.add("d");

        System.out.println(linkedHashSet); //ekleme sırasına göre tekrar etmeyenleri yazdır

        Object[] geciciDizi = linkedHashSet.toArray();
        System.out.println(geciciDizi[0].toString());

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("a");
        treeSet.add("1");
        treeSet.add("d");
        treeSet.add("c");
        treeSet.add("d");
        treeSet.add("d");
        treeSet.add("z");
        treeSet.add("d");
        treeSet.add("99");
        treeSet.add("e");
        treeSet.add("2");
        treeSet.add("d");

        //önce rakamlar, sonra a'dan z'ye
        System.out.println(treeSet);

        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
