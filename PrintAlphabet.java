import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream.range(0, 26)
                .forEach(i -> System.out.printf("%c", i + 'A'));
    }
}
