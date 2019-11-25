
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
}
