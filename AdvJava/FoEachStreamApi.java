import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FoEachStreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,4,20,12);

        /*
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        */

        // Optimizing the above anonymous class to lambda
        //Consumer<Integer> con = (i) -> System.out.println(i);

        // Optimizing the above lambda with Method Reference
        Consumer<Integer> con = System.out::println;

       nums.forEach(con);
    }
}
