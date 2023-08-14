package donguler_calismaSorulari;

import java.util.Scanner;

//en buyuk 2. sayiyi bulan program kodu
public class soru2 {
    public static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        int[] sayilar = new int[10];
        for(int i=0; i<10; i++){
            System.out.println( +(i+1) + "inci sayiyi giriniz: ");
            sayilar[i] = input.nextInt();
        }
        int ikinciMax = ikinciMaxBul(sayilar);
        System.out.println("ikinci en büyük sayı: " +ikinciMax);
        input.close();
    }

    private static int ikinciMaxBul(int[] sayilar) {
        int enBuyuk = sayilar[0];
        int ikinciEnBuyuk = sayilar[0];
        for(int i=0; i<10; i++){
            if(sayilar[i] > enBuyuk){
                ikinciEnBuyuk = enBuyuk;
                enBuyuk = sayilar[i];
            }
            else if(sayilar[i]> ikinciEnBuyuk){
                ikinciEnBuyuk = sayilar[i];
            }
        }
        return ikinciEnBuyuk;
    }
}
