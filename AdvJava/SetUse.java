import java.util.*;

public class SetUse {
    public static void main(String[] args) {
        //Set<Integer> num = new HashSet<>();
        Set<Integer> num = new TreeSet<>(); //Treeset for ordered entries
        num.add(5);
        num.add(10);
        num.add(15);
        num.add(25);
        num.add(10);

        System.out.println(num.size());
        System.out.println(num);
        System.out.println(num.contains(5));
        System.out.println(num.isEmpty());

        System.out.println("---------------------");

        Iterator<Integer> it = num.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
