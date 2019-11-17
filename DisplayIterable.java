
class Util {
    public static <T> void display(Iterable<T> iterable) {
        for (T t : iterable)
            System.out.printf("%s ", t);

        System.out.println();
    }
}
