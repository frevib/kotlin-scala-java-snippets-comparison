import java.util.function.Function;

public class FunctionJava {

    public static Integer function1(Function<Integer, Integer> operation) {
        return operation.apply(3);
    }

    public static void main(String[] args) {
        final Function<Integer, Integer> method = (number) -> number * 2;

        final var res = function1(method);

        System.out.println(res);
    }
}

// 6