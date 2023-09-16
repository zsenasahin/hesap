package bolum_11_generics.veteriner_birligi;

public class Main {
    public static void main(String[] args) {
        ilkNesneleriOlustur();
    }
    private static void ilkNesneleriOlustur() {
        Kedi kedi = new Kedi("01-01-2016", true, "Van kedisi");
        Kedi kedi2 = new Kedi("01-04-2013", false, "Siyan");
        Kedi kedi3 = new Kedi("09-04-2018", true, "Tekir");
        /*kedi.bilgileriGoster();
        System.out.println(kedi); //sadece kedi sınıfına ait olanlar
*/

        Kopek kopek = new Kopek("02-06-2018", true, 5, "golden");
        Kopek kopek2 = new Kopek("04-06-2018", true, 4, "Dalmaçyalı");
        Kopek kopek3= new Kopek("08-06-2018", true, 2, "pitbul");
       /* kopek.bilgileriGoster();
        System.out.println(kopek);*/

        Musteri m1 = new Musteri("emre", "234", "ankara");
        m1.musteriyeHayvanEkle(kedi);
        m1.musteriyeHayvanEkle(kopek2);
        Musteri m2 = new Musteri("sema", "424", "maras");
        Musteri m3 = new Musteri("zehra", "213", "antep");
        //System.out.println(m3);
        //m3.kendiniTanit();

        Veteriner v1 = new Veteriner("ayşe", "456", "ankara", 1);
        v1.musteriEkle(m1);
        v1.musteriEkle(m2);
        Veteriner v2 = new Veteriner("fatma", "567", "ege", 3);
        v2.musteriEkle(m1);
        Veteriner v3 = new Veteriner("hayriye", "834", "marmara", 4);
        //v3.kendiniTanit();
        v2.musteriEkle(m3);
        //System.out.println(v3);
        v1.musterileriListele();

        sehirVeterinerlikleri ankara = new sehirVeterinerlikleri("ankara");
        ankara.sehireVeterinerEkle(v1);
        ankara.sehireVeterinerEkle(v2);

        sehirVeterinerlikleri izmir = new sehirVeterinerlikleri("izmir");
        izmir.sehireVeterinerEkle(v3);

        ankara.sehirdekiToplamVeterinerSayisiniBul();
        izmir.sehirdekiToplamVeterinerSayisiniBul();

        System.out.println("YÖNETİM PANELİ");
        YonetimPaneli<Hayvan> hayvanYonetimPaneli = new YonetimPaneli<>();
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        hayvanYonetimPaneli.bilgileriGoster(kopek);

        YonetimPaneli<Musteri> musteriYonetimPaneli = new YonetimPaneli<>();
        musteriYonetimPaneli.bilgileriGoster(m1);
        System.out.println("musteri hayvanları");
        musteriYonetimPaneli.sahipOlduguHayvanlariGoster(m1);
    }
}
