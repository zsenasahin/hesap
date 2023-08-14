package bolum8.PolymorphismKavrami;

public class PolymorphismKavrami {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        Kopek kopek1 = new Kopek("Golden");
        Kedi kedi1 = new Kedi("van kedisi");
        adimiSoyle(h1);
        adimiSoyle(kedi1);
        adimiSoyle(kopek1);
    }

    public static void adimiSoyle(Hayvan hayvan){
        hayvan.adimiSoyle();
    }

}

class Hayvan{
    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public void adimiSoyle(){
        System.out.println("Ben hayvan sınıfı nesneyim");
    }
}

class Kopek extends Hayvan{
    private String tur;

    public Kopek(String tur){
        setAyakSayisi(4);
        setTur(tur);
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adimiSoyle() {
        System.out.println("Ben bir köpek nesnesiyim");;
    }
}

class Kedi extends Hayvan{
    private String cins;
    public Kedi(String cins){
        setAyakSayisi(4);
        setCins(cins);
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public void adimiSoyle() {
        System.out.println("Ben bir kedi nesnesiyim");
    }
}