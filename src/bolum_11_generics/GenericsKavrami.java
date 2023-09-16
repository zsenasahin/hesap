package bolum_11_generics;

import java.util.ArrayList;

public class GenericsKavrami {
    public static void main(String[] args) {
        String[] isimler = {"emre", "ayşe","ali"};
        Integer[] sayilar = {1,5,7,9,10};
        Character[] karakterler = {'a', 'b', 'k'};

        /*StringDiziYazdir.yazdir(isimler);
        IntegerDiziYazdir.yazdir(sayilar);
        CharDiziYazdir.yazdir(karakterler);
*/
        GenericDiziYazdir<String> stringGenericDiziYazdir = new GenericDiziYazdir<String>();
        stringGenericDiziYazdir.yazdir(isimler);

        GenericDiziYazdir<Integer> integerGenericDiziYazdir = new GenericDiziYazdir<>();
        integerGenericDiziYazdir.yazdir(sayilar);

        GenericDiziYazdir<Character> characterGenericDiziYazdir = new GenericDiziYazdir<>();
        characterGenericDiziYazdir.yazdir(karakterler);

        ArrayList listem = new ArrayList();
        listem.add("ankara");
        listem.add("izmir");
        listem.add(1); //ArrayList<String> dersek sadece stringleri yazarız.
        listem.add(true);
        listem.add("bursa");
        for (Object gecici:listem) {
            System.out.println(gecici); //Sadece böyleyken hata olmaz. ama stringe özgü bir şey yaparsan hata verir
        }

    }
}
