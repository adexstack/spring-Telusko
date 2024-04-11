import java.util.*;
import java.util.stream.Stream;

public class OptionalUse {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Navin", "Lasmi", "John", "Kishor");

        Optional<String> filteredName = names.stream()
                .filter(n -> n.contains("x"))
                .findFirst();

        //System.out.println(filteredName.get()); // will throw NoSuchElementException
        System.out.println(filteredName.orElse("Name not found")); // handled Exception

        /**
         * Another usage from the above; either are good. your choise
         * Not using Optional class directly but using orElse still
         *
         */
        String filteredName2 = names.stream()
                .filter(n -> n.contains("x"))
                .findFirst()
                .orElse("The Name is not found");

        System.out.println(filteredName2);

    }
}
