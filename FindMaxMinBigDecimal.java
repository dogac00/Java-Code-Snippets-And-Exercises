import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {

    }

    private static BigDecimal max(BigDecimal [] bigDecimals)
    {
        BigDecimal result = bigDecimals[0];

        for (int i = 1; i < bigDecimals.length; i++)
            result = result.max(bigDecimals[i]);

        return null;
    }

    private static BigDecimal min(BigDecimal [] bigDecimals)
    {
        BigDecimal result = bigDecimals[0];

        for (int i = 1; i < bigDecimals.length; i++)
            result = result.min(bigDecimals[i]);

        return null;
    }
}
