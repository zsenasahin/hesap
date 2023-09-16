package Deneme;

import java.util.Scanner;

public class PalindromKelimeKontrolu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        System.out.println("Kelime giriniz: ");
        String kelime =scan.nextLine();
        String yeniKelime = "";

        for(int i = (kelime.length()-1); i>=0; i--){
            yeniKelime += kelime.charAt(i);
        }
        if(yeniKelime.equals(kelime)){
            System.out.println("Girilen kelime Palindrom bir kelimedir.");
        }else{
            System.out.println("Girdiğiniz kelime Palindrom bir kelime değildir.");
        }
    }
}
