package predefined_interfaces.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionApplication {

    public static void main( String[] args ) {

        // Basic Function implementation

        Function<String, Integer> function = i -> i.length();

        System.out.println(function.apply("Hello World!"));

        // Using Function with Java 8 Streams

        List<String> list = Arrays.asList("One", "Two", "Three", "Four");

        list.stream().map(function).forEach(i -> System.out.println(i));

    }

}