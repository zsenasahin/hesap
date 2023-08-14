package kullanici;

public class Kullanici {
    private String kullaniciAdi;
    private String eposta;
    private String sifre;


    public Kullanici() {
    }

    public Kullanici(String kullaniciAdi, String eposta, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.eposta = eposta;
        this.sifre = sifre;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public Kullanici setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
        return this;
    }

    public String getEposta() {
        return eposta;
    }

    public Kullanici setEposta(String eposta) {
        this.eposta = eposta;
        return this;
    }

    public String getSifre() {
        return sifre;
    }

    public Kullanici setSifre(String sifre) {
        this.sifre = sifre;
        return this;
    }
}
