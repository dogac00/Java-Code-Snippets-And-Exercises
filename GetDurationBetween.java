import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        Duration duration = Duration.between(LocalTime.now(), LocalTime.now().plusSeconds(30));
        
        // Or another way is
        long minutes = LocalTime.now().until(LocalTime.now().plusHours(1), ChronoUnit.MINUTES);

        System.out.println(duration);
        System.out.println(minutes);
    }
}
