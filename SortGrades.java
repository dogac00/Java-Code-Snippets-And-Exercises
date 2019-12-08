import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws RuntimeException {
        int[] grades = {12,54,78,43,88,98,100,32,54};

        IntStream.of(grades)
                .sorted()
                .skip(grades.length - 3)
                .forEach(System.out::println);
    }
}
