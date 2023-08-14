package bolum8;

public class StringMetotlari {
    public static void main(String[] args) {
        String isim = "Emre";

        System.out.println(isim.length());
        System.out.println(isim.charAt(2)); //2. indexte hangi harf
        System.out.println(isim.concat( " Altunbilek"));
        String yeni = isim.concat(" Altunbilek    ");
        System.out.println(yeni.toLowerCase()); //küçük harfe çevirme
        System.out.println(yeni.toUpperCase()); //büyük harfe çevirme

        System.out.println(yeni.trim()); // boşlukları siler

        String ay = "Ocak";
        String ay2 = "Ocak";

        System.out.println(ay.equals(ay2));
        System.out.println(ay.equalsIgnoreCase(ay2));

        System.out.println(ay.compareTo(ay2)); // alfabetik kıyasla
        System.out.println(ay.startsWith("A"));  // A ile mi başlıyor kontrol
        System.out.println(ay.endsWith("m"));

        System.out.println(ay.contains("k"));

        System.out.println(yeni.trim().substring(5));
        System.out.println(yeni.trim().substring(0,5));

        System.out.println(yeni.trim().indexOf("m"));
        System.out.println(yeni.trim().lastIndexOf("e"));

        int sayi = 5;
        int sayi2 = 6;

        String say = "56";

        System.out.println(sayi+sayi2);
        System.out.println(Integer.parseInt(say)+4);

    }
}
