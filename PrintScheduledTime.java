import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        Timer t = new Timer();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        t.schedule(new TimerTask() {
            private LocalDateTime m_now;

            @Override
            public void run() {
                m_now = LocalDateTime.now();
                System.out.printf("Time: %s\r", dtf.format(m_now));
            }
        }, 0, 1);
    }
}
