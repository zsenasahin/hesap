package baslangic;//package src;
import java.util.Arrays;

public class arraysSinifKullanimi {
    public static void main(String[] args) {
        int[] sayilar = {8,7,2,-8,14,19,11};
        int[] sayilar2 = {8,7,2,-8,14,19,11};
        System.out.println("Sıralama öncesi dizi :");
        diziYazdir(sayilar);

        Arrays.sort(sayilar);
        Arrays.sort(sayilar,2,5);
        Arrays.parallelSort(sayilar);
        System.out.println("\nSıralama sonrası dizi: ");
        diziYazdir(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, 11);
        System.out.println("\nsonuc: "+sonuc);

        System.out.println("sayilar1 ile sayilar 2 aynı mı ? \n" + Arrays.equals(sayilar,sayilar2));
        int[] yeniDizi = new int[20];
        //Arrays.fill(yeniDizi, 50); //Bütün elemanlar 50 olur.
        Arrays.fill(yeniDizi, 0,5,95); //0 ile 5e kadar ki elemanlar 95 gerisi 0.
        System.out.println("Yeni Dizi: \n");
        diziYazdir(yeniDizi);

    }


    public static void diziYazdir(int[] dizi){
        for(int i: dizi){
            System.out.print(i+",");
        }
    }
}
