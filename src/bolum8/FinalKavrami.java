package bolum8;

public class FinalKavrami {
    public static void main(String[] args) {
        int sayi= 10;
        sayi = 15;

        final int sayi2 = 50;
        //sayi2 = 55;

        MyParentClass d1  = new MyParentClass();
        MyParentClass d2 = new myChildClass();

        d1.goster();
        d2.goster();

    }
}

class  MyParentClass {
    final static public void goster(){
        System.out.println("Parenttaki göster metodu: ");
    }
}

class myChildClass extends MyParentClass{
    public void childMetot(){
        goster();
    }
}

//NOT!!! concat sonuna ekliyo
// String abc = "emre";
// String yeni = abc.concat(" altunbilek");