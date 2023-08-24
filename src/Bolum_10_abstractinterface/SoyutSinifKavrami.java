package Bolum_10_abstractinterface;

public class SoyutSinifKavrami {
    public static void main(String[] args) {
       GeometrikSekil kare = new Kare(12);
       kare.cevreHesapla();
       kare.alanHesapla();
       ((Kare)kare).adiniSoyle();

       GeometrikSekil dikdortgen = new Dikdortgen(10,12);
       dikdortgen.cevreHesapla();
       dikdortgen.alanHesapla();
       ((Dikdortgen) dikdortgen).adiniSoyle();

       GeometrikSekil daire = new Daire(5);
       daire.cevreHesapla();
       daire.alanHesapla();

       alanlariKarsilastir(kare, dikdortgen);

       alanVeCevreyiSoyle(kare);
       alanVeCevreyiSoyle(dikdortgen);
       alanVeCevreyiSoyle(daire);
    }

    public static void alanVeCevreyiSoyle(GeometrikSekil gs1){
        gs1.cevreHesapla();
        gs1.alanHesapla();
    }

    public static void alanlariKarsilastir(GeometrikSekil gs1, GeometrikSekil gs2){
        if(gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından küçüktür.");
        }else if(gs1.getHesaplananAlan() > gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından büyüktür.");
        }else{
            System.out.println("Alanlar birbirine eşittir.");
        }
    }
}

abstract class GeometrikSekil{
    private int hesaplananAlan;
    private int birinciKenar;

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }

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
        setHesaplananAlan(getBirinciKenar()*getBirinciKenar());
        System.out.println("Karenin alanı: " +getHesaplananAlan());
    }

    public void adiniSoyle(){
        System.out.println("ben bir kareyim");
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
        setHesaplananAlan(getBirinciKenar()*ikinciKenar);
        System.out.println("Dikdörtgenin alanı: " +getHesaplananAlan());
    }

    public void adiniSoyle(){
        System.out.println("ben bir dikdörtgenim");
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
        setHesaplananAlan((int)(3.14*getBirinciKenar()*getBirinciKenar()));
        System.out.println("Dairenin alanı: " +getHesaplananAlan());
    }
}