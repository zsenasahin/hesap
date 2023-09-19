package bolum_13_collections_project.udemyKursPlayer;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ogrenci extends Kisi{
    private ArrayList<Kurs> katildigiKurslar;
    private LinkedList<Ders> izlenecekDersler;
    public Ogrenci(String isim, String tanitimYazisi, String kullaniciAdi) {
        super(isim, tanitimYazisi, kullaniciAdi);
        katildigiKurslar = new ArrayList<>();
        izlenecekDersler = new LinkedList<>();
    }

    @Override
    public String toString() {
        return super.toString() + "Ogrenci{" +
                "katildigiKurslar=" + katildigiKurslar +
                '}';
    }

    public void kursaKatil(Kurs javaKursu) {
        if(javaKursu.kursYayindaMiKontrol()){
            javaKursu.getKursOgrencileri().add(this);
            katildigiKurslar.add(javaKursu);
            System.out.println(this.getIsim() + " kullanıcısı " + javaKursu.getKursAdi() + " kursuna katıldı");
        }else{
            System.out.println(javaKursu.getKursAdi() + " isimli kurs yayında değil, katılamazsınız.");
        }
    }

    public void izlenecekDersEkle(Ders izlenecekDers){
        boolean dersBulundu = false;
        if(katildigiKurslar.size()> 0){
            for(Kurs gecici: katildigiKurslar){
                if(gecici.getKurstakiDersler().contains(izlenecekDers)){
                    System.out.println("Izlenecekler listesine" + gecici.getKursAdi() + " dersi eklendi");
                    izlenecekDersler.add(izlenecekDers);
                    dersBulundu = true;
                    break;
                }
            }
            if(!dersBulundu){
                System.out.println("Girilen ders kurslarda bulunamadı veya yetkisiz erişim.");
            }
        }
    }
}
