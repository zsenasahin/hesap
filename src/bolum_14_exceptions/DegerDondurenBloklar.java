package bolum_14_exceptions;

public class DegerDondurenBloklar {
    public static void main(String[] args) {
        System.out.println(stringDegerDondurenMetot());
    }

    private static String stringDegerDondurenMetot(){
        String selam = "Merhaba";
        try {
            selam = selam + " try";
            ArithmeticException e = new ArithmeticException();
            throw e;
        }catch (Exception e){
            selam = selam + " catch";
            return selam;
        }finally {
            selam = selam + " finally";
            return selam;
        }
    }
}
