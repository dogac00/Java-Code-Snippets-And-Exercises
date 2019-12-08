import java.util.Random;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        Random r = new Random();

        IntStream
                .generate(() -> r.nextInt(100))
                .filter(val -> val % 2 == 0)
                .limit(10)
                .forEach(System.out::println);
    }
}
