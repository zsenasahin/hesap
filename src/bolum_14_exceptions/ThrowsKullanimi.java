package bolum_14_exceptions;

import java.sql.SQLException;

public class ThrowsKullanimi {
    public static void main(String[] args) {
        try{
            metot();
        }catch (NumberFormatException e){
            System.out.println("hata yakalandı. " +e);
        }
    }

    private static void metot() throws NumberFormatException{
        Integer sayi = Integer.parseInt("abc");
    }
    private static void metot2() throws NumberFormatException{
        metot();
    }
    private static void metot3() throws NumberFormatException{
        metot2();
    }
}

class A{
    void aMetot() throws SQLException {
        System.out.println("A sınıfındaki metot");
    }
}

class B extends A{
    @Override
    void aMetot() throws SQLException {
        super.aMetot();
    }
}

class C extends B{
    @Override
    void aMetot(){
        System.out.println("C sınıfındaki metot");
    }
}
