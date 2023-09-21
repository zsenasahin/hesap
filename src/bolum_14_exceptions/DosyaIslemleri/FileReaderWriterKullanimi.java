package bolum_14_exceptions.DosyaIslemleri;

import java.io.*;

public class FileReaderWriterKullanimi {
    public static void main(String[] args) {
        veriYazma();
        veriOkuma();

    }

    private static void veriOkuma() {
        try(BufferedReader okuyucu = new BufferedReader(new FileReader("karakter.txt"))){
            String s;
            while((s= okuyucu.readLine()) != null){
                System.out.println(s);
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void veriYazma() {
        try(BufferedWriter yazici = new BufferedWriter(new FileWriter("karakter.txt", true))){
            yazici.write("Merhaba ");
            yazici.newLine();
            yazici.write("Ben Sena\n");
            yazici.write("Dosya Sonu\n\n\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
