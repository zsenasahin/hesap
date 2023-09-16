package bolum_12_collection.list_interface;

import java.util.LinkedList;
import java.util.Stack;

public class StackYiginKullanimi {
    public static void main(String[] args) {
        Stack<String> yigin = new Stack<>();

        yigin.add("emre");
        yigin.add("hasan");
        yigin.add("ali");
        System.out.println(yigin);

        System.out.println(yigin.pop()); //en sondaki elemanı gösterdi ve sildi
        System.out.println(yigin);

        System.out.println(yigin.peek()); // en sondaki elemanı gösterir
        System.out.println(yigin);

        System.out.println(yigin.push("can")); //ekrana yazdır ve listenin sonuna ekle
        System.out.println(yigin);

        System.out.println(yigin.search("hasan")); //kaçıncı sırada olduğunu verir,bulamazsa -1
        System.out.println(yigin.empty()); //boşsa true değilse false

        LinkedList<String> yigin2 = new LinkedList<>();
        yigin2.add("asdad");
        yigin2.add("asdadaad");
        yigin2.add("assdfddad");
        yigin2.add("ashghhgdad");
        System.out.println(yigin2.pop()); //ilk giren elemanı en son alır
        System.out.println(yigin2);
    }
}
