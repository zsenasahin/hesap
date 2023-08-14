package Deneme;

import java.util.ArrayList;
import java.util.Scanner;

class Kullanici{
    private String kullaniciAdi;
    private String eposta;
    private String sifre;

    public Kullanici(String kullaniciAdi, String eposta, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}

public class kullaniciHesabi {
    static Scanner tara = new Scanner(System.in);
    static ArrayList<Deneme.Kullanici> kullaniciListesi = new ArrayList<>();
    public static void main(String[] args) {
        menuGoster();
        boolean cikis = false;

        while(!cikis){
            System.out.println("Seçiminiz: (Menüyü görmek için 7iyi tuşlayın.)");
            int secim = Integer.parseInt(tara.nextLine());
            switch (secim) {
                case 1 -> kayitOl();
                case 2 -> girisYap();
                case 3 -> listele();
                case 4 -> kullaniciAra();
                case 5 -> kullaniciSil();
                case 6 -> sifreDegistir();
                case 7 -> menuGoster();
                case 0 -> {
                    System.out.println("Sistemden çıkılıyor..");
                    cikis = true;
                }
                default -> System.out.println("HATALI İŞLEM! 0 ile 7 arasında bir değer giriniz..");
            }
        }
    }

    private static void kayitOl() {
        System.out.println("Kullanıcı adı giriniz: ");
        String kullaniciAdi = tara.nextLine();
        if (kullaniciVarMi(kullaniciListesi, kullaniciAdi)) {
            System.out.println("Bu kullanıcı adı zaten var.");

        }else{
        System.out.println("e posta adresiniz: ");
        String eposta = tara.nextLine();
        System.out.println("şifre oluşturunuz: ");
        String sifre = tara.nextLine();
        kullaniciListesi.add(new Kullanici(kullaniciAdi, eposta, sifre));
        System.out.println("Kayıt oldunuz..");
        }
    }

    private static void girisYap() {
        System.out.println("Kullanıcı adı giriniz: ");
        String girisKullaniciAdi = tara.nextLine();
        System.out.println("Şifre giriniz: ");
        String girisSifre = tara.nextLine();
        boolean kontrol = kontrol(kullaniciListesi,girisKullaniciAdi,girisSifre);
        if(kontrol == true){
            System.out.println("Giriş yapıldı");
        }else{
            System.out.println("kullanıcı adı veya şifre hatalı");
        }
    }

    private static void listele() {
        System.out.println("Kayıtlı kullanıcılar: ");
        for(Kullanici kullanici: kullaniciListesi){
            System.out.println(kullanici.getKullaniciAdi());
        }
    }

    private static void kullaniciAra() {
        System.out.println("Aradığınız kullanıcı adını giriniz: ");
        String arananKullanici = tara.nextLine();
        int index = kullaniciIndexBul(kullaniciListesi, arananKullanici);
        if(index != -1){
            System.out.println("Kullanıcı " + (index+1) + ". sırada");
        }
        if(index == -1){
            System.out.println("Aradığınız kullanıcı bulunmamaktadır");
        }
    }

    private static void kullaniciSil() {
        System.out.println("Silmek istediğiniz kullanıcıyı giriniz: ");
        String silinecekKullaniciAdi = tara.nextLine();
        System.out.println("Doğrulamak için şifre giriniz: ");
        String silinecekKullaniciSifresi = tara.nextLine();
        boolean kontrol = kontrol(kullaniciListesi, silinecekKullaniciAdi, silinecekKullaniciSifresi);
        if(kontrol){
            kullaniciListesi.removeIf(kullanici -> kullanici.getKullaniciAdi().equals(silinecekKullaniciAdi));
        }else{
            System.out.println("nanay");
        }
    }

    private static void sifreDegistir() {
        System.out.println("Kullanıcı adını giriniz: ");
        String degisilecekKullaniciAdi = tara.nextLine();
        System.out.println("Eski şifreyi giriniz: ");
        String eskiSifre = tara.nextLine();

        int kullaniciIndex = kullaniciIndexBul(kullaniciListesi, degisilecekKullaniciAdi);
        if (kullaniciIndex != -1) {
            Kullanici kullanici = kullaniciListesi.get(kullaniciIndex);
            if (kullanici.getSifre().equals(eskiSifre)) {
                System.out.println("Yeni şifreyi giriniz: ");
                String yeniSifre = tara.nextLine();
                kullanici.setSifre(yeniSifre);
                System.out.println("Şifre güncellendi.");
            } else {
                System.out.println("Eski şifre yanlış.");
            }
        } else {
            System.out.println("Kullanıcı bulunamadı.");
        }
    }

    private static void menuGoster() {
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

    private static boolean kullaniciVarMi(ArrayList<Kullanici> kullaniciListesi, String kullaniciAdi) {
        for (Kullanici kullanici : kullaniciListesi) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi)) {
                return true;
            }
        }
        return false;
    }

    private static boolean kontrol(ArrayList<Kullanici> kullaniciListesi, String girisKullaniciAdi, String girisSifre){
        for (Kullanici kullanici : kullaniciListesi) {
            if (kullanici.getKullaniciAdi().equals(girisKullaniciAdi) && kullanici.getSifre().equals(girisSifre)) {
                return true;
            }
        }
        System.out.println("Yanlış kullanıcı adı veya şifre.");
        return false;
    }

    private static int kullaniciIndexBul(ArrayList<Kullanici> kullaniciListesi, String kullaniciAdi){
        for(int i=0; i<kullaniciListesi.size(); i++){
            if(kullaniciListesi.get(i).getKullaniciAdi().equals(kullaniciAdi)){
                return i;
            }
        }
        return -1;
    }
}
