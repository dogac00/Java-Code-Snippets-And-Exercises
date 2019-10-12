
public class App {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Util.foo();

        long end = System.currentTimeMillis();

        System.out.printf("Elapsed milliseconds: %d", end - start);
    }
}

class Util {
    public static void foo() {}
}
