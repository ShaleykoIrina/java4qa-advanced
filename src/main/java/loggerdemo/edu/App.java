package loggerdemo.edu;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String... args) {
        Logger logger = new Logger(new MessageContentLoggerFilter(), new ConsoleLoggerSaver(), formatter);
        logger.log("message", message -> "");

        Predicate<String> stringPredicate = element -> element.length() < 6;
        List<Integer> collect = new ArrayList<String>().parallelStream()
                .filter(new Object()::equals)
                .filter(stringPredicate)
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("R!");
    }
}

class MyFilters {
    public static boolean filterByLength(String str) {
        return str.length() < 10;
    }
}
