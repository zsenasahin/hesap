package bolum_14_exceptions.alistirmalar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Maas {
    public static void main(String[] args) {
        HashMap<String, Integer> maaslar = new HashMap<>();

        try(BufferedReader okuyucu = new BufferedReader(new FileReader("maas.txt"))){
            String oAnkiSatir = okuyucu.readLine();
            while(oAnkiSatir != null){
                String[] parcalar = oAnkiSatir.split(" ");
                System.out.println(oAnkiSatir);
                oAnkiSatir = okuyucu.readLine();
                if(parcalar.length == 2){
                    String isim = parcalar[0].trim();
                    int sayi = Integer.parseInt(parcalar[1].trim());
                    maaslar.put(isim,sayi);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("\n\n");

        List<Map.Entry<String,Integer>> siraliListe = new ArrayList<>(maaslar.entrySet());
        siraliListe.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for (Map.Entry<String, Integer> entry : siraliListe) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
