package bolum9;

import oop_giris.Ogrenci;

import java.util.ArrayList;

public class Soru1 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Ogrenci ogr1 = new Ogrenci(10, "emre");
        Ogrenci ogr2 = new Ogrenci(20, "ali" );
        Ogrenci ogr3 = new Ogrenci(30, "hasan");
        Ogrenci ogr4 = new Ogrenci(40, "ayse");
        myStack.push(ogr1);
        myStack.push(ogr2);
        myStack.push(ogr3);
        myStack.push(ogr4);
        myStack.yazdir();

        myStack.pop();
        System.out.println(myStack.kacElemanVar() + "tane eleman var");
        System.out.println(myStack.bosMu());
        System.out.println(myStack.elemanGoster());

        myStack.yazdir();
    }
}

class MyStack{
    private ArrayList<Object> liste = new ArrayList<>();

    public MyStack(){
        liste = new ArrayList<>();
    }
    public int kacElemanVar(){
        return liste.size();
    }

    public boolean bosMu(){
       // return liste.isEmpty(); true false donderir
        if(liste.size() > 0){
            return false;
        }else return true;
    }

    public Object elemanGoster(){
        return liste.get(kacElemanVar()-1);
    }

    public Object pop(){
        Object geriyeDondurulecekEleman = liste.get(kacElemanVar()-1);
        liste.remove(kacElemanVar()-1);
        return geriyeDondurulecekEleman;
    }

    public void push(Object eklenecekELeman){
        liste.add(eklenecekELeman);
    }

    public void yazdir(){
        System.out.println("YIĞIN İÇERİĞİ");
        for(int i=0; i< liste.size(); i++){
            System.out.println("indexte: "+ liste.get(i));
        }
    }
}