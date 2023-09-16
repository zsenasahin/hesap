package bolum_12_collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListelerinGezilmesi {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);
        sayilar1.add(4);

        ArrayList<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(3);
        sayilar2.add(4);
        sayilar2.add(5);
        sayilar2.add(6);

        System.out.println(sayilar1);
        System.out.println("For döngüsüyle gezmek");
        for(int i=0; i<sayilar1.size(); i++){
            System.out.println(sayilar1.get(i));
        }

        System.out.println("Gelişmiş for döngüsü");
        for(int gecici: sayilar1){
            System.out.println(gecici);
        }

        /*System.out.println("Sayılar1 ve 2 de ortak olan elemanlar sayılar1den çıkarılsın");

        for(int i=0; i<sayilar1.size(); i++){
            if(sayilar2.contains(sayilar1.get(i))){
                sayilar1.remove(i); //HATALI, index değişeceği için 4ü hiç görmez
            }
        }
        System.out.println("Çıkarılma işleminden sonra sayılar1: " +sayilar1);
*/
        System.out.println("Iterator ile listenin gezilmesi");
        Iterator<Integer> iterator = sayilar1.iterator();
        while(iterator.hasNext()){
            if(sayilar2.contains(iterator.next())){
                iterator.remove();
            }
        }
        System.out.println(sayilar1);

        System.out.println("List iterator ile listeyi gezmek");
        ListIterator<Integer> listIterator = sayilar2.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("List iterator ile listeyi sondan başa gezmek");
        ListIterator<Integer> listIteratorSondanBasa = sayilar2.listIterator(sayilar2.size());
        while(listIteratorSondanBasa.hasPrevious()){
            System.out.println("index: "+listIteratorSondanBasa.previousIndex()+ " Eleman: " + listIteratorSondanBasa.previous());
            listIteratorSondanBasa.add(7);
        }
    }
}
