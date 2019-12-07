
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(areCharsDistinct(s));
    }

    public static boolean areCharsDistinct(String s) {
        int len = s.length();
        HashSet<Character> chars = new HashSet<>();

        for (int i = 0; i < len; i++)
            if (!chars.add(s.charAt(i)))
                return false;

        return true;
    }
    
    // Following method is O(N) time complexity
    // O(1) space complexity
    private static final int MAX_CHARS = 256;

    public static boolean areCharsDistinctAscii(String str) {
        int length = str.length();

        if (length > MAX_CHARS)
            return true;

        boolean [] flags = new boolean[MAX_CHARS];

        for (int i = 0; i < length; i++) {
            int charCode = str.charAt(i);

            if (flags[charCode])
                return false;

            flags[charCode] = true;
        }

        return true;
    }
}
