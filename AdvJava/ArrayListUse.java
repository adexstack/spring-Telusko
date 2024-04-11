import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListUse {
    public static void main(String[] args) {
        //Collection<Integer> num = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(10);
        num.add(15);
        num.add(25);

        System.out.println(num.size());
        System.out.println(num);
        System.out.println(num.indexOf(10));
        System.out.println(num.get(2));
        System.out.println(num.contains(5));
        System.out.println(num.isEmpty());
        System.out.println(num.subList(0,2));

        for(int i : num){
            System.out.println(i);
            System.out.println();

        }

    }
}
