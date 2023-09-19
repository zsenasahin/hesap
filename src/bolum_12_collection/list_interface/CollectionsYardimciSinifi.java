package bolum_12_collection.list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsYardimciSinifi {
    public static void main(String[] args) {
        Student student = new Student(1,"abdullah");
        Student student2 = new Student(9,"sinem");
        Student student3 = new Student(5,"ezgi");

        ArrayList<Student> ogrenciler = new ArrayList<>();
        ogrenciler.add(student);
        ogrenciler.add(student2);
        ogrenciler.add(student3);

        Student enBuyukOgrenci = Collections.max(ogrenciler, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.isim.compareTo(o2.isim) < 0){
                    return -1;
                }else if(o1.isim.compareTo(o2.isim) > 0){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println("Max Öğrenci: " +enBuyukOgrenci);

        Student enKucukOgrenci = Collections.min(ogrenciler);
        System.out.println("Min Ogrenci: " +enKucukOgrenci);

        System.out.println("Sıralamadan önce: " +ogrenciler);

        Collections.sort(ogrenciler, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.id < o2.id){
                    return 1;
                }else if(o1.id > o2.id){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println("Sıralamadan sonra: " +ogrenciler);

        Collections.shuffle(ogrenciler);
        System.out.println("Karıştırıldıktan sonra: " +ogrenciler);

        int sonuc = Collections.binarySearch(ogrenciler,student); //indexi verir. 
        System.out.println("sonuc: " +sonuc);
    }
}

class Student implements Comparable<Student>{
    int id;
    String isim;

    public Student(int id, String isim) {
        this.id = id;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.isim.compareTo(o.isim) < 0){
            return -1;
        }else if(this.isim.compareTo(o.isim) > 0){
            return 1;
        }else{
            return 0;
        }
    }
}
