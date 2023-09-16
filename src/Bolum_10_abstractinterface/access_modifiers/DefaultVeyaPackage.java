package Bolum_10_abstractinterface.access_modifiers;

public class DefaultVeyaPackage {
    //aynı paket olduğu sürece sıkıntı yok.
    int sayi = 5;
    void metot(){

    }

    class InnerClass{

    }
}

class Y extends DefaultVeyaPackage{
    @Override
    void metot() {
        System.out.println(sayi);
    }
}