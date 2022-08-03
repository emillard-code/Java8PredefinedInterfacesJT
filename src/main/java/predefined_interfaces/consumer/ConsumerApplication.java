package predefined_interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApplication {

    public static void main( String[] args ) {

        // Basic Consumer implementation

        Consumer<Integer> consumer = t -> System.out.println("Printing: " + t);

        consumer.accept(10);

        // Using Consumer with Java 8 Streams

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

        list1.stream().forEach(consumer);

    }

}