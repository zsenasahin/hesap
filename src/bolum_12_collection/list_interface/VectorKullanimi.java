package bolum_12_collection.list_interface;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorKullanimi {
    public static void main(String[] args) {
        Vector<String> sehirler = new Vector<>(14);

        System.out.println(sehirler.capacity());
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Bursa");
        sehirler.add("Ankara");
        System.out.println(sehirler.capacity());
        //sehirler.setSize(20);
        System.out.println(sehirler);

        System.out.println(sehirler.firstElement());
        System.out.println(sehirler.lastElement());

        for(int i=0; i<sehirler.size(); i++){
            System.out.print(sehirler.get(i) + ",");
        }

        System.out.println("\nİterator ile gezinti");
        Iterator<String> iterator = sehirler.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ ",");
        }
        System.out.println("\nEnumeration ile gezinti");
        Enumeration<String> enumeration = sehirler.elements();
        while(enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement() + ",");
        }
    }
}
