import java.math.BigInteger;

public class NumberUtil {
    private static final BigInteger TWO = BigInteger.valueOf(2); // For compatibility before Java-9
    private static final BigInteger THREE = BigInteger.valueOf(3);
    private static final BigInteger FIVE = BigInteger.valueOf(5);
    private static final BigInteger SEVEN = BigInteger.valueOf(7);
    
    public static boolean isPrime(BigInteger bigInteger)
    {
        var zero = BigInteger.ZERO;
        var one = BigInteger.ONE;

        if (bigInteger.compareTo(one) <= 0)
            return false;

        if (bigInteger.mod(TWO).equals(zero))
            return bigInteger.equals(TWO);

        if (bigInteger.mod(FIVE).equals(zero))
            return bigInteger.equals(FIVE);

        if (bigInteger.mod(SEVEN).equals(zero))
            return bigInteger.equals(SEVEN);

        for (var i = BigInteger.valueOf(11); i.multiply(i).compareTo(bigInteger) <= 0; i = i.add(one))
            if (bigInteger.mod(i).equals(zero))
                return false;

        return true;
    }
}
