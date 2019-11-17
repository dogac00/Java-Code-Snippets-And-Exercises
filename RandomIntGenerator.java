import java.util.Iterator;
import java.util.Random;

public final class RandomIntGenerator implements Iterable<Integer> {
    private final int m_count, m_min, m_max;
    private final Random m_random;

    public RandomIntGenerator(int count, int min, int max) {
        this(count, min, max, new Random());
    }

    public RandomIntGenerator(int count, int min, int max, Random r) {
        this.m_count = count;
        this.m_min = min;
        this.m_max = max;
        this.m_random = r;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int m_index;

            @Override
            public boolean hasNext() {
                return m_index < m_count;
            }

            @Override
            public Integer next() {
                m_index++;

                return m_random.nextInt();
            }
        };
    }
}
