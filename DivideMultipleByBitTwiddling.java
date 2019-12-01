public class App {
    public static void main(String[] args) {
        System.out.println(divideByTwo(48));
        System.out.println(multiplyByTwo(12));
    }

    public static int multiplyByTwo(int x) {
        return x << 1;
    }

    public static int divideByTwo(int x) {
        return x >> 1;
    }
}
