import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamUse {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        int result = nums.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0, (a,b) -> a+b);

        System.out.println(result);
    }
}
