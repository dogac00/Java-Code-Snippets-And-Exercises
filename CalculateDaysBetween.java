import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        long days = ChronoUnit.DAYS
                .between(LocalDateTime.of(2019, Month.DECEMBER, 10, 15, 15),
                        LocalDateTime.of(2019, Month.DECEMBER, 22, 15, 15));

        System.out.println(days);
    }
}
