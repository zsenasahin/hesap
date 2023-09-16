package Deneme;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgeleSayi = 1 + rastgele.nextInt(49);
        System.out.println("Rastgele atanan sayi 1 ile 50 arasındadır");
        int sayi, sayac = 0;

        do{
            System.out.println("Bir sayı giriniz: ");
            sayi = scan.nextInt();
            if(sayi>rastgeleSayi){
                System.out.println("Sayıyı küçültün.");
            }else if(sayi< rastgeleSayi){
                System.out.println("Sayıyı büyültün.");
            }
            sayac++;
        }
        while (sayi!= rastgeleSayi);
            System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz..");
    }
}
