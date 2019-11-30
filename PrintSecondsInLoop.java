import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            var now = new GregorianCalendar();
            
            System.out.printf("Second : %d\r", now.get(Calendar.SECOND));
            
            Thread.sleep(20);
        }
    }
}
