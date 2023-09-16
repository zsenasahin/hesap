package Bolum_10_abstractinterface.access_modifiers;

public class PrivateKullanimi {
    //private sınıf tanımlamalarında kullanılamaz.
    //private değişken ve mototlar sadece o sınıfa aittir.
    //private yapılan kurucu metot o sınıftan nesne üretilmesini engeller. ve o sınıftan kalıtım ile yeni sınıf oluişturulamaz.
    //private ile inner sınıf tanımlanabilir.
    private int a;
    private void metot(){

    }

    public PrivateKullanimi(){

    }

    private class InnerClass{

    }
}

/*class yeniSinif extends PrivateKullanimi{

}*/