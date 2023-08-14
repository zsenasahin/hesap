package Deneme;

import java.util.ArrayList;
import java.util.Scanner;
/*
class Kullanici {
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

    public String getSifre() {
        return sifre;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}

public class hesap {
    public static void main(String[] args) {
        ArrayList<Kullanici> kullaniciListesi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0- Çıkış");
            System.out.println("1- Kayıt Ol");
            System.out.println("2- Giriş Yap");
            System.out.println("3- Kayıtlı Kullanıcıları Listele");
            System.out.println("4- Kullanıcı Ara");
            System.out.println("5- Kullanıcı Sil");

            System.out.print("Seçiminizi yapınız: ");
            int secim = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini tüket

            switch (secim) {
                case 0:
                    System.out.println("Program sonlandırılıyor...");
                    return;
                case 1:
                    System.out.print("Kullanıcı adı: ");
                    String yeniKullaniciAdi = scanner.nextLine();
                    if (kullaniciVarMi(kullaniciListesi, yeniKullaniciAdi)) {
                        System.out.println("Bu kullanıcı adı zaten var.");
                        break;
                    }
                    System.out.print("E-posta: ");
                    String yeniEposta = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String yeniSifre = scanner.nextLine();
                    kullaniciListesi.add(new Kullanici(yeniKullaniciAdi, yeniEposta, yeniSifre));
                    System.out.println("Kullanıcı kaydedildi.");
                    break;
                case 2:
                    System.out.print("Kullanıcı adı: ");
                    String girisKullaniciAdi = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String girisSifre = scanner.nextLine();
                    boolean girisBasarili = false;
                    for (Kullanici kullanici : kullaniciListesi) {
                        if (kullanici.getKullaniciAdi().equals(girisKullaniciAdi) && kullanici.getSifre().equals(girisSifre)) {
                            System.out.println("Giriş yapıldı.");
                            girisBasarili = true;
                            break;
                        }
                    }
                    if (!girisBasarili) {
                        System.out.println("Yanlış kullanıcı adı veya şifre.");
                    }
                    break;
                case 3:
                    System.out.println("Kayıtlı Kullanıcılar:");
                    for (Kullanici kullanici : kullaniciListesi) {
                        System.out.println("Kullanıcı Adı: " + kullanici.getKullaniciAdi() + ", E-posta: " + kullanici.getEposta());
                    }
                    break;
                case 4:
                    System.out.print("Aranacak kullanıcı adı: ");
                    String arananKullaniciAdi = scanner.nextLine();
                    int index = kullaniciIndexBul(kullaniciListesi, arananKullaniciAdi);
                    if (index != -1) {
                        System.out.println("Kullanıcı " + (index + 1) + ". sırada.");
                    } else {
                        System.out.println("Kullanıcı bulunamadı.");
                    }
                    break;
                case 5:
                    System.out.print("Kullanıcı adı: ");
                    String silinecekKullanici = scanner.nextLine();
                    System.out.print("Şifre: ");
                    String silinecekSifre = scanner.nextLine();
                    boolean silindi = false;
                    for (int i = 0; i < kullaniciListesi.size(); i++) {
                        Kullanici kullanici = kullaniciListesi.get(i);
                        if (kullanici.getKullaniciAdi().equals(silinecekKullanici) && kullanici.getSifre().equals(silinecekSifre)) {
                            kullaniciListesi.remove(i);
                            System.out.println("Kullanıcı silindi.");
                            silindi = true;
                            break;
                        }
                    }
                    if (!silindi) {
                        System.out.println("Yanlış kullanıcı adı veya şifre.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçenek.");
                    break;
            }
        }
    }

    private static boolean kullaniciVarMi(ArrayList<Kullanici> kullaniciListesi, String kullaniciAdi) {
        for (Kullanici kullanici : kullaniciListesi) {
            if (kullanici.getKullaniciAdi().equals(kullaniciAdi)) {
                return true;
            }
        }
        return false;
    }

    private static int kullaniciIndexBul(ArrayList<Kullanici> kullaniciListesi, String kullaniciAdi) {
        for (int i = 0; i < kullaniciListesi.size(); i++) {
            if (kullaniciListesi.get(i).getKullaniciAdi().equals(kullaniciAdi)) {
                return i;
            }
        }
        return -1;
    }
}
*/