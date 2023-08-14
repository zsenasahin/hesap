package bolum8.kalitimliOrnek;

public class kalitimliOrnek {
    public static void main(String[] args) {
        Personel mudur = new Personel("ahmet", 12345, 40, "müdür");
        System.out.println(mudur);

        Ogrenci emre = new Ogrenci("emre", 1234567, 20, 1215);
        System.out.println(emre);
    }
}

class Kisi{
    private String isim;
    private long tcKimlik;
    private int yas;

    public Kisi() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas >= 18)
            this.yas = yas;
        else this.yas = 18;
    }

    @Override
    public String toString() {
        return "Ad:"+isim+ " tckimlik:"+tcKimlik + " yas:" +yas;
    }
}

class Personel extends Kisi{
    private String pozisyonDegeri;

    public Personel(String isim, long tcKimlik, int yas, String pozisyonDegeri) {
        super(isim,tcKimlik,yas);
        this.pozisyonDegeri = pozisyonDegeri;
    }

    public String getPozisyonDegeri() {
        return pozisyonDegeri;
    }

    public void setPozisyonDegeri(String pozisyonDegeri) {
        this.pozisyonDegeri = pozisyonDegeri;
    }

    @Override
    public String toString() {
        return "Personel adı: " +getIsim() + " tc kimlik: " +getTcKimlik() + " yas:" + getYas() + " pozisyon:" + pozisyonDegeri;
    }
}

class Ogrenci extends Kisi{
    private int ogrenciNo;

    public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
        /*setYas(yas);
        setIsim(isim);
        setTcKimlik(tcKimlik);*/
        super(isim, tcKimlik, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Öğrenci adı:" +getIsim() +" tc kimlik:" +getTcKimlik()+ " yaş:" +getYas() + " Öğrenci no:" +ogrenciNo;
    }
}