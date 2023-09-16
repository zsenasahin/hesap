package Bolum_10_abstractinterface.member_innerclass_ornek;

public class HesapMakinesi {

    public int carp(int i, int i1){
        Carpma carpma = new Carpma();
        int carpim = carpma.carpma(i,i1);
        return carpim;
    }
    public class Topla{
        public int topla(int i, int j){
            return i+j;
        }
    }

    class Cikar{
        public int cikar(int i, int j){
            return i-j;
        }
    }

    

    private class Carpma{
        public int carpma(int i, int j){
            return i*j;
        }
    }

    class Bolme{
        public String bolme(int i, int j) {
            if (j == 0) {
                System.out.println("Bölen 0 olamaz");
                return "";
            }else{
                int sonuc = i/j;
                return String.valueOf(sonuc);
            }
        }
    }
}
