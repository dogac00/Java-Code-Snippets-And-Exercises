import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();

        map.put(34, "istanbul");
        map.put(06, "ankara");

        for (var x : map.keySet())
            System.out.println(map.get(x));
    }
}
