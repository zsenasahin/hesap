package bolum_14_exceptions;

public class MetotIcındeHata {
    public static void main(String[] args) {
        try {
            hataOlustur();
        }catch (ArrayIndexOutOfBoundsException hata){
            System.out.println(hata);
        }
        }

    private static void hataOlustur() {
        String[] dizi = {"abc", "234", null, "bdc"};
        for (int i = 0; i < dizi.length + 2; i++) {
            try {
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            } catch (NumberFormatException hata) {
                System.out.println(hata);
            } catch (NullPointerException hata) { // catchleri | kullanarak birleştirebiliriz.
                System.out.println(hata);
            }
        }
    }
}


