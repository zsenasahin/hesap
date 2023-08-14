package oop_giris;

public class ImmutableVeMetotaNesneGondermek {
    public static void main(String[] args) {
        String[] ureticiFirmalari = {"HP", "FUJİTSU", "DELL"};
        Bilgisayar b1 = new Bilgisayar(8,16,new String[] {"HP", "FUJİTSU", "DELL"});
        bilgisayariYazdir(b1);
        String[] ureticiler = b1.getUreticiFirmalari();
        ureticiler[0] = "Apple";
        bilgisayariYazdir(b1);
    }

    private static void bilgisayariYazdir(Bilgisayar yazdirilacakPC) {
        System.out.println("çekirdek sayısı: " + yazdirilacakPC.getCekirdekSayisi() + " ram miktari: "+yazdirilacakPC.getRamBoyutu() +" üretici firmalar: " +yazdirilacakPC.getUreticiFirmalari()[0]);
    }

    public void bilgisayarYazdir(){}
}

class Bilgisayar{
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalari;

    public Bilgisayar(int cSayisi, int ramBoyutu, String[] ureticiFirmaAdlari){
        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalari = ureticiFirmaAdlari;

    }
    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalari() {
        String[] kopyaFirmaIsimleri = new String[ureticiFirmalari.length];
        for(int i=0; i<ureticiFirmalari.length; i++){
            kopyaFirmaIsimleri[i] = ureticiFirmalari[i];
        }
        return kopyaFirmaIsimleri;
    }

}
