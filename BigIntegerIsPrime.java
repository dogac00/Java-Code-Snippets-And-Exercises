import java.math.BigInteger;

public class App {
    public static void main(String[] args) {

    }
}

class Util {
    private static boolean isPrime(long val) {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return false;

        if (val % 3 == 0)
            return false;

        if (val % 5 == 0)
            return false;

        for (long i = 7; i * i <= val; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }

    static boolean isPrime(BigInteger bg) {
        if (bg.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) < 0)
            return isPrime(bg.longValue());

        if (bg.compareTo(BigInteger.ONE) <= 0)
            return false;

        if (bg.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            return bg.equals(BigInteger.TWO);

        if (bg.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
            return false;

        if (bg.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO))
            return false;

        for (BigInteger i = BigInteger.valueOf(11); i.pow(2).compareTo(bg) <= 0; i = i.add(BigInteger.ONE)) {
            if (bg.mod(i).equals(BigInteger.ZERO))
                return false;
        }

        return true;
    }
}
