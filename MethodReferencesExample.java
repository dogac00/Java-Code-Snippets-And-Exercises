import java.util.function.LongConsumer;
import java.util.function.LongSupplier;

public class App {
    private static LongSupplier currentTime = System::currentTimeMillis;
    private static LongConsumer sleep = App::sleep;

    public static void main(String[] args) {

        long start = currentTime.getAsLong();

        sleep.accept(100);

        long end = currentTime.getAsLong();

        System.out.println(end - start);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
