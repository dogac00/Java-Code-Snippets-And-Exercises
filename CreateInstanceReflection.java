import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Sample> cls = (Class<Sample>) Class.forName("Sample");
        Constructor<Sample> c = cls.getConstructor(int.class);
        Sample s = c.newInstance(52);

        System.out.println(s);
    }
}

class Sample {
    private int m_a;
    private String m_b;

    public Sample(int a) {
        this.m_a = a;
        this.m_b = "";
    }

    public Sample(String b) {
        this.m_a = 0;
        this.m_b = b;
    }

    @Override
    public String toString() {
        return String.format("[%d, %s]", m_a, m_b);
    }
}
