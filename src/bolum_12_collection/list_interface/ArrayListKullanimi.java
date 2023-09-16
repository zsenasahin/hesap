package bolum_12_collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListKullanimi {
    public static void main(String[] args) {
        //Bellekte 10 tane eleman tutan bir arraylist oluşturur.
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        //Verdiğiniz değer kadar eleman tutacak bir arraylist oluşturur.
        ArrayList<String> isimler = new ArrayList<>(20);
        isimler.add("sena");
        isimler.add("zeynep");
        isimler.add("fatma");
        //ArrayList'i verilen sayı kadar eleman tutacak şekilde arttırır.
        isimler.ensureCapacity(100);
        //ArrayList'i sadece içindeki eleman tutacak şekilde küçültür.
        isimler.trimToSize();

        ArrayList<String> isimlerYedek = new ArrayList<>(isimler);
        //eleman sayısını gösterir
        System.out.println(isimlerYedek.size());
        //liste boş ise true
        System.out.println(isimlerYedek.isEmpty());
        isimlerYedek.clear();
        System.out.println(isimlerYedek.isEmpty());

        //Belirtilen elemanı listede arar bulursa true bulamazsa false
        System.out.println(isimler.contains("Hasan"));
        System.out.println(isimler.contains("fatma"));

        String[] isimlerDizisi = (String[]) isimler.toArray(new String[0]);
        System.out.println(isimlerDizisi[1]);

        //Belirli indexte ki elemanı okumak
        System.out.println(isimler.get(0));

        //Belirli indexteki elemanı güncellemek
        isimler.set(0,"yeni sena");
        System.out.println(isimler.get(0));

        //Belirli bir indexse eleman yerleştirmek
        isimler.add(2,"Hayriye");
        System.out.println(isimler);

        //Belirli bir indexteki elemanı silmek
        isimler.remove("hayriye");
        isimler.remove(2);
        System.out.println(isimler);
        isimler.add("Kemal");
        isimler.add("Mustafa");
        isimler.add("Can");
        System.out.println(isimler);

        //Belirli indexler arasındaki elemanları yeni bir listeye atamak
        List<String> yeniIsimlerListesi = isimler.subList(1,3); // 3 dahil değil
        System.out.println(yeniIsimlerListesi);

        ArrayList<String> erkekIsimleri = new ArrayList<>();
        erkekIsimleri.add("Emre");
        erkekIsimleri.add("ali");
        ArrayList<String> kadinIsimleri = new ArrayList<>();
        kadinIsimleri.add("Yeliz");
        kadinIsimleri.add("Ceren");

        //İki listeyi birleştirmek, belirli bir indexten sonra birleştirmek
        erkekIsimleri.addAll(kadinIsimleri);
        System.out.println(erkekIsimleri);
        erkekIsimleri.addAll(0,kadinIsimleri);
        System.out.println(erkekIsimleri);

        //Arrayi  listeye dönüştürmek
        String[] sehirler = {"ankara", "bursa", "izmir"};
        List<String> sehirlerListe;

        sehirlerListe = Arrays.asList(sehirler);
        System.out.println(sehirlerListe);

        ArrayList<String> sehirler2 = new ArrayList<>(Arrays.asList(sehirler));
        System.out.println(sehirler2);

        List<String> sehirler3 = new ArrayList<>();
        Collections.addAll(sehirler3,sehirler);
        System.out.println(sehirler3);

    }
}
