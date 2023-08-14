package kullanici;

import java.util.ArrayList;
import java.util.List;

public class KullaniciVeriTabani {
    private List<Kullanici> kullanicilar;

    public KullaniciVeriTabani() {
        this.kullanicilar = new ArrayList<>();
    }

    public void kullaniciEkle(Kullanici k){
        kullanicilar.add(k);
    }

    public void kullaniciListele(){
        System.out.println(kullanicilar);
    }

    public Kullanici kullaniciBul(String kullaniciAdi){
        for (Kullanici kullanici : kullanicilar) {
            if(kullanici.getKullaniciAdi().equals(kullaniciAdi)){
                return kullanici;
            }
        }
        return null;
    }

    public void kullaniciSil(String kullaniciAdi){
        Kullanici kullanici = kullaniciBul(kullaniciAdi);
        if(kullanici == null){
            System.out.println("Kullanıcı bulunamadı");
            return;
        }
        kullanicilar.remove(kullanici);
    }

    public void guncelle(String kullaniciAdi, Kullanici yeniKullanici){
        Kullanici kullanici = kullaniciBul(kullaniciAdi);
        if(kullanici == null){
            System.out.println("kullanıcı bulunamadı");
            return;
        }
        kullanici.setKullaniciAdi(yeniKullanici.getKullaniciAdi());
        kullanici.setSifre(yeniKullanici.getSifre());
        kullanici.setEposta(yeniKullanici.getEposta());
    }
}
