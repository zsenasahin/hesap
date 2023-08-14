package baslangic;

public class dizilerDers {
    public static void main(String[] args) {
        int[] anaDizi = {1,7,9,10};
        int[] kopyaDizi = new int[anaDizi.length];

        //manuel kopyalama
        for(int index=0; index< anaDizi.length; index++){
            kopyaDizi[index] = anaDizi[index];
        }

        //arraycopy
        int[] kopyaDizi2= new int[anaDizi.length];
        System.arraycopy(anaDizi, 0, kopyaDizi2, 0, anaDizi.length);
        diziYazdir(kopyaDizi2);

        int denemeDizisi[] =new int[anaDizi.length];
        //1,7,9,10
        denemeDizisi = anaDizi;
        diziYazdir(denemeDizisi);
        System.out.println("****************");
        diziYazdir(anaDizi);
        int[] tersiOlusturulmusDizi = tersiniOlustur(anaDizi);
        System.out.println("tersten: ");
        diziYazdir(tersiOlusturulmusDizi);

    }
    public static int[] tersiniOlustur(int[] dizi){
        int[] olusanDizi= new int[dizi.length];
        for(int i=0, j=dizi.length-1; i< dizi.length; i++, j--){
            olusanDizi[j]= dizi[i];
        }
        return olusanDizi;

    }
    public static void diziYazdir(int[] yazdirilacakDizi) {
        for(int sayi: yazdirilacakDizi){
            System.out.println("Kopya dizi elemanı: " +sayi);
        }
    }
}
