package Bolum_10_abstractinterface.member_innerclass_ornek;

public class main {
    public static void main(String[] args) {
        HesapMakinesi hm = new HesapMakinesi();
        HesapMakinesi.Topla toplayici = hm.new Topla();
        int toplam = toplayici.topla(5,6);
        System.out.println("Toplam: " +toplam);

        HesapMakinesi.Cikar cikarici = hm.new Cikar();
        int fark = cikarici.cikar(9,4);
        System.out.println("Fark: " +fark);

        int carpim =hm.carp(6,4);
        System.out.println("Çarpım: " +carpim);
    }
}
