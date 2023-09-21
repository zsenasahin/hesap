package bolum_14_exceptions;

public class ExceptionKavrami {
    public static void main(String[] args) {
        try{
            Integer i = new Integer("sad");
            System.out.println(i);
        }catch (Exception e){
            System.out.println("Hata çıktı: " +e.toString());
        }
        try{
            int sonuc = 5/0;
        }catch (Exception e){
            System.out.println("Tanımsız işlem" +e.toString());
        }
        finally {
            System.out.println("Sistem buradan devam etmeli");
        }
    }
}
