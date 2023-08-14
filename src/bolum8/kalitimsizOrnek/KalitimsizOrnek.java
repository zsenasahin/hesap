package bolum8.kalitimsizOrnek;

public class KalitimsizOrnek {
    public static void main(String[] args) {
        Personel mudur = new Personel("ahmet", 123456, -8);
        System.out.println(mudur);

        Ogrenci emre = new Ogrenci("emre", 18,8521236, 8526);
        System.out.println(emre);
    }
}

class Personel extends Object{
    private String isim;
    private long tcKimlik;
    private int yas;

    public Personel() {
        isim = "Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Personel(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public Personel(String isim) {
        this.isim = isim;
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

class Ogrenci{
    private String isim;
    private int yas;
    private long tckimlik;
    private int okulNo;

    public Ogrenci() {
        isim = "Henüz atanmadı";
        tckimlik = 0;
        yas = 18;
        okulNo = 5000;
    }
    public Ogrenci(String isim, int yas, long tckimlik, int okulNo) {
        this.isim = isim;
        setYas(yas);
        this.tckimlik = tckimlik;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas >= 7)
            this.yas = yas;
        else this.yas = 7;
    }

    public long getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(long tckimlik) {
        this.tckimlik = tckimlik;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }


    @Override
    public String toString() {
        return "Ad:"+isim+ " tckimlik:"+ tckimlik + " yas:" +yas + " okul no:"+okulNo;
    }

}