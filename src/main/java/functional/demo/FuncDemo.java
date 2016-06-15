package functional.demo;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.function.Function;

public class FuncDemo {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a", "b", "c");

        collection.parallelStream()
            .filter(e -> !e.equals("a"))
            .map(s -> s.toUpperCase())
            .skip(1)
        .forEach(e -> System.out.println(e));


    }
}
