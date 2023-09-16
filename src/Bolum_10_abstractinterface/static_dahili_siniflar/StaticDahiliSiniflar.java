package Bolum_10_abstractinterface.static_dahili_siniflar;

public class StaticDahiliSiniflar {
    public static void main(String[] args) {
        CerceveSinif cerceveSinif = new CerceveSinif();
        cerceveSinif.nesneDegiskeni = 5;
        cerceveSinif.metot();
        cerceveSinif.statikMetot();
        CerceveSinif.statikMetot();

        CerceveSinif.icSinif icSinif = new CerceveSinif.icSinif();
        icSinif.icSinifNesneDegiskeni = 5;
        icSinif.icSinifMetot();
        CerceveSinif.icSinif.setIcSinifStaticMetot();
        CerceveSinif.icSinif.icSinifStaticDegisken = 52;
    }
}
