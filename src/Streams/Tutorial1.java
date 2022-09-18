package src.Streams;

// Streams bring functional programming to Java
// They heavily use lambda expressions

//Basic Structure: Source -> {Filter, Sort, Map etc.} -> Collect
//The Steam Source can be created from List, Sets, Arrays, Longs, Collections, Ints etc.

//The Steam Operations are either intermediate or terminal:

//Intermediate: filter, map, sort etc. -> we can chain multiple operations
// -> Zero or more are allowed, Order matters for large datasets (first filter, then sort or map), very large sets can use ParallelStream to enable multiple threads
// -> anyMatch(), distinct(), filter(), findFirst(), flatmap(), map(), skip(), sorted()

//Terminal: forEach, collect, reduce etc. are either void or return a non-stream result
// -> only ONE ist allowed
// -> forEach (applies the same to each element)
// -> collect (saves all elemnt into a collection)
// -> count, min, max, reduce, summaryStatistics (reduce the stream to a single summary element)


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Tutorial1 {

    public static void main(String[] args) {
        // 1. Integer Stream
        IntStream
                .range(1, 10)
                .forEach(System.out::print);


        // 2. Integer Stream with skip and lambda expression
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));

        // 3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 10)
                        .sum());

        // 3.1 Integer Stream with sum but into a variable

        Integer i = IntStream
                .range(1, 10)
                .sum();
        System.out.println(i);


        // 4. Stream.of, sorted an findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        // 5. Stream from Array with sort and filter
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sami"};
        Arrays.stream(names) // same as Stream.of(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

        // 6. average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Ava", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sami");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("a"))
                .forEach(System.out::println);
    }
}
