package bolum_14_exceptions;

import java.util.Scanner;

//Throw ile hatayı fırlatıyoruz

public class KendiIstisnalarimiziOlustur {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Yaşınızı Girin: ");
        int yas = tara.nextInt();

        try{
            if(yas<0){
                throw new Exception("Yaş negatif olamaz");
            }
        }catch(Exception e){
            System.out.println("hata" +e);
        }
    }
}

class NegatifYasHatasi extends Exception{
    String hataMesaji;

    public NegatifYasHatasi(String hataMesaji) {
        this.hataMesaji = hataMesaji;
    }

    @Override
    public String toString() {
        return hataMesaji;
    }
}