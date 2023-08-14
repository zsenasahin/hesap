package bolum9;

import java.util.Scanner;

public class Soru2 {
    static Scanner tara = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {
        menuGoster();
        boolean cikis = false;

        while(!cikis){
            System.out.println("Seçiminiz: (Menüyü görmek için 8i tuşlayın.)");
            int secim = Integer.parseInt(tara.nextLine());
            switch (secim) {
                case 1 -> tvKurVeKanallariOlustur();
                case 2 -> tvAc();
                case 3 -> sesArttir();
                case 4 -> sesAzalt();
                case 5 -> kanalDegistir();
                case 6 -> kanalBilgisiniGoster();
                case 7 -> tvKapat();
                case 8 -> menuGoster();
                case 0 -> {
                    System.out.println("Sistemden çıkılıyor..");
                    cikis = true;
                }
                default -> System.out.println("HATALI İŞLEM! 0 ile 8 arasında bir değer giriniz..");
            }
        }
    }

    private static void kanalBilgisiniGoster() {
        if(tv!= null){
            tv.aktifKanaliGoster();
        }else{
            System.out.println("Önce tv kurun ve kanal oluşturun");
        }
    }

    private static void kanalDegistir() {
        if(tv!= null){
            System.out.println("Hangi kanalı açmak istiyosunuz ?\n");
            int acilmasiIstenenKanal = tara.nextInt();
            tara.nextLine();
            tv.kanalDegistir(acilmasiIstenenKanal);
        }else{
            System.out.println("Önce tv kurun ve kanal oluşturun");
        }
    }

    private static void sesArttir() {
        if(tv!= null){
            tv.sesArttir();
        }else{
            System.out.println("Önce tvyi kurun ve kanalları oluşturun");
        }
    }

    private static void sesAzalt() {
        if(tv!= null){
            tv.sesAzalt();
        }else{
            System.out.println("Önce tvyi kurun ve kanalları oluşturun");
        }
    }

    private static void tvKapat() {
        if(tv != null){
            tv.tvKapat();
        }else{
            System.out.println("Önce tvyi kurun ve kanalları oluşturun");
        }
    }

    private static void tvAc() {
        if(tv != null){
            tv.tvAc();
        }else{
            System.out.println("Önce tvyi kurun ve kanalları oluşturun");
        }
    }

    private static void tvKurVeKanallariOlustur() {
        if(tv == null){
            //tara.nextLine();
            System.out.println("Televizyonun markasını giriniz: ");
            String marka = tara.nextLine();
            System.out.println("Televizyonun boyutunu giriniz: ");
            String boyut = tara.nextLine();
            tv = new Televizyon(marka,boyut);
            System.out.println(tv);
        }else{
            System.out.println(tv);
        }
    }

    private static void menuGoster() {
        System.out.println("********* MENU *********");
        System.out.println("0-> çıkış\n" +
                "1-> Televizyonu kur.\n" +
                "2-> Televizyonu aç\n" +
                "3-> Sesi arttır\n" +
                "4-> Sesi azalt\n" +
                "5-> Kanal değiştir\n" +
                "6-> Kanal bilgilerini göster.\n" +
                "7-> Televizyonu kapat\n" +
                "8-> Menüyü göster.\n");
    }
}
