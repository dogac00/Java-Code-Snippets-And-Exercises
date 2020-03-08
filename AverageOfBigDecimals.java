import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) {
        var s = average(new BigDecimal[] { BigDecimal.ONE, BigDecimal.ZERO, BigDecimal.TEN });

        System.out.println(s);
    }

    private static BigDecimal average(BigDecimal[] bigDecimals) {
        var sum = sum(bigDecimals);
        var len = BigDecimal.valueOf(bigDecimals.length);

        return sum.divide(len, 6, RoundingMode.HALF_UP);
    }

    private static BigDecimal sum(BigDecimal[] bigDecimals) {
        BigDecimal sum = BigDecimal.ZERO;

        for (BigDecimal bigDecimal : bigDecimals) {
            sum = sum.add(bigDecimal);
        }

        return sum;
    }
}
