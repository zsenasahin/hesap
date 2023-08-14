package bolum9;

import java.util.ArrayList;

public class Televizyon {
    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean acik;
    private int ses;
    private int aktifKanal;

    public Televizyon(String marka, String boyut) {
        this.marka = marka;
        this.boyut = boyut;
        kanallar = new ArrayList<>();
        ses = 10;
        aktifKanal = 1;
        kanallariOlustur();
        this.acik = false;
    }


    public void sesArttir(){
        if(ses<20 && acik){
            ses++;
            System.out.println("Ses seviyesi: " + ses);
        }else{
            System.out.println("maksimum sese ulaşıldı veya tv kapalı");
        }
    }
    public void sesAzalt(){
        if(ses>0 && acik){
            ses--;
            System.out.println("Ses seviyesi: " + ses);
        }else{
            System.out.println("minimum sese ulaşıldı veya tv kapalı");
        }
    }
    public void tvAc(){
        if(acik == false){
            acik = true;
            System.out.println("TV açıldı");
        }else{
            System.out.println("TV zaten açık");
        }
    }

    public void tvKapat(){
        if(acik == true){
            acik = false;
            System.out.println("TV kapandı");
        }else{
            System.out.println("TV zaten kapalı");
        }
    }

    private void kanallariOlustur() {
        HaberKanali cnn = new HaberKanali("CNN", 1, "Genel haber");
        kanallar.add(cnn);
        HaberKanali bein = new HaberKanali("BeinSport", 2, "Spor haber");
        kanallar.add(bein);
        MuzikKanali dreamTurk = new MuzikKanali("Dream Türk", 3, "Yerli");
        kanallar.add(dreamTurk);
        MuzikKanali numberOne= new MuzikKanali("Number One", 4, "Yabancı");
        kanallar.add(numberOne);
    }

    public void aktifKanaliGoster(){
        if(acik)
        System.out.println("AKtif kanal: " +kanallar.get(aktifKanal-1).kanalBilgisiGoster());
        else System.out.println("Önce tv açın");
    }

    public void kanalDegistir(int acilmasiIstenenKanal){
        if (!acik) {
            System.out.println("Önce televizyonu açınız..");
            return ;
        }
        if (acilmasiIstenenKanal == aktifKanal) {
            System.out.println("Zaten " +aktifKanal + ". kanaldasınız");
            return ;
        }
        if (acilmasiIstenenKanal > kanallar.size() || acilmasiIstenenKanal < 0) {
            System.out.println("Geçerli bir kanal numarası giriniz..");
            return ;
        }
        aktifKanal = acilmasiIstenenKanal;
        System.out.println("Kanal: "+ acilmasiIstenenKanal + " Bilgi: " +kanallar.get(aktifKanal-1).kanalBilgisiGoster());
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    @Override
    public String toString() {
        return "Marka: " +marka + " boyut: " + boyut +" olan tv oluşturuldu";
    }
}
