package Bolum_10_abstractinterface;

import java.util.ArrayList;

public class CokluKalitimGerekliligi {
    public static void main(String[] args) {
        /*MuslumBaba muslum = new MuslumBaba();
        muslum.sahnedeSigaraIc();*/
        PopSarkiciOzellikleri popSarkici1 = new Tarkan();
        PopSarkiciOzellikleri popSarkici2 = new Hadise();

        PopSarkiciOzellikleri dizi[] = new PopSarkiciOzellikleri[5];
        dizi[0] = popSarkici1;
        dizi[1] = popSarkici2;

        ArrayList<PopSarkiciOzellikleri> sarkicilar = new ArrayList<>();
        sarkicilar.add(popSarkici1);
        sarkicilar.add(popSarkici2);

        popSarkici1.sahnedeDansEt();

    }
}


abstract class Sarkici{
    abstract void sarkiSoyle();
}

interface ArabeskSarkiciOzellikleri {
    void sahnedeSigaraIc();
}

interface PopSarkiciOzellikleri {
    void sahnedeDansEt();
    void duetYap();
    static final int yas = 50;
}

class Tarkan implements PopSarkiciOzellikleri{
    @Override
    public void sahnedeDansEt() {
    }

    @Override
    public void duetYap() {

    }
}

class Hadise implements PopSarkiciOzellikleri{
    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}
class ArabeskSarkici extends Sarkici{
    @Override
    void sarkiSoyle() {
        System.out.println("Arabesk şarkıcı sahnede şarkı söylüyor.");
    }
}

class PopSarkicisi extends Sarkici{
    @Override
    void sarkiSoyle() {
        System.out.println("Pop şarkıcısı şarkı söylüyor.");
    }
}

class MuslumBaba implements ArabeskSarkiciOzellikleri, PopSarkiciOzellikleri {
    @Override
    public void sahnedeSigaraIc() {
        
    }

    @Override
    public void sahnedeDansEt() {

    }

    @Override
    public void duetYap() {

    }
}