package predefined_interfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerApplication {

    public static void main( String[] args ) {

        // Basic Consumer implementation

        Consumer<Integer> consumer = i -> System.out.println("Printing: " + i);

        consumer.accept(10);

        // Using Consumer with Java 8 Streams

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().forEach(consumer);

    }

}