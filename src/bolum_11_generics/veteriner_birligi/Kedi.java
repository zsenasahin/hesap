package bolum_11_generics.veteriner_birligi;

public class Kedi extends Hayvan{
    private String tur;
    private String cins;
    public Kedi(String dogumTarihi, boolean kayitli, String cins) {
        super(dogumTarihi, kayitli);
        this.tur = "Kedi";
        this.cins = cins;
    }
    @Override
    void bilgileriGoster() {
        System.out.println(toString() + "kayıtlı mı: " +isKayitli() + " doğum tarihi: " +getDogumTarihi());
    }
    @Override
    public String toString() {
        return "Kedi{" +
                "tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                '}';
    }
}
