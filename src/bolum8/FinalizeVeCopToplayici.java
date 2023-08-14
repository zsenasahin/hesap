package bolum8;

public class FinalizeVeCopToplayici {
    public static void main(String[] args) {
        A nesne1 = new A(10);
        A nesne2 = new A(15);

        nesne1 = nesne2;

        for(int i=0; i<100; i++){
            nesne2 = new A(500);

            if(i==10){
                System.gc();
            }
        }
    }
}

class A{
    int i;
    public A(int parametre){
        this.i = parametre;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize tetiklendi");
    }
}