package baslangic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class altincibolumsorulari {
    //SORU-1
    /*public static void main(String[] args) {
        int[] sayilar = new int[100];
        int toplam=0;
        float ortalama=0;
        for(int i=0; i<100; i++){
            sayilar[i] = (int) ((Math.random() * 100) + 1);
            toplam+=sayilar[i];
        }
        ortalama= toplam/100;
        for(int i: sayilar){
            System.out.print(i+ ",");
        }
        System.out.println("\nortalama: " +ortalama);
        int sayac=0;
        for(int i=0; i<100; i++){
            if(sayilar[i]<ortalama){
                sayac++;
            }
        }
        System.out.println("ortalamadan küçük eleman sayısı: " +sayac);
    }
*/
/*
    //SORU-2
    public static void main(String[] args) {
        int[][] matris = new int[5][5];
        int i,j;
        int toplam=0;
        for(i=0; i<3; i++){
            for(j=0; j<2; j++){
                matris[i][j] = (int) ((Math.random() * 11) + 1);
                System.out.print(" " + matris[i][j]);
                toplam+= matris[i][j];
            }
            System.out.print("\n");
        }
        System.out.println("toplam: " +toplam);
        int min = minBul(matris);
        System.out.println("en küçük: " +min);

        int max = maxBul(matris);
        System.out.println("en büyük: " +max);
    }

    public static int minBul(int[][] matris){
        int min = matris[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                if(matris[i][j] < min){
                    min = matris[i][j];
                }
            }
        }
        return min;
    }

    public static int maxBul(int[][] matris){
        int max = matris[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                if(matris[i][j] > max){
                    max = matris[i][j];
                }
            }
        }
        return max;
    }*/

    //SORU 4
    /*
    public static Scanner input;
    public static void main(String[] args){
        input = new Scanner(System.in);
        int sayi1=0;
        int sayi2=0;
        System.out.println("1. sayıyı giriniz: ");
        sayi1= input.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        sayi2= input.nextInt();
        input.close();
        int ebob=1;
        int ekok=1;
        for(int i=1; i<=sayi1 & i<=sayi2; i++){
            if(sayi1 % i == 0 && sayi2 % i == 0){
                ebob=i;
            }
        }
        ekok = (sayi1*sayi2)/ebob;
        System.out.println("ebob: " +ebob);
        System.out.println("ekok: " +ekok);
    }
*/

    //SORU-5
  /*  public static Scanner input;

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Toplam öğrenci sayısını giriniz");
        int ogrenciSayisi = tara.nextInt();
        System.out.println("Toplam soru sayısını giriniz");
        int soruSayisi = tara.nextInt();
        //5,10 ==> 5 x 10 matris
        char[][] tumCevaplar = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];
        cevapAnahtariOlustur(cevapAnahtari);
        ogrenciCevaplariniYerlestir(tumCevaplar);
        ogrenciCevaplariniGoruntule(tumCevaplar);
        System.out.println("cevap anahtarı: ");
        cevapAnahtariniGoruntule(cevapAnahtari);
        ogrencileriDegerlendir(cevapAnahtari, tumCevaplar);
    }
    private static void cevapAnahtariniGoruntule(char[] cevapAnahtari) {
        for (char secenek : cevapAnahtari){
            System.out.print(secenek+",");
        }
        System.out.println();
    }
    private static void ogrenciCevaplariniGoruntule(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
                System.out.print(tumCevaplar[satir][sutun]+ ",");
            }
            System.out.println();
        }
    }
    private static void ogrencileriDegerlendir(char[] cevapAnahtari, char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            int dogruCevapSayisi = 0;
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
                if (tumCevaplar[satir][sutun] == cevapAnahtari[sutun]) {
                    dogruCevapSayisi++;
                }
            }
            System.out.println(satir+" indexsindeki öğrencinin dogru cevap sayısı : "
                    +dogruCevapSayisi);
        }
    }
    private static void cevapAnahtariOlustur(char[] cevapAnahtari) {
        for (int i = 0; i < cevapAnahtari.length; i++) {
            cevapAnahtari[i] = cevapOlustur();
        }
    }
    private static void ogrenciCevaplariniYerlestir(char[][] tumCevaplar) {
        for (int satir = 0; satir < tumCevaplar.length; satir++) {
            for (int sutun = 0; sutun < tumCevaplar[satir].length; sutun++) {
                tumCevaplar[satir][sutun] = cevapOlustur();
            }
        }
    }
    public static char cevapOlustur() {
        int rastgeleSayi = 65 + (int) (Math.random() * 5);//0 1 2 3 4
        char uretilenSecenek = (char) rastgeleSayi;
        return uretilenSecenek;

    }*/


 //   SORU 6
    /*
 public static void main(String[] args) {
     int[][] matris = new int[5][5];
     int toplam=0;
     for(int i=0; i<5; i++){
         for(int j=0; j<5; j++) {
             matris[i][j] = (int) ((Math.random() * 9) + 1);
             System.out.print(matris[i][j] + " ");
         }
         toplam += matris[i][i];
         System.out.print("\n");
     }
     System.out.println("toplam: " +toplam);
 }*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Decimal tabanda sayı giriniz: ");
        int sayi = input.nextInt();
        int bolen=0;
        while(sayi>0){
            bolen = sayi%2;
            System.out.println(+bolen);
            sayi/=2;
        }

    }

}
