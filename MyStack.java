import java.util.ArrayList;
import java.util.EmptyStackException;

public class App {
    public static void main(String[] args) {
        MyStack<Integer> list = new MyStack<>();

        list.push(32);
        list.push(36);
        list.push(40);
        list.push(44);

        list.pop();
        list.pop();

        list.push(999);
        list.push(111);
        list.push(222);
        list.push(333);

        while (!list.empty())
            System.out.println(list.pop());
    }
}

class MyStack<T> extends ArrayList<T> {
    public T push(T t) {
        this.add(t);
        return t;
    }

    public boolean empty() {
        return this.isEmpty();
    }

    public T pop() {
        int index = this.size() - 1;
        return this.remove(index);
    }

    public T peek() {
        if (empty())
            throw new EmptyStackException();

        int index = this.size() - 1;
        return this.get(index);
    }
}
