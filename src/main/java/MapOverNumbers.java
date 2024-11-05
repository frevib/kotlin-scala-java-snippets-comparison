import java.util.List;

public class MapOverNumbers {
    public static void main(String[] args) {

        final var numberList = List.of(1, 2, 3, 4, 5);

        final var sum = numberList.stream()
                .map(x -> x * x)
                .toList();

        System.out.println("The sum of the numbers is: " + sum);
    }
}