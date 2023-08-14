package oop_giris;

public class StaticKavrami {
    public static void main(String[] args) {
        Memur m1 = new Memur();
        m1.setIsim("Emre");
        m1.setMaas(4000);

        Memur m2 = new Memur();
        m2.setIsim("Sena");
        m2.setMaas(4500);

        Memur m3 = new Memur();
        m3.setIsim("Ali");
        m3.setMaas(5000);

        m3 .bilgileriGoster();
        Memur.kanunuSoyle();
        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();
        System.out.println("Nesne sayısı m1: " +m1.olusturulanMemurNesnesi);
        System.out.println("Nesne sayısı m2: " +m2.olusturulanMemurNesnesi);
        System.out.println("Nesne sayısı m3: " +m3.olusturulanMemurNesnesi);
        System.out.println("Nesne sayısı sınıfı: " +Memur.olusturulanMemurNesnesi);
    }
}

class Memur{
    private String isim;
    private int maas;
    public static int olusturulanMemurNesnesi;

    public Memur(){
        olusturulanMemurNesnesi ++;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas < 0){
            maas = 0;
        }else{
            this.maas = maas;
        }
    }

    public static void kanunuSoyle(){
        System.out.println("657 nolu kanun geçerli");
    }
    public void bilgileriGoster(){
        kanunuSoyle();
        System.out.println("Oluşturulan memur nesnesi: " +olusturulanMemurNesnesi);
    }

}