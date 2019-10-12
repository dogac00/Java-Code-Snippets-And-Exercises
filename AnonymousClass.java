
public class App {
    public static void main(String[] args) {
        var s = new Sample() {
           public void foo() {
               System.out.println("overridden");
           }
        };

        s.foo();
    }
}

class Sample {
    public void foo() {
        System.out.println("base");
    }
}

