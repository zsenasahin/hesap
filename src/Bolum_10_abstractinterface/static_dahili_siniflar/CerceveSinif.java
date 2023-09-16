package Bolum_10_abstractinterface.static_dahili_siniflar;

public class CerceveSinif {
    int nesneDegiskeni;
    static int staticDegisken;
    public void metot(){

    }
    static void statikMetot(){}

    static class icSinif{
        int icSinifNesneDegiskeni;
        static int icSinifStaticDegisken;
        public void icSinifMetot(){
            staticDegisken++;
            statikMetot();
        }
        static void setIcSinifStaticMetot(){ //burası abstract olamaz

        }
    }
}
