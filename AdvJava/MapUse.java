import java.util.*;

public class MapUse {
    public static void main(String[] args) {

        //Map<String, Integer> num = new HashMap<>(); // Treemap for key order
        Map<String, Integer> num = new TreeMap<>(); // Use Treemap for key order
        num.put("Seyi", 5);
        num.put("Dan", 10);
        num.put("Ken", 15);
        num.put("Guh", 35);
        num.put("Dave", 12);
        num.put("Guh", 77);



        System.out.println(num.size());
        System.out.println(num);
        System.out.println(num.keySet());
        System.out.println(num.entrySet());
        System.out.println("------------------");
        System.out.println(num.values());
        System.out.println(num.isEmpty());
        System.out.println(num.getOrDefault("Hay", 100));
        num.replace("Dave", 12, 22);
        System.out.println(num);

        System.out.println("---------------------");

        for(String key : num.keySet())
            System.out.println(key + " : " + num.get(key));

    }
}
