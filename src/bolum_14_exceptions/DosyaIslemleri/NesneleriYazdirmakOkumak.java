package bolum_14_exceptions.DosyaIslemleri;

import java.io.*;
import java.util.ArrayList;

public class NesneleriYazdirmakOkumak {
    public static void main(String[] args) {
        dosyayaNesneYazdir();
        dosyadanNesneleriOku();

        //Arraylisti dosyaya yazdırmak
        ArrayList<Student> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(new Student(9, "kkk", false));
        ogrenciListesi.add(new Student(19, "asd", true));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciNesneleriListesi.dat")))) {
            objectOutputStream.writeObject(ogrenciListesi);
        } catch (Exception e) {
            System.out.println(e);
        }

        //ArrayListi listeden okumak
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenciNesneleriListesi.dat")))) {
            ArrayList<Student> okunanListe = (ArrayList<Student>) objectInputStream.readObject();
            System.out.println("Okunan ArrayList: " + okunanListe);
        } catch (IOException e1) {
            e1.printStackTrace();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void dosyadanNesneleriOku() {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("ogrenciNesneleri.dat")))){
            boolean dosyaSonu = false;
            while(!dosyaSonu){
                try{
                    Student okunanNesne = (Student) objectInputStream.readObject();
                    System.out.println(okunanNesne);
                }catch (EOFException e){
                    dosyaSonu = true;
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void dosyayaNesneYazdir() {
        Student student1 = new Student(50,"emre ", true);
        Student student2 = new Student(70,"hasan ", false);
        Student student3 = new Student(40,"ali ", true);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciNesneleri.dat")))){
            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
            objectOutputStream.writeObject(student3);

        }catch (Exception e){
            System.out.println(e);
        }

    }
}


class Student implements Serializable {
    int id;
    String isim;
    boolean aktif;
    private final long serialVersionUID = 1L;

    public Student(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}