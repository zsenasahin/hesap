package bolum9;

public class HaberKanali extends Kanal{
    private String haberTuru;
    public HaberKanali(String ad, int kanalNo, String tur) {
        super(ad, kanalNo);
        this.haberTuru = tur;
    }
}
