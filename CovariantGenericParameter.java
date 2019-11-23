import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            list.add(i * 10);

        Sample.display(list);
    }
}

class Sample {
    public static void display(ArrayList<? extends Number> list) {
        for (Number n : list)
            System.out.printf("%s ", n);

        System.out.println();
    }
}
