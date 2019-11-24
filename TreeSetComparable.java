import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<MyClass> treeSet = new TreeSet<>();

        treeSet.add(new MyClass(32));
        treeSet.add(new MyClass(12));
        treeSet.add(new MyClass(24));
        treeSet.add(new MyClass(68));
        treeSet.add(new MyClass(72));
        treeSet.add(new MyClass(72));

        for (var t : treeSet)
            System.out.println(t);
    }
}

class MyClass implements Comparable<MyClass> {
    private int m_value;

    public MyClass(int value) {
        this.m_value = value;
    }

    @Override
    public int hashCode() {
        return this.m_value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass other = (MyClass) obj;

        return this.m_value == other.m_value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.m_value);
    }

    @Override
    public int compareTo(MyClass myClass) {
        return this.m_value > myClass.m_value ? 1 : -1;
    }
}
