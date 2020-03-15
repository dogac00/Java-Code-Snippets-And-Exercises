import java.math.BigInteger;

public class App
{
    public static void main(String[] args)
    {
        BigInteger bi = new BigInteger("2147483648");

        //   1111-1111-1111-1111
        // 1|0000-0000-0000-0000

        // 1 is being removed here

        int val = bi.intValue();

        System.out.println(val);
        
        // This will print the smallest integer value
    }
}
