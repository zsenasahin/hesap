package bolum_11_generics;

public class GenericMetotKavrami {
    public static void main(String[] args) {
        String[] isimler = {"emre", "ayşe","ali"};
        Integer[] sayilar = {1,5,7,9,10};
        Character[] karakterler = {'a', 'b', 'k'};

      /*  stringDiziYazdir(isimler);
        integerDiziYazdir(sayilar);
        charDiziYazdir(karakterler);

        diziYazdir(isimler);
        diziYazdir(sayilar);
        diziYazdir(karakterler);
        */
        genericMetinYazdir(isimler);
        genericNumaraYazdir(sayilar);
        //genericYazdir(karakterler);

    }

    public static <Genel extends Number> void genericNumaraYazdir(Genel[] dizi){
        for(Genel gecici : dizi){
            System.out.println(gecici.intValue());
        }
    }
    public static <Genel extends CharSequence> void genericMetinYazdir(Genel[] dizi){
        for(Genel gecici : dizi){
            System.out.println(gecici.length());
        }
    }

    public static void diziYazdir(Object[] dizi){
        for(Object gecici: dizi){
            System.out.println(gecici);
        }
    }
    public static void stringDiziYazdir(String[] dizi){
        for(String gecici : dizi){
            System.out.println(gecici);
        }
    }
    public static void integerDiziYazdir(Integer[] dizi){
        for(Integer gecici : dizi){
            System.out.println(gecici);
        }
    }
    public static void charDiziYazdir(Character[] dizi){
        for(Character gecici: dizi){
            System.out.println(gecici);
        }
    }

}
