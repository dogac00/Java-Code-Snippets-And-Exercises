import java.math.BigInteger;

public class App {
    public static void main(String[] args) {
        boolean is = Util.isPrime(BigInteger.valueOf(205476928475L));

        System.out.println(is);
    }
}

class Util {
    static boolean isPrime(BigInteger bg) {
        if (bg.compareTo(BigInteger.ONE) <= 0)
            return false;

        if (bg.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            return false;

        if (bg.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO))
            return false;

        if (bg.mod(BigInteger.valueOf(5)).equals(BigInteger.ZERO))
            return false;

        for (long i = 2; BigInteger.valueOf(i * i).compareTo(bg) < 0; i++) {
            if (bg.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }
}
