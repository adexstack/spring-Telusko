import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("navin", "lasmi", "john", "kishor");

        List<String> uNames = names.stream()
                //.map(name -> name.toUpperCase())
                .map(String::toUpperCase) //replacing above lambda with method reference
                .toList();

        System.out.println(uNames);

        //uNames.forEach(name -> System.out.println(name));
        uNames.forEach(System.out::println); //replacing above lambda with method reference

    }
}
