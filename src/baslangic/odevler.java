package baslangic;

public class odevler {
    public static void main(String[] args) {
        //ODEV 1 çözümü
        String stringDegiskeni = "150";
        int integerDegiskeni = Integer.parseInt(stringDegiskeni);
        int integerDegiskeni2 = Integer.valueOf(stringDegiskeni);

        System.out.println("Integer Değişkeni 1 : " +integerDegiskeni);
        System.out.println("Integer Değişkeni 2 : " +integerDegiskeni2);

        stringDegiskeni = String.valueOf(integerDegiskeni);

        System.out.println("String değişkeninin son değeri: " +stringDegiskeni);

        System.out.println("********************************");

        //ODEV 2 çözümü
        int sayi1 = 5/3;
        float sayi2 = 5f/3f;
        double sayi3 = 5d/3d;

        System.out.println("sayi1: " +sayi1);
        System.out.println("sayi2: " +sayi2);
        System.out.println("sayi3: " +sayi3);

        System.out.println("*********************************");
        //ODEV 3 çözümü
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.9);

        System.out.println("**********************************");

        //ODEV 4 çözümü

        int s1 = 10;
        int s2 = 20;

        double ortalama = (s1 + s2) / 2;
        System.out.println("ortalama 1: " +ortalama);

        double ortalama2 = (s1 + s2) / 2.0;
        System.out.println("ortalama 2: " +ortalama2);

        System.out.println("*******************");

        //deneme
        int sayim1 = 10;
        int sayim2 = ++sayim1;
        System.out.println("sayim1 ilk: " +sayim1);
        int sayim3 = sayim1--;

        System.out.println("sayi1: " +sayim1);
        System.out.println("sayi2: " +sayim2);
        System.out.println("sayi3: " +sayim3);

        System.out.println("sonuc: "+ (sayim1)+(--sayim2)+(sayim3++));
    }
}
