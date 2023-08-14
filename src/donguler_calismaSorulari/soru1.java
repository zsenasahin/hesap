package donguler_calismaSorulari;

import java.util.Scanner;

//Klavyeden girilen 10 adet tam sayıdan en büyüğünü bulan kod
public class soru1 {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int[] sayilar = new int[10];
        for(int i=0; i<10; i++){
            System.out.println( +(i+1) + "inci sayiyi giriniz: ");
            sayilar[i] = input.nextInt();
        }
        int max = maxBul(sayilar);
        System.out.println("max: " +max);
        input.close();
    }

    public static int maxBul(int[] sayilar){
        int enBuyuk = sayilar[0];
        for(int i=0; i<10; i++){
            if(sayilar[i]> enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        return enBuyuk;
    }
}
