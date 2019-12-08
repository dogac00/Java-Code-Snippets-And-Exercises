import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws RuntimeException {
        var list = IntStream.of(1,2,3,4,5)
                .filter(val -> val % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list.getClass().getName());
    }
}
