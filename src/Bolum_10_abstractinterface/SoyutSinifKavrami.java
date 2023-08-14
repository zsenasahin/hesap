package Bolum_10_abstractinterface;

public class SoyutSinifKavrami {
    public static void main(String[] args) {

    }
}

abstract class GeometrikSekil{
    private int birinciKenar;

    abstract public void cevreHesapla();

    abstract public void alanHesapla();

    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}

class Kare extends GeometrikSekil{

    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Karenin çevresi: " +(getBirinciKenar()*4));
    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin alanı: " +getBirinciKenar()*getBirinciKenar());
    }
}

class Dikdortgen extends GeometrikSekil{

    public Dikdortgen(int birinciKenar, int ikinciKenar) {
        setBirinciKenar(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }

    private int ikinciKenar;

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }

    @Override
    public void cevreHesapla() {
        System.out.println("Dikdörtgenin çevresi: " + 2*(getBirinciKenar()+ikinciKenar));
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdörtgenin alanı: " + getBirinciKenar()*ikinciKenar);
    }
}

class Daire extends GeometrikSekil{

    public Daire(int yaricap){
        setBirinciKenar(yaricap);
    }
    @Override
    public void cevreHesapla() {
        System.out.println("Dairenin çevresi: " + 2*3.14*getBirinciKenar());
    }

    @Override
    public void alanHesapla() {

    }
}