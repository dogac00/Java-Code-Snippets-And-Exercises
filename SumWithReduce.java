import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        var sum = IntStream.of(arr)
                .reduce((Integer::sum));

        sum.ifPresentOrElse(System.out::println, () -> {
            System.out.println("Not present.");
        });
    }
}
