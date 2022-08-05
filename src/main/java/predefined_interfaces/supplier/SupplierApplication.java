package predefined_interfaces.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierApplication {

    public static void main( String[] args ) {

        // Basic Supplier implementation

        Supplier<String> supplier = () -> "This is the Supplier functional interface.";

        System.out.println(supplier.get());

        // Using Supplier with Java 8 Streams

        List<String> list = Arrays.asList();

        System.out.println(list.stream().findAny().orElseGet(supplier));

    }

}