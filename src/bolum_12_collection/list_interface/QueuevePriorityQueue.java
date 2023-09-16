package bolum_12_collection.list_interface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuevePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Ogrenci> ogrenciKuyruk = new PriorityQueue<>();
        ogrenciKuyruk.offer(new Ogrenci(1,82));
        ogrenciKuyruk.offer(new Ogrenci(3,70));
        ogrenciKuyruk.offer(new Ogrenci(2,96));
        ogrenciKuyruk.offer(new Ogrenci(6,12));
        ogrenciKuyruk.offer(new Ogrenci(5,18));

        while(!ogrenciKuyruk.isEmpty()){
            System.out.println(ogrenciKuyruk.poll());
        }

        /*PriorityQueue<String> isimler = new PriorityQueue<>();
        isimler.offer("can");
        isimler.offer("ayşe");
        isimler.offer("beyhan");
        isimler.offer("beril");
        isimler.offer("emre");
        isimler.offer("ali");
        //System.out.println(isimler);
        while(!isimler.isEmpty()){
            System.out.println(isimler.poll());
        }
        System.out.println("remove ile dene");

        while(!isimler.isEmpty()){
            System.out.println(isimler.remove());
        }

        Iterator<String> iterator = isimler.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //System.out.println(isimler);
*/
        /*Queue<Integer> sayilar = new LinkedList<>();
        sayilar.offer(1);
        sayilar.offer(2);
        sayilar.offer(3);
        sayilar.offer(3);
        sayilar.offer(23);
        sayilar.add(2);
        System.out.println(sayilar.peek());//görüyor ama kaldırmıyor
        System.out.println(sayilar.poll()); //Kuyrugun başındakini alır ve kuyruktan çıkarır.
        System.out.println(sayilar);*/
    }
}  class Ogrenci implements Comparable<Ogrenci>{
        int id;
        int notDegeri;

        public Ogrenci(int id, int notDegeri) {
            this.id = id;
            this.notDegeri = notDegeri;
        }

        @Override
        public int compareTo(Ogrenci o) {
            if(this.notDegeri>o.notDegeri){
                return 1;
            }else if(this.notDegeri<o.notDegeri){
                return -1;
            }else{
                return 0;
            }
        }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", notDegeri=" + notDegeri +
                '}';
    }
}

