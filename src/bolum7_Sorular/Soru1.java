package bolum7_Sorular;

public class Soru1 {
    public static void main(String[] args) {
        cemberDaire cember1 = new cemberDaire(5);
        System.out.printf("Yarıçapı 5 olan çemberin çevresi: %.2f", cember1.cevreBul());
        System.out.println();
        System.out.printf("Yarıçapı 5 olan dairenin alanı: %.2f", cember1.alanBul());
    }
}

class cemberDaire{
    private int yaricap;
    private final static double PI = 3.14;

    public cemberDaire(int r){
        this.yaricap = r;
    }

    public double cevreBul(){
        return 2 * PI * yaricap;
    }

    public double alanBul(){
        return  PI * Math.pow(yaricap,2);
    }
}