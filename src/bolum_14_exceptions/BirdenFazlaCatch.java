package bolum_14_exceptions;

public class BirdenFazlaCatch {
    public static void main(String[] args) {
        String[] dizi = {"abc", "234", null, "bdc"};
        for (int i=0; i<dizi.length+2; i++){
            try{
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            }catch (NumberFormatException hata){
                System.out.println(hata);
            }catch (NullPointerException hata){ // catchleri | kullanarak birleştirebiliriz.
                System.out.println(hata);
            }
            catch (ArrayIndexOutOfBoundsException hata){
                System.out.println(hata);
            }
        }
        System.out.println("burada");
        for (int i=0; i<dizi.length+2; i++){
            try{
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            }catch (Exception hata){
                System.out.println(hata);
            }
        }
        System.out.println("burada 2");

        for (int i=0; i<dizi.length+2; i++){
            try{
                int sayi = dizi[i].length() + Integer.parseInt(dizi[i]);
            }catch (Exception hata){
                System.out.println(hata);
            }catch(Throwable t){
                System.out.println("Throwable" +t);
            }
        }
        System.out.println("Burada 3");

        for(int i=0; i< dizi.length+2; i++){
            try{
                int sayi = dizi[i].length();
                try{
                    sayi = Integer.parseInt(dizi[i]);
                }catch (NumberFormatException hata){
                    System.out.println("Hata çıktı");
                }
            }catch (NullPointerException hata){
                System.out.println("Dışardaki try da hata" +hata);
            }catch (ArrayIndexOutOfBoundsException hata){
                System.out.println("Dışardaki try da hata" +hata);
            }
        }
    }
}
