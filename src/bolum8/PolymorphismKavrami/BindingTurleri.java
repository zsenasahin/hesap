package bolum8.PolymorphismKavrami;

public class BindingTurleri {
    public static void main(String[] args) {
    /*    UstSinif.adiniSoyleStatic();
        AltSinif.adiniSoyleStatic();

        UstSinif ustSinifNesnesi = new UstSinif();
        ustSinifNesnesi.adiniSoyleStatic();

        AltSinif altSinifNesnesi = new AltSinif();
        altSinifNesnesi.adiniSoyleStatic();

        UstSinif ustSinif = new AltSinif();
        ustSinif.adiniSoyleStatic(); */

        UstSinif ustSinif = new UstSinif();
        ustSinif.adiniSoyle();

        AltSinif altSinif = new AltSinif();
        altSinif.adiniSoyle();

        UstSinif ustSinif1 = new AltSinif();
        ustSinif1.adiniSoyle();
    }
}

class UstSinif{
    public static void adiniSoyleStatic(){
        System.out.println("Üst sınıfın static adını söyle metotu çağırıldı.");
    }
    public void adiniSoyle(){
        System.out.println("Üst sınıfın adını söyle metotu çağırıldı.");
    }
}

class AltSinif extends UstSinif{
    public static void adiniSoyleStatic(){
        System.out.println("Alt sınıfın static adını söyle metotu çağırıldı.");
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Alt sınıfın adını söyle metotu çağırıldı.");
    }
}