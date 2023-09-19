package bolum_13_collections_project;

import bolum_13_collections_project.udemyKursPlayer.Ders;
import bolum_13_collections_project.udemyKursPlayer.Egitmen;
import bolum_13_collections_project.udemyKursPlayer.Kurs;
import bolum_13_collections_project.udemyKursPlayer.Ogrenci;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr1 = new Ogrenci("ali","alinin tanıtım yeri", "ali_udemy" );
        Ogrenci ogr2 = new Ogrenci("sena","senanın tanıtım yeri", "sena_udemy" );
        Egitmen egt1 = new Egitmen("emre", "emre java", "emreAltunbilek");
        Egitmen deneme = new Egitmen("deneme", "deneme java", "deneme_udemy");
        System.out.println(ogr1);
        System.out.println(egt1);

        Ders d1 = new Ders(1, "Giriş", 3.5);
        Ders d2 = new Ders(2, "java nedir", 9.2);
        Ders d3 = new Ders(3, "Primitive Veri Tipleri", 22.9);
        Ders d4 = new Ders(4, "Diziler", 15.9);
        Ders d5 = new Ders(4, "Diziler", 15.9);
        Ders d6 = new Ders(4, "Diziler", 15.9);

        Kurs javaKursu = new Kurs("İleri seviye java kursu", egt1);
        javaKursu.kursaDersEkle(d1);
        javaKursu.kursaDersEkle(d2);
        javaKursu.kursaDersEkle(d3);
        javaKursu.kursaDersEkle(d4);
        javaKursu.kursaDersEkle(d5);
        javaKursu.kursaDersEkle(d6);

        javaKursu.kurstaEgitmenSil(egt1);

        javaKursu.kursaEgitmenEkle(deneme);
        javaKursu.kurstaEgitmenSil(egt1);
        javaKursu.kurstaEgitmenSil(deneme);


        ogr1.kursaKatil(javaKursu);

        ogr1.izlenecekDersEkle(d1);
    }
}
