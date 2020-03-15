import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        int result = factorial(5);

        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n < 0)
            return -1;

        if (n < 2)
            return 1;

        return IntStream.rangeClosed(2, n)
                .reduce((a, b) -> a * b)
                .getAsInt();
    }
}
