import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorWithList {
    public static void main(String[] args) {
        //comparing numbers' 2nd digits
        Comparator<Integer> comp = (o1, o2) -> (o1 % 10) > (o2 % 10) ? 1 : -1;

        Comparator<String> compStrLength = (o1, o2) -> {
            if(o1.length() > o2.length())
                return 1;
            else
                return -1;
        };


        List<Integer> num = new ArrayList<>();
        num.add(43);
        num.add(31);
        num.add(72);
        num.add(29);

        System.out.println(num); // print as ordered entries
        Collections.sort(num); // sort with default
        System.out.println(num);
        Collections.sort(num, comp); //sort using Comparator for self logic
        System.out.println(num); //31,72,43,29

        System.out.println("-----List on name-----");

        List<String> name = new ArrayList<>();
        name.add("Smith");
        name.add("Dan");
        name.add("Livingstone");
        name.add("Stoney");
        System.out.println(name);
        name.sort(compStrLength); //sort using Comparator for self logic
        System.out.println(name);


    }
}
