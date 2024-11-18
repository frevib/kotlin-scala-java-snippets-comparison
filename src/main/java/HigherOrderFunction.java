import java.util.function.*;

public class HigherOrderFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
//        UnaryOperator<Integer> square = x -> x * x;

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
//        BinaryOperator<Integer> add = (a, b) -> a + b;

        Consumer<String> print = s -> System.out.println(s);
//        BiConsumer<String, Integer> print = (s, i) -> System.out.println(s + " " + i);
        Supplier<String> supplier = () -> "Hello, World!";
        Predicate<Integer> isPositive = i -> i > 0;
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
    }
}