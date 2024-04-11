import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Deep
 */
public class StreamUseDeepDive {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        Predicate<Integer> p = n -> n%2==0;
        Function<Integer, Integer> fn = n -> n*2;

        int result = nums.stream()
                .filter(p)
                .map(fn)
                .reduce(0, (a,b) -> a+b);

        System.out.println(result);
    }
}
