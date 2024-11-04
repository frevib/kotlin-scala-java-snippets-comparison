import java.util.List;

public class SumNumbers {
    public static void main(String[] args) {

        final var numberList = List.of(1, 2, 3, 4, 5);

        final var sum = numberList.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of the numbers is: " + sum);
    }
}