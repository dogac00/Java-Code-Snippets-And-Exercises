import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {
        var one = new BigDecimal(1);
        var three = new BigDecimal(3);

        var res = one.divide(three, 5, RoundingMode.HALF_UP);

        System.out.println(res);
    }
}
