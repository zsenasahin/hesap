package bolum_13_collections_project.udemyKursPlayer;

import java.util.ArrayList;

public class Kurs {
    private String kursAdi;
    private ArrayList<Ders> kurstakiDersler;
    private ArrayList<Egitmen> kursEgitmenleri;
    private ArrayList<Ogrenci> kursOgrencileri;
    private boolean yayinda; //Ders sayısı en az 5 ve toplam içerik en az 60 dk olmalı.

    public String getKursAdi() {
        return kursAdi;
    }

    public Kurs(String kursAdi, Egitmen basEgitmen) {
        this.kursAdi = kursAdi;
        this.kurstakiDersler = new ArrayList<>();
        this.kursEgitmenleri = new ArrayList<>();
        this.kursOgrencileri = new ArrayList<>();
        kursEgitmenleri.add(0,basEgitmen);
        this.yayinda = false;
    }

    public ArrayList<Ogrenci> getKursOgrencileri() {
        return kursOgrencileri;
    }

    public Kurs(String javaKursu, String emre) {
    }

    public void kursaEgitmenEkle(Egitmen yeniEgitmen){
        if(!kursEgitmenleri.contains(yeniEgitmen)){
            kursEgitmenleri.add(yeniEgitmen);
            System.out.println(yeniEgitmen.getIsim() + "kursa eğitmen olarak eklendi");
        }else{
            System.out.println(yeniEgitmen.getIsim()+" zaten kursta kayıtlı bir eğitmendir");
        }
    }
    public void kurstaEgitmenSil(Egitmen silinecekEgitmen){
        if(silinecekEgitmen.getIsim().equals(kursEgitmenleri.get(0).getIsim())){
            System.out.println(silinecekEgitmen.getIsim() + " kursun baş eğitmeni o yüzden silinemez");
        }else{
            kursEgitmenleri.remove(silinecekEgitmen);
            System.out.println(silinecekEgitmen.getIsim()+ " kurs eğitmenliğinden çıkarıldı.");
        }
    }

    public void kursaDersEkle(Ders eklenecekDers){
        kurstakiDersler.add(eklenecekDers);
    }
    public int kurstakiDersSayisi(){
        return kurstakiDersler.size();
    }
    private int kurstakiToplamDakikaSuresi(){
        double toplamSure = 0;
        for(Ders ders : kurstakiDersler){
            toplamSure = toplamSure + ders.getDakika();
        }
        return (int)toplamSure;
    }

    public boolean kursYayindaMiKontrol(){
        if(kurstakiDersler.size() >= 5 && kurstakiToplamDakikaSuresi()> 60){
            yayinda = true;
            return true;
        }else return false;
    }
    public void kursaOgrenciEkle(Ogrenci kursOgrencisi){
        if(kursYayindaMiKontrol()){
            kursOgrencileri.add(kursOgrencisi);
        }
    }

    public ArrayList<Ders> getKurstakiDersler() {
        return kurstakiDersler;
    }
}






