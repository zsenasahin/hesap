package kullanici;

public class KullaniciSifreIslemleri {
    private final KullaniciVeriTabani veriTabani;

    public KullaniciSifreIslemleri(KullaniciVeriTabani veriTabani) {
        this.veriTabani = veriTabani;
    }
    public void sifreGuncelle(KullaniciSifreGuncellemeIstegi istek){
        Kullanici kullanici = veriTabani.kullaniciBul(istek.kullaniciAdi);
        if(kullanici == null){
            System.out.println("kullanıcı bulunamadı");
            return;
        }
        if (!kullanici.getSifre().equals(istek.eskiSifre)) {
            System.out.println("Eski şifreyi yanlış girdiniz.");
            return;
        }
        if(kullanici.getSifre().equals(istek.yeniSifre)){
            System.out.println("Yeni şifre eski şifreyle aynı olamaz. :)");
            return;
        }
        kullanici.setSifre(istek.yeniSifre);
        veriTabani.guncelle(istek.kullaniciAdi, kullanici);
    }

    public void girisYap(String kullaniciAdi, String sifre){
        Kullanici kullanici = veriTabani.kullaniciBul(kullaniciAdi);
        if(kullanici == null){
            System.out.println("Kullanıcı adı veya şifre hatalı.");
            return;
        }
        if(kullanici.getSifre().equals(sifre)){
            System.out.println("Giriş yapıldı");
        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı.");
        }
    }

    class KullaniciSifreGuncellemeIstegi{
        private String kullaniciAdi;
        private String eskiSifre;
        private String yeniSifre;

        public void setKullaniciAdi(String kullaniciAdi) {
            this.kullaniciAdi = kullaniciAdi;
        }

        public void setEskiSifre(String eskiSifre) {
            this.eskiSifre = eskiSifre;
        }

        public void setYeniSifre(String yeniSifre) {
            this.yeniSifre = yeniSifre;
        }
    }
}
