package bolum8;

import java.util.Objects;

public class EqualsKullanimi {
    public static void main(String[] args) {
        Object k1 = new Kisi(5,"emre");
        System.out.println(k1);

        Object k2 = new Kisi(5,"emre");
        System.out.println(k2);
      /*  k1=k2;*/
        System.out.println("k1 ve k2 eşit mi: " +((Kisi)k1).equalss((Kisi)k2));

        System.out.println("k1 hashcode: " +k1.hashCode() + " k2: " +k2.hashCode());

        String isim = new String("emre");
        String isim2 = new String("emre");
        System.out.println("isimler eşit mi: " + isim.equals(isim2));


    }
}

class Kisi extends Object{
    int id;
    String isim;

    public Kisi(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "id:" + id + " isim:" + isim;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kisi kisi)) return false;
        return id == kisi.id && Objects.equals(isim, kisi.isim);
    }*/

    public boolean equalss(Kisi o) {
        if (this == o) return true;
        return id == o.id && Objects.equals(isim, o.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isim);
    }
}