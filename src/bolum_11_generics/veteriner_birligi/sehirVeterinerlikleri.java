package bolum_11_generics.veteriner_birligi;

import java.util.ArrayList;

public class sehirVeterinerlikleri {
    private String sehir;
    private int toplamVeterinerSayisi;
    private ArrayList<Veteriner> sehirdekiVeterinerler;

    public sehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler = new ArrayList<>();
        toplamVeterinerSayisi=0;
    }

    public void sehireVeterinerEkle(Veteriner veteriner){
        toplamVeterinerSayisi++;
        sehirdekiVeterinerler.add(veteriner);
    }
    public void sehirdekiToplamVeterinerSayisiniBul(){
        System.out.println("toplam veteriner sayısı: " +sehirdekiVeterinerler.size());
    }
}
