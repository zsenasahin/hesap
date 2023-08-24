package Bolum_10_abstractinterface;

import java.util.ArrayList;

public class InterfaceKavrami {
    public static void main(String[] args) {
        Elma a = new Elma();
        Yenilebilir aa = new Elma();
        Yenilebilir bb = new Inek();
        ArrayList<Yenilebilir> yenilebilenSeyler = new ArrayList<>();
    }
}

interface Yenilebilir{
    void yenmeSekli();
}

class Elma implements Yenilebilir{
    @Override
    public void yenmeSekli() {

    }
}

class Inek implements Yenilebilir{
    @Override
    public void yenmeSekli() {

    }
}