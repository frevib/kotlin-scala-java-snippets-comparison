import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        Integer result = list
            .stream()
            .map(n -> n + 2)
            .filter(n -> n % 2 == 0)
            .flatMap(n -> List.of(n, n).stream())
            .reduce(1, (a, b) -> a * b);

        System.out.println(result); // Output: 576

        Integer sum = list
            .stream()
            .mapToInt(Integer::intValue)
            .sum();

        System.out.println(sum); // Output: 15
    }
}
