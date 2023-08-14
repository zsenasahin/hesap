package kullanici;

import java.util.Scanner;

public class KullaniciApplication {
    private KullaniciVeriTabani veriTabani = new KullaniciVeriTabani();
    private Scanner tara = new Scanner(System.in);
    public static void main(String[] args) {
        KullaniciApplication app = new KullaniciApplication();
        app.menuGoster();
        boolean cikis = false;

        while(!cikis){
            System.out.println("Seçiminiz: (Menüyü görmek için 7iyi tuşlayın.)");
            int secim = Integer.parseInt(app.tara.nextLine());
            switch (secim) {
                case 1 -> app.kayitOl();
                case 2 -> app.girisYap();
                case 3 -> app.listele();
                case 4 -> app.kullaniciAra();
                case 5 -> app.kullaniciSil();
                case 6 -> app.sifreDegistir();
                case 7 -> app.menuGoster();
                case 0 -> {
                    System.out.println("Sistemden çıkılıyor..");
                    cikis = true;
                }
                default -> System.out.println("HATALI İŞLEM! 0 ile 7 arasında bir değer giriniz..");
            }
        }
    }

    private  void kayitOl() {
        String kullaniciAdi = degerAl("Kullanıcı adını gir");
        String sifre = degerAl("Sifreyi giriniz");
        Kullanici k = new Kullanici()
                .setKullaniciAdi(kullaniciAdi)
                .setSifre(sifre);

        veriTabani.kullaniciEkle(k);
    }

    private  void girisYap() {

    }

    private  void listele() {
    }

    private  void kullaniciAra() {

    }

    private  void kullaniciSil() {

    }

    private  void sifreDegistir() {

    }

    private  void menuGoster() {
        System.out.println("****** MENÜ ******");
        System.out.println("0 -> Çıkış\n" +
                "1 -> Kayıt Ol\n" +
                "2 -> Giriş Yap\n" +
                "3 -> Listele\n" +
                "4 -> Kullanıcı Ara\n" +
                "5 -> Kullanıcı Sil\n" +
                "6 -> Şifre Güncelle\n" +
                "7 -> Menüyü Göster\n");
    }

    private String degerAl(String mesaj) {
        System.out.println(mesaj);
        return tara.nextLine();
    }
}
