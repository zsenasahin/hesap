package bolum_14_exceptions.alistirmalar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Alistirmalar {
    public static void main(String[] args) {
        int toplamKarakterSayisi = 0;
        int toplamKelimeSayisi = 0;
        int toplamSatirSayisi = 0;
        HashMap<String, Integer> kelimeTekrarMap = new HashMap<>();

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("istiklalMarsi.txt"))){
            String oAnkiSatir = okuyucu.readLine();
            while(oAnkiSatir != null){
                toplamSatirSayisi++;

                String[] satirdakiKelimeDizisi = oAnkiSatir.toLowerCase().split(" ");

                toplamKelimeSayisi = toplamKelimeSayisi + satirdakiKelimeDizisi.length;

                for(String kelime : satirdakiKelimeDizisi){
                    if(kelimeTekrarMap.containsKey(kelime)){
                        kelimeTekrarMap.put(kelime,kelimeTekrarMap.get(kelime)+1);
                    }else{
                        kelimeTekrarMap.put(kelime,1);
                    }
                    toplamKarakterSayisi = toplamKarakterSayisi + kelime.length();
                }

                oAnkiSatir = okuyucu.readLine();
            }
            System.out.println("Toplam satır sayısı: " +toplamSatirSayisi);
            System.out.println("Toplam kelime sayısı: " +toplamKelimeSayisi);
            System.out.println("Toplam karakter sayısı: " +toplamKarakterSayisi);

            int tekrarSayisi = 0;
            String enCokTekrarEdenKelime = null;
            for(Map.Entry<String, Integer> temp : kelimeTekrarMap.entrySet()){
                if(temp.getValue() > tekrarSayisi && !temp.getKey().equals("")){
                    enCokTekrarEdenKelime = temp.getKey();
                    tekrarSayisi = temp.getValue();
                }
            }
            System.out.println("En çok tekrar eden kelime: " +enCokTekrarEdenKelime + "\nTekrar sayısı: " + tekrarSayisi);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
