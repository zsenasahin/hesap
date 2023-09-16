package bolum_11_generics.veteriner_birligi;

public class YonetimPaneli<T> {
    public void bilgileriGoster(T nesne){
        System.out.println(nesne);
    }

    public <T extends Musteri> void sahipOlduguHayvanlariGoster(T musteri){
        musteri.MusteriHayvanlariniListele();
    }
}
