package bolum_12_collection.list_interface;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
public class HashMapKullanimi {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap(16,0.75f);
        linkedHashMap.put("emre", 1);
        linkedHashMap.put("fb", 2);
        linkedHashMap.put(null,123456);
        linkedHashMap.put("Ea", 3);

        System.out.println(linkedHashMap);
        for(String gecici: linkedHashMap.keySet()){
            System.out.println(gecici);
        }
        for(Map.Entry<String,Integer> gecici: linkedHashMap.entrySet()){
            System.out.println(gecici);
        }



       /*  HashMap<Integer, String> plakalar = new HashMap<>();
        plakalar.put(1,"Adana");
        plakalar.put(34, "İstanbul");
        plakalar.put(16, "Bursa");
        plakalar.put(35, "İzmir");
        plakalar.put(06, "Ankara");

        HashMap<Integer, String> plakalarYedek = new HashMap<>();
        System.out.println("Plakalar yedek size: " +plakalarYedek.size());
        plakalarYedek.putAll(plakalar);
        System.out.println("Plakalar yedek size: " +plakalarYedek.size());
        plakalarYedek.clear();
        System.out.println("Plakalar yedek size: " +plakalarYedek.size());

        System.out.println(plakalar);
        String deger = plakalar.get(16);
        System.out.println(deger);
        System.out.println(plakalar.size());
        System.out.println(plakalar.isEmpty());
        System.out.println(plakalar.containsKey(16));
        System.out.println(plakalar.containsValue("Bursa"));
        System.out.println(plakalar.containsValue("Bursa"));
        System.out.println(plakalar.remove(35));
        System.out.println(plakalar.size());

        for(Integer key : plakalar.keySet()){
            System.out.println("Keyler: " + key);
        }

        System.out.println("Değerler");
        for(String value: plakalar.values()){
            System.out.println(" " +value);
        }

        for(Map.Entry<Integer,String> entry : plakalar.entrySet()){
            System.out.println("Key: " +entry.getKey()+ "value: " +entry.getValue());
        }
*/
    }
}
