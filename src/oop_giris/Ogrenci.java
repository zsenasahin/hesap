package oop_giris;

public class Ogrenci {
    private int ogrenciNo;
    private String isim;
    private byte sinif;
    private boolean aktif;


    public void setOgrenciNo(int yeniOgrenciNo){
        this.ogrenciNo = yeniOgrenciNo;
    }

    public int getOgrenciNo(){
        return this.ogrenciNo;
    }

    public String getIsim(){
        return isim;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public void setIsim(String isim){
        this.isim = isim;
    }
    public byte getSinif(){
        return sinif;
    }

    public void setSinif( byte sinif){
        this.sinif = sinif;
    }


 /*  private public Ogrenci(){

    }*/

   public Ogrenci(int ogrenciNo){
        this.ogrenciNo = ogrenciNo;
    }
    public Ogrenci(int ogrenciNo, String isim){
        this(ogrenciNo);
        this.isim = isim;
    }
    /*public Ogrenci(){
        System.out.println("Öğrenci nesnesi oluşturuluyor.");
        aktif = true;
    }*/

    public Ogrenci(int ogrenciNo, String isim, byte sinif, boolean aktif){
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.sinif =sinif;
        this.aktif = aktif;

    }
    public void dersAl() {
        System.out.println("Öğrenci ders alıyor.");
    }

    public void ogrenciBilgileriniYazdir(){
        if(aktif){
            System.out.println("Adım : " +isim + " numaram : " +ogrenciNo + " sınıfım : " +sinif );
        }else{
            System.out.println("Bu öğrenci aktif değil.");
        }
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo=" + ogrenciNo +
                ", isim='" + isim + '\'' +
                ", sinif=" + sinif +
                ", aktif=" + aktif +
                '}';
    }
}

