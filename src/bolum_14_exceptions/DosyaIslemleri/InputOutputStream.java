package bolum_14_exceptions.DosyaIslemleri;

import java.io.*;
import java.util.ArrayList;

public class InputOutputStream {
    public static void main(String[] args) {
        dosyayaYaz();
        dosyadanOku();
    }

    private static void dosyadanOku() {
        ArrayList<Ogrenci> ogrenciArrayList = new ArrayList<>();
        boolean dosyaSonu = false;

        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")))){
            Ogrenci okunanOgrenci;
            while (!dosyaSonu) {
                try {
                    int id = dataInputStream.readInt();
                    String isim = dataInputStream.readUTF();
                    boolean aktif = dataInputStream.readBoolean();
                    okunanOgrenci = new Ogrenci(id, isim, aktif);
                    ogrenciArrayList.add(okunanOgrenci);
                    System.out.println("Ogrenci 1: " + okunanOgrenci);
                } catch (EOFException e) {
                    System.out.println("Dosya sonuna gelindi");
                    dosyaSonu = true;
                }

            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(ogrenciArrayList.size());

        /*try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));
            Ogrenci okunanOgrenci;
            while (!dosyaSonu) {
                try {
                    int id = dataInputStream.readInt();
                    String isim = dataInputStream.readUTF();
                    boolean aktif = dataInputStream.readBoolean();
                    okunanOgrenci = new Ogrenci(id, isim, aktif);
                    ogrenciArrayList.add(okunanOgrenci);
                    System.out.println("Ogrenci 1: " + okunanOgrenci);
                } catch (EOFException e) {
                    System.out.println("Dosya sonuna gelindi");
                    dosyaSonu = true;
                }

            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(dataInputStream != null){
                try {
                    dataInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println(ogrenciArrayList.size());*/

    }

    private static void dosyayaYaz() {
        Ogrenci ogrenci1 = new Ogrenci(1,"emre", false);
        Ogrenci ogrenci2 = new Ogrenci(2,"hasan", true);
        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")))){
            dataOutputStream.writeInt(ogrenci1.id);
            dataOutputStream.writeUTF(ogrenci1.isim);
            dataOutputStream.writeBoolean(ogrenci1.aktif);

            dataOutputStream.writeInt(ogrenci2.id);
            dataOutputStream.writeUTF(ogrenci2.isim);
            dataOutputStream.writeBoolean(ogrenci2.aktif);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class Ogrenci{
    int id;
    String isim;
    boolean aktif;

    public Ogrenci(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}
