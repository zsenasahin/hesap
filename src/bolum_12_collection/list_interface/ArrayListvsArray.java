package bolum_12_collection.list_interface;

import java.util.ArrayList;

public class ArrayListvsArray {
    public static void main(String[] args) {
        ArrayList<String> isimlerListesi = new ArrayList<>();
        String[] isimlerDizisi = new String[100000];

        long baslamaZamani = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            isimlerDizisi[i] = "deneme" +i;
        }
        long bitmeZamani = System.currentTimeMillis();

        System.out.println("Dizi çalışma süresi: " + (bitmeZamani -baslamaZamani));

        baslamaZamani = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            isimlerListesi.add("deneme" +i);
        }
        bitmeZamani = System.currentTimeMillis();

        System.out.println("Liste çalışma süresi: " + (bitmeZamani -baslamaZamani));

    }
}
