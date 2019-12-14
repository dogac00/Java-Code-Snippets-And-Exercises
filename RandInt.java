public class App {
    public static void main(String[] args) {
        // Of course, we can do the following by writing random.nextInt();
    }

    private static int randInt(int max) {
        return (int) (Math.random() * max);
    }

    private static int randInt(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }
}
