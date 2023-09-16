package Bolum_10_abstractinterface.access_modifiers;

public class ProtectedKullanimi {
    protected int sayi;
    protected void protectedMetot(){

    }

    protected class InnerProtectedSinif{

    }
}

class G extends ProtectedKullanimi{
    @Override
    protected void protectedMetot() {
        super.protectedMetot();
        System.out.println(sayi);
    }
}