import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamReduceAndSum {
    public static void main(String[] args) {
        int size = 10000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i=1; i<=size;i++){
            nums.add(ran.nextInt(100));
        }

        int sum1 = nums.stream()
                .map(i -> i*2)
                .reduce(0, (a,b) -> a+b);

        int sum2 = nums.stream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        int sum3 = nums.parallelStream()
                .map(i -> i*2)
                .mapToInt(i -> i)
                .sum();

        System.out.println("sum1:" + sum1 + "  sum2:" + sum2 + " sum3:" + sum3);
    }
}
