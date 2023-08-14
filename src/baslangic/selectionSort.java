package baslangic;

public class selectionSort {
    public static void main(String[] args) {
        int sayilar[] = {1,9,5,2,7,9,60,120,55,-9};
        diziYazdir(sayilar);
        System.out.println("yer değiştirme metodundan sonra dizi: ");
        diziYerDegistir(sayilar);
        diziYazdir(sayilar);

        System.out.println("Sıralamadan sonra dizi: ");
        selectionSortSiralama(sayilar);
        diziYazdir(sayilar);
        int sonuc = binarySearch(sayilar, 55);
        System.out.println("sonuc: " +sonuc);
    }

    public static void diziYazdir(int[] dizi){
        for(int i: dizi){
            System.out.println("Eleman: " +i);
        }
    }

    public static int  binarySearch(int[] dizi, int aranacakEleman){
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;

        while(enYuksekIndex >= enDusukIndex){
            int ortaIndex = (enDusukIndex+ enYuksekIndex)/2;
            if(aranacakEleman<dizi[ortaIndex]){
                enYuksekIndex = ortaIndex - 1;
            }else if(aranacakEleman == dizi[ortaIndex]){
                return ortaIndex; //aranılacak elemanın bulunduğu indexi döndürür.
            }
            else{
                enDusukIndex = ortaIndex + 1;
            }
        }
        return enDusukIndex-1;
    }
    public static void diziYerDegistir(int[] dizi){
        for(int i = dizi.length-1; i>0; i--){
            int rastgeleIndex = (int)(Math.random()*(i+1));

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndex];
            dizi[rastgeleIndex] = gecici;
        }
    }
    public static void selectionSortSiralama(int[] dizi){
        for(int i=0; i< dizi.length-1; i++){
            //en küçük eleman ve indexin bulunması
            int oAnkiEnKucukSayi = dizi[i];
            int oAnkiEnKucukElemaninIndexi = i;

            for(int j = i+1; j < dizi.length; j++){
                if(oAnkiEnKucukSayi > dizi[j]){
                    oAnkiEnKucukSayi = dizi[j];
                    oAnkiEnKucukElemaninIndexi = j;
                }
            }

            if(oAnkiEnKucukElemaninIndexi != i){
                dizi[oAnkiEnKucukElemaninIndexi] = dizi[i];
                dizi[i] = oAnkiEnKucukSayi;
            }

        }
    }
}

