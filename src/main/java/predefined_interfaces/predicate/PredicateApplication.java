package predefined_interfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateApplication {

    public static void main( String[] args ) {

        // Basic Predicate implementation

        Predicate<Integer> predicate = i -> (i > -100) && (i < 100);

        System.out.println(predicate.test(50));

        // Using Predicate with Java 8 Streams

        List<Integer> list = Arrays.asList(20, 40, 60, 80, 100);

        list.stream().filter(predicate).forEach(i -> System.out.println("2 Digit Number: " + i));

    }

}